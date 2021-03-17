package com.bub.ooplab;

public class Employee {
  public String firstname;
  public String lastname;
  private int salary;

  public Employee(String firstnameInput, String lastnameIput, int salaryInput) {
    firstname = firstnameInput;
    lastname = lastnameIput;
    salary = salaryInput;
    // declare variables
  }


  public void work() {
    System.out.println("Hello " + firstname);
  }

  public int getSalary() {
    return this.salary;
  }

  public void checkPosition() {
    System.out.println("Hello " + firstname);
  }
}
