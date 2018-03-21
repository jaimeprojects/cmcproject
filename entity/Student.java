package entity;

<<<<<<< HEAD
=======
import dblibrary.project.csci230.*;
import java.util.*;
import java.lang.*;
import java.io.*;

import entity.*;
import interaction.*;
import controller.*;
  
>>>>>>> 018a1a6e394a193d6ca2d61190bb64ac1b91e19d
/**
 * Student Entity that stores the information for a student instance. 
 * 
 * 
 * 
 * From 2/25/18-2/26/18-->worked on by Vue Xiong
 * -->wrote the variables, the constructor and setter method
 * @author Ramon Angeles, Jonathan First, James H. , Jaime Vega, Vue Xiong
 * @version Feb 26, 2018
 */

public class Student
{
  private String userName;
<<<<<<< HEAD
  /**
=======
  private String password;
  private String firstName;
  private String lastName;
  private char accountStatus;//whether or not the student's account is still active or if it is deactivated.
  private University savedSchools;//the list of save schools for a student
  
 /**
>>>>>>> 018a1a6e394a193d6ca2d61190bb64ac1b91e19d
  * Constructor, creates a new student with a username and password. 
  * Also sets the accoutn status of a user
  * 
  * @param userName a unique username for a new user
  * @param password a unique password that belongs to a user
  * @param status the status of a user whether they are activer or not
  */
  public Student(String userName, String password, char status)
  {
    this.userName = userName;
<<<<<<< HEAD
=======
    this.password = password;
    this.accountStatus = status;//NOT SURE IF WE SHOULD HAVE THE STATUS OF A USER HERE OR NOT
>>>>>>> 018a1a6e394a193d6ca2d61190bb64ac1b91e19d
  }
  ///****Allows for the Admin to set the user's account to active or deactivates a user's account***********
  /**
   * Allows Admin to set status of user account
   * 
   * @param status the status of a user
   */
  public void setAccountStatus(char status)
  {
<<<<<<< HEAD
=======
    this.accountStatus = status;
>>>>>>> 018a1a6e394a193d6ca2d61190bb64ac1b91e19d
  }
  
  /**
   * Allows the user to get a username
   */
  public String getUserName()
  {
    return this.userName;
  }
  /**
   * Allows user to change first Name
   * 
   * @param firstName the first name of a user
   */
  public void setFirstname(String firstName)
  {
<<<<<<< HEAD
=======
    this.firstName = firstName;
>>>>>>> 018a1a6e394a193d6ca2d61190bb64ac1b91e19d
  }
  /**
   * Allows user to set last name of user account
   * 
   * @param lastName the last name of user
   */
  public void setLastname(String lastName)
  {
<<<<<<< HEAD
=======
    this.lastName = lastName;
>>>>>>> 018a1a6e394a193d6ca2d61190bb64ac1b91e19d
  }
  /**
   * Allows user to cahnge their password
   * 
   * @param password the password of the user
   */
  public void setPassword(String password)
  {
<<<<<<< HEAD
=======
    this.password = password;
>>>>>>> 018a1a6e394a193d6ca2d61190bb64ac1b91e19d
  }
  
}
