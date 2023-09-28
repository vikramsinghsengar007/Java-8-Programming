interface i{
	int x=10;
	public static final int y=20;
	 void m1();
}

public class Inter implements i {
		public static final int x=100;
	@Override
	public void m1() {
		System.out.println("class-m1()");
		
		
	}
	
	 public void AA(int x){}
	 private void AA(){}
	
	public static void main(String[] args) {
		Inter o=new Inter();
		o.m1();
		System.out.println(x);
		System.out.println(y);
	}
	

}
