package Assignment;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School s1 = new School();
		s1.conduct_exams();
		s1.publish_results(75);
		System.out.println(School.school_name);
//		System.out.println(s1.salary);           salary is not visible, becasue it is private in School class
		
	}

}
