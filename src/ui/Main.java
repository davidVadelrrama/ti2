package ui;
import java.util.scanner;
import model.PetCenter;

/**
*descripction:  name of the class to solve the problem using a Menu wich permits the user do multiple things with owners, vets and pets
*/

public class Main{
	private scanner sc;
	private PetCenter petcenter;

	public Main (){
		sc = new scanner (System.in);
		petcenter = new PetCenter();

	}

	/**
    *@param args array of strings as part of the main method of the program to redirect to a main Menu
    */

	public static void main (String[] args){
		Main op = new Main();

		op.showMenu();


	}

	/**
    *description: first method that corresponds to the introductory menu 
	*@param option number to run the switch
    *descripción: method for the execution of the problems
    */

	public void Menu(){
		int option = 0;

		do{
			System.out.println("Menu:\n"+
				"(1) Add Vet\n"+
				"(2) Remove Vet\n"+
				"(3) Register Pet\n"+
				"(4) Remove Pet\n"+
				"(5) Start Consultation\n"+
				"(6) End Consultation\n"+
				"(7) Number of pets cared for\n"+
				"(8) Closing daily\n"+
				"(0) Close Program");

				option = sc.nextInt();
				sc.nextLine();
		    }while (option !=0);

			switch (option){
				case 1:													//option to add a veterinarian
				System.out.print("enter vet´s ID");
				String id = nextLine();
				System.out.print("enter vet´s name");
				String nameVet = nextLine();
				System.out.print("enter vet´s last name");
				String lastName = nextLine();
				System.out.print("enter vet´s registration number");
				String vetRegister = nextLine();
				PetCenter.addvet(id,nameVet,fullName,vetRegister);
				break;

				case 2:
				PetCenter.showremoveveterinary();                 			//option to remove a veterinary

				case 3:													// option to add a new pet 
				System.out.print("enter pet´s specie");
				String specie = nextLine();
				System.out.print("enter pet´s name");
				String name = nexLtine();
				System.out.print("enter pet´s age");
				String age = nextLine();
				System.out.print("enter pet´s raze");
				String race = nextLine();
				System.out.print("enter pet´s symptoms");
				String symptoms = nextLine();
				System.out.print("enter pet´s owner name");
				String owner = nextLine();
				System.out.print("enter priority level");
				Priority priority = nextLine();
				petcenter.addpet(specie,name,age,race,symptoms,owner,priority);
				break;

				case 4:
				System.out.print("ingresa name");
				String nameo =sc.nextLine();
				System.out.print("ingresa name owner");
				String nameowner = sc.nextLine();									
				petcenter.showremovepet(nameo, nameowner);							//option to remove a pet
				break;

				case 5:
				petcenter.showstartConsultation();							//option to start a consult for any registered pet
				break;

				case 6:
				petcenter.showendConsultation();							//option to end any consult in progress
				break;

				case 7:
				petcenter.showamountofPets();								//option to show the amount of pets that already were attended
				break;

				case 8:
				petcenter.showdailyClosing();								//option to close the business for the day
				break;

				case 0:
				System.out.println("Bye :)");							//option to close the program

				default:
				System.out.println("Valor incorrecto");					//This is a message for any incorrect input information


			}

		


	}



}

