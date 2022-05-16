package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
    List<String> subjects = new ArrayList();
    subjects.add("a");
        Student student = new Student(1, "a", subjects);
      student.getSubjects().add("b");
System.out.println(student.getSubjects());
    }
}

 final class Student implements Cloneable{
     private int id =0;
    private String name ="";
    private  final List<String> subjects;

    public Student(int id, String name,  List<String> subjects) {
        this.id = id;
        this.name = name;
        ArrayList tempList = new ArrayList();
        for (int i = 0; i < subjects.size(); i++) {
            tempList.add(subjects.get(i));
        }
        this.subjects = tempList;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List getSubjects() {

        return subjects;
    }
    public Object clone() throws CloneNotSupportedException {
        return new Student(id,name,getSubjects());
    }
}
