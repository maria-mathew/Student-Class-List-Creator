
public class Student {

//declaring variables
	private long id;
	private double mark;

//default constructor	
	public Student(){}
	
//constructor with parameters	
	public Student(long id, double mark){
		this.id = id;
		this.mark = mark;
	}
	
//getter for id 
	public long getId(){
		return id;
	}
	
//setter for id
	public void setId(long id){
		this.id = id;
	}
	
//getter mark
	public double getMark(){
		return mark;
	}
	
//setter for mark
	public void setMark(double mark){
		this.mark = mark;
	}

//toString method
	public String toString(){
		return "\nID: "+getId()+" ; Marks: "+getMark();
	}

}
