package in.swatiksingh.helloworldapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Community {

    @Id
    private String id;
    private String name;
    private String description;


    @ManyToMany
    private List<User> joinCommunity;

    @ManyToMany
    private List<User> discussions;
    @ManyToMany
    private List<User> moderators;
}
