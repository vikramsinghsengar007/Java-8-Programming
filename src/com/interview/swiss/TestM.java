package com.interview.swiss;

import com.pojo.Employee;
import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

import java.util.*;
import java.util.stream.Collectors;

public class TestM {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"vikram","singh"));
        list.add(new Employee(2,"vikram","raj"));
        list.add(new Employee(3,"vikram","aman"));
        list.add(new Employee(4,"vivek","kumar"));
        list.add(new Employee(5,"vivek","singh"));
        list.add(new Employee(6,"vivek","rajput"));
        list.add(new Employee(7,"aman","singh"));
        list.add(new Employee(8,"nidhi","singh"));
        list.add(new Employee(9,"nidhi","parihar"));

       /* Comparator<Employee> comparator = Comparator.comparing(employee -> employee.getFname());
        comparator = comparator.thenComparing(Comparator.comparing(employee -> employee.getLname()));
        Collections.sort(list, comparator);*/

        List<Employee> employees = list.stream().sorted(
                Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getLastName)).collect(Collectors.toList());
        System.out.println(employees);
    }
}
