package functionality;
import tester.CriketerTest;
import java.lang.*;
import java.util.*;
public class cricketer {
	private String name;
	private int age;
	private String emailid;
	private String phoneno;
	public int rating;
	
	public cricketer(String name,int age,String emailid,String phoneno,int rating)
	{
		this.name= name;
		this.age =age;
		this.emailid=emailid;
		this.phoneno = phoneno;
		this.rating = rating;
	}
	@Override
	public String toString()
	{
		return "Name  " + name+ "\nAge  " +age+"\nEmailId  "+emailid+"\nPhone no  "+phoneno+"\nRating  "
				+rating;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmailid() {
		return emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public int getRating() {
		return rating;
	}
	
}
