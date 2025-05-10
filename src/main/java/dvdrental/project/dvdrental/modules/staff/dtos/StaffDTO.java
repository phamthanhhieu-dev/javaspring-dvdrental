package dvdrental.project.dvdrental.modules.staff.dtos;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class StaffDTO {
    private final Integer staffId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Integer storeId;
    private final Boolean active;
    private final String username;
    private final LocalDateTime lastUpdate;

    public StaffDTO(Integer staffId, String firstName, String lastName, String email, Integer storeId, Boolean active, String username, LocalDateTime lastUpdate) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.storeId = storeId;
        this.active = active;
        this.username = username;
        this.lastUpdate = lastUpdate;
    }
}