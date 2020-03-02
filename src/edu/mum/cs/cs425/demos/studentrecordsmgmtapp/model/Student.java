package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;

public class Student {
	private int studentId;
	private String name;
	private LocalDate dateOfAdmission;
	
	public Student() {
		System.out.println("Default Constructor");
	}

	public Student(int studentId, String name, int y, int m, int d) {
		this.studentId=studentId;
		this.name=name;
		this.dateOfAdmission=LocalDate.of(y, m, d);
	}
	
	public Student(int studentId, String name, LocalDate d) {
		this.studentId=studentId;
		this.name=name;
		this.dateOfAdmission=d;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(!(o instanceof Student)) return false;
		Student s=(Student)o;
		return s.getName().equals(this.name);
	}
	
	@Override
	public String toString() {
		return "studentId: "+this.studentId+",name:"+this.name+",dateOfAdmission:"+this.dateOfAdmission;
	}
}
