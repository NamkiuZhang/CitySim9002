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
public class BusinessPerson implements IPerson {

    @Override
    public String type() {
        return "Business Person"; 
    }
    
    //1->The Cathedral of Learning
    //2->Squirrel Hill
    //3->The point
    //4->Downtown
    //businessperson likes Squirrel Hill and Downtown
    @Override
    public String preference(int loc) {
        if(loc==2 || loc==4)
            return " did like ";
        else if(loc==1||loc==3)
            return " did not like ";
        return "Invalid location number";
    }
    
}
