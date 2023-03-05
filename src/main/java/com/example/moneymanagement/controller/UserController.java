package com.example.moneymanagement.controller;

import com.example.moneymanagement.domain.User;
import com.example.moneymanagement.dto.request.user.CreateUserRequest;
import com.example.moneymanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;

/**
 * 4:13 PM 05-Mar-23
 * Long Tran
 */
@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final ExecutorService executorService;

    @GetMapping("/get-by-id/{id}")
    public CompletableFuture<Object> getUserById(@PathVariable String id){
       return CompletableFuture.supplyAsync(() -> userService.getUserById(id),executorService);
    }

    @PostMapping("/create")
    public CompletableFuture<Object> create(@RequestBody CreateUserRequest request){
        return CompletableFuture.supplyAsync(() -> userService.create(request),executorService);
    }





}
