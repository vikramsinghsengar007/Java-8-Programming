import java.util.Arrays;

/*Given a list of integers, find the total number of elements present in the list using Stream functions?*/
 public class CountTotalNoOfElem {
     public static void main(String[] args) {
         Integer arr[] = {10,15,8,49,25,98,98,32,15};
         System.out.println(findFirst(arr));

     }
     public static Long findFirst(Integer[] numArr){
          return Arrays.stream(numArr).count();
     }
 }
