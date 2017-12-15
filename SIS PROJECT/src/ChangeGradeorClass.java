import java.util.*;

public class ChangeGradeorClass
{
	public static String changeStudentsclass;
	public static int switchClassChoice;
	public static String sc;
	public static void ChangeClassOrGrade()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to...");
		System.out.println("1) Switch a student's class");
		System.out.println("2) Change a student's grade");
		int choice1 = in.nextInt();
		
		if (choice1 == 1)
		{
			changeClass();
		}
		
		else if (choice1 == 2)
		{
			changeGrade();
		}
		//ss
	}
	
	public static void changeClass()
	{	
		
		System.out.println("Which student?");
		
		for(int i = 0 ; i < informations.roster.size() ; i++)
		{
			System.out.println(informations.roster.get(i).firstName);
		}
		Scanner in = new Scanner(System.in);
		changeStudentsclass = in.nextLine();
		ArrayList<Student> tempList = new ArrayList<Student>();
		for(int i = 0 ; i < informations.roster.size() ; i++)
			{
			String temp = informations.roster.get(i).firstName;
			if(changeStudentsclass.equals(temp))
				{
					String initialperiod1 = informations.roster.get(i).class1;
					String initialperiod2 = informations.roster.get(i).class2;
					String initialperiod3 = informations.roster.get(i).class3;
					
					informations.roster.get(i);
					System.out.println();
					System.out.println("This is your schedule");
					System.out.println("1) " + informations.roster.get(i).class1);
					System.out.println("2) " + informations.roster.get(i).class2);
					System.out.println("3) " + informations.roster.get(i).class3);
					
					System.out.println("Put your class 1 in which period");
					int newClassChoice1 = in.nextInt();
					if(newClassChoice1==1)
						{
							informations.roster.get(i).setClass1(initialperiod1);
						}
					else if(newClassChoice1==2)
						{
							informations.roster.get(i).setClass2(initialperiod1);
						}
					else if(newClassChoice1==3)
						{
							informations.roster.get(i).setClass3(initialperiod1);
						}
					System.out.println("Put your class2 in which period");
					int newClassChoice2 = in.nextInt();
					if(newClassChoice2==1)
						{
							informations.roster.get(i).setClass1(initialperiod2);
						}
					else if(newClassChoice2==2)
						{
							informations.roster.get(i).setClass2(initialperiod2);
						}
					else if(newClassChoice2==3)
						{
							informations.roster.get(i).setClass3(initialperiod2);
						}
					System.out.println("Put your class 3 in which period");
					int newClassChoice3 = in.nextInt();
					if(newClassChoice3==1)
						{
							informations.roster.get(i).setClass1(initialperiod3);
						}
					else if(newClassChoice3==2)
						{
							informations.roster.get(i).setClass2(initialperiod3);
						}
					else if(newClassChoice3==3)
						{
							informations.roster.get(i).setClass3(initialperiod3);
						}
					System.out.println("1) " + informations.roster.get(i).class1);
					System.out.println("2) " + informations.roster.get(i).class2);
					System.out.println("3) " + informations.roster.get(i).class3);
					for(int x=0; x<informations.roster.size(); x++)
						{
							System.out.println(informations.roster.get(x).getFirstName() + " " + informations.roster.get(x).getLastName() + " " + informations.roster.get(x).getClass1()+ " " + informations.roster.get(x).getClass1Grade()+ " " + informations.roster.get(x).getClass2()+ " " + informations.roster.get(x).getClass2Grade()+ " " + informations.roster.get(x).getClass3()+ " " + informations.roster.get(x).getClass3Grade()+ " " + informations.roster.get(x).getGPA());
						}
					
					
				}
			}
		
		
		
		
	}
	
	public static void changeGrade()
	{
System.out.println("Which student?");
		
		for(int i = 0 ; i < informations.roster.size() ; i++)
		{
			System.out.println(informations.roster.get(i).firstName);
		}
		Scanner in = new Scanner(System.in);
		changeStudentsclass = in.nextLine();
		for(int i = 0 ; i < informations.roster.size() ; i++)
			{
			String temp = informations.roster.get(i).firstName;
			if(changeStudentsclass.equals(temp))
				{
					informations.roster.get(i);
					System.out.println();
					System.out.println("This is your schedule");
					System.out.println("1) " + informations.roster.get(i).class1);
					System.out.println("2) " + informations.roster.get(i).class2);
					System.out.println("3) " + informations.roster.get(i).class3);
					System.out.println("You want to change what class.");
					int classNewGrade1 =in.nextInt();
					Scanner Intin = new Scanner(System.in);
					if(classNewGrade1==1)
						{
							System.out.println("Do you want change "+informations.roster.get(i).class1Grade+" to what grade?");
							String classNewGrade2 = Intin.nextLine();
							informations.roster.get(i).setClass1Grade(classNewGrade2);
							MainMenu.setGPA();
							for(int x=0; x<informations.roster.size(); x++)
								{
									System.out.println(informations.roster.get(x).getFirstName() + " " + informations.roster.get(x).getLastName() + " " + informations.roster.get(x).getClass1()+ " " + informations.roster.get(x).getClass1Grade()+ " " + informations.roster.get(x).getClass2()+ " " + informations.roster.get(x).getClass2Grade()+ " " + informations.roster.get(x).getClass3()+ " " + informations.roster.get(x).getClass3Grade()+ " " + informations.roster.get(x).getGPA());
								}
						}
					if(classNewGrade1==2)
						{
							System.out.println("Do you want change "+informations.roster.get(i).class2Grade+" to what grade?");
							String classNewGrade3 = Intin.nextLine();
							informations.roster.get(i).setClass2Grade(classNewGrade3);
							MainMenu.setGPA();
							for(int x=0; x<informations.roster.size(); x++)
								{
									System.out.println(informations.roster.get(x).getFirstName() + " " + informations.roster.get(x).getLastName() + " " + informations.roster.get(x).getClass1()+ " " + informations.roster.get(x).getClass1Grade()+ " " + informations.roster.get(x).getClass2()+ " " + informations.roster.get(x).getClass2Grade()+ " " + informations.roster.get(x).getClass3()+ " " + informations.roster.get(x).getClass3Grade()+ " " + informations.roster.get(x).getGPA());
								}
						}
					if(classNewGrade1==3)
						{
							System.out.println("Do you want change "+informations.roster.get(i).class3Grade+" to what grade?");
							String classNewGrade4= Intin.nextLine();
							informations.roster.get(i).setClass3Grade(classNewGrade4);
							MainMenu.setGPA();
							for(int x=0; x<informations.roster.size(); x++)
								{
									System.out.println(informations.roster.get(x).getFirstName() + " " + informations.roster.get(x).getLastName() + " " + informations.roster.get(x).getClass1()+ " " + informations.roster.get(x).getClass1Grade()+ " " + informations.roster.get(x).getClass2()+ " " + informations.roster.get(x).getClass2Grade()+ " " + informations.roster.get(x).getClass3()+ " " + informations.roster.get(x).getClass3Grade()+ " " + informations.roster.get(x).getGPA());
								}
						}
					
				}
			}
	}
}
