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
				
				informations.roster.add(new Data())
				
			}
		
		private static void deleteStudent()
			{
				// TODO Auto-generated method stub
				
			}

	}
