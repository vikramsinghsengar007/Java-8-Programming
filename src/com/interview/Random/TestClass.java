import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class TestClass {
    public static void main(String args[] ) throws Exception {
     

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        ArrayList list=new ArrayList();
        for (int i = 0; i < N; i++) {
        	String element=br.readLine();
        	list.add(element);
		}
        String arr[]=new String[list.size()];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=(String) list.get(i);
			StringBuffer reverse= new StringBuffer(arr[i]).reverse();
			System.out.println(reverse);
		}
    }
}
