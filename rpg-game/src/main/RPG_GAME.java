package main;

import characters.Archer;
import characters.Mage;
import characters.Warrior;

import javax.xml.transform.Source;
import java.util.Scanner;

public class RPG_GAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в RPG_GAME!");

        System.out.println("За кого будем играть?");

        int hero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("1 - Воин");
        System.out.println("2 - Маг");
        System.out.println("3 - Стрелок");

        switch (hero){
            case 1:
                System.out.println("Введите имя для вашего воина: ");
                String warrior_name = scanner.nextLine();
                Warrior warrior = new Warrior(warrior_name);
                System.out.println("Персонаж успешно создан!");
                break;
            case 2:
                System.out.println("Введите имя для вашего мага: ");
                String mage_name = scanner.nextLine();
                Mage mage = new Mage(mage_name);
                System.out.println("Персонаж успешно создан!");
                break;
            case 3:
                System.out.println("Введите имя для вашего стрелка: ");
                String archer_name = scanner.nextLine();
                Archer archer = new Archer(archer_name);
                System.out.println("Персонаж успешно создан!");
        }

    }
}
