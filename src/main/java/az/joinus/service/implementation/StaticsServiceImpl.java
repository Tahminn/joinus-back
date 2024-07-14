package az.joinus.service.implementation;

import az.joinus.dto.ContactUsDTO;
import az.joinus.model.entity.Config;
import az.joinus.repository.ConfigRepository;
import az.joinus.service.abstraction.ConfigService;
import az.joinus.service.abstraction.StaticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StaticsServiceImpl implements StaticsService {

    private final ConfigService configService;
    private final ConfigRepository configRepository;

    @Override
    public ContactUsDTO postContactUs(ContactUsDTO contactUsDTO) {
        List<Config> configs = configRepository.getAllByType("contact-us");
        configs.forEach(x->{
            if(x.getName().equals("title"))
                x.setValue(contactUsDTO.getTitle());
            if(x.getName().equals("text"))
                x.setValue(contactUsDTO.getText());
            if(x.getName().equals("phone"))
                x.setValue(contactUsDTO.getPhone());
            if(x.getName().equals("email"))
                x.setValue(contactUsDTO.getEmail());
        });
        configRepository.saveAll(configs);
        return contactUsDTO;
    }

    @Override
    public ContactUsDTO getContactUs() {

        List<Config> contactUs = configRepository.getAllByType("contact-us");
        return ContactUsDTO.builder()
                .title(contactUs.stream().filter(x->x.getName().equals("title")).findFirst().orElse(null).getValue())
                .text(contactUs.stream().filter(x->x.getName().equals("text")).findFirst().orElse(null).getValue())
                .email(contactUs.stream().filter(x->x.getName().equals("email")).findFirst().orElse(null).getValue())
                .phone(contactUs.stream().filter(x->x.getName().equals("phone")).findFirst().orElse(null).getValue())
                .build();
    }
}
