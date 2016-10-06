/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Random;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Mengjiao
 */
public class LocationTest {
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    //test strLoc() method of Location class
    //with valid location number
    @Test
    public void stringLocWithValidInput(){
        Assert.assertEquals("The Cathedral of Learning",new Location(any(Integer.class)).strLoc(1));
    }
    
    //test strLoc() method of Location class
    //with Invalid location number
    @Test
    public void stringLocWithInValidInput(){
        Assert.assertEquals("Invalid location number",new Location(any(Integer.class)).strLoc(5));
    }
    
    //test intLocWithoutLeave() method of Location class
    //to ensure that the number can only be one of  1,2,3,4
     @Test
    public void ranIntLocWithoutLeave(){
        Assert.assertThat(new Location(any(Integer.class)).intLocWithoutLeave(),instanceOf(Integer.class));
        Assert.assertTrue(new Location(any(Integer.class)).intLocWithoutLeave()<5 &&new Location(any(Integer.class)).intLocWithoutLeave()>0);
    }
     
     //test intLoc() method of Location class
    //to ensure that the number can only be one of  1,2,3,4,5
     @Test 
     public void ranIntLoc(){
        Assert.assertThat(new Location(any(Integer.class)).intLoc(),instanceOf(Integer.class));
        Assert.assertTrue(new Location(any(Integer.class)).intLoc()<6 &&new Location(any(Integer.class)).intLoc()>0);
     }
}
