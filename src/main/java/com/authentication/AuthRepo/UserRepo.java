package com.authentication.AuthRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentication.Entity.NewUser;

@Repository
public interface UserRepo extends JpaRepository<NewUser, String>  {

	List<NewUser> findByUsernameAndPassword(String username, String password);

	

}
