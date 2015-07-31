package Temperature;

public class Temperature {

	double degrees;
	double farenheit;
	
	public  Temperature(){
		degrees = 0;
		farenheit = 0;
		
	}
	public double Convert(double degrees){
	farenheit = (degrees * 2) + 30;
	return farenheit;
			
		}
			
		
		
	}

