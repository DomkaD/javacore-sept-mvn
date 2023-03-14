package hw3.models;

import hw3.interfaces.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Magazines implements Printable {
    private String name;
    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + " - " + this.name);
    }
}
