    import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/
public class FindNumStartWith1 {
    public static void main(String[] args) {
        Integer arr[] = {10,15,8,49,25,98,32};
        System.out.println(getNumStartWith1(arr));

    }
    public static List<Integer> getNumStartWith1(Integer[] numArr){
         List<Integer> numList = Arrays.asList(numArr);
         return numList.stream()
                 .map(num -> num + "")
                 .filter(num -> num.startsWith("1"))
                 .map(Integer::valueOf)
                 .collect(Collectors.toList());
    }
}
