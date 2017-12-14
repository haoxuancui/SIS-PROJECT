import java.util.*;

public class ChangeGradeorClass
{
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
	}
	
	public static void changeClass()
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("Which student?");
		for(int i = 0 ; i < informations.roster.size() ; i++)
		{
			System.out.println("1) " + informations.roster.get(i).firstName);
		}
		int whichStudent = in.nextInt();
		
		System.out.println();
		System.out.println("Which class do you want to switch");
		System.out.println("1) " + informations.roster.get(whichStudent).class1);
		System.out.println("2) " + informations.roster.get(whichStudent).class2);
		System.out.println("3) " + informations.roster.get(whichStudent).class3);
		
		int firstClass = in.nextInt();
		System.out.println("Which do you want to switch it out with");
		//incomplete
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
