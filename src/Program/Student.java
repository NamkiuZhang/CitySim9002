/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author Mengjiao
 */
public class Student implements IPerson{

    @Override
    public String type() {
        return "Student"; 
    }

    //1->The Cathedral of Learning
    //2->Squirrel Hill
    //3->The point
    //4->Downtown
    //student like all the locations except The Cathedral of Learning
    @Override
    public String preference(int loc) {
        if(loc==1)
            return " did not like ";
        else if(loc==2 || loc==3 || loc==4)
            return " did like ";
        
        return "Invalid location number";
    }
    
}
