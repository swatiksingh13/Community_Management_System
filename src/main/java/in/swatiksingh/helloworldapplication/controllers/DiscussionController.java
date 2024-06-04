package in.swatiksingh.helloworldapplication.controllers;

import in.swatiksingh.helloworldapplication.models.Discussion;
import in.swatiksingh.helloworldapplication.services.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscussionController {

    @Autowired
    private DiscussionService discussionService;

    @PostMapping("/setDiscussions")
    public Discussion setDiscussions(@RequestBody Discussion discussion) {
        return discussionService.addDiscussion(discussion);

    }


}
