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
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Mengjiao
 */
public class VisitorTest {
       
    //Test method ranvidNum() generates integer number 1,2,3,4
    @Test
    public void randomFour(){
        Assert.assertThat(new Visitor(any(Integer.class)).ranVisNum(),instanceOf(Integer.class));
        Assert.assertTrue(new Visitor(any(Integer.class)).ranVisNum()<5 &&new Visitor(any(Integer.class)).ranVisNum()>0);
    }
    
    //Test when the argument n in method geneVisitor(int n) is not a valid number.
    //n is beyond the 4 numbers
    @Test
    public void generateVisitorWithInvalidInput() {
        Assert.assertNull(new Visitor(any(Integer.class)).geneVisitor(5));
    }
    
    @Test
    public void generateVisitorWithValidInput(){
        Assert.assertThat(new Visitor(any(Integer.class)).geneVisitor(1),instanceOf(IPerson.class));
        Assert.assertThat(new Visitor(any(Integer.class)).geneVisitor(3),instanceOf(IPerson.class));
        //I am not sure whether type() methd used here is suitable
        //because what we want to test is geneVisitor() method, if it failed, we need to test each 
        //them to ensure, or we have the pre-condition that type() method is right
        //but without thesse, we can not know there are the type we want.
        Assert.assertEquals("Student",new Visitor(any(Integer.class)).geneVisitor(1).type());
        Assert.assertEquals("Professor",new Visitor(any(Integer.class)).geneVisitor(3).type());                 
    }
    
    
    
    
}
