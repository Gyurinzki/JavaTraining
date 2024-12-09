package training;

import javax.security.auth.login.AccountNotFoundException;
import java.sql.SQLOutput;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.name = "John Doe";
        trainer.setYearOfBirth(1980);
        System.out.println(trainer.name);
        System.out.println(trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.name = "Jack Doe";
        anotherTrainer.setYearOfBirth(1981);
        System.out.println(anotherTrainer.name);

        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getNameAndYearofBirth());

        anotherTrainer.changeName("Joe Doe");
        System.out.println(anotherTrainer.getName());

        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());
    }

}
