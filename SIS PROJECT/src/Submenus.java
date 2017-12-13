import java.util.*;

public class Submenus
	{
		
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
				
				System.out.println("What is the sudent's GPA?");
				double studentGPA = theInfo.nextDouble();
				
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
				
				
				informations.roster.add(new Data(firstName , lastName , studentGPA , firstClass ,firstClassGrade , secondClass ,secondClassGrade . thirdClass , thirdClassGrade));
				
			}
		
		private static void deleteStudent()
			{
				
				Scanner studentName = new Scanner(System.in);
				System.out.println("which student would you like to delete?");
				for(int i = 0 ; i < informations.roster.size() ; i++)
					{
						System.out.println(informations.roster.get(i));
					}
				String deletedStudentsName = studentName.nextLine();
				
				System.out.println("Are you sure you want to delete");
				
			}

	}
