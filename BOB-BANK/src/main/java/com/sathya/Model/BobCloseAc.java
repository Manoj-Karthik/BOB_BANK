package com.sathya.Model;

public class BobCloseAc {
public long account_number;
public String name;
public String password;
public BobCloseAc() {
	super();
}
public BobCloseAc(Long account_number, String name, String password) {
	super();
	this.account_number = account_number;
	this.name = name;
	this.password = password;
}
public Long getAccount_number() {
	return account_number;
}
public void setAccount_number(Long account_number) {
	this.account_number = account_number;
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
@Override
public String toString() {
	return "CloseAccountModel [account_number=" + account_number + ", name=" + name + ", password=" + password + "]";
}

}
