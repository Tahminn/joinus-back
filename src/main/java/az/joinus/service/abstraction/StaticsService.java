package az.joinus.service.abstraction;

import az.joinus.dto.ContactUsDTO;

public interface StaticsService {
    ContactUsDTO getContactUs();
    ContactUsDTO postContactUs(ContactUsDTO contactUsDTO);
}
