package com.example.assessment;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;

	class Student {
		private int studentId;
		private String studentName;
		private int marks;

		public Student() {
			super();
		}

		public Student(int studentId, String studentName, int marks) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public void displayStudentDetails() {
			System.out.println("studentName " + studentName + " studentId= " + studentId + "marks = " + marks);
		}

	}

	class Course {
		int courseId;
		String courseName;

		public Course(int courseId, String courseName) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
		}

		public Course() {
			super();
		}

		@Override
		public String toString() {
			return "Course [courseId=" + courseId + ", courseName=" + courseName + ", studentsInCourse=" + studentsInCourse
					+ "]";
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public List<Student> getStudentsInCourse() {
			return studentsInCourse;
		}

		public void setStudentsInCourse(List<Student> studentsInCourse) {
			this.studentsInCourse = studentsInCourse;
		}

		List<Student> studentsInCourse = new ArrayList<Student>();

		public void addStudent(Student student) {
			studentsInCourse.add(student);
		}

		public void displayCourses() {
			System.out.println(
					"Course[ courseName " + courseName + " courseId " + courseId + " StudentsInCourse " + studentsInCourse);
		}

	}

	class Department{
		int deptId;
		String DeptName;
		public Department() {
			super();
		}
		public Department(int deptId, String deptName) {
			super();
			this.deptId = deptId;
			DeptName = deptName;
		}
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return DeptName;
		}
		public void setDeptName(String deptName) {
			DeptName = deptName;
		}
		
		List<Course> coursesInDept = new ArrayList<Course>();
		
		public void addCourseToDept(Course course) {
			coursesInDept.add(course);
		}
		
		
		@Override
		public String toString() {
			return "Department [deptId=" + deptId + ", DeptName=" + DeptName + ", coursesInDept=" + coursesInDept + "]";
		}
	}

	public class Tester {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Course c = new Course(201, "java");
			c.addStudent(new Student(101, "pramod", 100));
			c.addStudent(new Student(102, "fayaz", 80));
			c.addStudent(new Student(103, "kirti", 60));
			c.addStudent(new Student(104, "rahul", 40));

			c.displayCourses();
			
			Department d = new Department(301,"Computer");
			
			d.addCourseToDept(c);
			
			System.out.println(d);

		}

	}


