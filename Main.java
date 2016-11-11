import java.util.Scanner;

public class Main 
{
	public static void main(String[]args)
	{
		LinearEquation l=new LinearEquation();
		QuadraticEquation q=new QuadraticEquation();
		System.out.println("Choose:");
		int count=0;
		Scanner scanner =new Scanner(System.in);
		while(count==0)
		{
			System.out.println("1:Calculate a Quadratic equation");
			System.out.println("2:Calculate a Linear equation");
			System.out.println("3:End");
			String choice=scanner.nextLine();
			switch(choice)
			{
				case "1": 
					System.out.println("Quadratic equation.");
					try
					{
						q.solve();	
					} catch (IllegalCoefficientException a)
					{
						System.out.println(a.getMessage());
					}
				
					break;
				case "2": 
					System.out.println("Linear equation.");
					try
					{
						l.solve(); 
					} catch(IllegalCoefficientException a)
					{
						System.out.println(a.getMessage());
					}
					break;
				case "3": count++;
					break;
				default: System.out.println("Enter the correct choice:");
					break;
			}
		}
	}
}

