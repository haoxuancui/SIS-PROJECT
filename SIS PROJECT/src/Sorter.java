import java.util.*;

import javafx.scene.chart.PieChart.Data;

import java.io.*;
public class Sorter
	{
		public static ArrayList<Data> roster = new ArrayList<Data>();
		public static void main(String[] args)
			{
				roster.add("K", "B", 4, "a", "A+", "b", "B+", "c", "C+");
				int sorterType = menu();
				chooseSorter(sorterType);
			}
		public static int menu()
		{
			int name =1;
			int gpa =2;
			int period =3;
			System.out.println("How do you want to sort?");
			System.out.println("	1) Sort by last name");
			System.out.println("	2) Sort by GPA");
			System.out.println("	3) Sort by period");
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
			ArrayList<String> lastNames = new ArrayList<String>();
			for(int x=0; x<roster.size(); x++)
				{
					lastNames.add(roster.get(x).getLastName());
				}
			Collections.sort(lastNames);
			ArrayList<Data> finished = new ArrayList<Data>();
			for(int x=0; x<roster.size(); x++)
				{
					if(roster.get(x).getLastName().equals(lastNames.get(x)))
						{
							finished.add(roster.get(x));
						}
				}
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