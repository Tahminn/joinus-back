package az.joinus.service.implementation;

import az.joinus.dto.ConfigurationPostDTO;
import az.joinus.dto.ResponseDTO;
import az.joinus.exception.ResourceAlreadyExistsException;
import az.joinus.model.entity.Config;
import az.joinus.model.entity.InnerItem;
import az.joinus.repository.ConfigRepository;
import az.joinus.service.abstraction.ConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ConfigServiceImpl implements ConfigService {

    private final ConfigRepository repository;

    @Override
    public ResponseDTO findById(Long id) {
        return ResponseDTO.builder()
                .success(true)
                .data(repository.findById(id).orElse(null))
                .build();
    }

    @Override
    public ResponseDTO findByName(String name) {
        Config config = repository.getByName(name).orElse(null);
        if (config != null && config.getInnerItems() != null) {
            List<InnerItem> inners = config.getInnerItems().stream().sorted(Comparator.comparing(InnerItem::getOrdering)).
                    collect(Collectors.toList());
            config.setInnerItems(inners);
        }
        return ResponseDTO.builder()
                .success(true)
                .data(config)
                .build();
    }

    @Override
    public ResponseDTO findAll() {
        return ResponseDTO.builder()
                .success(true)
                .data(repository.findAll())
                .build();
    }

    @Override
    public ResponseDTO getAllByType(String type) {
        return ResponseDTO.builder()
                .success(true)
                .data(repository.getAllByType(type))
                .build();
    }

    @Override
    public ResponseDTO save(ConfigurationPostDTO configurationPostDTO) {
        String name = configurationPostDTO.getName();
        Config config = repository.getByName(name).orElse(null);
        if (config != null && configurationPostDTO.getId() == null) throw new ResourceAlreadyExistsException();
        else
            config = new Config(configurationPostDTO);
        return ResponseDTO.builder()
                .success(true)
                .data(repository.save(config))
                .build();
    }

    @Override
    public String getValueByName(String name) {
        Config config = repository.getByName(name).orElse(null);
        return config == null ? null : config.getValue();
    }
}
