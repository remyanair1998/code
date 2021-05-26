class school
{
	public school()
	{
		System.out.println("class school");
	}
public void SchoolName()
{
	System.out.println("School Name: ABCD");
}
}
class student extends school{
	public student()
	{
		System.out.println("class student");
	}
public void name()
{
	System.out.println("student name: Arnav");
}
public void gender()
{
	System.out.println("gender: F");
}
}


public class StdId extends student {
public StdId()
{
	System.out.println("Blood group: B+");

}
public void age()
{
	System.out.println("Age: 10");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdId obj = new StdId();
		obj.SchoolName();
		obj.name();
		obj.gender();
		obj.age();

			}

	}


