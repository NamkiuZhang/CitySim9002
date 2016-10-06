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

/**
 *
 * @author Mengjiao
 */
public class ProfessorTest {
    

    //test type() method of Professor class
     @Test
     public void isTypeRightOfPorfessor() {
         Assert.assertEquals("Professor",new Professor().type());
     }
     
     //test preference() method of Professor method
     //with valid number of locations
     @Test
     public void preferenceWithValidInput(){
         Assert.assertEquals(" did like ", new Professor().preference(1));
     }
     
     //test preference() method of Professor method
     //with Invalid number of locations
     @Test
     public void preferenceWithInvalidInput(){
         Assert.assertEquals("Invalid location number", new Professor().preference(0));
         Assert.assertEquals("Invalid location number", new Professor().preference(5));
     }
}
