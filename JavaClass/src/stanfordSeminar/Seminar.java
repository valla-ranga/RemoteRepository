package stanfordSeminar;
import java.util.*;
import java.text.*;
public class Seminar {
	
	public String title;
	public String date;
	public String location;
	Presenter p;
	Person c;

	public Seminar (String title)
	{
		this.title = title;
	}
	public void printSeminar()
	{
		SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm a");
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy EEE | h:mm a");
		Date dt = new Date();
		Date dt1 = new Date();
		
		if(title.equals("Can we intelligently and electromechanically interact with the brain?"))
		{
			try {
				String time = "Nov 06, 2015 Fri | 7:00 AM ";
				dt = sdf.parse(time);
				String time1 = "8:00 AM";
				dt1 = sdf1.parse(time1);
				}
			catch (ParseException e) {
				e.printStackTrace();
			}
			this.location = "LKSC 120; 291 Campus Drive : Stanford, CA";
			System.out.println("Seminar 1: "+title+"\n"+sdf.format(dt)+" - "+ sdf1.format(dt1)+", "+location);
		}
		else  
		if(title.equals("Stanford Neurosciences Institute Seminar Series"))
		{
			try {
				String time = "Nov 05, 2015 Thu | 12:00 PM ";
				dt = sdf.parse(time);
				String time1 = "1:00 PM";
				dt1 = sdf1.parse(time1);
				}
			catch (ParseException e) {
				e.printStackTrace();
			}
			this.location = "291 Campus Drive / LKSC Room 120 : Stanford, CA";
			System.out.println("\n"+"Seminar 2: "+title+"\n"+sdf.format(dt)+" - "+ sdf1.format(dt1)+", "+location);
		}
	
		if(title.equals("PEDIATRIC GRAND ROUNDS - Bronchopulmonary Dysplasia"))
		{
			try {
				String time = "Nov 06, 2015 Fri | 8:00 AM ";
				dt = sdf.parse(time);
				String time1 = "9:00 AM";
				dt1 = sdf1.parse(time1);
				}
			catch (ParseException e) {
				e.printStackTrace();
			}
			this.location = "725 Welch Road, LPCH Auditorium : Palo Alto, CA";	
			System.out.println("\n"+"Seminar 3: "+title+"\n"+sdf.format(dt)+" - "+ sdf1.format(dt1)+", "+location);
		}
		
		if(title.equals("Recent Advances in Surgical Treatment of Spinal Neoplasms"))
		{
			try {
				String time = "Nov 06, 2015 Fri | 7:00 AM ";
				dt = sdf.parse(time);
				String time1 = "8:00 AM";
				dt1 = sdf1.parse(time1);
				}
			catch (ParseException e) {
				e.printStackTrace();
			}
			this.location = " LKS 120 : Stanford, CA";
			System.out.println("\n"+"Seminar 4: "+title+"\n"+sdf.format(dt)+" - "+ sdf1.format(dt1)+", "+location);
		}
		 p = new Presenter(title,"Presenter");		
		 c = new ContactPerson(title,"ContactPerson");
		 p.printInfo();
		 c.printInfo();
	}
}