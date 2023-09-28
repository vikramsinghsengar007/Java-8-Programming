package com.interview.swiss;

import com.pojo.Employee;
import com.pojo.EmployeeComparator;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> eList = new ArrayList<>();
        eList.add(new Employee(1,"e1"));
        eList.add(new Employee(1,"e1"));
        eList.add(new Employee(3,"e3"));
        eList.add(new Employee(2,"e2"));
        eList = removeDuplicates(eList);
        System.out.println(eList);
    }

    private static List<Employee> removeDuplicates(List<Employee> eList) {
        List<Employee> employeeList = null;
        Set<Employee> eSet = new HashSet<>();
        Collections.sort(eList, new EmployeeComparator());
        for(Employee e: eList){
            eSet.add(e);

        }

        employeeList = new ArrayList<>(eSet);


        return eList.stream().distinct().collect(Collectors.toList());
        //return employeeList;
    }
}
