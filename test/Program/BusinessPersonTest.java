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
public class BusinessPersonTest {
    
    //test type() method of BusinessPerson class
     @Test
    public void isTypeRightOfBusinessPerson() {
        Assert.assertEquals("Business Person",new BusinessPerson().type());
    }
    
    //test preference() method of BusinessPerson class
    //with valid location number
    @Test
    public void LikePlaceOfBusinessPerson(){
        Assert.assertEquals(" did like ", new BusinessPerson().preference(2)); 
        Assert.assertEquals(" did like ", new BusinessPerson().preference(4));
    }   
    @Test
    public void notLikePlaceOfBusinessPerson(){
        Assert.assertEquals(" did not like ", new BusinessPerson().preference(1));
        Assert.assertEquals(" did not like ", new BusinessPerson().preference(3));
    }
    
    //test preference() method of BusinessPerson class
    //with Invalid location number
    @Test
     public void preferenceWithInvalidInput(){
         Assert.assertEquals("Invalid location number", new BusinessPerson().preference(0));
         Assert.assertEquals("Invalid location number", new BusinessPerson().preference(5));
     }
}
