package dvdrental.project.dvdrental.modules.auth.services.interfaces;

import dvdrental.project.dvdrental.modules.auth.dtos.LoginResponseDTO;
import dvdrental.project.dvdrental.modules.auth.dtos.LoginRequestDTO;

public interface IAuthService {
    LoginResponseDTO login(LoginRequestDTO request);
}
