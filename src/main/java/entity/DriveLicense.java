package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString()
public class DriveLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int drive_license_id;

    private String series;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "driveLicense")
    private Owner owner;

    public DriveLicense(String series) {
        this.series = series;
    }
}
