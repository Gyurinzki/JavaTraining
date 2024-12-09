package training;

import java.sql.SQLOutput;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.name = "John Doe";
        trainer.YearOfBirth = 1980;
        System.out.println(trainer.name);
        System.out.println(trainer.YearOfBirth);

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.name = "Jack Doe";
        System.out.println(anotherTrainer.name);
    }

}
