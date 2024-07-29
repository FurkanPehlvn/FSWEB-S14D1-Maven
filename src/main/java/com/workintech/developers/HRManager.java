package com.workintech.developers;

public class HRManager extends Employee {


    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager (long id, String name, int salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, int salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        this(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    public void work(){
        System.out.println(getName()+ "Hr Manager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        if (index >= 0 && index < juniorDevelopers.length) {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
            } else {
                System.out.println("JuniorDeveloper index is full");
            }
        } else {
            System.out.println("Invalid index for JuniorDeveloper");
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper) {
        if (index >= 0 && index < midDevelopers.length) {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
            } else {
                System.out.println("MidDeveloper index is full");
            }
        } else {
            System.out.println("Invalid index for MidDeveloper");
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        if (index >= 0 && index < seniorDevelopers.length) {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
            } else {
                System.out.println("SeniorDeveloper index is full");
            }
        } else {
            System.out.println("Invalid index for SeniorDeveloper");
        }
    }
}

