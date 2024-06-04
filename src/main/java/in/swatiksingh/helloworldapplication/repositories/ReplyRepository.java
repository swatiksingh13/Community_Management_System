package in.swatiksingh.helloworldapplication.repositories;

import in.swatiksingh.helloworldapplication.models.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply,Long> {
}
