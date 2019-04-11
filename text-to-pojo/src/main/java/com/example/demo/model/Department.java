package com.example.demo.model;

import com.ancientprogramming.fixedformat4j.annotation.Field;
import com.ancientprogramming.fixedformat4j.annotation.Record;
import lombok.Getter;
import lombok.Setter;

@Record
@Setter
public class Department
{
    String name;
    int count;

    @Field(offset = 1, length = 26)
    public String getName()
    {
        return name;
    }

    @Field(offset = 27, length = 2)
    public int getCount()
    {
        return count;
    }
}
