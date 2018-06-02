package java8;

public class Runnabletest {
//java 7
	/*public static void main(String[] args) {
	Runnable r= new Runnable() {
		public void run() {System.out.println("call run");}
		
	};
	
	r.run();*/
	
	//java 8 
	Runnable r1=()->System.out.println("call run");
	r1.run();
	}

}
