import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static PersistentLinkedList list = new PersistentLinkedList();
	public static void main(String[] args) throws NumberFormatException, IOException {

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
	public static void display() {
		if(list.getHead() == null){
			System.out.println("The list is empty");
		}else {
			System.out.println("Displaying values of the existing nodes...");
			System.out.println(list.display());
		}
	}

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

	public static void listHistory() {
		System.out.println("Showing List History ...");
		System.out.println(list.displayListHistory());
	}

}
