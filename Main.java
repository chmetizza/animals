package si.rais;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat = new Cat();
        cat.setName("Maca");
        cat.setSpol(Cat.gender.Ž);
        System.out.println(cat.getName() + " " + "je stara" + " " + cat.getAge(cat.getBirthDay()) + " " + "let! ");
        System.out.println("Katerega spola je?" + " " + cat.getSpol());
    }
}
