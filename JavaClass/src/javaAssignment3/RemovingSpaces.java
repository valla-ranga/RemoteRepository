package javaAssignment3;

import java.util.StringTokenizer;

public class RemovingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "String    With Multiple      Spaces";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreElements()){
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
	}
}