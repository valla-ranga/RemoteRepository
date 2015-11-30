package practicetest;

public class Polymorphism {
	
	/*
	 * Method overloading = should have same method name; should have different number of arguments
	 * varied data types, return type can be same or different;
	 * Method Overriding = should have same method name; same number of arguments and same data types;
	 * same return type; Static and Final methods are hidden not overrided
	 */
	 public double a;
	 public int b;
	 int c;
	 int d;
	 long e;
	 public int add(int a,int b){
		 this.a = a;
		 this.b = b;
		 d = a+b;
		 return d;
	 }public int add(int a,int b, int c){
		 this.a = a;
		 this.b = b;
		 this.c = c;
		 d = a+b+c;
		 return d;
	 }
	 public void add(int a,int b, long e){
		 this.a = a;
		 this.b = b;
		 this.e = e;
		 c = (int) (a+b+e);
		 
	 }
}
