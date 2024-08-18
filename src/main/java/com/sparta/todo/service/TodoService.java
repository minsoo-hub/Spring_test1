package com.sparta.todo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository toddRepository;

    public TodoResponse createTodo(TodoRequset requset) {
        Todo entity = new Todo(requset);
        return TodoResponse.of(todoRepository.save(entity));
    }
}
