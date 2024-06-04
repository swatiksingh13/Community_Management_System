package in.swatiksingh.helloworldapplication.controllers;

import in.swatiksingh.helloworldapplication.models.Reply;
import in.swatiksingh.helloworldapplication.services.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReplyController {

    private final ReplyService replyService;

    public ReplyController(ReplyService replyService) {
 this.replyService=replyService;
    }

    @PostMapping("/reply")
    public Reply addReply(@RequestBody Reply reply) {
        return replyService.addReply(reply);
    }
}
