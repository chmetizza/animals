package si.rais;

import java.time.LocalDate;

/**
 * Created by spela on 11. 07. 2017.
 */
public class Cat extends Animal {
    private String name;
    private String color;
    /*protected enum gender{M,Ž};
    gender spol;*/

    public Cat() {
        super(LocalDate.of(2004,7,13),Spol.M);
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

    /*public String stringSpol() {
       String mz;
       if(spol == gender.Ž){
           mz = "ženska";
       }
       else{
           mz = "moški";
       }
        return mz;
    }

    public gender setSpol(gender spol) {
        this.spol = spol;
        return spol;
    }

    public gender getSpol() {
        return spol;
    }*/
}
