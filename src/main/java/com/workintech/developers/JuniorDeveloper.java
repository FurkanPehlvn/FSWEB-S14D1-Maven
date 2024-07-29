package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }


    public void work(){
        System.out.println(getName()+ "Junior developer starts to working");
    }
}
