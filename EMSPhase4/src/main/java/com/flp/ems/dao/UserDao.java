package com.flp.ems.dao;

import org.springframework.stereotype.Repository;

import com.flp.ems.model.user.User;
@Repository
public interface UserDao {
	
	boolean authenticate(User user);
	boolean changePwd(User user);

}
