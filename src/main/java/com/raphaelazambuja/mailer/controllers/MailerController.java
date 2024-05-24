package com.raphaelazambuja.mailer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raphaelazambuja.mailer.dtos.MailerDTO;
import com.raphaelazambuja.mailer.services.MailService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/mail")
public class MailerController {
    private final MailService mailService;

    @Autowired
    public MailerController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMail(@Valid @RequestBody MailerDTO mailRequest) {
        String response = mailService.sendMail(mailRequest.getSubject(), mailRequest.getText());
        if ("Email enviado com sucesso".equals(response)) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
