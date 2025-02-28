package com.velocity.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bill_seq")
	@SequenceGenerator(name = "bill_seq", sequenceName = "bill_seq", allocationSize = 1)
	private Long id;

    
    private Long billId;
    private String orderName;
    private String gstNumber;
    private int quantity;
    private double totalAmount;

    // Getters and Setters
    
    public Long getId() {
		return id;
	}
    public void setId(Long id) {
		this.id = id;
	}
    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", orderName=" + orderName + ", gstNumber=" + gstNumber + ", quantity="
				+ quantity + ", totalAmount=" + totalAmount + "]";
	}
}
