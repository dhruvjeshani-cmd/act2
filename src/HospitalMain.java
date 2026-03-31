import java.util.*;
import java.io.*;

public class HospitalMain {
    private static List<Patient> patientList = new ArrayList<>();
    private static final String FILE_NAME = "hospital_records.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadData(); 

        boolean running = true;
        while (running) {
            System.out.println("\n===== HOSPITAL SYSTEM MENU =====");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Delete All Data (Clear File & Memory)"); 
            System.out.println("4. Save and Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addNewPatient(scanner);
                    break;
                case "2":
                    viewPatients();
                    break;
                case "3":
                    clearAllData();
                    break;
                case "4":
                    saveData();
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }

  
    private static void clearAllData() {
        patientList.clear(); 
        File file = new File(FILE_NAME);
        if (file.exists()) {
            if (file.delete()) { 
                System.out.println("Storage and Memory cleared successfully.");
            }
        } else {
            System.out.println("Memory cleared. No file was found to delete.");
        }
    }

    private static void addNewPatient(Scanner scanner) {
        try {
            System.out.print("Enter Patient Name: ");
            String pName = scanner.nextLine();
            patientList.add(new Patient(pName));
            System.out.println("Patient added to memory.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewPatients() {
        System.out.println("\n--- Current Patients in Memory ---");
        if (patientList.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Patient p : patientList) {
                System.out.println("- " + p.name);
            }
        }
    }

    private static void saveData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Patient p : patientList) {
                writer.println(p.name);
            }
        } catch (IOException e) {
            System.out.println("Save Error: " + e.getMessage());
        }
    }

    private static void loadData() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                patientList.add(new Patient(line));
            }
        } catch (IOException e) {
            System.out.println("Load Error: " + e.getMessage());
        }
    }
}