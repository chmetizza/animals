package si.rais;

import java.time.LocalDate;
import java.time.LocalTime;

import static si.rais.Cat.gender.Ž;

/**
 * Created by spela on 11. 07. 2017.
 */
public class Cat extends Animal {
    private String name;
    private String color;
    protected enum gender{M,Ž};
    gender spol;

    public Cat() {
        super(10, LocalDate.of(2004,4,1));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpol() {
       String mz;
       if(spol == gender.Ž){
           mz = "ženska";
       }
       else{
           mz = "moški";
       }
        return mz;
    }

    public void setSpol(gender spol) {
        this.spol = spol;
    }
}
