package tester;
import com.app.Calculator;
import java.util.Scanner;
public class TestCalc
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers :");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();

		Calculator c=new Calculator();
		c.setFirstNo=n1;
		c.setSecondNo=n2;

		int ch;
		do
		{
			System.out.print("\nMenu\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n0.Exit\n");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.print("AddResult =" + c.add());

				}break;

				case 2:
				{
					System.out.print("SubResult =" + c.sub());
				}break;

				case 3:
				{
					System.out.print("MulResult =" + c.mul());
				}break;

				case 4:
				{
					System.out.print("DivResult =" + c.div());
				}break;

				case 0:
				{}break;
				
				default:
				{
					System.out.print("invalid choice");
				}break;
			}
		}while(ch!=0); 
	}
}