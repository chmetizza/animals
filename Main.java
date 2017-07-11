package si.rais;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat = new Cat();
        cat.setAge(13);
        cat.setName("Maca");
        cat.setSpol(Cat.gender.Ž);
        System.out.println(cat.getName() + " " + "je stara" + " " + cat.getAge() + " " + "let! ");
        System.out.println("Katerega spola je?" + " " + cat.getSpol());
    }
}
