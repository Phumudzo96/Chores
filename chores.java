import java.util.*;
import java.lang.*;

public class chores {
    public static void main(String[] args) {
        // the user to the progarm
        System.out.println("Hey there..please enter three people's names and the chores.\n"+
        "We'll assign each person with a random chore");

        // creating the list for the peoples names
        ArrayList<String> people = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        
        // entering the first person's name
        System.out.println("Enter the first person's name: ");
        people.add(scanner.next()); // adding the name to the list

        // second person
        System.out.println("Enter the second person's name: ");
        people.add(scanner.next());

        // third person
        System.out.println("Enter the third person's name: ");
        people.add(scanner.next());

        // creating the list for the chores
        ArrayList<String> duties = new ArrayList<String>();

        // entering the first chore
        System.out.println("Enter the first chore: ");
        duties.add(scanner.next()); // adding the chores to the list

        // second chore
        System.out.println("Enter the second chore: ");
        duties.add(scanner.next());

        // third chore
        System.out.println("Enter the third chore: ");
        duties.add(scanner.next());


        Collections.shuffle(people); // shuffling the list order for the people
        Collections.shuffle(duties); // shuffling the list order for the chores

        // printing out which person is going to do which chore
        System.out.println("Person 1 belongs to chore 1"+
        "\nPerson 2 belongs to chore 2 \nPerson 3 belongs to chore 3 :");
        System.out.println(people);
        System.out.println(duties);



    }
    
}
