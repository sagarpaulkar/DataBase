package Database;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=2450;
		int rev=0; 
		while(num>-1) {
			
			int remainder= num%10;
			
			rev=rev*10+remainder;
			
			num=num/10;
			
		}
		System.out.println(rev);
		
}
}

