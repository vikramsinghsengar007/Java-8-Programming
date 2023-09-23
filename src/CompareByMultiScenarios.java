import com.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CompareByMultiScenarios {
    public static void main(String[] args) {
        Collection<Employee> employees = Arrays.asList(
                new Employee(1,"Rahul",  100500, "delhi"),
                new Employee(2, "Suresh", 90000, "blore"),
                new Employee(3,"Rohan", 110000,"hybad"),
                new Employee(4,"Mahesh",  200000, "blore"),
                new Employee(5,"vikram", 210000, null),
                new Employee(6,"akash", 210000, null));

System.out.println(sortSalary(employees));
System.out.println(sortSal(employees));
System.out.println(sortSalByJava8(employees));
System.out.println(sortSalDeptNotNull(employees));
    }

    private static List<Employee> sortSalByJava8(Collection<Employee> employees) {
        return employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
    }

    //sort name if salary is same
    public static List sortSalary(Collection<Employee> list){
        return list.stream().sorted((s1, s2) -> {
            if(s1.getSalary() - s2.getSalary() == 0){
                return s1.getName().compareTo(s2.getName());

            }else
                return (int) (s1.getSalary() - s2.getSalary());
        }).collect(Collectors.toList());
    }

    public static List sortSal(Collection<Employee> list){
        return list.stream()
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());
    }
    public static List sortSalDeptNotNull(Collection<Employee> list){
        return list.stream().filter(employee -> employee.getAddress() !=null)
                .sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))
                .collect(Collectors.toList());
    }

}
