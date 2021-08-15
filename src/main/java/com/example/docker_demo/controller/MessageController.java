package com.example.docker_demo.controller;

import com.example.docker_demo.model.Message;
import com.example.docker_demo.repository.MessageRepository;
import com.example.docker_demo.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MessageController {
    MessageService service;

    @GetMapping("/")
    public List<Message> findAll() {
        return service.getAllMessages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Message> findMessage(@PathVariable int id) {
        return new ResponseEntity<>(service.findMessageById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Message> postMessage(@RequestBody Message message) {
        return new ResponseEntity<>(service.saveMessage(message), HttpStatus.CREATED);
    }
}
