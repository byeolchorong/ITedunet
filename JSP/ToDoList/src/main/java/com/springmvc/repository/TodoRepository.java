package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springmvc.domain.Todo;

@Repository
public class TodoRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// 할 일 목록 조회
	public List<Todo> findAll() {
		String sql = "SELECT * FROM todo ORDER BY created_date DESC";
		return jdbcTemplate.query(sql, new TodoRowMapper());
	}
	
	// 할 일 추가
	public void save (Todo todo) {
		String sql = "INSERT INTO todo (content, created_date, completed) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, todo.getContent(), todo.getCreatedDate(), todo.isCompleted());
	}
	
	// ✅ 할 일 완료 처리 (completed = true)
    public void markAsCompleted(int id) {
        String sql = "UPDATE todo SET completed = true WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    // ✅ 할 일 삭제
    public void deleteById(int id) {
        String sql = "DELETE FROM todo WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    // 내부 클래스: 결과셋 → Todo 객체로 변환
    private static class TodoRowMapper implements RowMapper<Todo> {
        @Override
        public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
            Todo todo = new Todo();
            todo.setId(rs.getInt("id"));
            todo.setContent(rs.getString("content"));
            todo.setCreatedDate(rs.getDate("created_date").toLocalDate());
            todo.setCompleted(rs.getBoolean("completed"));
            return todo;
        }
    }
}
