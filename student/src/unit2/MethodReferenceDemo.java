package unit2;

@FunctionalInterface
interface example{
	void greet();
	
}
public class MethodReferenceDemo {
	public static void greetings() {
		System.out.println("static method reference example");
	}
	public void objGreetings() {
		System.out.println(" object method reference example");
	}
	
	public static void main(String[] args) {
		MethodReferenceDemo o1 = new MethodReferenceDemo();
		example obj = MethodReferenceDemo::new;
		obj.greet();
	}

}
