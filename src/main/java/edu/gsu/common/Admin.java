package edu.gsu.common;

public class Admin {
    private String adminId;
    private String adminName;
    private String adminUsername;
    private String adminPassword;

    Admin(){

    }

    Admin(String adminId, String adminName,
             String adminUsername, String adminPassword){
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;


    }

    public void setAdminId(String ai){
        this.adminId = adminId;
    }
    public String getAdminId(String ai){
        return ai;
    }
    public void setAdminName(String an){
        this.adminName = adminName;
    }
    public String getAdminName(String an){
        return an;
    }
    public void setAdminUsername(String au){
        this.adminUsername = adminUsername;
    }
    public String getAdminUsername(String au){
        return au;
    }
    public void setAdminPassword(String ap){
        this.adminPassword = adminPassword;
    }
    public String adminPassword(String ap){
        return ap;
    }

//    Admin(adminId, adminName, adminUsername, adminPassword){
//    }
}
