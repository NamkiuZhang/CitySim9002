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
public class Professor implements IPerson{

    @Override
    public String type() {
        return "Professor"; 
    }

    //1->The Cathedral of Learning
    //2->Squirrel Hill
    //3->The point
    //4->Downtown
    //professor likes all locations
    @Override
    public String preference(int loc) {
        if(loc<5 && loc>0)
            return " did like ";
        return "Invalid location number";
    }
    
}
