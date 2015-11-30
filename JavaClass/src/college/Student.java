package college;

public class Student extends Person{
	public int studentid;
	public String course;
	public float gpa;
	public Department d;
	
	public Student(int id){
		super();
		studentid =id; 
		if(studentid ==3)
		{
		//course = d.deptname;
		Person p1 = new Person("Jack",25,"Frisco");
		gpa =(int)3.5f;
	    System.out.println( " in student1 object:  "+ "Student Name :" + p1.name+ " Student age :"+ 
	    					p1.age+ " Student Address :" + p1.address + " Student GPA : "+ gpa);
		}
		if(studentid ==4)
		{
		Person p2 = new Person("Jill",26,"irving");
		gpa =(int)3.8f;
		System.out.println(" in student2 object: "+"Student Name :" +p2.name+" Student age :"+ p2.age+ 
							" Student Address :" +p2.address +  " Student GPA : "+ gpa);
		}
	}
	
}