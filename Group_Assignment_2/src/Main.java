import java.util.Scanner;

public class Main {

    Scanner input;
    Lists<Politician> politicians;

    public Main(){
        input = new Scanner(System.in);
        politicians = new Lists<>();
        runMenu();
    }

    public static void main(String[] args){

        new Main();
        Lists<Politician> politician = new Lists<>();
        System.out.println(politician.printList(""));
    }

    private void runMenu(){
        int answer;
        do{
            answer = mainMenu();
            switch(answer){
                case 1:
                    addPolitician();
                    break;
                case 2:
                    listPoliticians();
                    break;
                case 3:
                    deleteAllPoliticians();
                    break;
                case 4:
                    startElection();
                    break;
            }
        }
        while(answer != 0);
    }

    private int mainMenu(){
        System.out.println("1) add Politician");
        System.out.println("2) list Politicians");
        System.out.println("3)Delete all Politicians");
        System.out.println("4) Start Election");
        System.out.println("0) exit");
        return ScannerInput.readNextInt("==>>");
    }

    public void addPolitician(){
        System.out.println("Name: ");
        String name = input.next();
        System.out.println("Date of Birth; ");
        String dob = input.next();
        System.out.println("Party: ");
        String party = input.next();
        System.out.println("County: ");
        String county = input.next();

        Politician p = new Politician(name, dob, party, county);
        politicians.addElement(p);
    }

    public void listPoliticians(){
        System.out.println("All Politicians: ");
        System.out.println(politicians.listPoliticians());
    }

    public void deleteAllPoliticians(){
        politicians.deleteAll();
        System.out.println("All politicians deleted!");
    }

    public void startElection(){
        System.out.println("Election Type: ");
        String type = input.next();
        System.out.println("Election Location: ");
        String location = input.next();
        int year = ScannerInput.readNextInt("Year: ");
        int seats = ScannerInput.readNextInt("Number of seats: ");

        Election e = new Election(type, location, year, seats);
    }
}
