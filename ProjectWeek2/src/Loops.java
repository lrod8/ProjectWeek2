/**
 * 
 */

/**
 * @author lisar
 *
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//While loop that prints all even numbers from 0 to 100

		int a = 0;
		while (a <101) {
			System.out.println(a);
			a+=2;
		}

//While loop that prints every 3rd number going backwards from 100 until we reach 0
		
		int b = 100;
		while (b > -1) {
			System.out.println(b);
			b-=3;
		}

//For loop that prints every other number from 1 to 100
		
		for (int c=1; c<101; c+=2) {
			System.out.println(c);
		}	
		
/* For loop that prints every number from 0 to 100
 * If number is divisible by 3, print "Hello" instead of number
 * If number is divisible by 5, print "World" instead of number
 * If number is divisible by 3 & 5, print "HelloWorld" instead of number
 */
		
		for (int d= 0; d<101; d++) {
			if (d % 3 == 0 && d % 5 != 0) {
				System.out.println("Hello");
			}else if (d % 3 != 0 && d % 5 == 0) {
				System.out.println("World");
			}else if (d % 3 == 0 && d % 5 == 0) {
				System.out.println("HelloWorld");
			}else {
				System.out.println(d);
			}
		}
	}

}
