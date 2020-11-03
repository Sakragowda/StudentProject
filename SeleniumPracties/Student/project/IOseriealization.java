package Student.project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;




public class IOseriealization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set<String> s = new HashSet<String>();
		Set<String> s = new TreeSet<String>();

		s.add("s");
		s.add("a");
		s.add("k");
		s.add("r");
		s.add("a");
		
	//	List<String> a = new ArrayList<String>(s);
		List<String> a = new ArrayList<String>();
		a.addAll(s);
		
		for (String b : a) {
			System.out.println(b);
		}
		
	}

}
