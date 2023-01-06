package com.example.demo.rescontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;
import com.example.demo.repository.CustomerRepository;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/cus")
public class CustomerAPI {
	@Autowired
	CustomerRepository repo;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<customer>> getAll(){
		return ResponseEntity.ok(repo.findAll());
	}
	
	@PostMapping("/insertCus")
	public ResponseEntity<String> insertCus(@RequestBody customer cus){
		repo.save(cus);
		return ResponseEntity.ok("Thành công");
	}
	
	

}
