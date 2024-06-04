package in.swatiksingh.helloworldapplication.services;

import in.swatiksingh.helloworldapplication.models.Reply;
import in.swatiksingh.helloworldapplication.repositories.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {
    @Autowired
    private ReplyRepository replyRepository;

    public Reply addReply(Reply reply) {
      return  replyRepository.save(reply);
    }

}
