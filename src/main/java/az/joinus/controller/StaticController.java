package az.joinus.controller;

import az.joinus.dto.ContactUsDTO;
import az.joinus.service.abstraction.ConfigService;
import az.joinus.service.abstraction.StaticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("statics")
@CrossOrigin("*")
public class StaticController {

    private final StaticsService service;

    @PostMapping("/contact-us")
    public ResponseEntity<ContactUsDTO> postContactUs(@RequestBody ContactUsDTO contactUsDTO) {
        return new ResponseEntity<>(service.postContactUs(contactUsDTO), HttpStatus.OK);
    }

    @GetMapping("/contact-us")
    public ResponseEntity<ContactUsDTO> getContactUs() {
        return new ResponseEntity<>(service.getContactUs(), HttpStatus.OK);
    }
}
