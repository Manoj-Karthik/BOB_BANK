package com.sathya.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BankOfBaroda_Bank")
public class BobEntity {
@Id
public long account_Number;
public String name;
public String password;
public double previous_Balance;
public double current_Balance;
public String address;
public long mobile_Number;
public String status;
public BobEntity() {
	super();
}
public BobEntity(long account_Number, String name, String password, double previous_Balance, double current_Balance,
		String address, long mobile_Number, String status) {
	super();
	this.account_Number = account_Number;
	this.name = name;
	this.password = password;
	this.previous_Balance = previous_Balance;
	this.current_Balance = current_Balance;
	this.address = address;
	this.mobile_Number = mobile_Number;
	this.status = status;
}
public long getAccount_Number() {
	return account_Number;
}
public void setAccount_Number(long account_Number) {
	this.account_Number = account_Number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getPrevious_Balance() {
	return previous_Balance;
}
public void setPrevious_Balance(double previous_Balance) {
	this.previous_Balance = previous_Balance;
}
public double getCurrent_Balance() {
	return current_Balance;
}
public void setCurrent_Balance(double current_Balance) {
	this.current_Balance = current_Balance;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobile_Number() {
	return mobile_Number;
}
public void setMobile_Number(long mobile_Number) {
	this.mobile_Number = mobile_Number;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "BankEntity [account_Number=" + account_Number + ", name=" + name + ", password=" + password
			+ ", previous_Balance=" + previous_Balance + ", current_Balance=" + current_Balance + ", address=" + address
			+ ", mobile_Number=" + mobile_Number + ", status=" + status + "]";
}

}
