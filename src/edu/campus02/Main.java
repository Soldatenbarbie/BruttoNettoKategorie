package edu.campus02;

public class Main {

    public static void main(String[] args) {
        // write your code here


           int preis = 200;
           int steuerklasse = 3;

           double steuer1 = 0.2;
           double steuer2 = 0.16;
           double steuer3 = 0.08;
           double steuer = 0;
           double brutto;

           switch (steuerklasse){
               case 1:
                   System.out.println(steuer = preis * steuer1);
               break;
               case 2:
                   System.out.println(steuer = preis * steuer2);
                   break;
               case 3:
                   System.out.println(steuer = preis * steuer3);
                   break;
               default:
                   System.out.println("Keines");
                   break;
           }

               brutto = preis +steuer;

               System.out.println("Brutto" + brutto);



        }
    }

