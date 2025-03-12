package com.velocity.insurance.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "audit_log")
public class AuditLog {

	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audit_log_seq")
    @SequenceGenerator(name = "audit_log_seq", sequenceName = "audit_log_seq", allocationSize = 1)
    private Long id;

    private String username;
    private LocalDateTime loginTime;
    private String status;

    public AuditLog() {}

    public AuditLog(String username, String status) {
        this.username = username;
        this.loginTime = LocalDateTime.now();
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getUsername() { return username; }
    public LocalDateTime getLoginTime() { return loginTime; }
    public String getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setUsername(String username) { this.username = username; }
    public void setLoginTime(LocalDateTime loginTime) { this.loginTime = loginTime; }
    public void setStatus(String status) { this.status = status; }

}
