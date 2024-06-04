package in.swatiksingh.helloworldapplication.services;

import in.swatiksingh.helloworldapplication.models.User;
import in.swatiksingh.helloworldapplication.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

}
