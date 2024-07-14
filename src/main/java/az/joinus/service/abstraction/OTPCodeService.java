package az.joinus.service.abstraction;

import az.joinus.model.entity.OTPCode;

public interface OTPCodeService {
    OTPCode save(OTPCode otpCode);

    void sendOtpCode(String email);

    void handleUserActiveOTPs(String email);

    Boolean checkOTPCode(String email, Integer otpCode);

}
