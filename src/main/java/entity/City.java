package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long city_id;

    @Column(name ="city")
    private String city;
    @Column(name ="country_id")
    private long country_id;


    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date last_update;

    public City(String city, long country_id) {
        this.city = city;
        this.country_id = country_id;
    }
}
