package com.paytem.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paytem.entity.Users;
import com.paytem.entity.UsersContact;
import com.paytem.repository.UserContactRepository;
import com.paytem.repository.UsersRepository;

@RestController
@RequestMapping("/rest/userscantact")
public class UsersContactResourece {

	@Autowired
	private UserContactRepository usersContactRepository;

	@GetMapping(value = "/all")
	public List<UsersContact> getUsersContact() {

		return usersContactRepository.findAll();

	}

	@GetMapping(value = "update/{name}")
	public List<UsersContact> update(@PathVariable final String name) {
		UsersContact usersContact = new UsersContact();
		Users users = new Users();

		users.setTeamName("Development").setSalary(10000).setName(name);

		usersContact.setPhoneNo(1111111).setUsers(users);
		usersContactRepository.save(usersContact);
		return usersContactRepository.findAll();

	}
	

}
