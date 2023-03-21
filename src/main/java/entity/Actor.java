package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long actor_id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;


    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date last_update;


    public Actor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}