package rocketseat.com.passsin.domain.Checkin;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rocketseat.com.passsin.domain.attendee.Attendee;

@Entity
@Table(name = "check_ins")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Checkin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "attendee_id", nullable = false)
    private Attendee attendee;
}
