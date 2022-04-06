import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Given a list of integers, find out all the even numbers exist in the list using Stream functions?*/
public class EvenNumbers {
    public static void main(String[] args) {
        Integer arr[] = {10,15,8,49,25,98,32};
        System.out.println(getEvens(arr));

        int n = 10;
        isEvenNumber(n);

    }

    private static void isEvenNumber(int n) {
        Optional<Integer> m = Stream.of(n).filter(h -> n %10 ==0).findAny();
        System.out.println(m.isPresent());
    }

    public static List<Integer> getEvens(Integer[] numArr){
         List<Integer> numList = Arrays.asList(numArr);
         return numList.stream().filter(num -> num%2 ==0).collect(Collectors.toList());
    }
}
