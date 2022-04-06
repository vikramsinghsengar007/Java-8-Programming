import java.util.Arrays;

public class SeparateZeroFromArray {
    public static void main(String[] args) {
        int[] arr = {1,3,0,2,0,4,6,0,0};
int j=0;
        for (int i=0; i< arr.length-1; i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
