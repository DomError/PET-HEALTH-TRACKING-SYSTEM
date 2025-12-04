import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HealthProfile {
    private String petName;
    private double currentWeight;
    private List<String> vaccinations;
    
    public HealthProfile(String petName, double initialWeight) {
        this.petName = petName;
        this.currentWeight = initialWeight;
        this.vaccinations = new ArrayList<>();
    }
    
    public String getPetName() {
        return petName;
    }
    
    public double getCurrentWeight() {
        return currentWeight;
    }
    
    public List<String> getVaccinations() {
        return new ArrayList<>(vaccinations);
    }
    
    public void setCurrentWeight(double weight) {
        if (weight > 0) {
            this.currentWeight = weight;
        }
    }
    
    public void addVaccination(String vaccine) {
        if (vaccine != null && !vaccine.trim().isEmpty()) {
            vaccinations.add(vaccine);
        }
    }
    
    public void checkRisk() {
        System.out.println("\nChecking health risks for " + petName + "...");
        
        if (currentWeight < 5) {
            System.out.println("Warning: Underweight! (" + currentWeight + " kg)");
        } else if (currentWeight > 20) {
            System.out.println("Warning: Overweight! (" + currentWeight + " kg)");
        } else {
            System.out.println("Weight is within healthy range: " + currentWeight + " kg");
        }
        
        if (vaccinations.isEmpty()) {
            System.out.println("Warning: No vaccinations recorded!");
        } else if (vaccinations.size() < 3) {
            System.out.println("Warning: Incomplete vaccinations. Current: " + vaccinations.size());
        }
    }
    
    public void generateReport() {
        System.out.println("\n==================================");
        System.out.println("   Health Report for " + petName);
        System.out.println("==================================");
        System.out.println("Name: " + petName);
        System.out.println("Weight: " + currentWeight + " kg");
        System.out.println("Vaccinations: " + getVaccinationList());
        System.out.println("==================================");
        
        System.out.println("\nRisk Summary:");
        System.out.println("-------------");
        checkRisk();
        System.out.println("==================================\n");
    }
    
    private String getVaccinationList() {
        if (vaccinations.isEmpty()) {
            return "None";
        }
        return vaccinations.toString();
    }
}

public class PetHealthTracker {
    private static Scanner scanner = new Scanner(System.in);
    private static HealthProfile currentPet = null;
    
    public static void main(String[] args) {
        displayWelcome();
        
        while (true) {
            showMenu();
            int choice = getChoice();
            
            switch (choice) {
                case 1:
                    createProfile();
                    break;
                case 2:
                    updateWeight();
                    break;
                case 3:
                    addVaccine();
                    break;
                case 4:
                    checkRisks();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    exit();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        }
    }
    
    private static void displayWelcome() {
        System.out.println("==================================");
        System.out.println("   PET HEALTH TRACKING SYSTEM");
        System.out.println("==================================");
        System.out.println("IT 2112 - OOP Project");
        System.out.println("==================================\n");
    }
    
    private static void showMenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Create Pet Profile");
        System.out.println("2. Update Weight");
        System.out.println("3. Add Vaccination");
        System.out.println("4. Check Health Risks");
        System.out.println("5. Generate Health Report");
        System.out.println("6. Exit");
        System.out.print("\nEnter your choice (1-6): ");
    }
    
    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private static void createProfile() {
        System.out.println("\n===== CREATE PET PROFILE =====");
        
        if (currentPet != null) {
            System.out.print("A pet profile already exists. Overwrite? (y/n): ");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("y")) {
                return;
            }
        }
        
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        
        if (name.trim().isEmpty()) {
            System.out.println("Pet name cannot be empty!");
            return;
        }
        
        double weight = getDouble("Enter initial weight (kg): ");
        if (weight <= 0) {
            System.out.println("Weight must be positive!");
            return;
        }
        
        currentPet = new HealthProfile(name, weight);
        System.out.println("\nPet profile created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Initial Weight: " + weight + " kg");
    }
    
    private static void updateWeight() {
        if (checkPet()) {
            double oldWeight = currentPet.getCurrentWeight();
            double newWeight = getDouble("Enter new weight for " + 
                currentPet.getPetName() + " (kg): ");
            
            if (newWeight <= 0) {
                System.out.println("Weight must be positive!");
                return;
            }
            
            currentPet.setCurrentWeight(newWeight);
            System.out.printf("\nWeight updated from %.1f kg to %.1f kg\n", 
                oldWeight, newWeight);
        }
    }
    
    private static void addVaccine() {
        if (checkPet()) {
            System.out.println("\n===== ADD VACCINATION =====");
            System.out.print("Enter vaccination name to add: ");
            String vaccine = scanner.nextLine();
            
            if (vaccine.trim().isEmpty()) {
                System.out.println("Vaccination name cannot be empty!");
                return;
            }
            
            currentPet.addVaccination(vaccine);
            System.out.println("\nAdded vaccination: " + vaccine);
            
            System.out.println("Current vaccinations: " + 
                currentPet.getVaccinations());
        }
    }
    
    private static void checkRisks() {
        if (checkPet()) {
            currentPet.checkRisk();
        }
    }
    
    private static void makeReport() {
        if (checkPet()) {
            currentPet.generateReport();
        }
    }
    
    private static void exit() {
        System.out.println("\n==================================");
        System.out.println("Thank you for using Pet Health Tracker!");
        System.out.println("Goodbye!");
        System.out.println("==================================");
        
        scanner.close();
    }
    
    private static boolean checkPet() {
        if (currentPet == null) {
            System.out.println("\nNo pet profile exists! Please create one first.");
            return false;
        }
        return true;
    }
    
    private static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
}
