//Create a program that asks the user for their name, age, height (in meters), and favorite color.
//Extension: can you convert the height in cm?

import java.util.*;

public class InputTask{
                    public static void main(String args[]){
                                        Scanner sc=new Scanner(System.in);
                                        System.out.println("Enter ur name");
                                        String name=sc.nextLine();
                                        int age;
                                        System.out.println("Enter you age");
                                        age=sc.nextInt();
                                        float heighet;
                                        System.out.println("Enter your heighet in meters");
                                        heighet=sc.nextFloat();
                                        System.out.println("Enter ur favourite colour");
                                        String colour=sc.nextLine();
                                        //1m =100cm
                                        System.out.println("Name :"+name+"\n  Age :"+age+"\n  Heighet"+heighet+" \n Favourite Colour"+colour);

                                        System.out.println("Heighet convert in cm "+ heighet*100);


                    }
}