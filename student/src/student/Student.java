package student;

public class Student {
	int RollNumber;
	String Name;
	String Department;
	char section;
	static String collegename="KIET"; // class variable
	
	public Student(int RollNumber, String Name, String Department, char section) {
		this.RollNumber=RollNumber;
		this.Name=Name;
		this.Department=Department;
		this.section=section;
	}
	public Student() {
		this.RollNumber=3;
		this.Name="unknown";
		this.Department="AI";
		this.section='C';
	}
	public Student(Student obj) {
		this.RollNumber=obj.RollNumber;
		this.Name=obj.Name;
		this.Department=obj.Department;
		this.section=obj.section;
	}
	
	public void studying(int No_of_hours) {
		
		System.out.println("the student is studying for"+No_of_hours);
	}
	public void playing() {
		System.out.println("Student is Playing");
	}
	public void displayInfo() {
		System.out.println("the name of the student is"+Name + "the college name is"+collegename);
	}
	public static void main(String args[]) {
		Student student1 = new Student(1, "Rohit", "AI", 'C');//parameterized constructor
		Student student2 = new Student();//default constructor
		Student student3 = new Student(student1); // copy constructor
		student1.displayInfo();
		student2.displayInfo();
		Student.collegename="IIT";
		//student1.collegename="NIT";
		student1.displayInfo();
		student2.displayInfo();
		
		/*student2.Department="AI";
		student2.Name="Rohan";
		student2.RollNumber=1;
		student2.section='C';*/
		
		//student1.playing();
		//student3.displayInfo();
		//student1.studying(5);
		//System.out.println(student1.total);
		
	}

}
