package consForAbstract;

public abstract class Vechile {
	private String make;
    private String model;
    private int year;
    
    

	public abstract void start();
    
	public Vechile(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Vechile [Car Made=" + make + ", Car Model=" + model + ", Year=" + year + "]";
	}
     

}
