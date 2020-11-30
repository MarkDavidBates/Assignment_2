import java.util.Scanner;

public class Main {

    Scanner input;
    Lists politicians;

    public Main(){
        input = new Scanner(System.in);
        runMenu();
    }

    public static void main(String[] args){

        new Main();
        Lists<Politician> politician = new Lists<>();
        politician.addElement(new Politician("mark", "03/02/01", "labour", "tipperary"));
        politician.addElement(new Politician("connor", "05/06/00", "independent", "tipperary"));

        System.out.println("Listed Politicians:");
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
            }
        }
        while(answer != 0);
    }

    private int mainMenu(){
        System.out.println("1) add Politician");
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

        Lists.addElement = new Politician(name, dob, party, county); //to be fixed
    }
}
