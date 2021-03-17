package com.bub.ooplab;

public class Employee {
  public String firstname;
  public String lastname;
  private int age;
  private int salary;

  public Employee(String firstnameInput, String lastnameIput, int ageInput, int salaryInput) {
    firstname = firstnameInput;
    lastname = lastnameIput;
    salary = salaryInput;
    age = ageInput;
    int temp = 123;
    // declare variables
  }

  public void work() {
    System.out.println("Hello " + firstname);
  }

  public int getSalary() {
    return this.salary;
  }

  public int getAge() {
    return this.age;
  }

  public void checkPosition() {
    System.out.println("Hello " + firstname);
  }
}
