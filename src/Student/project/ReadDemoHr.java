package Student.project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ReadDemoHr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fil = null;
		try
		{
			fil = new FileInputStream("HRdata.txt");
			ObjectInputStream ois = new ObjectInputStream(fil);
			Object o=ois.readObject();
			Hr s = null ;
			if (o instanceof Hr)
				s = (Hr) o;
				System.out.println(s.name +" "+s.profile+" "+s.sal+" "+s.comm);
			    ois.close();
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
