package az.joinus.controller;

import az.joinus.dto.QuestionSaveDTO;
import az.joinus.dto.ResponseDTO;
import az.joinus.model.entity.Question;
import az.joinus.service.abstraction.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("questions")
@RequiredArgsConstructor
@CrossOrigin("*")
public class QuestionController {

    private final QuestionService service;

    @GetMapping
    public ResponseEntity<ResponseDTO> get() {
        return new ResponseEntity<>(ResponseDTO.builder()
                .success(true)
                .data(service.getAll())
                .build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> post(@RequestBody QuestionSaveDTO saveDTO) {
        return new ResponseEntity<>(ResponseDTO.builder()
                .success(true)
                .data(service.save(saveDTO))
                .build(), HttpStatus.OK);
    }
}
