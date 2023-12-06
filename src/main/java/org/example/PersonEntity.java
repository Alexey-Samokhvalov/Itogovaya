package org.example;

import lombok.Data;

@Data
public class PersonEntity {
    private String Proffesion;
    private String Obrazovanie;
    private String mestoanddoljnost;
    private String prichinauvol;
    private String semeinoepoloj;
    private String jilishnie;
    private String kontact;
    private String trebovaniya;

    @Override
    public String toString() {
        return "Профессия = " + Proffesion + "\n" +
                "Образование = " + Obrazovanie + "\n" +
                "Место и должность последеней работы = " + mestoanddoljnost + "\n" +
                "Причнина увольнения = " + prichinauvol + "\n" +
                "Семейное положение = " + semeinoepoloj + "\n" +
                "Жилищные условия = " + jilishnie + "\n" +
                "Контактные координаты = " + kontact + "\n" +
                "Требования к будущей работе = " + trebovaniya + "\n";
    }
}
