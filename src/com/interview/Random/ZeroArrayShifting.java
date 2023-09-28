
public class ZeroArrayShifting {
	public static void main(String[] args) {
		int arr[] = {0, 20, 10, 30, 0, 0};
		for (int i = 0; i < arr.length-1; i++) {
				if(arr[i] ==0) {
					arr[i] = arr[i+1];
					arr[i+1] = 0;
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
