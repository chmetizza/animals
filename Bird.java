package si.rais;

import java.time.LocalDate;

/**
 * Created by spela on 13.7.2017.
 */
public class Bird extends Animal {
    public Bird() {
        super(LocalDate.of(2015,12,2),Spol.M);
        System.out.println("To je class Bird, ki extenda class Animal");
    }
}
