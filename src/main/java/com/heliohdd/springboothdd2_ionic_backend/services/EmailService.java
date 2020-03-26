package com.heliohdd.springboothdd2_ionic_backend.services;

import org.springframework.mail.SimpleMailMessage;

import com.heliohdd.springboothdd2_ionic_backend.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}