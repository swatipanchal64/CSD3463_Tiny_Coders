import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Manager
        System.out.println("Enter Manager's Information:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Birth Year: ");
        int managerBirthYear = scanner.nextInt();
        System.out.print("Monthly Salary: ");
        double managerMonthlySalary = scanner.nextDouble();
        System.out.print("Occupation Rate: ");
        int managerRate = scanner.nextInt();
        System.out.print("Number of Travel Days: ");
        float managerTravelDays = scanner.nextFloat();
        System.out.print("Number of Clients: ");
        int managerClients = scanner.nextInt();

        Manager manager = new Manager(managerName, managerBirthYear, managerMonthlySalary, managerRate, managerTravelDays, managerClients);

        // Input for Tester
        System.out.println("\nEnter Tester's Information:");
        System.out.print("Name: ");
        String testerName = scanner.next();
        System.out.print("Birth Year: ");
        int testerBirthYear = scanner.nextInt();
        System.out.print("Monthly Salary: ");
        double testerMonthlySalary = scanner.nextDouble();
        System.out.print("Occupation Rate: ");
        int testerRate = scanner.nextInt();
        System.out.print("Number of Bugs: ");
        int testerBugs = scanner.nextInt();

        Tester tester = new Tester(testerName, testerBirthYear, testerMonthlySalary, testerRate, testerBugs);

        // Input for Programmer
        System.out.println("\nEnter Programmer's Information:");
        System.out.print("Name: ");
        String programmerName = scanner.next();
        System.out.print("Birth Year: ");
        int programmerBirthYear = scanner.nextInt();
        System.out.print("Monthly Salary: ");
        double programmerMonthlySalary = scanner.nextDouble();
        System.out.print("Occupation Rate: ");
        int programmerRate = scanner.nextInt();
        System.out.print("Number of Projects: ");
        int programmerProjects = scanner.nextInt();

        Programmer programmer = new Programmer(programmerName, programmerBirthYear, programmerMonthlySalary, programmerRate, programmerProjects);

        // Display Results
        System.out.println("\nResults:");

        displayEmployeeInfo(manager);
        displayEmployeeInfo(tester);
        displayEmployeeInfo(programmer);

        scanner.close();
    }

    private static void displayEmployeeInfo(Employee employee) {
        System.out.println("Employee: " + employee.getName());
        System.out.println("Annual Income: $" + employee.annualIncome());
        System.out.println("-----------------------");
    }
}

