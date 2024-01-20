package com.sathya.Service;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathya.Model.BobCloseAc;
import com.sathya.Model.BobEntity;



public interface BobService {
public BobEntity createAccount(BobEntity entity,double amount);
public BobEntity viewAccount(long account_Number,String name,String password);
public BobEntity depositAmount(BobEntity entity,@RequestParam long account_Number, String name, String password, double amount,ModelMap map);
public BobEntity withdrawlAmount(BobEntity entity,@RequestParam long account_Number, String name, String password,double amount);
public BobEntity transferAmount(BobEntity entity,@RequestParam long account_Number, String name, String password, long target_Account_Number, double amount);
public BobEntity  closeAccount(BobCloseAc close,BobEntity entity,@RequestParam long account_number, String name, String password);
}
