package com.sparta.todo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoSevice todoSevice;

    @PostMapping("/api/v1/todos")
    public ResponseEntity<TodoResponse> createTodo(@RequestBody TodoRequset requset) {
        TodoResponse response = todoSevice.createTodeo(requset);
        return ResponseEntity.ok(response);
    }
}
