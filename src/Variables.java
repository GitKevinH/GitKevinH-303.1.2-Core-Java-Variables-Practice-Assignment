
public class Variables {

	public static void main(String[] args) {
		question1();
		System.out.println("-----------");
		question2();
		System.out.println("-----------");
		question3();
		System.out.println("-----------");
		question4();
		System.out.println("-----------");
		question5();
		System.out.println("-----------");
		question6();
		System.out.println("-----------");
		question7();
		System.out.println("-----------");
		question8();
	}
		
		
		public static void question1() {
		
			// Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
			// Assign the sum to a variable. Print out the result.
		
	
			int z = 10;
			int x = 20;
		
			System.out.println("The value for int z is: " +z ); 
			System.out.println("The value for int x is: " +x );
			System.out.println("The value when adding z + x is: "+ (z+x)  );
		
		}


		
		public static void question2() {

			// Write a program that declares 2 double variables, assigns a number to each, 
			// and adds them together. Assign the sum to a variable. Print out the result.
		
			double c = 22.222222;
			double b = 44.444444;
		
			System.out.println("The value for double c = " +c);
			System.out.println("The value for double b = " +b);
			System.out.println("The value when adding c + b is: " + (c+b) );
		
		}
		
		public static void question3() {
			// Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
			// Assign the sum to a variable. Print out the result. What variable type must the sum be?
			// 			Answer: The sum's variable type must be a double due to implicit casting.
			
			int z = 23;
			double x = 55.555;
			
			double addedVariable = z + x;
			
			System.out.println("The result of adding int z and double x is: " +addedVariable);
			
		}
		
		
		public static void question4() {
			/* Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
			 * Assign the result to a variable. Print out the result. Now change the larger number to a decimal.
			 * What happens? What corrections are needed?
			 *		Answer: At first if we divide the two int variables and the result has a decimal, the decimal will be rounded off and only show zero. 
			 *	    If we change the larger number to a decimal, we need to change the data type to one that can
			 *	    handle it, like a float or double. We must do this to the division operator as well to get an accurate calculation.
			 *		After that, if we execute the division operator it will return 0.7912957467853611.
			*/	
			
			double z = 50.55;
			int x = 40;
			
			double dividedVariable = x/z;
			
			System.out.println("The result of dividing int x by int z is: " +dividedVariable);
			
		}
		
		public static void question5() {
			// Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
			// Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
			
			double z = 12;
			double x = 22;
			
			double y = x/z;
			
			System.out.println("Result of double z / double y = "+y );
			System.out.println("After casting into an int data type, the result of double z / double y = "+(int)y );
			
		}
		
		
		public static void question6() {
			// Write a program that declares two integer variables, x, and y, and assigns 5 to x and 6 to y. 
			// Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
			
			int x = 5;
			int y = 6;
			double q = y/x;
			
			System.out.println("The result of assigning variable q to 'y/x' is: "+q);
			
			q = (double)y/x;
			
			System.out.println("After casting y as a double, the result of assigning variable q to 'y/x' is: "+q);
			
		}
		
		public static void question7() {
			// Write a program that declares a named constant and uses it in a calculation. Print the result.
			
			final int CONSTANTVAR = 23;
			
			
			System.out.println("The result of adding one to the constant variable is: " + (CONSTANTVAR+1));
			
		}
		
		public static void question8() {
			
		/*	Write a program where you create 3 variables that represent products at a cafe. 
		 *	The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. 
		 *	Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 
		 *	4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal.
		 *	Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
		 *	Be sure to format the results to 2 decimal places.
		*/	
			
			float sandwich = 5.99f;
			float crossaint = 3.99f;
			float coffee = 1.99f;
			float subtotal, totalSale;
			final float SALES_TAX = 1.06f;
			
			subtotal = 3*sandwich + 4*crossaint + 2*coffee; // Order value going into subtotal
			totalSale = subtotal*SALES_TAX;
			
			System.out.printf("Your order's total for today is: $%.2f%n",totalSale);
					
		}
		
}