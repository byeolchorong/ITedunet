package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Todo;
import com.springmvc.repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoDao;

    // 전체 할 일 목록 가져오기
    public List<Todo> getTodoList() {
        return todoDao.findAll();
    }

    // 할 일 추가
    public void addTodo(String content) {
        Todo todo = new Todo();
        todo.setContent(content);
        todo.setCreatedDate(java.time.LocalDate.now());
        todo.setCompleted(false);
        todoDao.save(todo);
    }

    // 할 일 완료 처리
    public void completeTodo(int id) {
        todoDao.markAsCompleted(id);
    }

    // 할 일 삭제
    public void deleteTodo(int id) {
        todoDao.deleteById(id);
    }
}