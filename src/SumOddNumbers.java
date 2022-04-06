import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOddNumbers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(sumOddNumbers(arr));
    }

    public static int sumOddNumbers(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.stream().filter(i -> i%2 != 0).mapToInt(i -> i).sum();
    }
}
