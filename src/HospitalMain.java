import java.util.Scanner;

public class HospitalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // try-catch-finally = handling structure
        try {
            // 1. Dynamic Input & Validation for Patient
            System.out.print("Enter Patient Name: ");
            String pName = scanner.nextLine();
            if (pName == null || pName.trim().isEmpty()) {
                
                throw new IllegalArgumentException("Patient name cannot be empty.");
            }
            Patient patient = new Patient(pName);

           
            System.out.print("Enter Doctor Name: ");
            String dName = scanner.nextLine();
            if (dName == null || dName.trim().isEmpty()) {
                throw new IllegalArgumentException("Doctor name cannot be empty.");
            }
            Doctor doctor = new Doctor(dName);

            
            Billing bill = new Billing();
            
            System.out.print("Enter Consultation Fee: ");
            
            int cFee = Integer.parseInt(scanner.nextLine()); 
            
            System.out.print("Enter Medicine Fee: ");
            int mFee = Integer.parseInt(scanner.nextLine()); 

            if (cFee < 0 || mFee < 0) {
                
                throw new IllegalArgumentException("Fees cannot be negative.");
            }
            
            
            
            System.out.println("\n--- Hospital Record ---");
            patient.schedule();
            doctor.work();
            bill.showBill();

        } catch (IllegalArgumentException e) {
            
            System.out.println("Validation Error: " + e.getMessage());
            
       
            
        } catch (Exception e) {
        
            System.out.println("An unexpected error occurred: " + e.getMessage());
            
        } finally {
            
            System.out.println("Execution completed. Closing Scanner.");
            scanner.close(); 
        }
    }
}