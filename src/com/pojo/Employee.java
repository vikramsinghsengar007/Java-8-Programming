package com.pojo;

import java.util.List;
import java.util.Map;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String address;
    Map<String, List<Employee>> slabwiseEmployees;
    // SALARY SLABs :
//
//	"SLAB-0" : salary < 50000
//	"SLAB-1" : salary >= 50000
//	"SLAB-2" : salary >= 100000

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", department=" + department +
                '}';
    }

    private Department department;

    public Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.department = getDepartment();
    }

    public Employee(int id, String name, double salary, String address, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.department = department;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Map<String, List<Employee>> getSlabwiseEmployees() {
        return slabwiseEmployees;
    }

    public void setSlabwiseEmployees(Map<String, List<Employee>> slabwiseEmployees) {
        this.slabwiseEmployees = slabwiseEmployees;
    }
}
