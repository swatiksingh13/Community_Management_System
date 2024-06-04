package in.swatiksingh.helloworldapplication.repositories;

import in.swatiksingh.helloworldapplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User  , String> {
}
