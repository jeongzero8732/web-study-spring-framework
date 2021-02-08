package org.kpu.eclass.service;

import java.util.List;

import org.kpu.eclass.domain.UserVO;
import org.kpu.eclass.persistence.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	public UserVO readUser(String id) throws Exception{
		return userDAO.read(id);
	}
	public UserVO loginUser(UserVO user) throws Exception{
		return userDAO.login(user);
	}
	public void addUser(UserVO student) throws Exception{
		userDAO.add(student);
	}
	public List<UserVO> readUserList() throws Exception{
		return userDAO.readList();
	}
	public void updateUser(UserVO vo) throws Exception{
		userDAO.update(vo);
	}
	public void deleteUser(UserVO vo) throws Exception{
		userDAO.delete(vo);
	}
}
