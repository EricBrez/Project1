import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    public static Scanner scanner = new Scanner(System.in);
    public static String menuChoice;

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        do {
        	displayMenu();
        	switch(menuChoice) { // switch actions menuChoice
            	case "1":
            		intakeNewDog(scanner);
            		break;
            	case "2":
            		intakeNewMonkey(scanner);
            		break;
            	case "3":
            		reserveAnimal(scanner);
            		break;
            	case "4":
            		printAnimals();
            		break;
            	case "5":
            		printAnimals();
            		break;
            	case "6":
            		printAnimals();
            		break;
            	case "q":
            		break;
            	default:
            		System.out.println("That is an invalid choice, please choose again: ");
            	
        	}
        } while (menuChoice != "q");

    }

    // This method prints the menu options
    public static String displayMenu() {
    	
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
        menuChoice = scanner.next();
        return menuChoice;
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Kumquat", "Capuchin", "female", "2", "9.7", "07-04-1776", "England", "intake", false, "United States");
    	Monkey monkey2 = new Monkey("Grapeseed", "Tamarin", "male", "1", "0.9", "12-15-1997", "United States", "intake", true, "United States");
    	Monkey monkey3 = new Monkey("Lettuce", "Guenon", "female", "3", "9.6", "03-13-1984", "United States", "intake", true, "United States");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for (Monkey monkey: monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) { // validates new monkey
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return; //returns to menu
            	}
            	
            }
            System.out.println("\n\nWhat species is the monkey?\n\n");
            String species = scanner.nextLine();
            System.out.println("\n\nWhat gender is the monkey?\n\n");
            String gender = scanner.nextLine();
            System.out.println("\n\nHow old is the monkey?\n\n");
            String age = scanner.nextLine();
            System.out.println("\n\nHow much does the monkey weigh?\n\n");
            String weight = scanner.nextLine();
            System.out.println("\n\nWhat is the acquisition date?\n\n");
            String date = scanner.nextLine();
            System.out.println("\n\nWhat is the acquisition country?\n\n");
            String country = scanner.nextLine();
            System.out.println("\n\nWhat is the training status?\n\n");
            String status = scanner.nextLine();
            System.out.println("\n\nIs the monkey reserved?\n\n");
            boolean reserved = scanner.nextBoolean();
            System.out.println("\n\nWhat country will the monkey be serving in?\n\n");
            String serveCountry = scanner.nextLine();
            		
            monkeyList.add(new Monkey(name, species, gender, age, weight, date, country,
            		status, reserved, serveCountry));

        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            System.out.println("The method printAnimals needs to be implemented");

        }
}

