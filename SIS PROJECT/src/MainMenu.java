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
					changeScheduleorGrades();
				}
				
				else if (choice1 == 3)
				{
					sortList();
				}
					
		}

		private static void sortList()
		{
			// TODO Auto-generated method sub
			//ssd
		}
		
		private static void changeScheduleorGrades()

			{
				// TODO Auto-generated method sub
				
			}


	
	
	}
