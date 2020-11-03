package Student.project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileInputDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        StudentData s= new StudentData();
        s.name = "sakra";
        s.dept = "civil";
        s.cls = 1 ;
        s.per = 10 ;
        
        FileOutputStream fos = new FileOutputStream("Sdata.txt");
        ObjectOutputStream o = new ObjectOutputStream(fos);
        o.writeObject(s);
        o.close();
        System.out.println("Detailes added sucessfully");
        
        
	}

}
