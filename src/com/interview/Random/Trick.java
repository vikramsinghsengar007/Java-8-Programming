
public class Trick {
	public static void main(String[] args) {
		String str="hi i am hello";
		char newchar[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char ch[]= str.toCharArray();
			for (int j = 1; j < str.length(); j++) {
				if(ch[i]!=ch[j]){
					newchar[i]=ch[j];
				}
			}
			System.out.println(newchar);
			}
	}
}
