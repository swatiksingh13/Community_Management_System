package in.swatiksingh.helloworldapplication.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String communityId;
    private String title;
    private  String Content;
    private String userId;


}
