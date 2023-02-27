package answer4;

public class Engine {
	
	private int rmp;
	private int power;
	private String manufacturer;
	private boolean hasTurbo;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public int getRmp() {
		return rmp;
	}

	public void setRmp(int rmp) {
		this.rmp = rmp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean isHasTurbo() {
		return hasTurbo;
	}

	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}

	public Engine(int rmp, int power, String manufacturer, boolean hasTurbo) {
		super();
		this.rmp = rmp;
		this.power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}
	
	public boolean isTurboEngine(boolean hasTurbo)
	{
		if(hasTurbo)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
