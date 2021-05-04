package SRC_JAVA;

	public class child {
	
		public void school() {
		
		System.out.println("This is Parent Class----------------->");
		
	}
	
	
	public static class ParentsSchool extends child{
		
		public void Home() {
			
			
			System.out.println("This is Child Class--------------------->");
		}
		
		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("New Java Learner");
		
		ParentsSchool t2 = new ParentsSchool();
		t2.Home();
		t2.school();
		
		
	
		}
			
		}
		
		
		
	}


