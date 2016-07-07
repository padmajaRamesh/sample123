package test_one;

import java.security.AllPermission;
import java.util.Scanner;

public class Calculate implements Calc {
	Calculate() {
	}

	@Override
	public Integer add(Integer a, Integer b) {

		return a + b;
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		return a - b;
	}

	@Override
	public Integer multiply(Integer a, Integer b) {
		return a * b;
	}

	@Override
	public Integer divide(Integer a, Integer b) {

		return a / b;
	}
public void all_func(char action,Calc calc)
{
	System.out.println("enter two integers");
	Scanner input= new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();

	switch (action) {
	case '+':
		
		int add1 = calc.add(a, b);
		System.out.print(add1);
		break;
	case '-':
		int sub1 = calc.sub(a, b);
		System.out.print(sub1);
		break;
	case '*':
		int mul1 = calc.multiply(a, b);
		System.out.print(mul1);
		break;
	case '/':
		int div1 = calc.multiply(a, b);
		System.out.print(div1);
		break;
	default:

	}
}
	public static void main(String args[]) {
		System.out.println("Enter your choice +,-,*,//");

		Scanner sc = new Scanner(System.in);
		Calculate calc = new Calculate();

		char action = sc.next().charAt(0);
		for(;action!='q';)
		{
			calc.all_func(action, calc);
			System.out.println("Enter your choice +,-,*,//,q");
			action = sc.next().charAt(0);
		}
		System.out.println("thank you");
		sc.close();

	}
}
