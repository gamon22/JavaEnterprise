package com.luis.javabrains.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.cfg.Configuration;

@Entity// (name="UserDetails_details")
@Table (name="USER_DETAILS")
public class UserDetailsv10 {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)  //GenerateValue para que hibernate crea el valor del id automaticamente
	private int userId;
	private String Username;
		
	@ElementCollection// este sirbe para marcar ListOfAddresses como un objeto persistente
	private Set<Address> ListOfAddresses =new HashSet();
	
	
	public int getUserId() {
		return userId;
	}
	public Set<Address> getListOfAddresses() {
		return ListOfAddresses;
	}
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		ListOfAddresses = listOfAddresses;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	
	
	

}
