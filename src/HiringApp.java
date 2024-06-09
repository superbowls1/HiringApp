import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

import static java.lang.System.in;
//Joey slepski lab used on intelij

public class HiringApp {
    static Queue<Person> recruit = new ArrayDeque<>();
    static Queue<Person> current = new ArrayDeque<>();
    static Queue<Person> past = new ArrayDeque<>();
    static Scanner in= new Scanner(System.in);

    public static void main(String[] args) {

        int c = 0;
        do {
            System.out.println("Press 5 to quit");
            c = getChoice();

            switch (c) {
                case 1:
                    Person applicant = getApplication();
                    recruit.offer(applicant);

                    break;

                case 2:
                    if (current.isEmpty()) {
                        System.out.println("No Employees");
                        break;
                    }

                    System.out.println("Enter the name to be fired");
                    String name = in.next();
                    for (Iterator<Person> iterator = current.iterator(); iterator.hasNext(); ) {
                        Person employee = iterator.next();
                        if (employee.getName().equals(name)) {
                            iterator.remove();
                            System.out.println(employee.getName() + "has been fired");
                            break;
                        }


                    }


                case 3:
                    if (recruit.isEmpty()) {
                        System.out.println("No applicants");
                        return;
                    }
                    Person app = recruit.poll();
                    current.offer(app);
                    System.out.println(app.getName() + " has been hired.");


            }




        } while (c != 5);

        //Define the data structures for 3 different groups of people:
        //  new applicants
        //  current employees (those who were hired),
        //  past employees (those who were fired)
        //
        //Hint: for queue: Queue<Person>,  ArrayDeque, LinkedList
        //      for stack: Deque<Person>   ArrayDeque, LinkedList

        //display the menu

        //get the menu choice

        //process user selected service request.

        //loop until the user decides to quit.

    }

    //other methods for code modularization
    //method for getting user choice
    public static int getChoice() {

        System.out.println("1 to recruit, 2 to fire, 3 to hire");

        return in.nextInt();


        //display the menu
        //get user choice
        //return user choice as an integer


    }

    //method for accepting an applicant and reurn this applicant as a Person object
    public static  Person getApplication() {

        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("Enter the applicants name");

        name = in.nextLine();

        String major;

        System.out.println("Enter the major");
        major = in.nextLine();
        int ski;

        System.out.println("Enter the amount of skills");
        ski = in.nextInt();
        in.nextLine();
        String[] skills = new String[ski];
        for (int i = 0; i < ski; i++) {
            System.out.println("Enter the skill" + (i + 1) + ":");
            skills[i] = in.nextLine();
        }

        return new Person(name, major, skills);



    }
}

        //display prompt for user to enter an applicant's name
        //get user input

        //display prompt for user to enter an applicant's degree
        //get user input

        //display prompt for user to enter an applicant's skill list
        //  (first how many skills, then enter skill one by one)
        //use a loop to get each skill

        //create a Person object using the name, degree, skill list
        //and return this Person object




    //You can either implement hire and fire functionalities in main(...),
    //   or implement them here as separate methods:
    //hire method
    //fire method

