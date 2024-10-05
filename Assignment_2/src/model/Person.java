/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Dwaraka Deepika vadd
 */
public class Person{
    String firstName;
    String lastName;
    String SSN;
    int age;
    char gender; // to get a 'F' for female, 'M' for male and 'O' for others
    Address HomeAddress;
    Address WorkAddress;
    
    public Person(){
        this.HomeAddress=new Address();
        this.WorkAddress=new Address();
    }

    public Address getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(Address HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public Address getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(Address WorkAddress) {
        this.WorkAddress = WorkAddress;
    }
    
  
    
  
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    
    
    @Override
    public String toString(){
        return firstName;
    }
    
}
