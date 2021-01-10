package sample;

import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    Scanner input;
    Lists<Politician> politicians;
    Lists<Election> elections;

    public Main(){
        input = new Scanner(System.in);
        politicians = new Lists<>();
        runMenu();
    }

    public static void main(String[] args) {
        new Main();
        Lists<Politician> politician = new Lists<>();
        System.out.println(politician.printList(""));
        launch(args);
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
                case 5:
                    listRunningElections();
                    break;
                case 6:
                    try{
                        politicians.save();
                        elections.save();
                    }
                    catch(Exception e){
                        System.err.println("Error writing to file: " + e);
                    }
                    break;
                case 7:
                    try{
                        politicians.load();
                        elections.load();
                    }
                    catch(Exception e){
                        System.err.println("Error loading from file: " + e);
                    }
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
        System.out.println("5) list Running Elections");
        System.out.println("----------");
        System.out.println("6) Save");
        System.out.println("7) Load");
        System.out.println("----------");
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
        elections.addElement(e);
    }

    public void listRunningElections(){
        System.out.println("All Current Running Elections: ");
        System.out.println(elections.listElections());
    }
}
