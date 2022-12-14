package controllers;

import models.Department;
import models.Group;
import models.Human;

import java.util.ArrayList;

public class DepartmentCreator {
    public Department createDepartment(String name, Human chief, ArrayList<Group> groups) {
        Department department = new Department();

        department.setGroups(groups);
        department.setChief(chief);
        department.setName(name);

        return department;
    }
}
