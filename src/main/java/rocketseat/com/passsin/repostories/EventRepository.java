package rocketseat.com.passsin.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passsin.domain.event.Event;

public interface EventRepository extends JpaRepository<Event, String> {

}
