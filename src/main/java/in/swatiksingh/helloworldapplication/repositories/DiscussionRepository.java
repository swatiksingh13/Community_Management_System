package in.swatiksingh.helloworldapplication.repositories;

import in.swatiksingh.helloworldapplication.models.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
}
