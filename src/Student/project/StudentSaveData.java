package Student.project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSaveData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		student s = new student(); 
		s.name="sakra";
		s.dept="civil";
		s.per=70.8;
		FileOutputStream fos = new FileOutputStream("Sdata.txt");
        ObjectOutputStream ops =new ObjectOutputStream(fos);
		ops.writeObject(s);
		ops.close();
		System.out.println("Application End");
		
	}

}
