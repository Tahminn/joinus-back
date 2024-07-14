package az.joinus.service.implementation;

import az.joinus.model.entity.OTPCode;
import az.joinus.repository.OTPCodeRepository;
import az.joinus.service.abstraction.ConfigService;
import az.joinus.service.abstraction.EmailService;
import az.joinus.service.abstraction.OTPCodeService;
import az.joinus.util.OTPGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OTPCodeServiceImpl implements OTPCodeService {

    private final static Integer DEF_MIN_RANDOM_BOUND = 100000;
    private final static Integer DEF_MAX_RANDOM_BOUND = 999999;
    private final static String MIN_RANDOM_BOUND = "min_random";
    private final static String  MAX_RANDOM_BOUND = "max_random";

    private final OTPCodeRepository repository;
    private final UserServiceImpl userService;
    private final EmailService emailService;
    private final ConfigService configService;

    @Override
    public Boolean checkOTPCode(String email, Integer otpCode) {
        return repository.findByOtpAndEmailAndIsActive(otpCode, email, true) != null;
    }

    public void handleUserActiveOTPs(String email) {
        List<OTPCode> activeOTPs = repository.findAllByEmail(email);
        activeOTPs.forEach(x-> {
            x.setIsActive(false);
            save(x);
        });
    }

    public int generateOTPCode() {
        String minValue = configService.getValueByName(MIN_RANDOM_BOUND);
        String maxValue = configService.getValueByName(MAX_RANDOM_BOUND);
        int min = minValue == null ? DEF_MIN_RANDOM_BOUND : Integer.parseInt(minValue);
        int max = maxValue == null ? DEF_MAX_RANDOM_BOUND : Integer.parseInt(maxValue);
        return OTPGenerator.generateBetween(min, max);
    }

    @Override
    public void sendOtpCode(String email) {
        if(!userService.checkUserExistence(email))
            throw new RuntimeException("No such an account registered");
        int otp = generateOTPCode();
        emailService.sendOTPCode(email,otp);
        handleUserActiveOTPs(email);
        save(new OTPCode(otp, email));
    }

    @Override
    public OTPCode save(OTPCode otpCode) {
        return repository.save(otpCode);
    }
}
