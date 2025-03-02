package com.velocity.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.velocity.insurance.entity.Bill;
import com.velocity.insurance.repository.BillRepository;
import com.velocity.insurance.service.BillService;

@Service
public class BillServiceImpl implements BillService{

	@Autowired
	private BillRepository billRepository;
	
	@Override
	public Bill saveBill(Bill bill) {
		Bill bill2=	billRepository.save(bill);
		return bill2;
		
	}
//  @Auother Kaveri
	@Override
	public Bill updateBill(Bill bill) {
	Bill bill1=	billRepository.save(bill);
		return bill1;
	}

	@Override
	public void deleteBill(Long id) {
		// TODO Auto-generated method stub
		billRepository.deleteById(id);
		
	}

}
