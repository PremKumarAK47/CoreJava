package answer3;

public class Student {
	private int roll;
	private String name;
	private  String address;
	private  String collageName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	
	
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName="NIT";
	}
	
	
 
	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}

	public static Student getStudent (boolean isFromNIT)
	{
	
		if(isFromNIT)
		{
			Student sNIT= new Student(1, "Murshid", "AllahPur");
			
			return sNIT;
			
		}
		else
		{
			Student sOther= new Student(2, "Efat", "ChetGanj", "KashiVidyaPeeth");
			//System.out.println("==================================");
			return sOther;
		}
	}


}
