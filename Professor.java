
public class Professor {

//declaring variables
	private String name;
	private long office;
	private int extention;

//default constructor
	public Professor(){}
	
//constructor with parameter
	public Professor(String name, long office, int extention){
		this.name = name;
		this.office = office;
		this.extention = extention;
	}
	
//accessor for name
	public String getName() {
		return name;
	}

//mutator for name	
	public void setName(String name) {
		this.name = name;
	}

//accessor for office number
	public long getOffice() {
		return office;
	}

//mutator for office number
	public void setOffice(long office) {
		this.office = office;
	}
	
//accessor for extension
	public int getExtention() {
		return extention;
	}

//mutator for extension
	public void setExtention(int extention) {
		this.extention = extention;
	}
	
//toString method
	public String toString(){
		return "\nName: "+getName()+"\nOffice: "+getOffice()+
				"\nExtention: "+getExtention();
	}
}
