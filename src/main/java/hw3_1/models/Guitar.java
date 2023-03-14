package hw3_1.models;

import hw3_1.interfaces.Instrument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Guitar implements Instrument {
     private int countOfChord;
    @Override
    public void play() {
        System.out.println("Play " + this.getClass().getSimpleName() + " and it have " + this.countOfChord + " chords");
    }
}
