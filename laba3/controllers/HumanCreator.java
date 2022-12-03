package controllers;


import enums.Sex;
import models.Human;

public class HumanCreator {
    public Human createHuman(String lastName, String firstName, String patronymicName, Sex sex) {
        Human human = new Human();

        human.setPatronymicName(patronymicName);
        human.setFirstName(firstName);
        human.setLastName(lastName);
        human.setSex(sex);
        return human;
    }
}