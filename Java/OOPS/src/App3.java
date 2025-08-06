
public class App3 {

	public static void callMe(Shape s) {		//pass triangle/rectange
		s.calculateArea();
	}
	
	public static void main(String[] args) {
		Shape s;
		s=new Triangle();
		s.calculateArea();
		
		s=new Rectangle();
		s.calculateArea();
			
	}

}
