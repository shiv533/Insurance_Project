package com.velocity.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.entity.Branch;
import com.velocity.insurance.service.BranchService;

@RestController
public class BranchController {

	@Autowired
	private BranchService branchService;

	@PostMapping("/save")
	public ResponseEntity<Branch> saveBranch(@RequestBody Branch branch) {
		Branch savedBranch = branchService.saveBranch(branch);
		return new ResponseEntity<>(savedBranch, HttpStatus.CREATED);
	}
	
	// Restful web service to update branch data
	   
	    @PutMapping("/update")
		public Branch updateBranch(@RequestBody Branch branch) {
			Branch br=branchService.updateBranch(branch);
			return br;
		}
	    
	    
	  // // Restful web service to fetch  branch data by id
	    
	    @GetMapping("/get/{id}") 
	    public Branch getBranchById(@PathVariable("id") Long id) { 
	    Branch branch = branchService.getBranchbyId(id); 
	    return branch; 
	    } 
}
