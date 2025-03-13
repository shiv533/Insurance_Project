package com.velocity.insurance.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "TRANSACTIONS")

public class Transaction {

	@Id
	@GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;

    @Column(name = "AMOUNT")
    private Double amount;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "TRANSACTION_DATE")
    private LocalDateTime transactionDate;


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTransactionType() {
			return transactionType;
		}

		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		
		public LocalDateTime getTransactionDate() {
			return transactionDate;
		}
		
		public void setTransactionDate(LocalDateTime transactionDate) {
			this.transactionDate = transactionDate;
		}

		@Override
		public String toString() {
			return "Transaction [id=" + id + ", transactionType=" + transactionType + ", amount=" + amount + ", status="
					+ status + ", transactionDate=" + transactionDate + "]";
		}

		
	    
	    
}
