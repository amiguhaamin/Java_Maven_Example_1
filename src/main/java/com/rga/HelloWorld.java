package com.rga;

public class HelloWorld {

  public static void main(String[] args) {
//    LocalTime currentTime = new LocalTime();
//    System.out.println("The current local time is: " + currentTime);
    Person person = new Person();
    System.out.println(person.greet());
  }

}
