package com.auto.code.test.controller;

import com.auto.code.annotations.AutoMapper;
import com.auto.code.mapper.ExampleMapper;
import com.auto.code.test.mapper.ExampleDTO;
import com.auto.code.test.mapper.ExampleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.System.out;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    ExampleMapper exampleMapper;


    @GetMapping("/mapper")
    @AutoMapper(name = "ExampleMapper", classes = {ExampleDTO.class, ExampleEntity.class})
    public ExampleDTO mapper(){
        ExampleEntity exampleEntity = getEntity();
        out.println(exampleEntity.getName());

        ExampleDTO exampleDTO = exampleMapper.exampleEntityToExampleDTO(exampleEntity);
        out.println(exampleDTO.toString());
        return exampleDTO;
    }

    private ExampleEntity getEntity(){
        return new ExampleEntity(1L, "Ahmad", 10, 100.0);
    }

}
