package basicJava;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a,int b) {
		return a - b;
	}
	
	public int multiplication(int a,int b) {
		return a * b;
	}
	
	public double div(int a,int b) {
		return (double) a / b;
	}
	
	public void swap(int a, int b) {
		System.out.println("Before swapping");
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		
		System.out.println("After Swapping:");
		int c = a;
		a = b;
		b = c;
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		
	}
	
	public boolean checkPrime(int num) {
		
		for(int i = 2;i<num;i++) {
			if(num % i ==0) {
				System.out.println(num +" is not prime number");
				return false;
			}
		}
		System.out.println(num + " is a prime number");
		return true;
		
	}
	
	public static void main(String [] args) {
		Calculator obj = new Calculator();
		System.out.println("Addition: "+ obj.add(2,4));
		System.out.println("Subtraction: " +obj.subtract(8,2));
		System.out.println("Multiplication: " +obj.multiplication(6,5));
		System.out.println("Division: "+obj.div(8, 3));
		obj.swap(4,6);
		System.out.print(obj.checkPrime(17));
		
	}

}
