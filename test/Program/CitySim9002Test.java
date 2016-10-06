/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Mengjiao
 */
public class CitySim9002Test {
    

    
    //test getVisitorInfo(IPerson person,int i) of CitySim9002 class
     @Test
    public void testPrintVisitorInfo() {
        Student mockStudent = mock(Student.class);
        when(mockStudent.type()).thenReturn("Student");
        String result = "Visitor 1 is a Student.";
        Assert.assertEquals(result, CitySim9002.getVisitorInfo(mockStudent, 1));       
    }
    
    //test getVisitorPreference(IPerson person, int i, int iloc, String sloc) of CitySim9002 class
    @Test
    public void testPrintVisitorPreference(){
       BusinessPerson mockBusinessPerson=mock(BusinessPerson.class);
       when(mockBusinessPerson.preference(any(Integer.class))).thenReturn(" did like ");
       String result="Visitor 1 is going to Downtown!\nVisitor 1 did like Downtown.";
       Assert.assertEquals(result, CitySim9002.getVisitorPreference(mockBusinessPerson, 1, 4, "Downtown"));        
    }
}
