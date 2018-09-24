import java.util.ArrayList;
public class Course {

//declaring variables
	private String name;
	private String department;
	private int year;
	private char semester;
	private CourseDescription description;
	private Professor professor;
	private ArrayList<Student> student;

//default constructor
	public Course(){}

//constructor with parameter
	public Course(String name, String department, int year, char semester){
		this.name = name;
		this.department = department;
		this.year = year;
		this.semester = semester;
	}

//constructor with parameter 
	public Course(String name, String department, int year, char semester, 
			Professor professor,ArrayList <Student> student){
		this.name = name;
		this.department = department;
		this.year = year;
		this.semester = semester;
		this.professor = professor;
		this.student = student;
	}
//constructor with parameter
	public Course(String name, String department, int year, char semester, 
			CourseDescription description,Professor professor,
			ArrayList <Student> student){
		this.name = name;
		this.department = department;
		this.year = year;
		this.semester = semester;
		this.description = description;
		this.professor = professor;
		this.student = student;
	}


//getter for name
	public String getName() {
		return name;
	}

//setter for name
	public void setName(String name) {
		this.name = name;
	}

//getter for description
	public String getDepartment() {
		return department;
	}

//setter for description
	public void setDepartment(String department) {
		this.department = department;
	}

//getter for year
	public int getYear() {
		return year;
	}

//setter for year
	public void setYear(int year) {
		this.year = year;
	}

//getter for semester
	public char getSemester() {
		return semester;
	}

//setter for semester
	public void setSemester(char semester) {
		this.semester = semester;
	}
	
//toString method
	public String toString(){
		return "\nCourse Name: "+getName()+
				"\nDepartment: "+getDepartment()+
				"\nYear: "+getYear()+
				"\nSemester: "+getSemester();
	}
//toString method with description
	public String toStringWithDescription(){
		return "@@@@@@@@@@@@@@@@@@@@@@@@@-----SUMMARY------@@@@@@@@@@@@@@@@@@@@@@@@@@"+
				"\n\n=============COURSE DETAILS=============="+
				  "\n========================================="+
				toString()+
				"\n\n============COURSE DESCRIPTION==========="+
				  "\n========================================="+
				description.toString()+
				"\n\n=============PROFESSOR DEATILS==========="+
				  "\n========================================="+
				professor.toString()+
				"\n\n==============STUDENT DETAILS============"+
				  "\n========================================="+
				student.toString();
	}
	
//toString method without description
	public String toStringWithoutDescription(){
		return 	"@@@@@@@@@@@@@@@@@@@@@@@@-----SUMMARY------@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
				"\n\n==============COURSE DETAILS============="+
				  "\n========================================="+
				toString()+
				"\n\n==============PROFESSOR DEATILS=========="+
				  "\n========================================="+
				professor.toString()+
				"\n\n===============STUDENT DETAILS==========="+
				  "\n========================================="+
				student.toString();
	}
	
	
}

