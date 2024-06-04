package in.swatiksingh.helloworldapplication.services;

import in.swatiksingh.helloworldapplication.models.Community;
import in.swatiksingh.helloworldapplication.models.User;
import in.swatiksingh.helloworldapplication.repositories.CommunityRepository;
import in.swatiksingh.helloworldapplication.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CommunityService {
    private final CommunityRepository communityRepository;
    private final UserRepository userRepository;

    public CommunityService(CommunityRepository communityRepository, UserRepository userRepository) {
        this.communityRepository = communityRepository;
        this.userRepository = userRepository;
    }

    public Community createNewCommunity(Community community) {
            return communityRepository.save(community);
    }

    public void setModerators(String communityId, String userId) {
            Community community1 = communityRepository.findById(communityId).orElse(null);
            User user1 = userRepository.findById(userId).orElse(null);

            if( community1 != null && user1 != null) {
                community1.getDiscussions().add(user1);

                communityRepository.save(community1);
            }
    }

    public void joinCommunity(String communityId, String userId) {
        Community community1 = communityRepository.findById(communityId).orElse(null);
        User user1 = userRepository.findById(userId).orElse(null);

        if( community1 != null && user1 != null) {
            community1.getJoinCommunity().add(user1);
            communityRepository.save(community1);
        }
    }

    public Community getCommunityById(String id) {
            return communityRepository.findById(id).orElse(null);
    }

    public List<Community> getAllCommunities() {
            return communityRepository.findAll();
    }

}
