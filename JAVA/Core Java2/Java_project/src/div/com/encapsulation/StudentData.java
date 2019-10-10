package div.com.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
		s.setRollNo(1101);
		s.setName("Alen");
		s.setEmail("alen123@gmail.com");
		s.setPassword("alen");
		
		s1.setRollNo(1102);
		s1.setName("Stephen");
		s1.setEmail("stephen123@gmail.com");
		s1.setPassword("stephen");
		
		int roll=s.getRollNo();
		System.out.println("Roll no.=>"+roll);
		System.out.println("NAme=>"+s.getName());
		System.out.println("Email=>"+s.getEmail());
		
		
		System.out.println("Roll no.=>"+s1.getRollNo());
		System.out.println("NAme=>"+s1.getName());
		System.out.println("Email=>"+s1.getEmail());
		
		Student[] students= {s,s1};
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getRollNo());
			System.out.println(students[i].getName());
			System.out.println(students[i].getEmail());
			
			
		}
		

		
		
	}

}

