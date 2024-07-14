package az.joinus.service.implementation;

import az.joinus.dto.FAQPostDTO;
import az.joinus.model.entity.FAQ;
import az.joinus.repository.FAQRepository;
import az.joinus.service.abstraction.FAQService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FAQServiceImpl implements FAQService {

    private final FAQRepository repository;

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public FAQ post(FAQPostDTO postDTO) {
        return repository.save(new FAQ(postDTO));
    }

    @Override
    public List<FAQ> getAllActive() {
        return repository.getAllByIsActive(true);
    }
}
