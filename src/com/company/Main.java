package com.company;

//import java.io.IOException;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;
import java.util.Scanner;

//import static java.util.Calendar.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        String firstname;
        String Lastname;
        String ID = "";
        String message;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age;
        String year1 = "";
        Scanner sc = new Scanner(System.in);
        String year="";
        String months = "";
        String dates="";

        System.out.print("enter your firstname: ");
        firstname = sc.nextLine();
if(!firstname.matches("[a-zA-Z_]+")){
    System.out.println("invalid first name");
    while (!firstname.matches("[a-zA-Z_]+")){
        System.out.print("re enter firstname");
        firstname = sc.nextLine();

} }

        System.out.print("please enter your lastname:");
        Lastname = sc.nextLine();
        if(!Lastname.matches("[a-zA-Z_]+")){
            System.out.println("invalid lastname");
            while (!Lastname.matches("[a-zA-Z_]+")){
                System.out.print("re enter lastname");
                Lastname = sc.nextLine();

            } }

                System.out.print("please enter your ID:");
        ID = sc.nextLine();
        if(ID.contains("[a-zA-Z_]+")){

            System.out.println("id number must contain numbers only");
        }




        if (ID.length() == 13) {
            System.out.println("The ID Number Is The Correct Length");

            String dob = ID.substring(0, 6);
             year = dob.substring(0, 2);
             months = dob.substring(2, 4);
             dates = dob.substring(4, 6);

        } else {


            System.out.println("your ID number:" + ID);

        }
        int yearr = Integer.parseInt(year);



       if (yearr >= 00 && yearr <= 18){

           year1 = "200";

       }else if (yearr >= 90 && yearr <= 99){

           year1 ="19";
       }





        String tempage =year1+ yearr;
        int temp2 = Integer.parseInt(tempage);
        age = currentYear - temp2;

        String part = ID.substring(2, 5);

        int y = Integer.parseInt(part);

        String Gender = "";
        if (y > 500) {
            Gender = "Male";

        } else
            Gender = "Female";


        System.out.println();
        System.out.println(" Year of birth is :" + dates + "/" + months + "/" + temp2);
        System.out.println("you are a  " + age + "years old");
        System.out.println("You are a " + Gender);
        String Pronoun="";
        if(Gender=="Male"){

            Pronoun="He";}

            else if (Gender=="Female"){
                Pronoun="She";
            }
            System.out.println("This is the record of " +firstname+ " "+Lastname);
            System.out.println(Pronoun +" was born on "+ dates + "/" + months + "/" + temp2 );
        }


}











