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
public class BloggerTest {
    
    //test type() method of Blogger class
    @Test
    public void isTypeRightOfBlogger() {
        Assert.assertEquals("Blogger", new Blogger().type());
    }
    
    //test preference() method of Blogger class
    //with valid number of locations
    @Test
    public void preferenceOfBloggerWithValidInput(){
        Assert.assertEquals(" did not like ",new Blogger().preference(2));
    }
    
    //test preference() method of Blogger class
    //with invalid number of locations
    @Test
    public void preferenceOfBloggerWithInvalidInput(){
        Assert.assertEquals("Invalid location number",new Blogger().preference(0));
        Assert.assertEquals("Invalid location number",new Blogger().preference(5));
    }
    
    
}
