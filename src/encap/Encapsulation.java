package encap;

public class Encapsulation {
	// private attributes
	private int mobNo;
	private String name;
	private int dob;

	// public getter and setter methods
	public int getMobNo() {
		return mobNo;
	}

	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setMobNo(987678654);
		obj.setName("Akshay");
		obj.setDob(10011998);
		
		System.out.println("Mobile No ---> "+obj.getMobNo());
		System.out.println("DOB ---> " +obj.getDob());
		System.out.println("Name ---> " +obj.getName());

	}

}
