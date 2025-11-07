package unit2;

@FunctionalInterface
 interface Demo{
	 void show();
}
//class functional implements Demo{
//	public void show() {
//		System.out.println("this is the implementation of functional interface");
//	}	
//}
public class MyFunctionalInterface {
	public static void main(String[] args) {
		Demo obj = () -> System.out.println("this is the implementation of functional interface");
		obj.show();
	}

}



//functional fun = new functional();
//fun.show();




//Demo obj = new Demo() {
//	public void show() {
//		System.out.println("this is the implementation of functional interface");
//	}
//};
//obj.show();