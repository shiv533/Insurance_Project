package com.velocity.insurance.service;

import com.velocity.insurance.entity.Bill;

public interface BillService {
	
	public Bill saveBill(Bill bill);
	
	
	public Bill updateBill(Bill bill);
	
	
	public void deleteBill(Long id);

}
