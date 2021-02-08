package org.kpu.eclass.service;

import java.util.List;
import org.kpu.eclass.domain.UserVO;

public interface UserService {
	public UserVO readUser(String id) throws Exception;
	public UserVO loginUser(UserVO user) throws Exception;
	public void addUser(UserVO student) throws Exception;
	public List<UserVO> readUserList() throws Exception;
	public void updateUser(UserVO vo) throws Exception;
	public void deleteUser(UserVO vo)  throws Exception;

}
