import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(sumEvenNumbers(arr));
    }

    public static int sumEvenNumbers(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.stream().filter(i -> i%2 != 0).reduce(0, (a,b) -> a+b);
        //return list.stream().filter(i -> i%2 != 0).mapToInt(i -> i).sum();
    }
}
