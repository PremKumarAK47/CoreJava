package consForAbstract;

public class Cars extends Vechile {
	
	


	int numDoors;

	public Cars(String make, String model, int year, int numDoors) {
		super(make, model, year);
		// TODO Auto-generated constructor stub
		this.numDoors=numDoors;
	}
	


	@Override
	public void start() {
		System.out.println("Car is Starting...!!");
		
	}

	public int getNumDoors() {
		return numDoors;
	}


	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}


	
	

}
