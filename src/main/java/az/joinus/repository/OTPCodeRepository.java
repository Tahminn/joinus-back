package az.joinus.repository;

import az.joinus.model.entity.OTPCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OTPCodeRepository extends JpaRepository<OTPCode, Long> {
    List<OTPCode> findAllByEmail(String email);
    OTPCode findByOtpAndEmailAndIsActive(Integer otp, String email, Boolean isActive);
}
