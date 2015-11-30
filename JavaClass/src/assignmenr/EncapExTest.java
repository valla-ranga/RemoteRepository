package assignmenr;

public class EncapExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapExample ee = new EncapExample(234, "Ranganath", "Engineering");
		
		ee.getName();
		ee.getId();
		ee.getDept();
		
		System.out.println(ee.getName()+" "+ee.getId()+" "+ee.getDept());
	}
}
