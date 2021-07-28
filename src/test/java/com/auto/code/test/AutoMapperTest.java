package com.auto.code.test;

import com.auto.code.annotations.AutoMapper;
import com.auto.code.mapper.ExampleMapper;
import com.auto.code.mapper.ExampleMapperImpl;
import com.auto.code.test.mapper.ExampleDTO;
import com.auto.code.test.mapper.ExampleEntity;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class AutoMapperTest {

    private ExampleMapper exampleMapper = new ExampleMapperImpl();

    @Test
    @AutoMapper(name = "ExampleMapper", classes = {ExampleDTO.class, ExampleEntity.class})
    public void testAutoMapper(){
        ExampleEntity exampleEntity = getEntity();
        out.println(exampleEntity.getName());

        ExampleDTO exampleDTO = exampleMapper.exampleEntityToExampleDTO(exampleEntity);
        out.println(exampleDTO.toString());
    }

    private ExampleDTO getDTO(){
        return new ExampleDTO(1L, "Ahmad", 10, 100.0);
    }

    private ExampleEntity getEntity(){
        return new ExampleEntity(1L, "Ahmad", 10, 100.0);
    }
}
