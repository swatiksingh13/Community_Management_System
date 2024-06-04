package in.swatiksingh.helloworldapplication.services;

import in.swatiksingh.helloworldapplication.models.Discussion;
import in.swatiksingh.helloworldapplication.models.User;
import in.swatiksingh.helloworldapplication.repositories.DiscussionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussionService {

    @Autowired
    private DiscussionRepository discussionRepository;

    public Discussion addDiscussion(Discussion discussion) {
        return discussionRepository.save(discussion);
    }
}
