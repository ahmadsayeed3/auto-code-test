package com.auto.code.test.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleEntity {
    private long id;
    private String name;
    private int age;
    private double salary;
}
