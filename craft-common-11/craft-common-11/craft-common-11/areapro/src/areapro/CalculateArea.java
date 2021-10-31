package areapro;

public class CalculateArea {

	public static void main(String[] args) {
		calcYearAndDay(4000);
   
    	
    }
	 public static void calcYearAndDay(long minute) {
	    	if (minute<0) {
	    		System.out.println("invalid value");
	    	}
	    	long year=minute/525600;
	    	long riminderofyear=(minute%525600)/1440;
	    	System.out.println(minute +"m" + "=" + year+"y"  +  riminderofyear+"d");  
	}

}
