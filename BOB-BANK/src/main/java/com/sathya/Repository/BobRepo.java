package com.sathya.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.Model.BobEntity;

@Repository
public interface BobRepo extends JpaRepository<BobEntity, Long>{

}
