import java.math.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.lang.*;

public class task_3 {


    public static void main(String[] args) {
        main_title();
        Randon_farm ran = new Randon_farm(new Farm_Anaimal[]{
                new Cat(),
                new Dog(),
                new Fish()
        });
        Dog dog = new Dog();
        Fish fish = new Fish();
        String l = dog.sp;
        int counter = 0;
        int dcount = 0, ccount = 0, fcount = 0;
        double n = Math.random() * 10;
        Animal animal_dog = dog;
        Animal animal_cat = new Cat();
        Animal animal_fish = fish;
        for (int i = 0; i < (int) n; i++) {
            Animal animal = ran.create();
            animal.speak();
            if (animal_dog.getClass() == animal.getClass()) {
                dcount++;
            } else if (animal_cat.getClass() == animal.getClass()) {
                ccount++;
            } else {
                fcount++;
            }
            counter++;
        }

        System.out.printf("Итого животных: %d \n Собак: %d \n Кошек: %d \n Рыб: %d", counter, dcount, ccount, fcount);
    }

    public static void main_title() {
        var s = String.format("Зоопарк: ");
        System.out.println(s);
    }
}


