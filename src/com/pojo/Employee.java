package com.pojo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private double salary;
    private String address;
    Map<String, List<Employee>> slabwiseEmployees;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(address, employee.address) && Objects.equals(slabwiseEmployees, employee.slabwiseEmployees) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, address, slabwiseEmployees, department);
    }
}
