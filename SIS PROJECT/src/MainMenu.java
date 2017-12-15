import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class MainMenu
	{

		public static void main(String[] args) throws IOException
			{
				informations.fillStudentInformation();
				
				System.out.println("Please tell me what you want to do");
			Scanner in = new Scanner(System.in);
				System.out.println("What would you like to do?");
				System.out.println("	1) add or delete a student");
				System.out.println("	2) change student grades/schedule");
				System.out.println("	3) sort students");
				int choice1 = in.nextInt();
				
				if (choice1 == 1)
				{
					Submenus.addOrDelete();
				}
				
				else if (choice1 == 2)
				{
					ChangeGradeorClass.ChangeClassOrGrade();
				}
				
				else if (choice1 == 3)
				{
					Sorter.sorter();
				}
					
				String fpg = informations.roster.class1Grade;
				String spg = informations.roster.class2Grade;
				String tpg = informations.roster.class3Grade;
				
				switch(fpg)
					{
						case "A+":
								{
								gpa += 4.0;
								break;
								}
						case "A":
								{
								gpa += 4.0;
								break;
								}
						case "A-":
								{
								gpa += 3.7;
								break;
								}
						case "B+":
								{
								gpa += 3.3;
								break;
								}
						case "B":
								{
								gpa += 3.0;
								break;
								}
						case "B-":
								{
								gpa += 2.7;
								break;
								}
						case "C+":
								{
								gpa += 2.3;
								break;
								}
						case "C":
								{
								gpa += 2.0;
								break;
								}
						case "C-":
								{
								gpa += 1.7;
								break;
								}
						case "D+":
								{
								gpa += 1.3;
								break;
								}
						case "D":
								{
								gpa += 1.0;
								break;
								}
					}
				switch(spg)
				{
					case "A+":
							{
							gpa += 4.0;
							break;
							}
					case "A":
							{
							gpa += 4.0;
							break;
							}
					case "A-":
							{
							gpa += 3.7;
							break;
							}
					case "B+":
							{
							gpa += 3.3;
							break;
							}
					case "B":
							{
							gpa += 3.0;
							break;
							}
					case "B-":
							{
							gpa += 2.7;
							break;
							}
					case "C+":
							{
							gpa += 2.3;
							break;
							}
					case "C":
							{
							gpa += 2.0;
							break;
							}
					case "C-":
							{
							gpa += 1.7;
							break;
							}
					case "D+":
							{
							gpa += 1.3;
							break;
							}
					case "D":
							{
							gpa += 1.0;
							break;
							}
				}
				switch(tpg)
				{
					case "A+":
							{
							gpa += 4.0;
							break;
							}
					case "A":
							{
							gpa += 4.0;
							break;
							}
					case "A-":
							{
							gpa += 3.7;
							break;
							}
					case "B+":
							{
							gpa += 3.3;
							break;
							}
					case "B":
							{
							gpa += 3.0;
							break;
							}
					case "B-":
							{
							gpa += 2.7;
							break;
							}
					case "C+":
							{
							gpa += 2.3;
							break;
							}
					case "C":
							{
							gpa += 2.0;
							break;
							}
					case "C-":
							{
							gpa += 1.7;
							break;
							}
					case "D+":
							{
							gpa += 1.3;
							break;
							}
					case "D":
							{
							gpa += 1.0;
							break;
							}
				}
		}

		
	
	
	}
