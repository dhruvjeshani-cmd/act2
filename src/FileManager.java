import java.util.*;
import java.io.*;

public class FileManager {
    static String file = "data.txt";

    // Save ArrayList to File
    public static void save(List<Patient> list) {
        try (PrintWriter out = new PrintWriter(new FileWriter(file))) {
            for (Patient p : list) out.println(p.name);
        } catch (Exception e) { System.out.println("Save error"); }
    }

    // Load File to ArrayList
    public static void load(List<Patient> list) {
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = in.readLine()) != null) list.add(new Patient(line));
        } catch (Exception e) { /* File might not exist yet */ }
    }
}