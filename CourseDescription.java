
public class CourseDescription {

//declaring variables
	private String description;
	
//default constructor
	public CourseDescription(){}
	
//constructor with parameter 
	public CourseDescription(String description){
		this.description = description;
	}
	
//mutator with description
	public void setDescription(String description){
		this.description = description;
	}

//accessor for description
	public String getDescription(){
		return description;
	}

//toString method
	public String toString(){
		return "\n"+getDescription();
	}
	
}
