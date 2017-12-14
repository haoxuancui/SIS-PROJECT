import java.util.*;
import java.util.ArrayList;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.*;
public class informations
	{
		static ArrayList<Data> roster = new ArrayList<Data>();

		DecimalFormat decFor = new DecimalFormat("0.0");

		
		public static void fillStudentInformation() throws IOException
			{
				Scanner file = new Scanner(new File("studentList.txt"));
				while(file.hasNextLine())
					{
						String list =file.nextLine();
						String [] reallist= list.split(" ");
						roster.add(new Data(reallist[0],reallist[1],reallist[2],reallist[3],reallist[4],reallist[5],reallist[6],reallist[7],6));
							
					} 

				
				
			}
		
			
	}
