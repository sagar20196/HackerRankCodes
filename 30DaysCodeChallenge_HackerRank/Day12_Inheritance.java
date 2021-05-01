import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    String fname, lname;
    int pid;
    Student(String fname, String lname, int pid, int[] testScores)
    {
        super(fname,lname,pid);
        this.fname= fname;
        this.lname= lname;
        this.pid= pid;
        this.testScores= testScores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate()
    {   int avg=0;
        int l = testScores.length;
        for(int i=0;i<l;i++)
            avg+=testScores[i];
         avg=avg/testScores.length;
        return(avg> 89 ?'O': avg>79 ? 'E' : avg > 69 ? 'A' : avg > 54 ? 'P' :avg > 39 ? 'D' : 'T' );
    }
}

class Solution {