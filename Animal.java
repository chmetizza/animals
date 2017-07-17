package si.rais;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

/**
 * Created by spela on 11. 07. 2017.
 */
public class Animal {
    private LocalDate birthDay;
    private Spol spol;

    public Animal( LocalDate birthDay, Spol spol) {
        this.birthDay = birthDay;
        this.spol = spol;
        //spol = Spol.M;

    }

    public LocalDate getBirthDay() {

        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {

        this.birthDay = birthDay;
    }

    public Spol getSpol() {
        spol.getSloSpol();
        return spol;
    }

    public void setSpol(Spol spol) {
        this.spol = spol;
    }

    public int getAge(LocalDate birthDay){
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthDay, today);
        int years = p.getYears();
        return years;
    }
}
