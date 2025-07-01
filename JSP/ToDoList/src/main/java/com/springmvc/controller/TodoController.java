package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springmvc.domain.Todo;
import com.springmvc.service.TodoService;

@Controller
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public String listTodos(Model model) {
        List<Todo> todos = todoService.getTodoList();
        model.addAttribute("todos", todos);
        return "todos"; // /WEB-INF/views/todos.jsp
    }

    @PostMapping("/add")
    public String addTodo(@RequestParam("content") String content) {
        todoService.addTodo(content);
        return "redirect:/todos";
    }

    @PostMapping("/complete/{id}")
    public String complete(@PathVariable("id") int id) {
        todoService.completeTodo(id);
        return "redirect:/todos";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        todoService.deleteTodo(id);
        return "redirect:/todos";
    }
}