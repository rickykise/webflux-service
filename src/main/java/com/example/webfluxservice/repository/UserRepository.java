package com.example.webfluxservice.repository;

import com.example.webfluxservice.vo.UserVO;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface UserRepository extends ReactiveCrudRepository<UserVO, Long> {

    @Query("SELECT * FROM `User` WHERE userSeq = :userSeq")
    Flux<UserVO> findByUser(Long userSeq);
}
