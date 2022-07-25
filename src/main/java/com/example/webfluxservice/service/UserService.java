package com.example.webfluxservice.service;

import com.example.webfluxservice.repository.UserRepository;
import com.example.webfluxservice.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Flux<UserVO> getUsers() {
        return Flux.mergeSequential(
                userRepository.findById(1L),
                userRepository.findById(2L),
                userRepository.findById(3L),
                userRepository.findById(4L)
        );
    }

    public Flux<UserVO> getUser(Long userSeq) {
        return Flux.mergeSequential(
                userRepository.findByUser(userSeq)
        );
    }
}
