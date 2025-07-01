package com.springmvc.domain;

import java.time.LocalDate;

public class Todo {
	private int id; 				// 고유번호
	private String content; 		// 할 일 내용
	private LocalDate createdDate; 	// 등록한 날짜
	private boolean completed; 		// 완료 여부
	
	public Todo() {
		
	}

	public Todo(int id, String content, LocalDate createdDate, boolean completed) {
		super();
		this.id = id;
		this.content = content;
		this.createdDate = createdDate;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", content=" + content + ", createdDate=" + createdDate + ", completed=" + completed
				+ "]";
	}
	
	
}
