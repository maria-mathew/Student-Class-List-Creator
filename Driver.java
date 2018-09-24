//contains the main method
//importing classes
import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

//creating scanner object
		Scanner input = new Scanner(System.in);

//declaring variables
		double sum = 0;
		int count = 0;
		int extention, year;
		long id;
		double marks;
		double average;
		String name,firstName, lastName, courseName,deptName,s;
		long office;
		char semester;
		String answer = "yes";

//printing the welcome message
		System.out.println("#########################  WELCOME!  #############################");

//prompting user to enter course details
		System.out.println("ENTER THE COURSE DETAILS"+
						"\n----------------------------------");
		//course name
		System.out.print("\nName of the course: ");
		courseName = input.next();

		//name of the department
		System.out.print("Name of the department: ");
		deptName = input.next();

		//year
		System.out.print("Year: ");
		year = input.nextInt();

		//semester
		System.out.print("Semester (F/S/W)?: ");
		semester = input.next().charAt(0);

//creating course object
		Course newCourse =new Course(courseName,
				deptName, year, semester);

//prompting the user to enter the details of the professor
		System.out.println("\nENTER THE DETAILS OF THE PROFESSOR"+
							"\n----------------------------------");
		//name of the professor
		System.out.print("First Name: ");
		firstName = input.next();

		System.out.print("Last Name: ");
		lastName = input.next();

		name = firstName +" "+lastName;

		//office number
		System.out.print("Office Number: ");
		office = input.nextLong();

		//extension
		System.out.print("Extention: ");
		extention = input.nextInt();

//creating the professor object
		Professor newProfessor = new Professor(name , office, extention);

//declaring array list for students
		ArrayList <Student> studentList  = new ArrayList <Student> ();

//prompting user to enter details of the students
		System.out.println("\nENTER THE STUDENT DETAILS"+
							"\n----------------------------------");

		//number of students
		int i = 0;
			while(answer.equals("yes")){
				System.out.println("\nStudent ("+i+")");
				//prompting user to enter the id of the student
				System.out.print("Id : ");
				id = input.nextInt();

				//prompting user to enter the marks of the student
				System.out.print("Marks: ");
				marks = input.nextDouble();

				//adding the student objects to the arraylist
				studentList.add(new Student (id, marks));
				i++;

				System.out.println("Do you want to create another student? Yes or No?");
				answer = input.next();
			}



//prompting user to enter course description
			System.out.println("\nDo you want to create course description? yes/no?");
			String temp = input.next();

			if(temp.equals("yes")){
				int num = 0;
				System.out.println("Enter the course description and type 'end' at the end.");
				String description = input.next();
				while(input.hasNext()){
					s = input.next();
					if(s.equals("end"))
						break;
					if(num<10){
					description = description +" "+ s;
					num++;}
					else if(num>=10){
						description = description+"\n"+s;
						num = 0;
					}
					}
//creating course description object
				CourseDescription descript = new CourseDescription(description);
				newCourse = new Course(courseName, deptName, year, semester,
										descript, newProfessor,studentList );
				System.out.println(newCourse.toStringWithDescription());
				}
			else if(temp.equals("no")){
				newCourse = new Course(courseName, deptName, year, semester,
										newProfessor,studentList);
				System.out.println(newCourse.toStringWithoutDescription());
			}

//calculating the average of the students
	    System.out.println("\nDo you want to calculate the average of the class. yes/no?");
		temp = input.next();
		if(temp.equals("yes")){
		for(int j = 0; j<studentList.size(); j++){
			sum = studentList.get(j).getMark()+sum;}

		average = sum/studentList.size();

//printing the class marks average
		System.out.println("****************************"+
						  "\nThe class average is "+average+
				          "\n****************************");}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//End message
		System.out.println("#########################------THE END-----##########################");
	}

}
