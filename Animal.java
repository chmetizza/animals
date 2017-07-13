package si.rais;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

/**
 * Created by spela on 11. 07. 2017.
 */
public class Animal {
    private LocalDate birthDay;

    public Animal( LocalDate birthDay) {

        this.birthDay = birthDay;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge(LocalDate birthDay){
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthDay, today);
        int years = p.getYears();
        return years;
    }
}
