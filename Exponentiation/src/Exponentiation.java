/*
 * Done by Talib Bacchus
 * This program calculates exponents using recursion
 * Two integer values are taken in as parameters, the base and the power it is raised by
 */
public class Exponentiation {
	
	public static int FindExponent(int base, int power)
	{
		
		if(power==0)
		{
			return 1;
		}
		if(power==1)
		{
			return base ;
			
		}
		else
		{
			return base * FindExponent(base, power -1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(FindExponent(3,4));
	}
}
