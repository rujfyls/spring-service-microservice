package ru.feduncov.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.feduncov.userservice.controller.dto.UserRequestDTO;
import ru.feduncov.userservice.controller.dto.UserResponseDTO;
import ru.feduncov.userservice.entity.User;
import ru.feduncov.userservice.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO requestDTO) {

        User user = new User();
        user.setEmail(requestDTO.getEmail());
        user.setUsername(requestDTO.getName());
        user.setPassword(requestDTO.getPassword());

        return ResponseEntity.ok(new UserResponseDTO(userService.createOrUpdate(user)));
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers()
                .stream().map(UserResponseDTO::new).collect(Collectors.toList()));
    }
}
