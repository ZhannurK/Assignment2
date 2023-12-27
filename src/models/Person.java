package models;

import interfaces.Payable;

public class Person implements Payable {
    private String name;
    private String surname;
    private int id;
    private static int id_gen;

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return getId() + ": " + getName() + " " + getName();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getId(){
        return id;
    }

    public Person(){
        this.id = id_gen++;
    }

    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }

    public String Position(){
        return "models.Student";
    }
}