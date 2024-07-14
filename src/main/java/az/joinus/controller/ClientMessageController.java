package az.joinus.controller;

import az.joinus.dto.ClientMessageDTO;
import az.joinus.model.entity.ClientMessage;
import az.joinus.service.abstraction.ClientMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client-messages")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ClientMessageController {

    private final ClientMessageService service;

    @GetMapping
    public ResponseEntity<List<ClientMessage>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<ClientMessage> post(@RequestBody ClientMessageDTO message) {
        return ResponseEntity.ok(service.save(message));
    }
}
