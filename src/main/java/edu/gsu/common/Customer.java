package edu.gsu.common;

public class Customer {
//    Registration requires information such as first name, last name, address, zip, state,
//    username, password, email, SSN and a security question for password recovery.
    private String firstname;
    private String lastname;

    private String address;
    private String zipcode;
    private String state;

    private String username;
    private String password;
    private String email;

    private String SSN;
    private String securityQuestion;
    Customer(){

    }



    Customer(String firstname, String lastname,
             String address, String zipcode, String state,
             String username, String password, String email,
             String SSN, String securityQuestion){
        this.firstname = firstname;


    }
    //// FULL NAME
    public void setFirstname(String f){
        this.firstname = firstname;
    }
    public String getFirstname(String f){
        return f;
    }
    public void setLastname(String l){
        this.lastname = lastname;
    }
    public String getLastname(String l){
        return l;
    }
    ////FULL ADDRESS

    public void setAddress(String a){
        this.address = address;
    }
    public String getAddress(String a){
        return a;
    }
    public void setZipcode(String z){
        this.zipcode = zipcode;
    }
    public String getZipcode(String z){
        return z;
    }
    public void setState(String s){
        this.state = state;
    }
    public String getState(String s){
        return state;
    }
    //// ACCOUNT

    public void setUsername(){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    //// SECURITY

    public void setSSN(){
        this.SSN = SSN;
    }
    public String getSSN(){
        return SSN;
    }
    public void setSecurityQuestion(){
        this.securityQuestion = securityQuestion;
    }
    public String getSecurityQuestion(){
        return securityQuestion;
    }




}
//n
