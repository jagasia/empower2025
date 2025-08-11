import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		Method[] methods = Product.class.getMethods();
		for(Method method:methods)
		{
			Annotation[] anns = method.getAnnotations();
			System.out.println("Annotations in "+method.getName()+":-");
			
			for(Annotation a:anns) {
				
				System.out.println("--"+a);
			}
			System.out.println("------------------");
		}
	}

}
