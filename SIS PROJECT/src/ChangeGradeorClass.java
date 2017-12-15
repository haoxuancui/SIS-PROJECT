import java.util.*;

public class ChangeGradeorClass
{
	public static String changeStudentsclass;
	public static String changeStudentsperiod;
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
					informations.roster.get(i);
					System.out.println();
					System.out.println("Which class do you want to switch");
					System.out.println("1) " + informations.roster.get(i).class1);
					System.out.println("2) " + informations.roster.get(i).class2);
					System.out.println("3) " + informations.roster.get(i).class3);
					int switchClassChoice = in.nextInt();
					System.out.println("Which do you want to switch it out with");
					changeStudentsperiod= in.nextLine();
					informations.roster.get(i).class1;
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
		//
	}
}
