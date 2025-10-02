public static Weather(){
	int temperature;
	String weather;
	temperature = Math.random()*65 + 25;
		if temperature < 65{
			weather = "Cold";
		}
		else if 65 <= temperature < 85{
			weather = "Cloudy";
		}
		else {
			weather = "Sunny";
		}
		System.out.println("Temp: " + temperature);
		System.out.println("Weather: " + weather);
}
