/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

//import Domain.Validator;

/**
 *
 * @author AsphaltPanthers
 */
public class CitySim9002 {
    public static String errorMessage = "Please enter one integer argument, seed";
    
    public static void main(String[] args) {   
        if (new Validator().validateArguments(args)) {
            int arg=Integer.parseInt(args[0]);     
            Visitor vi= new Visitor(arg);
            Location loc = new Location(arg);           
            System.out.println("Welcome to CitySim! Your seed is "+arg+".");
            
            for(int i =1;i<6;i++){
                int numVi=vi.ranVisNum();
                //generate one type visitor from the four type
                IPerson person=vi.geneVisitor(numVi);
                System.out.println(getVisitorInfo(person,i));
                
                //make sure that visitor visit one locaton
                int nlwl=loc.intLocWithoutLeave();
                //get the location name
                String location = loc.strLoc(nlwl);
                System.out.println(getVisitorPreference(person,i,nlwl,location));
                
                //after visit one location, generate next locations or leave randomly
                int nl=loc.intLoc();
                while(nl!=5){
                    location = loc.strLoc(nl);
                    System.out.println(getVisitorPreference(person,i,nl,location));
                    nl=loc.intLoc();
                }
                System.out.println("Visitor "+i+" has left the city.");
                System.out.println("***");                      
            }             
        }
        else {
            System.out.println(errorMessage);
            System.exit(0);
        }
    }
    
    public static String getVisitorInfo(IPerson person,int i){
        return "Visitor "+ i +" is a "+person.type()+".";
    }
    
    //getVisitorPreference(IPerson person,int i,int intlocationnumber,String locationname)
    public static String getVisitorPreference(IPerson person, int i, int iloc, String sloc){
        return "Visitor "+ i+" is going to "+sloc+"!\nVisitor "+i+person.preference(iloc)+sloc+".";
    }
    
    
}
