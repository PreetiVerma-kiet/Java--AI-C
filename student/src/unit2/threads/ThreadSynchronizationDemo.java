package unit2.threads;
class Booking{
	static int total_ticket = 10;
	static synchronized void  book(int no_of_tickets) {
		if(no_of_tickets<total_ticket) {
			System.out.println("Ticket booked successfully");
			total_ticket-=no_of_tickets;
			System.out.println("total no of tickets left:"+total_ticket);
		}
		else {
			System.out.println("ticket can not be booked");
			System.out.println("total no of tickets left:"+total_ticket);
		}
	}
}
public class ThreadSynchronizationDemo extends Thread {
	Booking b;
	int ticket;
	public ThreadSynchronizationDemo(Booking b, int ticket) {
		this.ticket = ticket;
		this.b=b;
	}
	public void run() {
		b.book(ticket);
	}
	public static void main(String[] args) {
		//b= new Booking();
		Booking b1= new Booking();
		Booking b2= new Booking();
		//Booking b3= new Booking();
		ThreadSynchronizationDemo t1 = new ThreadSynchronizationDemo(b1,9);
		ThreadSynchronizationDemo t2 = new ThreadSynchronizationDemo(b2,8);
		//ThreadSynchronizationDemo t3 = new ThreadSynchronizationDemo(b3,7);
		t1.start();
		t2.start();
		//t3.start();
	}

}
