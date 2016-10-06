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
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

/**
 *
 * @author Mengjiao
 */
public class StudentTest {
    
    //test type() method of Student class
     @Test
    public void isTypeRightOfStudent() {
        Assert.assertEquals("Student",new Student().type());
    }
    
    //test preference() method of Student method
    //with valid number of locations
    @Test
    public void likePlaceOfStudent(){
        Assert.assertEquals(" did like ", new Student().preference(3));      
    }    
    @Test
    public void notLikePlaceOfStudent(){
        Assert.assertEquals(" did not like ", new Student().preference(1));      
    }
    
    //test preference() method of Student method
    //with Invalid number of locations
    @Test
    public void preferenctWithInvalidInput(){
        Assert.assertEquals("Invalid location number", new Student().preference(0));
        Assert.assertEquals("Invalid location number", new Student().preference(5));
    }
}
