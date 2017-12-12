import java.util.*;
import java.io.*;
public class Sorter
	{
		public static void main(String[] args)
			{
				int sorterType = menu();
				chooseSorter(sorterType);
				
			}
		public static int menu()
		{
			int name =1;
			int gpa =2;
			int period =3;
			System.out.println("How do you want to sort?");
			System.out.println("1) Sort by last name");
			System.out.println("2) Sort by GPA");
			System.out.println("3) Sort by period");
			Scanner reply = new Scanner(System.in);
			try
				{
				int a = reply.nextInt();
				if(a==1)
					{
						return name;
					}
				else if(a==2)
					{
						return gpa;
					}
				else if(a==3)
					{
						return period;
					}
				else
					{
						return 0;
					}
				}
			catch(InputMismatchException e)
			{
				return 0;
			}
		}
		public static void chooseSorter(int x)
		{
			if(x==0)
				{
					System.out.println();
					System.out.println();
					System.out.println("There seems to have been a problem. Please re-try!");
					int sorterType = menu();
					chooseSorter(sorterType);
				}
			else if(x==1)
				{
					lastName();
				}
			else if(x==2)
				{
					gpa();
				}
			else if(x==3)
				{
					period();
				}
		}
		public static void lastName()
		{
			
		}
		public static void gpa()
		{
			System.out.println("gpa");
		}
		public static void period()
		{
			System.out.println("period");
		}
	}