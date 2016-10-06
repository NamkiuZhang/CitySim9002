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
public class Visitor {
       
    Random ra;
    public Visitor(int arg){
        ra = new Random(arg);
    }
    
    //random generate 4 numbers 1,2,3,4
    public int ranVisNum(){      
       return ra.nextInt(4)+1;      
    }
    
    //based on the relationship between number and the type it represents
    //to generate one type of visitor
    //1->Student
    //2->Business Person
    //3->Professor
    //4->Blogger
    public IPerson geneVisitor(int n){
        if(n==1)
            return new Student();
        else if(n==2)
            return new BusinessPerson();
        else if(n==3)
            return new Professor();
        else if(n==4)
            return new Blogger();
       
       return null;
    }
  
}
