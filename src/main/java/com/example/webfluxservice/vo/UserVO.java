package com.example.webfluxservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("User")
public class UserVO {
    @Id
    @Column("userSeq")
    private Long userSeq;
    @Column("name")
    private String name;

}
