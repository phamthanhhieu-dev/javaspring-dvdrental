package dvdrental.project.dvdrental.modules.auth.dtos;

import dvdrental.project.dvdrental.modules.staff.dtos.StaffDTO;
import lombok.Data;

@Data
public class LoginResponseDTO {
    private final String token;
    private final StaffDTO staff;

    public LoginResponseDTO(String token, StaffDTO staff) {
        this.token = token;
        this.staff = staff;
    }
}
