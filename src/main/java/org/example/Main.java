package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;
import java.util.List;
import java.util.*;

import lombok.Data;


@Data
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        int menu = 0;
        do {
            mainMenu();
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    list.add(info());
                    break;
                case 2:
                    infoo(list);
                    break;
                case 3:
                    removePeople(list);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("До свидания!");
                    break;
            }
        }while (menu !=5);

    }

    private static void removePeople(ArrayList list) {
        Scanner scanner = new Scanner(System.in);
        infoo(list);
        System.out.println("Выберите номер человека которого хотите удалить: ");
        int peopleNumber = scanner.nextInt();
        if (peopleNumber >= 1 && peopleNumber <= list.size()) {
            list.remove(peopleNumber - 1);
            System.out.println("Данные о человеке успешно удалены!\n");
        } else {
            System.out.println("Такого номера нету! Попробуйте еще раз\n");
        }
    }

    private static void infoo(ArrayList list) {
        int i = 1;
        for (Object people : list){
            System.out.println("Безработный №: "+ i++ + '\n' + people.toString());
        }
    }

    public static String info() {

     FioEntity fio = new FioEntity();
    System.out.println("Введите фамилию человека: ");
    Scanner scanner = new Scanner(System.in);
    fio.setLastname(scanner.nextLine());

    System.out.println("Введите имя человека: ");
    fio.setName(scanner.nextLine());

    System.out.println("Введите отчество человека: ");
    fio.setSurname(scanner.nextLine());

    PersonEntity info = new PersonEntity();
    System.out.println("Введите профессию человека: ");
    info.setProffesion(scanner.nextLine());

    System.out.println("Введите образование человека: ");
    info.setObrazovanie(scanner.nextLine());

    System.out.println("Введите место и должность последней работы: ");
    info.setMestoanddoljnost(scanner.nextLine());

    System.out.println("Введите причину увольнения: ");
    info.setPrichinauvol(scanner.nextLine());

    System.out.println("Введите семейное положение: ");
    info.setSemeinoepoloj(scanner.nextLine());

    System.out.println("Введите жилищные условия: ");
    info.setJilishnie(scanner.nextLine());

    System.out.println("Введите контактные координаты: ");
    info.setKontact(scanner.nextLine());

    System.out.println("Введите требования к будующей работе: ");
    info.setTrebovaniya(scanner.nextLine());

    return String.valueOf(info);
}


    private static void mainMenu() {
        System.out.println("Выберите действие: \n" +
                "1 - Добавить информацию о человеке \n" +
                "2 - Просмотреть список безработных \n" +
                "3 - Удалить человека из списка \n" +
                "4 - Поиск \n" +
                "5 - Закрыть программу\n");
    }
}