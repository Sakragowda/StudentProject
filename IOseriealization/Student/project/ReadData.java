package Student.project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       FileInputStream fis  = null;
       
       try {
    	fis = new FileInputStream("Sdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		StudentData s = null;
		if (o instanceof StudentData) {
			s = (StudentData)o;
			System.out.println(s.name+"  "+s.dept+"   "+s.per);
			ois.close();
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
       
	}

}
