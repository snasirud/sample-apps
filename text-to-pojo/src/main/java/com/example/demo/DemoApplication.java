package com.example.demo;

import com.ancientprogramming.fixedformat4j.format.FixedFormatManager;
import com.ancientprogramming.fixedformat4j.format.impl.FixedFormatManagerImpl;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class DemoApplication
{

    public static void main(String[] args)
    {
        String employeeString  = "testemployee       25   male";
        String departmentString  = "information technology    10";

        Class<?> classz = getClassz();
        String string = classz.isInstance(Employee.class) ? employeeString : departmentString;
        Object object = new FixedFormatManagerImpl().load(classz, string);
        if(object instanceof Employee)
        {
            Employee employee = (Employee) object;
            System.out.println(employee.getName() + "=" + employee.getAge() + "=" + employee.getGender());
        }
        else
        {
            Department department = (Department) object;
            System.out.println(department.getName() + "=" + department.getCount());
        }
        SpringApplication.run(DemoApplication.class, args);
    }

    public static Class<?> getClassz()
    {
        if(new Random().nextInt() % 2 != 0)
        {
            return Employee.class;
        }
        else
        {
            return Department.class;
        }
    }

}
