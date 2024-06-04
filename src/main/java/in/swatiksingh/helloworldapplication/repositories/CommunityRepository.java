package in.swatiksingh.helloworldapplication.repositories;

import in.swatiksingh.helloworldapplication.models.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunityRepository extends JpaRepository<Community, String> {
}
