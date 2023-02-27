package answer.one;

public class CheckWeather {
	
	public void weatherConditions (boolean isSnowing ,boolean isRaining, double temperature)
	{
		if(isSnowing && isRaining && temperature <50.0)
		{
			System.out.println( "Let’s stay home. " + "if its raining or snowing.");
		}
		else {
			System.out.println("Let’s go out! ");
		}
	}
	
	public static void main(String[] args) {

		CheckWeather ch= new CheckWeather();
		ch.weatherConditions(false, false, 60.0);
		CheckWeather ch1= new CheckWeather();
		ch1.weatherConditions(true, true, 30.0);

	}


}
