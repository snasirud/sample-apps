package com.example.demo.model;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record
@Setter
public class Employee
{
    String name;
    int age;
    String gender;

    @Field(offset = 1, length = 19)
    public String getName()
    {
        return name;
    }

    @Field(offset = 20, length = 5)
    public int getAge()
    {
        return age;
    }

    @Field(offset = 25, length = 4)
    public String getGender()
    {
        return gender;
    }
}
