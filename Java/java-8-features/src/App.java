
public class App {

	public static void main(String[] args) {
		Person raja;
//		raja=new Student();
//		raja.speak();
		
		raja=()->{	System.out.println("Mithun speaks");};
		raja.speak();
		
		
		raja=new Person() {
			
			@Override
			public void speak() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
