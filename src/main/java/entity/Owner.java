package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owner_table")
@NoArgsConstructor
@Getter
@Setter
@ToString()
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long owner_id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "owner_car",
            joinColumns = @JoinColumn(name = "owner_id_c"),
            inverseJoinColumns = @JoinColumn(name = "car_id_c")
    )
    private List<Car> cars = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "driveL_id", referencedColumnName = "drive_license_id")
    @ToString.Exclude
    private DriveLicense driveLicense;

    public Owner(String name, DriveLicense driveLicense) {
        this.name = name;
        this.driveLicense = driveLicense;
    }
}
