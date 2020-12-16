public class Politician {

    private String name;
    private String dob; //date of birth
    private String party; //if affiliated with a political party
    private String county; //home county
    //photo or image of politician is needed too

    public Politician(String name, String dob, String party, String county){
        this. name = name;
        this.dob = dob;
        this.party = party;
        this.county = county;
    }

    //getters + setters//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Date of Birth: " + dob + ", Party: " + party + ", County: " + county;
    }
}
