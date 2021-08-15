package com.example.docker_demo.service;

import com.example.docker_demo.model.Message;
import com.example.docker_demo.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository repository;

    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    public Message findMessageById(int id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Message saveMessage(Message message) {
        return repository.save(message);
    }
}
