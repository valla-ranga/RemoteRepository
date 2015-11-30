package oops;

public class Dogs {

	private String dname;

 int dage;
	private String dbreed;
	private String dcolor;
	String downer;
	public Dogs (String dname,String dcolor){
		this.dname=dname;
		this.dcolor=dcolor;
	}
	public Dogs(){
		
	}
	/* we cannot use any of the above variables in other classes if they are 
	 * declared private however, we can use them in sub-classes
	 */
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDage() {
		return dage;
	}
	public void setDage(int dage) {
		this.dage = dage;
	}
	public String getDbreed() {
		return dbreed;
	}
	public void setDbreed(String dbreed) {
		this.dbreed = dbreed;
	}
	public String getDcolor() {
		return dcolor;
	}
	public void setDcolor(String dcolor) {
		this.dcolor = dcolor;
	}
}
