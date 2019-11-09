import java.util.*;

public class addition {
    public static AbstractList myList = new ArrayList<>();

    static void addi() {
        int x, y, z;
        int sum;
        System.out.println("Write the first number: ");
        Scanner in1 = new Scanner(System.in);
        System.out.println("Write the second number: ");
        Scanner in2 = new Scanner(System.in);
        x = in1.nextInt();
        y = in2.nextInt();
        sum = x + y;
        System.out.println("The sum of the two numbers is: " + sum);
        while (true) {
            System.out.println("Do you want to add " + sum + " to the list?");
            System.out.println("1= add to list.     0= don´t add.");
            Scanner in3 = new Scanner(System.in);
            z = in3.nextInt();


            if (z == 0) {
                break;
            }
            if (z == 1) {
                myList.add(sum);
                System.out.println(sum + " was added to your list");
                System.out.println("now your list looks like this: " + myList);
                break;
            }
        }
    }

    static void subtrakt() {
        int x, y, z;
        int sum;
        System.out.println("Write the first number: ");
        Scanner in1 = new Scanner(System.in);
        System.out.println("Write the second number: ");
        Scanner in2 = new Scanner(System.in);
        x = in1.nextInt();
        y = in2.nextInt();
        sum = x - y;
        System.out.println(x + " - " + y + " = " + sum);
        while (true) {
            System.out.println("Do you want to add " + sum + " to the list?");
            System.out.println("1= add to list.     0= don´t add.");
            Scanner in3 = new Scanner(System.in);
            z = in3.nextInt();


            if (z == 0) {
                break;
            }
            if (z == 1) {
                myList.add(sum);
                System.out.println(sum + " was added to your list");
                System.out.println("now your list looks like this: " + myList);
                break;
            }


        }

    }


    public static void Do_list() {
        //List<Object> myList = new ArrayList<>();
        int a, b, c;
        System.out.println("What do you want to add to your list?");
        Scanner valget = new Scanner(System.in);
        a = valget.nextInt();
        System.out.println("Ok, " + a + " was added to your list.");
        myList.add(a);
        System.out.println(myList);
        while (true) {
            System.out.println("Finish? Press 1. Add more? Press 2");
            Scanner valg = new Scanner(System.in);
            b = valg.nextInt();
            if (b == 1) {
                break;
            }
            if (b == 2) {
                System.out.println("What do you want to add to your list?");
                Scanner valgs = new Scanner(System.in);
                c = valgs.nextInt();
                System.out.println("Ok, " + c + " was added to your list.");
                myList.add(c);
                System.out.println(myList);
            }
        }
    }

    public static void main(String args[]) {

        int valg;
        while (true) {
            System.out.println("______________________");
            System.out.println("What do you want to do?");
            System.out.println("1. addition");
            System.out.println("2. subtraksjon");
            System.out.println("3. Add numbers to the list");
            System.out.println("4. Show list");

            Scanner valget = new Scanner(System.in);
            valg = valget.nextInt();
            if (valg == 1) {
                addi();
            }
            if (valg == 2) {
                subtrakt();
            }
            if (valg == 3) {
                Do_list();
            }
            if (valg == 4) {
                System.out.println(myList);
            }

        }

    }
}


