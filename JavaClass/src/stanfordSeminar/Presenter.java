package stanfordSeminar;

import java.util.*;
import java.util.regex.Pattern;
import java.text.*;
public class Presenter extends Person{
	
	public String title;
	public Presenter(String title, String type)
    {
		super(title, type);
		this.title = title;
		this.type =type;
	}
	public void printInfo()
	{
		
		//if(title ==t)
			
		if(title.equals("Can we intelligently and electromechanically interact with the brain?"))
		{  name = "Mark S. George";
			details();
		}
		if(title.equals("Stanford Neurosciences Institute Seminar Series"))
			{
			name = "Mark George";
			details();
			}
		if(title.equals("PEDIATRIC GRAND ROUNDS - Bronchopulmonary Dysplasia"))
			{
			name = "Hugh O'Brodovich";
			details();
			}
		if(title.equals("Recent Advances in Surgical Treatment of Spinal Neoplasms"))
			{
			name = "Ziya Gokaslan";
			details();			
			}
		System.out.println("\n"+ "Presenter:"+name+","+ Email);
	}
}