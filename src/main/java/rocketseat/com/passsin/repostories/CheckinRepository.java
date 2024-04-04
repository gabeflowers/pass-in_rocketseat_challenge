package rocketseat.com.passsin.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passsin.domain.Checkin.Checkin;;

public interface CheckinRepository extends JpaRepository<Checkin, String> {

}
