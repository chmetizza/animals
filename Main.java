package si.rais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Cat cat = new Cat();
        cat.setName("Mac");
        cat.setSpol(Cat.gender.M);
        cat.setColor("črna");

        if(cat.getSpol() == Cat.gender.Ž){
            System.out.println(cat.getName() + " " + "je stara" + " " + cat.getAge(cat.getBirthDay()) + " " + "let! ");
        }
        else{
            System.out.println(cat.getName() + " " + "je star" + " " + cat.getAge(cat.getBirthDay()) + " " + "let! ");
        }
        System.out.println("Spol: " + " " + cat.stringSpol());
        System.out.println("Barva: " + cat.getColor());

        /*Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Vnesli ste: " + n);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        //String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        System.out.println("Vnesli ste: " + i);

    }
}
