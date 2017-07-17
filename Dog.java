package si.rais;

import java.time.LocalDate;

/**
 * Created by spela on 11. 07. 2017.
 */
public class Dog extends Animal {
    private String name;

    public Dog(LocalDate birthDay, String name) {
        super(birthDay, Spol.M);
        this.name = name;
    }
}
