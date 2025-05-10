package dvdrental.project.dvdrental.bases;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate() {
        createdAt = updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}