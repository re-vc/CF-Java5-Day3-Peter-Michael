package Michael;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int s = in.nextInt();
*/

        //Day 3 A1

/*
        if (s >= 0) {
            System.out.println(s + " is positive");
        }
        else {
            System.out.println((s + " is negative"));
        }
        */

        // Day 3 A2

        /*
        if(s > 1000000) {
            System.out.println((s + " large negative"));
        }
        else if (s > 0) {
            System.out.println(s + " positive");
        }
        else if(s < 0){
            System.out.println((s + " small negative"));
        }
        else
            System.out.println((s + " zero"));
*/

        //Day 3 A3a

        /*
        if(s == 1) {
            System.out.println(("Monday"));
        }
        else if (s == 2) {
            System.out.println("Tuesday");
        }
        else if(s == 3){
            System.out.println("Wednesday");
        }
        else if(s == 4){
            System.out.println("Thursday");
        }
        else if(s == 5){
            System.out.println(("Friday"));
        }
        else if(s == 6){
            System.out.println("Saturday");
        }
        else if(s == 7){
            System.out.println("Sunday");
        }
        else
            System.out.println("Week only has 7 days");
*/

        //Day3 A3b

        /*
        switch (s){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3 :
                System.out.print( "Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Week only has 7 days");
        }

         */

        //Day 4 A1
       /*

        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        */

        //Day 4 A2

        /*
        for (int i =2; i <= 100; i = i + 2){
            System.out.println(i);
        }
         */

        //Day 3 A4

        /*
        System.out.println("Enter number: ");
        int b = in.nextInt();

        if (s < b){
            System.out.println(s + " is smaller than " + b);
        }
        else if(s > b){
            System.out.println(s + " is bigger than " + b);
        }
        else {
            System.out.println(s + " is equal to " + b);
        }
*/
        //Day 3 A5

/*
        if (s % 2 == 0) {
            System.out.println(s + " is an even number");
        }
        else {
            System.out.println((s + " is an odd number"));
        }
*/

        //Day 3 A6

        /*
        if (s % 3 == 0 && s % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (s % 3 == 0){
            System.out.println("Fizz");
        }
        else if (s % 5 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(s);
        }
*/
        //Day 4 A3

/*
        System.out.println("Enter last number: ");
        int b = in.nextInt();

        for (int i = s; i <= b; i++){
            if (i % 2 != 0) {
                System.out.println(i++);
            }
        }
*/

        //Day 4 A4
/*
        Scanner in = new Scanner(System.in);
        System.out.println("Enter last number: ");
        float c = in.nextFloat();

        float b=(c+1)*(c/2);
        System.out.println(b);


        int a = 0;

        for (int i = 1; i <= c; i++) {
            a = a + i;
        }
        System.out.println(a);
*/

        //Day 3 A7

        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = in.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = in.nextInt();

        System.out.println("Enter 3rd number: ");
        int c = in.nextInt();


        if (a > b && a > c){
            System.out.println(a + " is the biggest");
        }
        else if (b > a && b > c){
            System.out.println(b + " is the biggest");
        }
        else{
            System.out.println(c + " is the biggest");
        }


        if (a < b && a > c || a > b && a < c){
            System.out.println(a + " is the 2nd one");
        }
        else if (b < a && b > c || b > a && b < c){
            System.out.println(b + " is the 2nd one");
        }
        else{
            System.out.println(c + " is the 2nd one");
        }


        if (a < b && a < c){
            System.out.println(a + " is the smallest");
        }
        else if (b < a && b < c){
            System.out.println(b + " is the smallest");
        }
        else{
            System.out.println(c + " is the smallest");
        }
*/

        //Day 4 A5

/*
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = in.nextInt();

        int[] b = {
                3,
                6,
                9,
                12,
                15,
                18,
                21,
                24,
                27,
                30,
                30
        };

        int c = 0;
        for (int i = 0; i < b.length; i++){
            if (b[i] == a){
                c = c + 1;
            }
        }

        if (c>0) {
            System.out.println(c + " item(s) found");
        } else{
            System.out.println("Not found");
        }
*/

        //Day 4 A6
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            arr[i] = input.nextInt();
        }
        for(int i : arr){
            System.out.println(i);
        }

/*
        for (int i= arr[0]; i < arr.length; i++){
                System.out.println(arr[i]);
        }
*/



    }
}
