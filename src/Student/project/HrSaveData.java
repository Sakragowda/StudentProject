package Student.project;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class HrSaveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hr H =new Hr();
		H.name="Anusha";
		H.profile="HR";
		H.sal=1500.00;
		H.comm=500.00;
		try
		{
		FileOutputStream fos = new FileOutputStream("HRdata.txt");
        ObjectOutputStream ops =new ObjectOutputStream(fos);
		ops.writeObject(H);
	    ops.close();
		System.out.println("HR data saved");
		}
		catch (Exception e1)
		{
			e1.printStackTrace();
		}		

	}

}
