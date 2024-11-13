package group.lab_04_ex_01;

import java.util.Scanner;

class Computer {
   
    private String name;
    private String type;
    private String processor;
            
    private int ram; 
    private int hardDisk;
    private String motherboard;
    private String opticalDrive;

    public Computer() {
        this.name = "Unknown";
        this.type = "Desktop";
        this.processor = "Intel";
        this.ram = 6;
        this.hardDisk = 512;
        this.motherboard = "Motherboard"; 
        this.opticalDrive = "DVD";
    }
    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Computer Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Computer Type (Desktop/Laptop): ");
        this.type = scanner.nextLine();
        System.out.print("Enter Processor: ");
        this.processor = scanner.nextLine();
        System.out.print("Enter RAM (in GB): ");
        this.ram = scanner.nextInt();
        System.out.print("Enter Hard Disk Size (in GB): ");
        this.hardDisk = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Motherboard: ");
        this.motherboard = scanner.nextLine();
        System.out.print("Enter Optical Drive Type: ");
        this.opticalDrive = scanner.nextLine();
    }
    public void displayInfo() {
        System.out.println("\n--- Computer Information ---");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.ram + " GB");
        System.out.println("Hard Disk: " + this.hardDisk + " GB");
        System.out.println("Motherboard: " + this.motherboard);
        System.out.println("Optical Drive: " + this.opticalDrive);
        System.out.println();
    }

    public void modifyInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Modify Computer Information ---");
        System.out.println("1. Name");
        System.out.println("2. Type");
        System.out.println("3. Processor");
        System.out.println("4. RAM");
        System.out.println("5. Hard Disk");
        System.out.println("6. Motherboard");
        System.out.println("7. Optical Drive");
        System.out.print("Select a field to modify (1-7): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  

        switch (choice) {
            case 1:
                System.out.print("Enter new Name: ");
                this.name = scanner.nextLine();
                break;
            case 2:
                System.out.print("Enter new Type (Desktop/Laptop): ");
                this.type = scanner.nextLine();
                break;
            case 3:
                System.out.print("Enter new Processor: ");
                this.processor = scanner.nextLine();
                break;
            case 4:
                System.out.print("Enter new RAM (in GB): ");
                this.ram = scanner.nextInt();
                break;
            case 5:
                System.out.print("Enter new Hard Disk Size (in GB): ");
                this.hardDisk = scanner.nextInt();
                break;
            case 6:
                System.out.print("Enter new Motherboard: ");
                this.motherboard = scanner.nextLine();
                break;
            case 7:
                System.out.print("Enter new Optical Drive Type (or None): ");
                this.opticalDrive = scanner.nextLine();
                break;
            default:
                System.out.println("Invalid choice! No changes made.");
        }
    }
}
public class Lab_04_ex_01 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.getInfo();
        comp.displayInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to modify any information? (yes/no): ");
        String ans = scanner.nextLine();
        if (ans.equals("yes")) {
        comp.modifyInfo();
            comp.displayInfo();
        }
    }
}
