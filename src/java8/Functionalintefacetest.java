package java8;

interface x1{
	void call(String arg);
	default void display(String a) {
		System.out.println("display"+a);
	}
	static void print(String s) {
		System.out.println("Printing"+s);
	}
}
@Override
interface x2{
	void call(String arg);
	default void display(String a) {
		System.out.println("display"+a);
	}
public class Functionalintefacetest implements x1.x2 {
	public void call2(String arg) {
		
	}
public void call(String arg) {
		
	}
@Override
public void display(String a)
	x2.super.display(a);
}

	
}
