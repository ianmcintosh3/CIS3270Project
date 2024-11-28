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

    public Customer() {

    }


    public Customer(String firstname, String lastname,
                    String address, String zipcode, String state,
                    String username, String password, String email,
                    String SSN, String securityQuestion) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.zipcode = zipcode;
        this.state = state;
        this.username = username;
        this.password = password;
        this.email = email;
        this.SSN = SSN;
        this.securityQuestion = securityQuestion;
    }

    //FULL NAME
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    //ADDRESS
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    // ACCOUNT INFO
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    // SECURITY
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return this.SSN;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityQuestion() {
        return this.securityQuestion;
    }
}




//n
