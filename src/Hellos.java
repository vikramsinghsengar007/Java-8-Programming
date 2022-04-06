import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hellos {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(2,17,25,9,5);


        Collections.sort(intList);
        int count =3;
        for(int j = intList.size()-1; j> 0; j--){
            if(count !=0){
                System.out.println(intList.get(j));
                count--;
            }
        }
    }
}
