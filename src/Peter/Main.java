package Peter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    // Scanncer sc - the sc is the name of my Scanner.

        // A1 & A2
/*      int i;  // defines my Integer i (which means its a variable placeholder for input)
        System.out.println("Input number: ");
        i = sc.nextInt(); // for another number, add another int variable and sc.nextInt does safe the input for it.
        if(i == 0){
            System.out.println(i+" is Zero");
        } else if(i < 0){
            System.out.printf(i+" is negative and small");
        } else if(i > 1000000){
            System.out.printf(i+" is positive and large");
        } else {
            System.out.println(i+" is positive");
        }
*/

        // A3 a)
/*      int weekday;
        weekday = sc.nextInt();
*/
/*      if(weekday == 1){
            System.out.println("today is monday.");
        } else if(weekday == 3){
            System.out.println("today is wednesday.");
        } else if(weekday == 8){
            System.out.println("the week has only 7 days!");
        } else{
            System.out.println("this number isn't defined.");
        }
*/

        // A3 b)
/*      switch (weekday){
            case 1:
                System.out.println("today is monday.");
                break;
            case 2:
                System.out.println("today is tuesday.");
                break;
            case 3:
                System.out.println("today is wednesday.");
                break;
            case 4:
                System.out.println("today is thursday.");
                break;
            case 5:
                System.out.println("today is friday.");
                break;
            case 6:
                System.out.println("today is saturday.");
                break;
            case 7:
                System.out.println("today is sunday.");
                break;
            default:
                System.out.println("this number isn't defined.");
        }
*/

        // D4 A1
/*      for (int x = 0; x <= 100; x++){
            System.out.println(x);
        }
        System.out.println("here comes D4 A2:");
        // D4 A2
        for (int x = 0; x <= 100; x = x + 2){
          System.out.println(x);
        }
*/

        // D3 A4
/*      int z, y;
        System.out.println("type your first number: ");
        z = sc.nextInt();
        System.out.println("type your second number: ");
        y = sc.nextInt();

        if(z == y){
            System.out.println(z+" and "+y+" both are equal.");
        } else if(z < y){
            System.out.println(y+" is the larger number");
        } else{
            System.out.println(z+" is the larger number");
        }
*/


        // D3 A5
/*      int i;
        System.out.println("input your number: ");
        i = sc.nextInt();

        if(i % 2 == 0){ // wenn die variable i keinen rest hat, dann ist es eine gerade nummer.
            System.out.println("this is an even number.");
        } else {
            System.out.println("this is not an even number.");
        }
*/
        // D3 A6
/*      int i;
        System.out.println("input your number: ");
        i = sc.nextInt();

        if(i % 3 == i % 5){
            System.out.println("FizzBuzz");
        } else if(i % 3 == 0){
            System.out.println("Fizz");
        } else{
            System.out.println("Buzz");
        }
*/
        // D3 A6 | NOT WORKING ATM
/*      int z, y, x;
        System.out.println("type your first number: ");
        z = sc.nextInt();
        System.out.println("type your second number: ");
        y = sc.nextInt();
        System.out.println("type your third number: ");
        x = sc.nextInt();

        if(z == y){
            if(z == x){
                System.out.println(z+" and "+x+" both are equal.");
            } else if(y == x){
                System.out.println(y+" and "+x+" both are equal.");
            } else{
                System.out.println(z+" and "+y+" both are equal.");
            }
        } else if(z < y){
            if(z < x){
                System.out.println(x+" is the larger number");
            } else if(y < x){
                System.out.println(x+" is the larger number");
            } else{
                System.out.println(y+" is the larger number");
            }
        } else{
            System.out.println(z+" is the larger number");
        }
 */

        // D4 A3
/*      int z, y;
        System.out.println("1st number: ");
        z = sc.nextInt();
        System.out.println("2nd number: ");
        y = sc.nextInt();

        for (int a = z; a <= y; a++){ // for a for-loop: re-define your int so input z is getting renamed to a.
            if (a % 2 != 0){ // shows a++ only if a++ is NOT divide-able without rests. if changed to (a % 2 == 0) itll only display even numbers.
                System.out.println(a++); // prints a++ because we want ALL numbers between z and y.
            }
        }
*/
        // D4 A4
/*        int n, a = 0;
        System.out.println("your number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            a = a + i;  // variable a is overwritten every loop. a is in l1 = 1, l2 = 3, l3 = 6 and so on.
        }
        System.out.println(a);
 */

        // D4 A6
/*        int[] arrayOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int x = 0; x < 10; x++){
            System.out.println(arrayOfInts[x]);
        }
 */
        //D4 A7 | NOT WORKING ATM
/*        int[] arrayOfKeys = new int[10]
 */


    }
}
