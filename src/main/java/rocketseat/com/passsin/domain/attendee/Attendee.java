package rocketseat.com.passsin.domain.attendee;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rocketseat.com.passsin.domain.event.Event;

@Entity
@Table(name = "attendees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
