/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Dog extends Animal {
    
    String Breed;
    
    public Dog(String Breed,String Name,String Genus,String Species){
        super(Name,Genus,Species);
        this.Breed=Breed;
    }
    @Override
    
   public  String SayHello(){
        return ("Woof Woof!");
    }
    
    public String SayHello(double amount){
        return ("Woof Woof! You can get me at"+amount);
    }
    
}
