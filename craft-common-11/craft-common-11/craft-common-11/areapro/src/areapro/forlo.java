package areapro;

public class forlo {

	public static void main(String[] args) {
		System.out.println(isodd(10)  );
		System.out.println(sumodd(0,10));

	}
	public static boolean isodd(int number) {
		
		if(number<0) {
			return false;
		}
		else if (number%2 >0) {
			return true;
			}
		else {
			return false;
		}
	}
	public static int sumodd(int start,int end) {
		int sum=0;
		for(int i=start;i<end;i++) {
			if(isodd(i)==true) {
				sum+=i;
				
			}
			
		}
		return sum;
	}
}

		
	



