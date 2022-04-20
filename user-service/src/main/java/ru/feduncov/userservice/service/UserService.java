package ru.feduncov.userservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import ru.feduncov.userservice.controller.dto.CaseDTO;
import ru.feduncov.userservice.entity.User;
import ru.feduncov.userservice.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CaseFeignService caseFeignService;

    private final ObjectMapper objectMapper;

    public UserService(UserRepository userRepository,
                       CaseFeignService caseFeignService,
                       ObjectMapper objectMapper) {

        this.userRepository = userRepository;
        this.caseFeignService = caseFeignService;
        this.objectMapper = objectMapper;
    }

    public User createOrUpdate(User user) {
        try {
            user.setActivity(objectMapper.readValue(caseFeignService.getRandomCase(), CaseDTO.class).getActivity());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
