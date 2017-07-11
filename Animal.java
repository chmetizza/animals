package si.rais;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by spela on 11. 07. 2017.
 */
public class Animal {
    private int age;
    private LocalDate birthDay;

    public Animal(int age, LocalDate birthDay) {
        this.age = age;
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
