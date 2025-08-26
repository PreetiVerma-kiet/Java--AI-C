package student;

public class HostelStudent extends RegularStudent{
	String hostel_name;
		
	public HostelStudent(int RollNumber, String Name, String Department, char section, int attend_per, String class_room, String hostel_name) {
		super(RollNumber, Name, Department,section, attend_per,class_room);
		this.hostel_name=hostel_name;
	}
	public void payFee() {
		//super.payFee();
		System.out.println("The student of Hostel"+hostel_name+"has submitted the tution fee + lab fee + library fee + hostel fee");
	}

}
