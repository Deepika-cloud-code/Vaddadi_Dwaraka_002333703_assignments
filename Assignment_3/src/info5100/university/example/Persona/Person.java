/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

/**
 *
 * @author kal bugrara
 */
public class Person {
    
    String id;
    String name;
    public Person (String name){
        
        this.name = name;
    }
    public String getPersonName(){
        return name;
    }

        public boolean isMatch(String id){ //changed ID to name 
        if(getPersonName().equals(id)) return true;
        return false;
    }
 
        
    
}
