// swap with third varibles

class swap {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		int temp;
		
		
		temp =a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.print(b);
		
		
		// without using third varible

		int c = 20;
		int d = 10;
		
		
		c = c+d;
		
		d = c-d;
		
		c = c-d;
		
		
		System.out.println(c);
		System.out.println(d);
		
		 
	 

	}

}
