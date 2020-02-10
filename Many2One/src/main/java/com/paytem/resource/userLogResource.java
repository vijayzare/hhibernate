package com.paytem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paytem.entity.Users;
import com.paytem.entity.UsersLog;
import com.paytem.repository.UsersLogRepository;

@RestController
@RequestMapping("/rest/users/log")
public class userLogResource {

	@Autowired
	private UsersLogRepository usersLogRepository;

	@GetMapping(value = "/all")
	public List<UsersLog> getAll() {
		return usersLogRepository.findAll();

	}

	@GetMapping(value = "/update/{name}")
	public List<UsersLog> update(@PathVariable final String name) {	
		Users user = new Users();
		user.setName(name).setSalary(13000).setTeamName("Guru");

		UsersLog userLog1 = new UsersLog();
		userLog1.setUsers(user);
		userLog1.setLog("Hii YouTube");
		
	 usersLogRepository.save(userLog1);
		
	 UsersLog userLog2 = new UsersLog();
	 userLog2.setUsers(user);
	 userLog2.setLog("Hii YouTube");
	 usersLogRepository.save(userLog2);
		
		return usersLogRepository.findAll();
	}
}
