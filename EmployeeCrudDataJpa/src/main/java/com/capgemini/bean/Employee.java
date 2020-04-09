package com.capgemini.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Entity
@EnableWebSecurity
@Table(name="Jpatable")
public class Employee {
	@Id
	@GeneratedValue
	@Column(length=10)
	private int eid;
	@Column(length=15)
	private String ename;
	@Column(length=10)
	private int esal;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}

}