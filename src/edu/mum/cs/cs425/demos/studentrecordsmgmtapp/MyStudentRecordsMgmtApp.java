package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Stream;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

public class MyStudentRecordsMgmtApp {
	public static void main(String[] args) {
		Student s1=new Student(110001,"Dave",1951,11,18);
		Student s2=new Student(110002,"Anna",LocalDate.of(1990,12,07));
		Student s3=new Student(110003,"Erica",1974,1,31);
		Student s4=new Student(110004,"Carlos",LocalDate.of(2009,8,22));
		Student s5=new Student(110005,"Bob",1990,3,5);

		Student[] s= {s1,s2,s3,s4,s5};
		printListOfStudents(s);
		getListOfPlatinumAlumniStudents(s);
	}
	
	public static void printListOfStudents(Student[] list) {
		System.out.println("List of Students in ascending order of names");
		System.out.println("--------------------------------------------");
		
		Stream<Student> stud=Stream.of(list);
					stud.sorted((x,y)->x.getName().compareTo(y.getName()))
				    .forEach(System.out::println);
	}
	
	public static void getListOfPlatinumAlumniStudents(Student[] list) {
		System.out.println("\nList of PlatinumAlumni Students in descending order of date of admission");
		System.out.println("---------------------------------------------------------------------------");
		
		Stream<Student> stud=Stream.of(list);
			stud.filter(x->Period.between(x.getDateOfAdmission(),LocalDate.now()).getYears()>=30)
				.sorted((x,y)->y.getDateOfAdmission().compareTo(x.getDateOfAdmission()))
				.forEach(System.out::println);

	}
}
