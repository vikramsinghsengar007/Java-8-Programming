
	interface Printable{
		void print();
		}


    interface Showable{
    void print();
    }

		class MultipleInheritance implements Printable,Showable{

		public void print(){System.out.println("Hello: ");}

		public static void main(String args[]){
			Printable obj = new MultipleInheritance();
		obj.print();
		Showable obj1 = new MultipleInheritance(){
			public void print(){
				System.out.println("Test");
			}
		};
		obj1.print();
		 }
		}
