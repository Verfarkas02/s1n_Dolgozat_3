/*
* File: Employee.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-05-23
* Github: https://github.com/Verfarkas02/s1n_Dolgozat_3
* Licenc: GUI GPL 
*/
import java.time.LocalDate;

public class Employee {
    String name;
    String city;
    String address;
    LocalDate birth;
    double salary;

    public Employee() {
    }

    public Employee(String name, String city, String address, LocalDate birth, double salary) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }
    
}
