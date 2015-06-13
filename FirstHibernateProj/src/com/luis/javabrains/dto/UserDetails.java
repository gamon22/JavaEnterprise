package com.luis.javabrains.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity// (name="UserDetails_details")
@Table (name="UserDetails_details")
public class UserDetails {
	@Id @GeneratedValue  //GenerateValue para que hibernate crea el valor del id automaticamente
	//@Column(name="User_ID")
	private int userId;
	//@Column(name="UserName")
	//@Basic  // threat the field as persisted
	//@Transient // ask hibernate to ignore this user field alone
	private String Username;
	
	@Embedded  //para indicar que esta clase sera embebida
	@AttributeOverrides({ //para poder encapsular mas de un campo que se va a modificar
	@AttributeOverride ( name="street", //Ayuda a reconfigurar los atributos que ya han sido configurados o tambien para cambiar algun comportamiento
						column=@Column(name="HOME_STREET_NAME")),
    @AttributeOverride ( name="city", //Ayuda a reconfigurar los atributos que ya han sido configurados o tambien para cambiar algun comportamiento
						column=@Column(name="HOME_CITY_NAME")),
	@AttributeOverride ( name="state", //Ayuda a reconfigurar los atributos que ya han sido configurados o tambien para cambiar algun comportamiento
						column=@Column(name="HOME_STATE_NAME")),
    @AttributeOverride ( name="pincode", //Ayuda a reconfigurar los atributos que ya han sido configurados o tambien para cambiar algun comportamiento
						column=@Column(name="HOME_PIN_NAME"))})  
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	//@Temporal(TemporalType.DATE)   //para que nomas capture solamente la fecha
	private Date joinedDate;
	//private String Address;
	
	
	
	//@Lob // (Large Object) para que este campo pueda soportar mas de 255 caracteres
	private String  description;
	
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
//	public String getAddress() {
//		return Address;
//	}
//	public void setAddress(String address) {
//		Address = address;
//	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return Username ;
	}
	public void setUsername(String username) {
		Username = username;
	}

}
