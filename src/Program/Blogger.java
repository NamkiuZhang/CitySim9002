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
public class Blogger implements IPerson{

    @Override
    public String type() {
        return "Blogger"; 
    }

    //1->The Cathedral of Learning
    //2->Squirrel Hill
    //3->The point
    //4->Downtown
    //blogger dislikes all locations
    @Override
    public String preference(int loc) {
        if(loc>0 && loc<5)
            return " did not like ";
        return "Invalid location number";
            
    }
    
}
