import java.util.HashMap;
import java.util.Map;


public class HashMapException {
public static void main(String[] args) {
	Map<Integer,String> map= new HashMap<Integer, String>();
	map.put(1, "a");
	map.put(2, "b");
	/*for (int i = 0; i < map.size(); i++) {
		map.remove(i);
		System.out.println(map);
	}*/
	
	for (Integer key : map.keySet() ) {
		map.remove(key);
		System.out.println(key);
	}
}
}
