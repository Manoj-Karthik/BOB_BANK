package com.sathya.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathya.Model.BobCloseAc;
import com.sathya.Model.BobEntity;
import com.sathya.Repository.BobRepo;

@Service
public class BobServiceImp implements BobService{
	@Autowired
	BobRepo repo;
	@Override
	public BobEntity createAccount(BobEntity entity,double amount) {

		double previous_Balance=0;
		double current_Balance=amount;
		entity.setPrevious_Balance(previous_Balance);
		entity.setCurrent_Balance(current_Balance);
		String status="Active";
		entity.setStatus(status);
		return repo.save(entity);
	}

	@Override
	public BobEntity viewAccount(long account_Number,String name,String password) {
		BobEntity entity=repo.findById(account_Number).get();
		if(name.equals(entity.getName())&&password.equals(entity.getPassword())) {
			return entity;
		}
		else {
			return null;
		}	
	}


	@Override
	public BobEntity depositAmount(BobEntity entity,@RequestParam long account_Number, String name, String password, double amount,ModelMap map) {
		BobEntity entity1=repo.findById(account_Number).get();
		if(entity1.getStatus().equals("Active")) {
			if(name.equals(entity1.getName())&&password.equals(entity1.getPassword())) {
				double previous_Balance=entity1.current_Balance;
				double current_Balance=entity1.getCurrent_Balance()+amount;
				entity1.setPrevious_Balance(previous_Balance);
				entity1.setCurrent_Balance(current_Balance);


			}
			BobEntity entity2=	repo.save(entity1);
			return entity2;
		}

		else {
			return 	null;

		}

	}

	@Override
	public BobEntity withdrawlAmount(BobEntity entity,@RequestParam long account_Number, String name, String password, double amount) {
		BobEntity entity1=repo.findById(account_Number).get();
		if(entity1.getStatus().equals("Active")) {
			if(name.equals(entity1.getName())&&password.equals(entity1.getPassword())) {
				double previous_Balance=entity1.current_Balance;
				double current_Balance=entity1.getCurrent_Balance()-amount;
				entity1.setPrevious_Balance(previous_Balance);
				entity1.setCurrent_Balance(current_Balance);

			}
			BobEntity entity3=repo.save(entity1);
			return entity3;
		}
		else {
			return 	null;

		}
	}

	@Override
	public BobEntity transferAmount(BobEntity entity,@RequestParam long account_Number,String name, String password, long target_Account_Number, double amount) {
		BobEntity entity1=repo.findById(account_Number).get();	
		BobEntity entity3=repo.findById(target_Account_Number).get();
		BobEntity entity4=new BobEntity();
		if (entity3.getAccount_Number()==(target_Account_Number)&&entity1.getAccount_Number()==(account_Number)) {
			double current_Balance=entity1.getCurrent_Balance();
			current_Balance=current_Balance-amount;
			double current_Balance_Target=entity3.getCurrent_Balance();
			current_Balance_Target=current_Balance_Target+amount;
			entity1.setCurrent_Balance(current_Balance);
			entity3.setCurrent_Balance(current_Balance_Target);
			entity4=repo.save(entity1);
			entity4=repo.save(entity3);
		}

		return entity4;

	}


	@Override
	public BobEntity closeAccount(BobCloseAc close,BobEntity entity,@RequestParam long account_Number, String name, String password) {
		BobCloseAc close11=new BobCloseAc();
		BobEntity entity3=repo.findById(account_Number).get(); 

		if(account_Number==entity3.getAccount_Number()&&name.equals(entity3.getName())&&password.equals(entity3.getPassword())) {
			String status="Inactive";
			entity3.setStatus(status);
			return 	repo.save(entity3);

		}
		else {
			return null;
		}	
	}
}

