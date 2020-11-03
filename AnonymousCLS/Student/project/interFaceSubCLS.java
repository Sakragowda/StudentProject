package Student.project;

public class interFaceSubCLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interFaceSuperCLS s= new interFaceSuperCLS() {
			
			@Override
			public void inter() {
				// TODO Auto-generated method stub
				System.out.println("interFace super Cls ");
			}
		};
        s.inter();
	}

}
