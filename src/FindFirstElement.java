import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

    /*Given the list of integers, find the first element of the list using Stream functions?*/
     public class FindFirstElement {
         public static void main(String[] args) {
             Integer arr[] = {};
             System.out.println(findFirst(arr));

         }
         public static Integer findFirst(Integer[] numArr){
              return Arrays.stream(numArr).findFirst().orElse(null);
         }
     }
