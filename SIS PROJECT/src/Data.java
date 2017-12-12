
public class Data
{
	String firstName;
	String lastName;
	double GPA;
	String class1;
	String class1Grade;
	String class2;
	String class2Grade;
	String class3;
	String class3Grade;
	

	public Data(String f, String l, double g, String c1, String c1g, String c2, String c2g, String c3, String c3g)
	{
		String firstName = f;
		String lastName = l;
		double GPA = g;
		String class1 = c1;
		String class1Grade = c1g;
		String class2 = c2;
		String class2Grade = c2g;
		String class3 = c3;
		String class3Grade = c3g;

	}


	public String getFirstName()
	{
		return firstName;
	}


	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}


	public String getLastName()
	{
		return lastName;
	}


	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}


	public double getGPA()
	{
		return GPA;
	}


	public void setGPA(double gPA)
	{
		GPA = gPA;
	}


	public String getClass1()
	{
		return class1;
	}


	public void setClass1(String class1)
	{
		this.class1 = class1;
	}


	public String getClass1Grade()
	{
		return class1Grade;
	}


	public void setClass1Grade(String class1Grade)
	{
		this.class1Grade = class1Grade;
	}


	public String getClass2()
	{
		return class2;
	}


	public void setClass2(String class2)
	{
		this.class2 = class2;
	}


	public String getClass2Grade()
	{
		return class2Grade;
	}


	public void setClass2Grade(String class2Grade)
	{
		this.class2Grade = class2Grade;
	}


	public String getClass3()
	{
		return class3;
	}


	public void setClass3(String class3)
	{
		this.class3 = class3;
	}


	public String getClass3Grade()
	{
		return class3Grade;
	}


	public void setClass3Grade(String class3Grade)
	{
		this.class3Grade = class3Grade;
	}

}
