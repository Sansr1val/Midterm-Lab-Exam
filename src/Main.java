import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static PersistentLinkedList list = new PersistentLinkedList();
	public static void main(String[] args) throws NumberFormatException, IOException {

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
			break;

		case 2:
			break;

		case 3:
			break;

		case 4:
			break;

		case 5:
			break;

		case 6:
			break;

		case 7:
			break;

		default:
			System.out.println("Invalid command. Please try again.");
			break;
		}

	}
	
	public void addNode() throws NumberFormatException, IOException {
		System.out.print("Enter new node's value: ");
		int value = Integer.parseInt(reader.readLine());
		list.add(value);
		System.out.println("Node was successfully added!");
	}

}
