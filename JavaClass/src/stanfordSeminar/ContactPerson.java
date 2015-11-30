package stanfordSeminar;
public class ContactPerson extends Person{

	public ContactPerson(String title, String type)
	{
		super(title, type);
		this.title = title;
		this.type =type;
	}
	public void printInfo()
	{
		if(title.equalsIgnoreCase("Can we intelligently and electromechanically interact with the brain?"))
		{
			name = "Romola L. Breckenridge";
		    details();		   		
		}
		if(title.equalsIgnoreCase("Stanford Neurosciences Institute Seminar Series"))
		{
			name = "Roula El-Asmar";
		    details();		 
		}
		if(title.equalsIgnoreCase("PEDIATRIC GRAND ROUNDS - Bronchopulmonary Dysplasia"))
		{
			name = "Alyssa Ray";
		    details();		  
		}
		if(title.equalsIgnoreCase("Recent Advances in Surgical Treatment of Spinal Neoplasms"))
		{
			name = "LaToya Rosales";
		    details();		  
		}
		System.out.println("Contact Person : "+name+", "+Email+ ", " +phnumber);
	}
}