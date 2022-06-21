/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author parsarayaneh
 */
@Entity
@Table(name = "usercinema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usercinema.findAll", query = "SELECT u FROM Usercinema u"),
    @NamedQuery(name = "Usercinema.findById", query = "SELECT u FROM Usercinema u WHERE u.id = :id"),
    @NamedQuery(name = "Usercinema.findByEmail", query = "SELECT u FROM Usercinema u WHERE u.email = :email"),
    @NamedQuery(name = "Usercinema.findByFirstName", query = "SELECT u FROM Usercinema u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Usercinema.findByLastName", query = "SELECT u FROM Usercinema u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Usercinema.findByPhone", query = "SELECT u FROM Usercinema u WHERE u.phone = :phone")})
public class Usercinema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "firstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "lastName")
    private String lastName;
    @Basic(optional = false)
    @Lob
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "phone")
    private int phone;

    public Usercinema() {
    }

    public Usercinema(Integer id) {
        this.id = id;
    }

    public Usercinema(Integer id, String email, String firstName, String lastName, String password, int phone) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usercinema)) {
            return false;
        }
        Usercinema other = (Usercinema) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wekerle.June.Model.Usercinema[ id=" + id + " ]";
    }
    
}
