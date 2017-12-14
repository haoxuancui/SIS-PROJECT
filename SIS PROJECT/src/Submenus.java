import java.util.*;

public class Submenus
	{
		public static String deletedStudentsName;
		
		public static void addOrDelete()
			{
				Scanner addOrDelete = new Scanner(System.in);
				System.out.print("Would you like to: \n (1) Add a student \n (2) Delete a Student");
				int whatTheyWant = addOrDelete.nextInt();
				
				switch(whatTheyWant)
				{
					case 1 : 
						addStudent();
						break;
					case 2 :
						deleteStudent();
						break;
					default :
						System.out.println("You did not enter an acceptable response, try again!");
						addOrDelete();
						break;
				}
			}

		private static void addStudent()
			{
				Scanner theInfo = new Scanner(System.in);
				System.out.println("What is the sudent's first name?");
				String firstName = theInfo.nextLine();
				
				System.out.println("What is the sudent's last name?");
				String lastName = theInfo.nextLine();
				
				Scanner theGPA = new Scanner(System.in);
				System.out.println("What is the sudent's GPA?");
				double studentGPA = theGPA.nextDouble();
				
				System.out.println("What is the sudent's first class?");
				String firstClass = theInfo.nextLine();
				
				System.out.println("What is the sudent's first class grade?");
				String firstClassGrade = theInfo.nextLine();
				
				System.out.println("What is the sudent's second class?");
				String secondClass = theInfo.nextLine();
				
				System.out.println("What is the sudent's second class grade?");
				String secondClassGrade = theInfo.nextLine();
				
				System.out.println("What is the sudent's third class?");
				String thirdClass = theInfo.nextLine();
				
				System.out.println("What is the sudent's third class grade?");
				String thirdClassGrade = theInfo.nextLine();
				
				informations.roster.add(new Data (firstName , lastName , firstClass , firstClassGrade , secondClass , secondClassGrade , thirdClass , thirdClassGrade , studentGPA));
				
				
			}
		
		private static void deleteStudent()
			{
				
				Scanner studentName = new Scanner(System.in);
				System.out.println("which student would you like to delete?");
				for(int i = 0 ; i < informations.roster.size() ; i++)
					{
						System.out.println(informations.roster.get(i).getFirstName());
					}
				

				deletedStudentsName = studentName.nextLine();
				
				Scanner yesOrNo = new Scanner(System.in);
				System.out.println("Are you sure you want to delete " + deletedStudentsName + " ? \n (1) yes \n (2) no");
				int yON = yesOrNo.nextInt();
				switch(yON)
				{
					case 1 : 
						finishDeleteStudent();
						break;
					case 2 :
						deleteStudent();
						break;
					default :
						System.out.println("You did not enter an acceptable response, try again!");
						deleteStudent();
						break;
				}
				}
				
			

		private static void finishDeleteStudent()
			{
				for(int i = 0 ;i < informations.roster.size() ; i++)
					{
						String temp = informations.roster.get(i).firstName;
						if(deletedStudentsName.equals(temp))
							{
								informations.roster.remove(i);
							}
					}
				
				for(int i = 0 ; i < informations.roster.size() ; i++)
					{
						System.out.println(informations.roster.get(i).firstName);
					}
				System.out.println("Done!");
				
			}

	}
