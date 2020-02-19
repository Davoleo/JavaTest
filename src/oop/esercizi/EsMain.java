package oop.esercizi;

import enumerazioni.EnumOW;
import esercizi.Time;
import esercizi.animals.*;

import java.util.EnumSet;

/*************************************************
 * Author: Leonardo
 * Date: 05/11/2018
 * Hour: 22.23
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class EsMain {

    public static void main(String[] args)
    {
        Time time = new Time(13, 1,29);

        System.out.println(time.displayMilitary());
        System.out.println(time.displayClassic());

        Date date = new Date(20,5,2018);
        System.out.println("the date is: " + date);

        BirthDate bday = new BirthDate("Jeff", date);
        System.out.println(bday);

        for(EnumOW hero : EnumOW.values())
            System.out.println("Hero: " + hero + "\t\tName: " + hero.realName() + "\t\tAge: " + hero.age() + "\t\tLocation: " + hero.localize());

        System.out.println("\nEnum Constant Range\n");
        for (EnumOW hero : EnumSet.range(EnumOW.Reinhardt, EnumOW.Wrecking_Ball))
            System.out.println("Hero: " + hero + "\t\tName: " + hero.realName() + "\t\tAge: " + hero.age() + "\t\tLocation: " + hero.localize());

        //--------------------------------
        //Animal test

        Animal[] animalArray = new Animal[2];
        Dog d = new Dog();
        Fish f = new Fish();

        animalArray[0]=d;
        animalArray[1]=f;

        for(Animal x : animalArray)
        {
            x.noise();
        }
    }

}
