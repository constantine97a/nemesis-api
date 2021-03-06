package com.nemesis.api.repository;

import java.util.List;

import com.nemesis.api.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findUserByUsername(String username);

	public List<User> findUserDailyReport();
}
