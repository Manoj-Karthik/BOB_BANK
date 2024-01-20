package com.sathya.Model;

public class BobModel {
public long account_Number;
public String name;
public String password;
public double amount;
public String address;
public long mobile_Number;
public BobModel() {
	super();
}
public BobModel(long account_Number, String name, String password, String confirm_password, double amount,
		String address, long mobile_Number) {
	super();
	this.account_Number = account_Number;
	this.name = name;
	this.password = password;
	this.amount = amount;
	this.address = address;
	this.mobile_Number = mobile_Number;
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

public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
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
@Override
public String toString() {
	return "BankModel [account_Number=" + account_Number + ", name=" + name + ", password=" + password
			+ ",  amount=" + amount + ", address=" + address
			+ ", mobile_Number=" + mobile_Number + "]";
}



}
