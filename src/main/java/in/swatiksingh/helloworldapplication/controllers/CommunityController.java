package in.swatiksingh.helloworldapplication.controllers;

import in.swatiksingh.helloworldapplication.models.Community;
import in.swatiksingh.helloworldapplication.services.CommunityService;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommunityController {

    private final CommunityService communityService;

    public CommunityController(CommunityService communityService) {
        this.communityService = communityService;
    }
    @PostMapping("/addNewCommunity")
        public Community addNewCommunity(@RequestBody Community community) {
        return communityService.createNewCommunity(community);
    }

    @PostMapping("/setModerators/{communityId}/{userId}")
    public void setModerators(@PathVariable String communityId, @PathVariable String userId) {
        communityService.setModerators(communityId, userId);
        return;
    }

    @PostMapping("/joinCommunity/{communityId}/{userId}")
    public void joinCommunity(@PathVariable String communityId, @PathVariable String userId) {
        communityService.joinCommunity(communityId, userId);
        return;
    }

    @GetMapping("/getCommunity/{id}")
    public Community getCommunity(@PathVariable String id) {
        return communityService.getCommunityById(id);
    }

    @GetMapping("/getAll")
    public List<Community> getAllCommunities() {
            return communityService.getAllCommunities();
    }





}
