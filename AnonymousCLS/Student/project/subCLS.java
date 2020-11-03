package Student.project;

public class subCLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       superCLS s = new superCLS() {
		
		@Override
		public void watch() {
			// TODO Auto-generated method stub
			System.out.println("Watch from super class");
		}
	};
	System.out.println(s.getClass());
	s.watch();
	}

}
