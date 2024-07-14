package az.joinus.service.abstraction;

import az.joinus.dto.FAQPostDTO;
import az.joinus.model.entity.FAQ;

import java.util.List;

public interface FAQService {
    List<FAQ> getAllActive();
    FAQ post(FAQPostDTO postDTO);
    void delete(Long id);
}
