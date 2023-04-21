import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static PersistentLinkedList list = new PersistentLinkedList();
	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * The main menu of the program.
		 * When an error occurs while inputting a command or while
		 * performing the operations, the user will be brought back to the main menu.
		 */
		while(true) {
			try {
				System.out.println("\n\n-----Menu-----");
				System.out.println("[1] Add Node");
				System.out.println("[2] Delete Node");
				System.out.println("[3] Display");
				System.out.println("[4] Change Value");
				System.out.println("[5] Node History");
				System.out.println("[6] List History");
				System.out.println("[7] Exit");
				System.out.print("Enter Command: ");
				int command = Integer.parseInt(reader.readLine());	
				switch (command) {
				case 1:
					addNode();
					break;

				case 2:
					deleteNode();
					break;

				case 3:
					display();
					break;

				case 4:
					changeValue();
					break;

				case 5:
					nodeHistory();
					break;

				case 6:
					listHistory();
					break;

				case 7:
					System.out.print("\n--Exit--" + "\nProgram will be terminated");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(1000);
						System.out.print(".");
					}
					System.out.print("\nProgram terminated.");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid command. Please try again.");
					break;
				}
			} catch (Exception e) {
				System.out.println("Only allowed inputs are integers. Please try again.");
			}
		}

	}

	/*
	 * Only allows integers as inputs.
	 * Adds a new node at the end of the list.
	 * A history version is made by copying the linked list after insertion.
	 */
	public static void addNode() throws NumberFormatException, IOException {
		try {
			System.out.print("Enter new node's value: ");
			int value = Integer.parseInt(reader.readLine());
			list.add(value);
			list.getHistory().add(list.copyList());
			System.out.println("Node was successfully added!");
		} catch (NumberFormatException e) {
			System.out.println("Only allowed inputs are integers. Please try again.");
		}
	}

	/*
	 * Only allows integers as inputs.
	 * Deletes a node based on the position input.
	 * A copy of the list is saved after deletion.
	 * The deleted node is also saved(to be used for list history).
	 */
	public static void deleteNode() throws NumberFormatException, IOException {
		try {
			if(list.getHead() == null) {
				System.out.println("Operation cannot be performed as the list is empty.");
			}else {
				System.out.print("Enter node position: ");
				int position = Integer.parseInt(reader.readLine());
				if(position > list.getSize() || position < list.getSize()){
					System.out.println("Invalid position");
				}else {
					list.delete(position);
					list.getHistory().add(list.copyList());
					System.out.println("Node was successfully deleted!");
				}
			}

		} catch (NumberFormatException e) {
			System.out.println("Only allowed inputs are integers. Please try again.");
		}
	}
	//Displays the data of the currently existing nodes of the list,
	//Shows a prompt if the list is currently empty.
	public static void display() {
		if(list.getHead() == null){
			System.out.println("The list is empty");
		}else {
			System.out.println("Displaying values of the existing nodes...");
			System.out.println(list.display());
		}
	}

	/*
	 * Only allows integers as inputs
	 * Changes the value of a number depending on the position input and new value input.
	 * Saves a version of the list after chaning a value of a node in the list.
	 */
	public static void changeValue() throws NumberFormatException, IOException {
		try {
			if(list.getHead() == null) {
				System.out.println("Operation cannot be performed as the list is emtpy.");
			}else {
				System.out.print("Enter node position: ");
				int position = Integer.parseInt(reader.readLine());
				if(position > list.getSize() || position < list.getSize()){
					System.out.println("Invalid position");
				}else {	
					System.out.println("Current value of node "+position+ " is "+list.get(position)+"\n");
					System.out.print("Enter new value for node "+position+" : ");
					int value = Integer.parseInt(reader.readLine());
					list.changeValue(position, value);
					list.getHistory().add(list.copyList());
					System.out.println("Node value hase been modified successfully!");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Only allowed inputs are integers. Please try again.");
		}

	}

	//Displays the history of a node.
	//Shows its current value and its past values
	public static void nodeHistory() throws NumberFormatException, IOException {
		try {
			if(list.getHead() == null) {
				System.out.println("Operation cannot be performed as the list is emtpy.");
			}else {
				System.out.print("Enter node position: ");
				int position = Integer.parseInt(reader.readLine());
				System.out.println(list.displayNodeHistory(position));
			}
		} catch (NumberFormatException e) {
			System.out.println("Only allowed inputs are integers. Please try again.");
		}
	}

	/*
	 * Shows the history of the list.
	 * Does 3 things:
	 * -Displays the current values of the existing node.
	 * -Displays the deleted nodes recent values together with its past position.
	 * -Displays all the versions of the list.
	 */
	public static void listHistory() {
		System.out.println("Showing List History ...");
		System.out.println(list.displayListHistory());
	}

}
