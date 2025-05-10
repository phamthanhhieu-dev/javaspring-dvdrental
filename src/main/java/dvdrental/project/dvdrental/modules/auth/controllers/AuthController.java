package dvdrental.project.dvdrental.modules.auth.controllers;

import dvdrental.project.dvdrental.modules.auth.dtos.LoginRequestDTO;
import dvdrental.project.dvdrental.modules.auth.dtos.LoginResponseDTO;
import dvdrental.project.dvdrental.modules.auth.services.interfaces.IAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final IAuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO request) {
        LoginResponseDTO response = authService.login(request);
        return ResponseEntity.ok(response);
    }
}
