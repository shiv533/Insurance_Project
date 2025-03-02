package com.velocity.insurance.entity;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBServiceHealthIndicator implements HealthIndicator {
	
	private static final String HOST = "localhost"; // Change if your DB service is on a different host
    private static final int PORT = 8081; // Your database service port

	@Override
	public Health health() {
		
		if (isDatabaseRunning()) {
            return Health.up().withDetail("Database Service", "Running on port " + PORT).build();
        } else {
            return Health.down().withDetail("Database Service", "Not running on port " + PORT).build();
        }
    }

    private boolean isDatabaseRunning() {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(HOST, PORT), 1000); // 1-second timeout
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}


