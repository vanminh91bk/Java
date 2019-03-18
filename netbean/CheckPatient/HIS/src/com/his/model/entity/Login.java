/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.his.model.entity;

import java.io.Serializable;

/**
 *
 * @author DinhThap
 */
public class Login implements Serializable{
    private ID id;
    private String username;
    private String password;
    
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Login(ID id,String username, String password) {
        this.username = username;
        this.password = password;
        this.id = id;
    }
    
    public Login() {
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return username; //To change body of generated methods, choose Tools | Templates.
    }
    
}
