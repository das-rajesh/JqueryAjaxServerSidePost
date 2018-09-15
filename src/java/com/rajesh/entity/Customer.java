/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajesh.entity;

/**
 *
 * @author admin
 */
public class Customer {

    private int id;
    private String email;
    private String name;
    private boolean status;

    public Customer() {
    }

    public Customer(int id, String name, String email, boolean status) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toJson() {
        String json = "{";
        json += "\"id\":\"" + id + "\",";
        json += "\"name\":\"" + name + "\",";
        json += "\"email\":\"" + email + "\",";
        json += "\"status\":\"" + status + "\"";
        json += "}";

        return json;
    }

}
