package day2;

public class Room {
	
	public int roomno;
	public String roomtype;
	public float roomarea;
	public String ACMachine;
	
	public void setData(int no, String type, float area, String machine) {
		
		roomno = no;
		roomtype = type;
		roomarea = area;
		ACMachine = machine;
		
	}
	
	public void displayData() {
		
		System.out.println(roomno);
		System.out.println(roomtype);
		System.out.println(roomarea);
		System.out.println(ACMachine);
		
	}
}
