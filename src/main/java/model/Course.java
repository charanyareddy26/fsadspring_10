package model;

public class Course {
	String coursecode;
	String coursename;
	Faculty faculty;  //nonpremitive datatype  (user defined class, object of another class)
    public Course(String coursecode, String coursename, Faculty faculty ) 
    {
    	this.coursecode=coursecode;
    	this.coursename=coursename;
    	this.faculty=faculty;
    }
    public String getCoursecode() {
    	return this.coursecode;
    }
    public String getCoursename() {
    	return this.coursename;
    }
    public String getFaculty() {
    	return this.faculty.getFid() + "-" + this.faculty.getFname();
    }
    
}
