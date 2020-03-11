package com.mouli.design_pattern;

import com.mouli.design_pattern.Cow; 
import com.mouli.design_pattern.Lion;
import com.mouli.design_pattern.House;
import com.mouli.design_pattern.Login;
import com.mouli.design_pattern.Client;
import com.mouli.design_pattern.My_Order;
import com.mouli.design_pattern.OrderDetails;
import com.mouli.design_pattern.Phone_Book;


public class App {

  public static void main(String[] args) {
    System.out.println("        Design Patterns Implemented :   \n");
    System.out.println("\n-------Abstract Factory Pattern-------");
    System.out.println("Animals consisting of Lion and Cow:");
    Lion lion = new Lion();
    lion.type();
    lion.typeOfSound();
    lion.seenIn();
    Cow cow = new Cow();
    cow.type();
    cow.typeOfSound();
    cow.seenIn();
    System.out.println("\n-------Adapter Pattern-------");
    My_Order targetInterface=new OrderDetails();
    targetInterface.getBurger();
    System.out.print(targetInterface.getBurgerDetails()+"\n");
    System.out.println("\n-------Builder Pattern-------");
    House house = new House(true,false,true,false,true,true);
    house.houseDetails();
    System.out.println("\n-------State Pattern-------");
    Phone_Book ph = new Phone_Book();
    ph.call("9839586001");
    System.out.println("\n-------Proxy Pattern-------");
    Client c = new Client();
    c.connectTo("www.reddit.com");
    c.connectTo("www.google.com");
    System.out.println("\n-------Chain Of Responsibilites Pattern-------");
    Login log = new Login("Prince","princeabc");
    Login log1 = new Login("Raina","raina93");
  }
}