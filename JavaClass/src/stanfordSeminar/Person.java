package stanfordSeminar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Person {
	
	public String name;
	public String Email;
	public String type;
	public String title;
	public String phnumber;

	public Person(String title, String type)
	{
		this.title = title;
		this.type= type;
	}
		
	
	
	
	public void details(){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Contact Person Details : ");
		String n = sc.nextLine();
		if(name == n)*/
		if(name.equals("Romola L. Breckenridge"))
		{
			name = "Romola L. Breckenridge";
			String e = "romola@stanford.edu";
			String p = "650-736-1743";
			
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e);
	        if(matcher.matches()) 
			   Email = e;			
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p);
	        if(matcher1.matches()) 
	        	phnumber = p;             
		}
		if(name.equals("Roula El-Asmar"))
		{
			name = "Roula El-Asmar ";
			String e1 = "Roula@stanford.edu";
			String p1 = "780-789-6359";
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e1);
	        if(matcher.matches()) 
			   Email = e1;	
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p1);
	        if(matcher1.matches()) 
	        	phnumber = p1;        
		}
		if(name.equals("Alyssa Ray"))
		{
			name = "Alyssa Ray";
			String e2 = "alyssar@stanford.edu";
			String p2 = "650-724-9246";
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e2);
	        if(matcher.matches()) 
			   Email = e2;	
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p2);
	        if(matcher1.matches()) 
	        	phnumber = p2;    
		}
		if(name.equals("LaToya Rosales"))
		{
			name = "LaToya Rosales";
			String e3 = "lrosale2@stanford.edu";
			String p3 = "650-497-8775";
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e3);
	        if(matcher.matches()) 
			   Email = e3;	
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p3);
	        if(matcher1.matches()) 
	        	phnumber = p3;    
		}
		if(name.equalsIgnoreCase("Mark S. George"))
		{
			name = "Mark S. George";
			String e4 = "georgems@gmail.com";
			String p4 = "654-361-4520";
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e4);
	        if(matcher.matches()) 
			   Email = e4;	
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p4);
	        if(matcher1.matches()) 
	        	phnumber = p4;    
		}
		if(name.equalsIgnoreCase("Mark George"))
		{
			name = "Mark George";
			String e5 = "mark@gmail.com";
			String p5 = "326-526-7596";
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e5);
	        if(matcher.matches()) 
			   Email = e5;	
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p5);
	        if(matcher1.matches()) 
	        	phnumber = p5;    
		}
		if(name.equalsIgnoreCase("Hugh O'Brodovich"))
		{
			name = "Hugh O'Brodovich";
			String e6 = "brodovich@gmail.com";
			String p6 = "635-859-1256";
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e6);
	        if(matcher.matches()) 
			   Email = e6;	
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p6);
	        if(matcher1.matches()) 
	        	phnumber = p6;    
		}
		if(name.equalsIgnoreCase("Ziya Gokaslan"))
		{
			name = "Ziya Gokaslan";
			String e7 = "ziya@gmail.com";
			String p7 = "759-526-6325";
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(e7);
	        if(matcher.matches(	)) 
			   Email = e7;	
	        Pattern pattern1 = Pattern.compile("([ |\\(])*(\\d{3})[^\\d]*(\\d{3})[^\\d]*(\\d{4})");
	        Matcher matcher1 = pattern1.matcher(p7);
	        if(matcher1.matches()) 
	        	phnumber = p7;    
		}
		}
	public void printInfo()
	{
		System.out.println(" "+name+"\t"+Email+"\t"+type+"\t"+phnumber);
	}	
}