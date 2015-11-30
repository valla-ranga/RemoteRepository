package cricket;

public class Player implements Batsman, Bowler{
	
	public String name;
	public String type;
	public double noofmatches;
	public double noofruns;
	public double noofwickets;
	public double noofcatches;
	
	public Player(String name, String type, double noofmatches,double noofruns,double noofwickets, double noofcatches){
		this.name = name;
		this.type = type;
		this.noofruns = noofruns;
		this.noofwickets = noofwickets;
		this.noofmatches = noofmatches;
		this.noofcatches = noofcatches;
			bat();
			bowl();
			field();
	}	
	@Override
	public void bowl() {	
		System.out.println(name+" is a "+ type+" who took "+ noofwickets + " wickets");
	}
	@Override
	public void bat() {
		System.out.println(name+" is a "+ type+ " who scored "+noofruns+ " runs");
	}
	@Override
	public void field() {
		System.out.println(name+" is a "+ type+ " who caught "+noofcatches+ " catches");
		
	}

}
