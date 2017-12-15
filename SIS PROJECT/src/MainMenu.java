import java.io.IOException;
import java.util.*;
import java.util.ArrayList;

public class MainMenu
	{
		static double fpg=0.0;
		static double spg=0.0;
		static double tpg=0.0;
		static double gpa=0.0;
				
		public static void main(String[] args) throws IOException
			{
				informations.fillStudentInformation();
				setGPA();
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
			}
			public static void setGPA()
			{
				for(int x=0; x<informations.roster.size(); x++)
					{
				String firstperiodgrade = informations.roster.get(x).getClass1Grade();
				String secondperiodgrade = informations.roster.get(x).getClass2Grade();
				String thirdperiodgrade = informations.roster.get(x).getClass3Grade();
				
					
				switch(firstperiodgrade)
					{
						case "A+":
								{
								fpg= 4.0;
								break;
								}
						case "A":
								{
									fpg= 4.0;
								break;
								}
						case "A-":
								{
									fpg= 3.7;
								break;
								}
						case "B+":
								{
									fpg= 3.3;
								break;
								}
						case "B":
								{
									fpg= 3.0;
								break;
								}
						case "B-":
								{
									fpg= 2.7;
								break;
								}
						case "C+":
								{
									fpg= 2.3;
								break;
								}
						case "C":
								{
								fpg= 2.0;
								break;
								}
						case "C-":
								{
									fpg= 1.7;
								break;
								}
						case "D+":
								{
									fpg= 1.3;
								break;
								}
						case "D":
								{
								fpg= 1.0;
								break;
								}
					}
				switch(secondperiodgrade)
				{
					case "A+":
							{
							spg= 4.0;
							break;
							}
					case "A":
							{
								spg= 4.0;
							break;
							}
					case "A-":
							{
								spg= 3.7;
							break;
							}
					case "B+":
							{
								spg= 3.3;
							break;
							}
					case "B":
							{
								spg= 3.0;
							break;
							}
					case "B-":
							{
								spg= 2.7;
							break;
							}
					case "C+":
							{
							gpa += 2.3;
							break;
							}
					case "C":
							{
								spg= 2.0;
							break;
							}
					case "C-":
							{
								spg= 1.7;
							break;
							}
					case "D+":
							{
								spg= 1.3;
							break;
							}
					case "D":
							{
							spg= 1.0;
							break;
							}
				}
				switch(thirdperiodgrade)
				{
					case "A+":
							{
							tpg= 4.0;
							break;
							}
					case "A":
							{
								tpg= 4.0;
							break;
							}
					case "A-":
							{
								tpg= 3.7;
							break;
							}
					case "B+":
							{
								tpg= 3.3;
							break;
							}
					case "B":
							{
								tpg= 3.0;
							break;
							}
					case "B-":
							{
								tpg= 2.7;
							break;
							}
					case "C+":
							{
								tpg= 2.3;
							break;
							}
					case "C":
							{
								tpg= 2.0;
							break;
							}
					case "C-":
							{
								tpg= 1.7;
							break;
							}
					case "D+":
							{
								tpg= 1.3;
							break;
							}
					case "D":
							{
								tpg= 1.0;
							break;
							}
				}
				gpa=(fpg+spg+tpg)/3;
				String gpa1=Double.toString(gpa);
				String gpa2=gpa1.substring(0, 3);
				double gpaFinal = Double.parseDouble(gpa2);
				informations.roster.get(x).setGPA(gpaFinal);
				}
		}

		
	
	
	}
