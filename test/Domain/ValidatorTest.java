/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author AsphaltPanthers
 */
public class ValidatorTest {
    @Test
    public void ifOneArgumentIsProvidedReturnTrue() {
        Assert.assertTrue(new Validator().validateNumberOfArguments(new String[] { "1" }));
    }
    
    @Test
    public void ifOneArgumentIsNotProvidedReturnFalse() {
        Assert.assertFalse(new Validator().validateNumberOfArguments(new String[] { "1", "2" }));
    }
    
    @Test
    public void ifArgumentIsAnIntegerReturnTrue() {
        Assert.assertTrue(new Validator().validateArgumentType(new String[] { "1" }));
    }
    
    @Test
    public void ifArgumentIsNotAnIntegerReturnFalse() {
        Assert.assertFalse(new Validator().validateArgumentType(new String[] { "test" }));
    }
    
    //test Validator validateArguments(String[] args) method 
    @Test
    public void ifArgumentLengthAndArgumentTypeAreCorrect(){
        Validator mockValidator=mock(Validator.class);
        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();       
        Assert.assertTrue(mockValidator.validateArguments(new String[0]));
    }
    
    //test Validator validateArguments(String[] args) method 
    //when one of length and type is wrong
    @Test
    public void ifArgumentLengthCorrectArgumentTypeWrong(){
        Validator mockValidator=mock(Validator.class);
        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(true);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(false);
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();       
        Assert.assertFalse(mockValidator.validateArguments(new String[0]));
    }
    
    //test Validator validateArguments(String[] args) method 
    //when both length and type are wrong
    @Test
    public void ifArgumentLengthandArgumentTypeAreWrong(){
        Validator mockValidator=mock(Validator.class);
        when(mockValidator.validateNumberOfArguments(any(String[].class))).thenReturn(false);
        when(mockValidator.validateArgumentType(any(String[].class))).thenReturn(false);
        when(mockValidator.validateArguments(any(String[].class))).thenCallRealMethod();       
        Assert.assertFalse(mockValidator.validateArguments(new String[0]));
    }
    
    
}

   

