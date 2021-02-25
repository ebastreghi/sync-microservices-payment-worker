package com.microservice.hrpayroll.servicies;

import org.springframework.stereotype.Service;

import com.microservice.hrpayroll.entities.Payment;


@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}