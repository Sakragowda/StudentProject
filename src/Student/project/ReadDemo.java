package Student.project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


public class ReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fil = null;
		try
		{
			fil = new FileInputStream("Sdata.txt");
			ObjectInputStream ois = new ObjectInputStream(fil);
			Object o=ois.readObject();
			student s = null ;
			if (o instanceof student)
				s = (student) o;
				System.out.println(s.name +" "+s.dept+" "+s.per);
			    ois.close();
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
