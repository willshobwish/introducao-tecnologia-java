/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco.de.dados.parte2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author willm
 */
@Entity
@Table(name = "staff_list")
@NamedQueries({
    @NamedQuery(name = "StaffList.findAll", query = "SELECT s FROM StaffList s"),
    @NamedQuery(name = "StaffList.findById", query = "SELECT s FROM StaffList s WHERE s.id = :id"),
    @NamedQuery(name = "StaffList.findByName", query = "SELECT s FROM StaffList s WHERE s.name = :name"),
    @NamedQuery(name = "StaffList.findByAddress", query = "SELECT s FROM StaffList s WHERE s.address = :address"),
    @NamedQuery(name = "StaffList.findByZipCode", query = "SELECT s FROM StaffList s WHERE s.zipCode = :zipCode"),
    @NamedQuery(name = "StaffList.findByPhone", query = "SELECT s FROM StaffList s WHERE s.phone = :phone"),
    @NamedQuery(name = "StaffList.findByCity", query = "SELECT s FROM StaffList s WHERE s.city = :city"),
    @NamedQuery(name = "StaffList.findByCountry", query = "SELECT s FROM StaffList s WHERE s.country = :country"),
    @NamedQuery(name = "StaffList.findBySid", query = "SELECT s FROM StaffList s WHERE s.sid = :sid")})
public class StaffList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private short id;
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Column(name = "zip code")
    private String zipCode;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @Column(name = "SID")
    private short sid;

    public StaffList() {
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public short getSid() {
        return sid;
    }

    public void setSid(short sid) {
        this.sid = sid;
    }

}
