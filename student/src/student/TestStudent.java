package student;

public class TestStudent {
	public static void main(String args[]) {
		Student student1 = new Student(1, "Rohit", "AI", 'C');//parameterized constructor
		Student student2 = new Student();//default constructor
		Student student3 = new Student(student1); // copy constructor
		HostelStudent hs = new HostelStudent(1, "Priya", "AIML", 'G', 80, "H506", "Araya");
		
		RegularStudent rs = new RegularStudent(1, "Priya", "AIML", 'G', 80, "H506");
		//rs.displayInfo();
		//rs.payFee();
		System.out.println(hs.Name);
		hs.payFee();
		//student1.payFee();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//student1.Department="AIML";
		//student1.displayInfo();
		//student2.displayInfo();
		//Student.collegename="IIT";
		//student1.collegename="NIT";
		//student1.displayInfo();
		//student2.displayInfo();
		
		
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
