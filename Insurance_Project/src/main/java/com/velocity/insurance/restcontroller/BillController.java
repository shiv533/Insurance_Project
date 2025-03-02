package com.velocity.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.velocity.insurance.entity.Bill;
import com.velocity.insurance.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
    private BillService billService;

	@PostMapping("/save")
	public Bill saveBill(@RequestBody Bill bill) {
	
		Bill bill2 = billService.saveBill(bill);
		return bill2;

     }
	//@Author Kaveri
	@PutMapping("/update")
	public Bill updateBill(@RequestBody Bill bill) {
	Bill bill1=	billService.saveBill(bill);
		return bill1;
	}
	@DeleteMapping("/delete/{id}")
	public void deleteBill(@PathVariable("id") Long id) {
		billService.deleteBill(id);
	}


}
