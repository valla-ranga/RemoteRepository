package stanfordSeminar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		
		Seminar s,s1,s2,s3;
		
		//s= new Seminar("Can we intelligently and electromechanically interact with the brain?");
		//s1= new Seminar("Stanford Neurosciences Institute Seminar Series");
		//s2 = new Seminar("PEDIATRIC GRAND ROUNDS - Bronchopulmonary Dysplasia");
		//s3 = new Seminar("Recent Advances in Surgical Treatment of Spinal Neoplasms");
		
		String t = null;
		FileReader fr;
		//System.out.println("Enter Seminar Title");
		try {
			 fr = new FileReader("C:\\Program Files\\Java\\Workspace\\JavaClass\\src\\stanfordSeminar\\title.txt");
			 BufferedReader br=new BufferedReader(fr);
			 while((t=br.readLine())!=null)
			 {
				 //System.out.println(t);
				 if (t.equalsIgnoreCase("Can we intelligently and electromechanically interact with the brain?"))
				    {
			        	s = new Seminar(t);
			        	s.printSeminar();
				    } 
			        else if (t.equalsIgnoreCase("Stanford Neurosciences Institute Seminar Series"))
			        {
			        	s1 = new Seminar(t);
			        	s1.printSeminar();
			        }
			        else if (t.equalsIgnoreCase("PEDIATRIC GRAND ROUNDS - Bronchopulmonary Dysplasia"))
			        {
			        	s2 = new Seminar(t);
			        	s2.printSeminar();        	
			        }
			        else if (t.equalsIgnoreCase("Recent Advances in Surgical Treatment of Spinal Neoplasms"))
			        {
			        	s3 = new Seminar(t);
			        	s3.printSeminar();
			        }	
			 }
			 fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
					
		/*Scanner sc = new Scanner(System.in);
			System.out.println("Enter Seminar Title");
			String t = sc.nextLine();
			*/
        
	}
}