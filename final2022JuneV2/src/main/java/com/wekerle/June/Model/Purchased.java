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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author parsarayaneh
 */
@Entity
@Table(name = "purchased")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Purchased.findAll", query = "SELECT p FROM Purchased p"),
    @NamedQuery(name = "Purchased.findById", query = "SELECT p FROM Purchased p WHERE p.id = :id"),
    @NamedQuery(name = "Purchased.findByUserId", query = "SELECT p FROM Purchased p WHERE p.userId = :userId"),
    @NamedQuery(name = "Purchased.findByAppointmentId", query = "SELECT p FROM Purchased p WHERE p.appointmentId = :appointmentId"),
    @NamedQuery(name = "Purchased.findByAmount", query = "SELECT p FROM Purchased p WHERE p.amount = :amount")})
public class Purchased implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "user-id")
    private int userId;
    @Basic(optional = false)
    @Column(name = "appointment-id")
    private int appointmentId;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;

    public Purchased() {
    }

    public Purchased(Integer id) {
        this.id = id;
    }

    public Purchased(Integer id, int userId, int appointmentId, int amount) {
        this.id = id;
        this.userId = userId;
        this.appointmentId = appointmentId;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
        if (!(object instanceof Purchased)) {
            return false;
        }
        Purchased other = (Purchased) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wekerle.June.Model.Purchased[ id=" + id + " ]";
    }
    
}
