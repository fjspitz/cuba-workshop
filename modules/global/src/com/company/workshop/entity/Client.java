package com.company.workshop.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|name,phoneNumber")
@Table(name = "WORKSHOP_CLIENT")
@Entity(name = "workshop_Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = -8734137953112923189L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, length = 20)
    protected String phoneNumber;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true, length = 50)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}