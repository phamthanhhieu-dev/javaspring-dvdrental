package dvdrental.project.dvdrental.modules.auth.services.impl;

import dvdrental.project.dvdrental.bases.BaseService;
import dvdrental.project.dvdrental.modules.auth.dtos.LoginRequestDTO;
import dvdrental.project.dvdrental.modules.auth.dtos.LoginResponseDTO;
import dvdrental.project.dvdrental.modules.auth.services.interfaces.IAuthService;
import dvdrental.project.dvdrental.modules.staff.dtos.StaffDTO;
import dvdrental.project.dvdrental.modules.staff.entities.Staff;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthService extends BaseService implements IAuthService {
//    private final StaffRepository staffRepository;  // Để truy vấn thông tin staff
//    private final JwtUtils jwtUtils;  // Để tạo JWT token
//    private final BCryptPasswordEncoder passwordEncoder;  // Để mã hóa và kiểm tra mật khẩu
    @Override
    public LoginResponseDTO login(LoginRequestDTO request) {
        // Lấy thông tin từ request
        String token = "random_token";
        StaffDTO staff = new StaffDTO(
                1,
                "John",
                "Doe",
                "john.doe@example.com",
                1,
                true,
                "johndoe",
                LocalDateTime.now()
        );

//        String username = request.getUsername();
//        String password = request.getPassword();

//        // Kiểm tra xem staff có tồn tại không
//        Staff staff = staffRepository.findUsername(username)
//                .orElseThrow(() -> new RuntimeException("User not found"));
//
//        // Kiểm tra mật khẩu với BCrypt
//        if (!passwordEncoder.matches(password, staff.getPassword())) {
//            throw new RuntimeException("Invalid credentials");
//        }
//
//        // Tạo JWT token
//        String token = jwtUtils.generateToken(staff);
//
//        // Tạo LoginResponseDTO và trả về
//        LoginResponseDTO response = new LoginResponseDTO();
//        response.setToken(token);
//        response.setStaff(new StaffDTO(staff));  // Giả sử bạn đã có StaffDTO để map đối tượng Staff sang DTO

//        return response;
        return new LoginResponseDTO(token, staff);
    }
}
