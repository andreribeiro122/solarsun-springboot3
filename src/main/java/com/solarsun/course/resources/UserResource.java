package com.solarsun.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solarsun.course.entities.User;

@RestController
@RequestMapping(value = "/penis")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Andre", "andre@gmail.com", "11930700078", "12345");
		return ResponseEntity.ok().body(u);
	}
}
