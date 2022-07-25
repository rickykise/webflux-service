package com.example.webfluxservice.controller;

import com.example.webfluxservice.service.UserService;
import com.example.webfluxservice.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/api/users")
    public Flux<UserVO> getUsers() {

        return userService.getUsers();
    }

    @GetMapping("/api/user/{userSeq}")
    public Flux<UserVO> getUser(@PathVariable Long userSeq) {

        return userService.getUser(userSeq);
    }
}
