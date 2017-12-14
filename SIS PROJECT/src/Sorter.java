import java.util.*;

import javafx.scene.chart.PieChart.Data;

import java.io.*;
public class Sorter
	{
		public static void sorter()
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
			for(int x=0; x<informations.roster.size(); x++)
				{
					lastNames.add(informations.roster.get(x).getLastName());
				}
			Collections.sort(lastNames);

			ArrayList<Student> finished = new ArrayList<Student>();
			for(int j=0; j<informations.roster.size(); j++)
				{
			for(int x=0; x<informations.roster.size(); x++)

				{
					if(informations.roster.get(x).getLastName().equals(lastNames.get(j)))
						{
							finished.add(informations.roster.get(x));
						}
				}
				}
			for(int x=0; x<finished.size(); x++)
				{
					System.out.println(finished.get(x).getFirstName() + " " + finished.get(x).getLastName() + " " + finished.get(x).getClass1()+ " " + finished.get(x).getClass1Grade()+ " " + finished.get(x).getClass2()+ " " + finished.get(x).getClass2Grade()+ " " + finished.get(x).getClass3()+ " " + finished.get(x).getClass3Grade()+ " " + finished.get(x).getGPA());
				}
		}
		public static void gpa()
		{
			ArrayList<Double> lastNames = new ArrayList<Double>();
			for(int x=0; x<informations.roster.size(); x++)
				{
					lastNames.add(informations.roster.get(x).getGPA());
				}
			Collections.sort(lastNames);
			ArrayList<Student> finished = new ArrayList<Student>();
			for(int j=0; j<informations.roster.size(); j++)
				{
			for(int x=0; x<informations.roster.size(); x++)
				{
					if(informations.roster.get(x).getGPA() == (lastNames.get(j)))
						{
							finished.add(informations.roster.get(x));
							informations.roster.remove(x);
							j++;
						}
				}
				}
			for(int x=0; x<finished.size(); x++)
				{
					System.out.println(finished.get(x).getFirstName() + " " + finished.get(x).getLastName() + " " + finished.get(x).getClass1()+ " " + finished.get(x).getClass1Grade()+ " " + finished.get(x).getClass2()+ " " + finished.get(x).getClass2Grade()+ " " + finished.get(x).getClass3()+ " " + finished.get(x).getClass3Grade()+ " " + finished.get(x).getGPA());
				}
		}
		public static void period()
		{
			Scanner reply = new Scanner(System.in);
			System.out.println("What period would you like?");
			int period = reply.nextInt();
			if(period == 1)
				{
					period1();
				}
			else if(period == 2)
				{
					period2();
				}
			else if(period == 3)
				{
					period3();
				}
			
		}
		public static void period1()
			{
				ArrayList<String> lastNames = new ArrayList<String>();
				for(int x=0; x<informations.roster.size(); x++)
					{
						lastNames.add(informations.roster.get(x).getClass1());
					}
				Collections.sort(lastNames);
				ArrayList<Student> finished = new ArrayList<Student>();
				for(int j=0; j<informations.roster.size(); j++)
					{
				for(int x=0; x<informations.roster.size(); x++)
					{
						if(informations.roster.get(x).getClass1() == (lastNames.get(j)))
							{
								finished.add(informations.roster.get(x));
							}
					}
					}
				for(int x=0; x<finished.size(); x++)
					{
						System.out.println(finished.get(x).getFirstName() + " " + finished.get(x).getLastName() + " " + finished.get(x).getClass1()+ " " + finished.get(x).getClass1Grade()+ " " + finished.get(x).getClass2()+ " " + finished.get(x).getClass2Grade()+ " " + finished.get(x).getClass3()+ " " + finished.get(x).getClass3Grade()+ " " + finished.get(x).getGPA());
					}
			}
		public static void period2()
			{
				ArrayList<String> lastNames = new ArrayList<String>();
				for(int x=0; x<informations.roster.size(); x++)
					{
						lastNames.add(informations.roster.get(x).getClass2());
					}
				Collections.sort(lastNames);
				ArrayList<Student> finished = new ArrayList<Student>();
				for(int j=0; j<informations.roster.size(); j++)
					{
				for(int x=0; x<informations.roster.size(); x++)
					{
						if(informations.roster.get(x).getClass2() == (lastNames.get(j)))
							{
								finished.add(informations.roster.get(x));
							}
					}
					}
				for(int x=0; x<finished.size(); x++)
					{
						System.out.println(finished.get(x).getFirstName() + " " + finished.get(x).getLastName() + " " + finished.get(x).getClass1()+ " " + finished.get(x).getClass1Grade()+ " " + finished.get(x).getClass2()+ " " + finished.get(x).getClass2Grade()+ " " + finished.get(x).getClass3()+ " " + finished.get(x).getClass3Grade()+ " " + finished.get(x).getGPA());
					}
			}
		public static void period3()
			{
				ArrayList<String> lastNames = new ArrayList<String>();
				for(int x=0; x<informations.roster.size(); x++)
					{
						lastNames.add(informations.roster.get(x).getClass3());
					}
				Collections.sort(lastNames);
				ArrayList<Student> finished = new ArrayList<Student>();
				for(int j=0; j<informations.roster.size(); j++)
					{
				for(int x=0; x<informations.roster.size(); x++)
					{
						if(informations.roster.get(x).getClass3() == (lastNames.get(j)))
							{
								finished.add(informations.roster.get(x));
							}
					}
					}
				for(int x=0; x<informations.roster.size(); x++)
					{
						System.out.println(finished.get(x).getFirstName() + " " + finished.get(x).getLastName() + " " + finished.get(x).getClass1()+ " " + finished.get(x).getClass1Grade()+ " " + finished.get(x).getClass2()+ " " + finished.get(x).getClass2Grade()+ " " + finished.get(x).getClass3()+ " " + finished.get(x).getClass3Grade()+ " " + finished.get(x).getGPA());
					}
			}
	}