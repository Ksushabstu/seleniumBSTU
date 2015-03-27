package Calcul;
import java.util.Scanner;
public class Odin {
	
		public static void main(String[] args) {

			/*
			 * int x = 1; int y = 4;
			 * 
			 * System.out.println(x); System.out.println(y);
			 */

			System.out.println("Please enter first number: ");
			Scanner scanner = new Scanner(System.in);
			String number1 = scanner.nextLine();

			System.out.println("Please enter second number: ");
			String number2 = scanner.nextLine();
			
			System.out.println("result sum");
			double res = Operatori.add(Double.valueOf(number1),
					Double.valueOf(number2));
			System.out.println(res);

			System.out.println("result subtraction");
			double res1 = Operatori.sub(Double.valueOf(number1),
					Double.valueOf(number2));
			System.out.println(res1);

			System.out.println("result multiplication");
			double res2 = Operatori.mnog(Double.valueOf(number1),
					Double.valueOf(number2));
			System.out.println(res2);

			System.out.println("result divided");
			double res3 = Operatori.delen(Double.valueOf(number1),
					Double.valueOf(number2));
			System.out.println(res3);
		}

	}

