//question link   https://www.hackerrank.com/challenges/30-inheritance/problem

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
    int[] score= new int[50];
    int tot=0,score1;
     Student(String firstName,String lastName,int idNumber, int[] testScores)
     {
         super(firstName,lastName,idNumber );
         this.score=testScores;
     }
     
    public String calculate()
    {   for(int i=0;i<score.length;i++)
     {
         tot=tot+score[i];
         
     }
     
     score1=tot/score.length;
        
        String grade="";
        if(score1>=90 && score1<=100)
            grade="O";
        else if(score1>=80 && score1<90)
            grade="E";
        else if(score1>=70 && score1<80)
            grade="A";
        else if(score1>=55 && score1<70)
            grade="P";
        else if(score1>=40 && score1<55)
            grade="D";   
        else
            grade="T"; 
        return grade;
    }
}



class Solution {
