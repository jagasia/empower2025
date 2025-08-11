
public class AppSyncMethod {

	public static void main(String[] args) {
		NumberGenerator ng=new NumberGenerator();
//		NumberGenerator ng2=new NumberGenerator();
		NGThread t1=new NGThread(ng);
		NGThread t2=new NGThread(ng);
		
		t1.setName("Bhuvan");
		t2.setName("Sameeksha");
		
		t1.start();
		t2.start();
	}

}
