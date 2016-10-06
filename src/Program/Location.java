/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import java.util.Random;

/**
 *
 * @author Mengjiao
 */
public class Location {
    
    Random ra;
    
    public Location(int arg){
        ra = new Random(arg);
    }
    
    //1->The Cathedral of Learning
    //2->Squirrel Hill
    //3->The point
    //4->Downtown
    //5 means left   
    //randomly generate 5 numbers
    public int intLoc(){    
        return ra.nextInt(5)+1;
    }
    
    //1->The Cathedral of Learning
    //2->Squirrel Hill
    //3->The point
    //4->Downtown
    //randamly generate 4 numbers
    public int intLocWithoutLeave(){       
        return ra.nextInt(4)+1;
    }
    
    //generate location name based on relationship between number and the location it represents
    public String strLoc(int n){
        if(n==1)
            return "The Cathedral of Learning";
        else if(n==2)
            return "Squirrel Hill";
        else if(n==3)
            return "The point";
        else if(n==4)
            return "Downtown";
        
        return "Invalid location number";
    }
    
    
}
