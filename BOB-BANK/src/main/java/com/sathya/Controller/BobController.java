package com.sathya.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathya.Model.BobCloseAc;
import com.sathya.Model.BobEntity;
import com.sathya.Model.BobModel;
import com.sathya.Model.BobTransfer;
import com.sathya.Service.BobServiceImp;

@Controller
public class BobController {
	@Autowired
	private BobServiceImp service;
@RequestMapping("/")
public String homePage() {
return "home";	
}

@RequestMapping("/newaccountUrl")
public String registrationPage(ModelMap model) {
	BobModel bobmodel=new BobModel();
	model.put("bank", bobmodel);
return "register";	
}
@RequestMapping("/register")
public String createAccount(@ModelAttribute BobEntity entity,ModelMap map,@RequestParam double amount) {
BobEntity bobentity	=service.createAccount(entity,amount);
	return "success";	
}
@RequestMapping("/balanceUrl")
public String view(ModelMap model) {
	BobModel dobModel=new BobModel();
	model.put("models", dobModel);
	return "view";	
}
@RequestMapping("/balancecheck")
public String viewDetails(ModelMap model,@RequestParam long account_Number,@RequestParam String name, String password) {
	BobEntity entity=service.viewAccount(account_Number,name,password);
	model.put("entity", entity);
	return "check";
}
@RequestMapping("/depositUrl")
		public String deposit(ModelMap model) {
	BobModel bobmodel=new BobModel();
	model.put("deposit", bobmodel);
			return "deposit";
	}
@RequestMapping("/depositstatus")
public String depositStatus(BobEntity entity,@RequestParam long account_Number,String name, String password, double amount,ModelMap model) {
	
	BobEntity bobEntity=service.depositAmount(entity,account_Number,name,password,amount,model);
	String message=null;
	if(bobEntity!=null)
	{
		message="Amount Deposited successfully.............";
	}
	else {
		message="Please entered valid Details";
	}
	model.put("depositstatus",message);
	return "depositstatus";

}
@RequestMapping("/withdrawUrl")
public String withdraw(ModelMap model) {
BobModel bobModel=new BobModel();
model.put("withdraw", bobModel);
		return "withdraw";
}
@RequestMapping("/withdrawamount")
public String viewWithdrawDetails(BobEntity entity,@RequestParam long account_Number, String name, String password, double amount,ModelMap model) {
	BobEntity bobentity=service.withdrawlAmount(entity,account_Number,name,password,amount);
	String message=null;
	if(bobentity!=null)
	{
		message="Amount withdrawn successfully";
	}
	else {
		message="Please enter valid details";
	}
	model.put("withdrawalstatus",message);
	return "withdrawstatus";	
}
@RequestMapping("/transferUrl")
public String transfer(ModelMap model,BobTransfer transfer) {
	BobTransfer bobtransfer=new BobTransfer();
	model.put("transfer", bobtransfer);
	return "transfer";	
}
@RequestMapping("/transfer")

public String viewDetails(BobEntity entity,@RequestParam long account_Number, String name, String password, long target_Account_Number, double amount,ModelMap model) {
	BobEntity bobEntity=service.transferAmount(entity,account_Number,name,password,target_Account_Number,amount);
	String message=null;
	if(bobEntity!=null)
	{
		message="Amount Transferred successfully";
	}
	else if(bobEntity==null)
	{
		message="Amount Transfer failed";
	}
	model.put("transferstatus",message);
	return "transferstatus";		 
	
}
@RequestMapping("/closeUrl")
public String closeAccount(ModelMap model,BobCloseAc cmobobaccclose)
{
	BobCloseAc bobclosemodel=new BobCloseAc();
	model.put("close", bobclosemodel);
			return "close";	
}
@RequestMapping("/closeaccount")
public String closeAccount(BobCloseAc close,BobEntity entity,@RequestParam long account_number, String name, String password,ModelMap model) {
	BobEntity bobcloseAcc=service.closeAccount(close,entity,account_number,name,password);
	String message=null;
	if(bobcloseAcc!=null) {
		message="Your account closed successfully";
	}
	else {
		message="You have entered invalid data.Please,Re_enter again";
	}
	model.put("closing", message);
	return "account";
	
}
@RequestMapping("/aboutUrl")
public String aboutOurBank() {
	return "about";
}
}
