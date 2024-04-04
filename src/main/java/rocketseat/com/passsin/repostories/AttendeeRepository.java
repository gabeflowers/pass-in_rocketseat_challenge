package rocketseat.com.passsin.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passsin.domain.attendee.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {

}
