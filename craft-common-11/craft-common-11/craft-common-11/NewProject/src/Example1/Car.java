package Example1;

public class Car {
	 static  void  age(int x){
		if(x>18) {
			System.out.println("you are capable of driving");
			
		}
		else if(x<18) {
			System.out.println("you are too young to drive");
		}
		else {
			System.out.println("cheack it again ");
		}
	 }

	public static void main(String[] args) {
	
	age(20);
	age(14);
	}

}
