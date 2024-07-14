package az.joinus.controller;

import az.joinus.dto.authentication.OTPAuthDTO;
import az.joinus.dto.ResponseDTO;
import az.joinus.service.abstraction.OTPCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("otp-codes")
@CrossOrigin("*")
public class OTPCodeController {

    private final OTPCodeService otpCodeService;

    @PostMapping("/authentication")
    public ResponseEntity<ResponseDTO> checkOTPCode(@RequestBody OTPAuthDTO otpAuthDTO) {
        return new ResponseEntity<>(ResponseDTO
                .builder()
                .success(otpCodeService.checkOTPCode(otpAuthDTO.getEmail(), otpAuthDTO.getOtp()))
                .build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> sendOTPCode(String email) {
        otpCodeService.sendOtpCode(email);
        return new ResponseEntity<>(ResponseDTO.builder().success(true).build(), HttpStatus.OK);
    }
}
