/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Dwaraka Deepika vadd
 */
public class PersonDirectory {
    private ArrayList<Person> person;
    
    public PersonDirectory(){
        this.person=new ArrayList<Person>();
    }
    public ArrayList<Person> getPerson(){
        return person;
    }
    public void setPerson(ArrayList<Person> accounts){
        this.person=accounts;
    }
    public Person addPerson(){
        Person p=new Person();
        person.add(p);
        return p;
    }
    public void deletePerson(Person p){
        person.remove(p);
    }
    
    public Person searchPerson(String details){
        for(Person p:person){
            if (p.getFirstName().contains(details)){
                return p;
            }
            else if(p.getLastName().contains(details)){
                return p;
            }
            else if(p.getHomeAddress().getStreetAddress().contains(details)){
                return p;
            }
        }
        return null;
    }
}
