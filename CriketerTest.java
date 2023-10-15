package tester;
import java.util.*;
import functionality.cricketer;
public class CriketerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<cricketer> al = new ArrayList<>();
		CriketerTest cktr = new CriketerTest();
		boolean exit = false;
		while(!exit)
		{
			System.out.println("Enter your choice of operation");
			System.out.println("1. Enter cricketer's details"+
								"2. Modify cricketer's rating"+
								"3. Search cricketer"+
								"4. Display all cricketer entered "+
								"5. Display all cricketers sorted as per rating "
								+ "6. Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter name of cricketer");
					String name = sc.next().toUpperCase();
					System.out.println("Enter age of criketer");
					int age = sc.nextInt();
					System.out.println("Enter email id of cricketer");
					String emailid = sc.next();
					System.out.println("Enter phone number");
					String phoneno = sc.next();
					System.out.println("Enter cricketer rating");
					int rating = sc.nextInt();
					cricketer ck1 = new cricketer(name,age,emailid,phoneno,rating);
					al.add(ck1);
					break;
			case 2:
					System.out.println("Enter name of cricketer whose rating is to be modified");
					String name1 =sc.next().toUpperCase();
					for(cricketer ck2:al) 
					{
					if(ck2.getName().equals(name1))
					{	System.out.println("Current rating" + ck2.getRating());
						System.out.println("Enter the modified rating");
						int rating1 = sc.nextInt();
						ck2.rating = rating1;
						System.out.println("Rating updated");
					}
					}	
					break;
			case 3: // search cricketer by rating
					System.out.println("Enter the name you want to search");
					String name2 = sc.next().toUpperCase();
					for(cricketer ck2:al)
					{
						if(name2.equals(ck2.getName()))
						{
						
						System.out.println("Cricketer exists");
						}
					}
					break;
			case 4:
					for(cricketer ck2:al)
					{
						System.out.println(ck2);
					}
					break;
			case 5:
				  ArrayList<cricketer> al2 = new ArrayList<>(al);
				  Collections.sort(al2,Comparator.comparing(cricketer::getRating));
				  for(cricketer ck2:al2)
				  {
					  System.out.println(ck2);
				  }
				  break;
				  
			case 6:
				System.out.println("Exiting cricketer app");
				break;
				
			default:
				System.out.println("Invalid choice");
			
			}
		}
	}
}
