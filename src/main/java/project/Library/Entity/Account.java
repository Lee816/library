package project.Library.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    private Integer id;

    private String name;

    private String phone;

    private String email;

    private LocalDateTime createdAt;
}
