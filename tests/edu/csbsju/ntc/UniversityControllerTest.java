package edu.csbsju.ntc;

import controller.UniversityController;
import entity.*;
import interaction.AdminInteraction;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UniversityControllerTest {
	UniversityController uc;
	String schoolName = "SAMPLE";
	String state = "MN";
	String location = "URBAN";
	String control = "PRIVATE";
	int numStudents = 300;
	double female = 55;
	double satVerb = 550;
	double satMath = 550;
	double expenses = 500;
	double finAid = 360;
	int numApplicants = 300;
	double numAdmitted = 4500;
	double numEnrolled = 5000;
	int acaScale = 20;
	int socScale = 15;
	int qualityLife = 10;
	
	@Before
	  public void setUp() throws Exception {
		uc = new UniversityController();
		
		
		uc.addUniversity(schoolName, state, location, control, numStudents,
		        female, satVerb, satMath, expenses, finAid, numApplicants,
		        numAdmitted, numEnrolled, acaScale, socScale, qualityLife);
	  }
	@Test
	public void testAddUniversity() {

		University sample = uc.getUniversity(schoolName);
	    assertEquals("Expected University Name is" + schoolName, schoolName, sample.getUniversityName());
		assertEquals("Expected  State is " + state, state, sample.getUniversityState());
		assertEquals("Expected  location is " + location, location, sample.getLocationType());
		assertEquals("Expected control is" + control, control, sample.getControl());
		assertEquals("Expected numStudents is" + numStudents, numStudents, sample.getNumOfStudents());
		assertTrue("Expected female is" + female, female == sample.getFemalePercentage());
		assertTrue("Expected satVerb is" + satVerb, satVerb == sample.getSATVerbal());
		assertTrue("Expected satMath is" + satMath, satMath == sample.getSATMath());
		assertTrue("Expected expense is" + expenses, expenses == sample.getExpenses());
		assertTrue("Expected financial Aid is " + finAid, finAid == sample.getFinancialAid());
		assertEquals("Expected number of applicant is" + numApplicants, numApplicants, sample.getNumApplicants());
		assertTrue("Expected number admitted is" + numAdmitted, numAdmitted == sample.getNumAdmitted());
		assertTrue("Expected numEnrolled is" + numEnrolled, numEnrolled == sample.getNumEnrolled());
		assertEquals("Expected academic Scale is" + acaScale, acaScale, sample.getAcademicScale());
		assertEquals("Expected social Scale is" + socScale, socScale, sample.getSocialScale());
		assertEquals("Expected quality of life is" + qualityLife, qualityLife, sample.getQualityOfLife());
	}

	@Test
	public void testGetSavedUniversities() {
		fail("Not yet implemented");
		//invalid user, null, valid user
		uc.getSavedUniversities();
	}

	@Test
	public void testAddUser() {
		String firstName = "clark";
		String lastName = "kent";
		String usrName = "superman";
		String password = "password";
		char type = 'a';
		
		AdminInteraction noreen = new AdminInteraction("nadmin", "admin");
	    
	    //noreen.login("noreen", "admin");
	    uc.addUser(firstName, lastName, usrName, password, type);
	    
	    Account temp = noreen.findStudent("superman");
	    
		//assertTrue("Expected first name is " + firstName, 5 == (2+3));
		assertEquals("Expected first name is " + firstName, firstName, temp.getFirstName());
		//assertTrue("Expected Last  name is " + lastName, lastName == temp.getLastName());
		//assertTrue("Expected username is " + usrName, usrName == temp.getUsername());
		//assertTrue("Expected password is " + password, password == temp.getPassword());
		//assertTrue("Expected user type is " + type, type == temp.getType());
		
		
	}

	@Test
	public void testViewUniversityDetails() {
		fail("Not yet implemented");
		//existing and not and null
	}

	@Test
	public void testGetUniversity() {
		fail("Not yet implemented");
		//existing , not, null possibly 
	}

}
