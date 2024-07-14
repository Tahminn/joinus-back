package az.joinus.service.abstraction;

import az.joinus.dto.ConfigurationPostDTO;
import az.joinus.dto.ResponseDTO;

public interface ConfigService {
    String getValueByName(String name);
    ResponseDTO findAll();
    ResponseDTO findById(Long id);
    ResponseDTO findByName(String name);
    ResponseDTO getAllByType(String type);
    ResponseDTO save(ConfigurationPostDTO configurationPostDTO);
}
