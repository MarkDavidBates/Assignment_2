public class Election {

    private String electionType;
    private String location;
    private int year;
    private int seats;
    Lists politicians;

    public Election(String electionType, String location, int year, int seats){
        this.electionType = electionType;
        this.location = location;
        this.year = year;
        this.seats = seats;
        politicians = new Lists();
    }

    //getters + setters//

    public String getElectionType() {
        return electionType;
    }

    public void setElectionType(String electionType) {
        this.electionType = electionType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String toString(){
        return "Election Type: " + electionType + "Location: " + location + "Year: " + year + "Number of seats: " + seats;
    }
}
