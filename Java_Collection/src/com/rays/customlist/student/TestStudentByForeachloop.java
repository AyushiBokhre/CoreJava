package com.rays.customlist.student;

import java.util.ArrayList;
import java.util.List;

public class TestStudentByForeachloop {
	public static void main(String[] args) {
		Student s1 =new Student("Ram",101,"Maths");
		Student s2 =new Student("Shayam",103,"Maths");
		Student s3 =new Student("Aman",104,"Maths");
		Student s4 =new Student("Kamlesh",102,"Maths");
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(Student s:list) {
			System.out.println(s);
		}
	}

}
