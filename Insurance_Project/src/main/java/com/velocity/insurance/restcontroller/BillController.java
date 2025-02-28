package com.velocity.insurance.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
}
