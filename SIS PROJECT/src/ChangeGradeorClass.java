import java.util.*;

public class ChangeGradeorClass
{
	public static String changeStudentsclass;
	public static int switchClassChoice;
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
					
					System.out.println("Do you want to put "+informations.roster.get(i).class1+" in which period");
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
					System.out.println("Do you want to put "+informations.roster.get(i).class2+" in which period");
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
					System.out.println("Do you want to put "+informations.roster.get(i).class3+" in which period");
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
					 
					
					
				}
			}
		
		
		
		
	}
	
	public static void changeGrade()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Which student?");
		for(int i = 0 ; i < informations.roster.size() ; i++)
		{
			System.out.println("1) " + informations.roster.get(i).firstName);
		}
		int whichStudent = in.nextInt();
		
		System.out.println();
		System.out.println("Which grade do you want to change?");
		System.out.println("1) " + informations.roster.get(whichStudent).class1 + ": " + informations.roster.get(whichStudent).class1Grade);
		System.out.println("2) " + informations.roster.get(whichStudent).class2 + ": " + informations.roster.get(whichStudent).class2Grade);
		System.out.println("3) " + informations.roster.get(whichStudent).class3 + ": " + informations.roster.get(whichStudent).class3Grade);
		
		int selectGrade = in.nextInt();
		System.out.println("What do you want to change the grade to?");
		String changeGrade = in.nextLine();
		
	}
}
