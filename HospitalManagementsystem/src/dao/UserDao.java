package dao;

import model.User;

interface UserDao {
	int signup(User u1) throws Exception;
	int[] login(User u1) throws Exception;


}
