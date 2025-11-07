package unit2;
@FunctionalInterface
interface operation{
	int calculate (int n);
}
public class PracticeSet {
	public static int square(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		operation op = new operation() {
			public int calculate (int n) {
				return n*n;
			}
		};
System.out.println("Square using Anonymous Inner Class"+op.calculate(5));
	operation op1 =(n)-> n*n;
	System.out.println("Square using lambda expression"+op1.calculate(5));
	operation op2 = PracticeSet::square;
	System.out.println("Square using method reference"+op2.calculate(5));
	}

}
