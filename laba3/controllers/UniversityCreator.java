package controllers;

import models.Faculty;
import models.Human;
import models.University;
import models.Faculty;
import models.Human;
import models.University;

import java.util.ArrayList;

public class UniversityCreator {
    public University createUniversity(String name, Human chief, ArrayList<Faculty> faculties) {
        University university = new University();

        university.setName(name);
        university.setChief(chief);
        university.setFaculties(faculties);

        return university;
    }
}
