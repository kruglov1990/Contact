package ru.levelp;

/**
 * Created by Андрей on 05.06.2016.
 */
public class Contact {
    private Object phone;

    public static void main(String[] args) {
        String[] contact = new Contact[10]{
                Contact vasya = new Contact(),
                Contact lena = new Contact(),
                Contact ira = new Contact(),
                Contact ksyusha = new Contact(),
                Contact masha = new Contact(),
                Contact pavel = new Contact(),
                Contact rodion = new Contact(),
                Contact danya = new Contact(),
                Contact jura = new Contact(),
                Contact sasha = new Contact(),
        };
        vasya.name = "Vasya";
        vasya.phone = "+7 953 213 42 23";
        vasya.email = "vasya@yandex.ru";

        lena.name = "Lena";
        lena.phone = "+7 231 243 42 22";
        lena.email = "lena@yandex.ru";

        ira.name = "Ira";
        ira.phone = "+7 923 321 42 33";
        ira.email = "iraa@yandex.ru";

        ksyusha.name = "Ksyusha";
        ksyusha.phone = "+7 432 231 44 32";
        ksyusha.email = "ksyusha@yandex.ru";

        masha.name = "Masha";
        masha.phone = "+7 955 653 54 23";
        masha.email = "masha@yandex.ru";

        pavel.name = "Pavel";
        pavel.phone = "+7 993 265 42 87";
        pavel.email = "pavel@yandex.ru";

        rodion.name = "Rodion";
        rodion.phone = "+7 963 343 42 64";
        rodion.email = "vasya@yandex.ru";

        danya.name = "Faniil";
        danya.phone = "+7 950 543 23 21";
        danya.email = "vasya@yandex.ru";

        jura.name = "Jura";
        jura.phone = "+7 959 233 12 21";
        jura.email = "vasya@yandex.ru";

        sasha.name = "Sasha";
        sasha.phone = "+7 932 211 44 28";
        sasha.email = "vasya@yandex.ru";

    }
}
