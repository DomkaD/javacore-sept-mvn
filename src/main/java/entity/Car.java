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
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long car_id;
    @Enumerated(value = EnumType.STRING)
    private Type type;

    private String model;
    private double power;
    private int price;
    private int year;

    public Car(Type type, String model, double power, int price, int year) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.price = price;
        this.year = year;
    }
}
