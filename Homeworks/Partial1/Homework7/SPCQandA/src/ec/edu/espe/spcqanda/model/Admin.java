/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.spcqanda.model;

/**
 *
 * @author Edwin
 */
public class Admin {
    private String adminName;
    private String adminId;
    private String adminEmail;
    private String birthdate;

    public Admin(String adminName, String adminId, String adminEmail, String birthdate) {
        this.adminName = adminName;
        this.adminId = adminId;
        this.adminEmail = adminEmail;
        this.birthdate = birthdate;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
}
