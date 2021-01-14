import java.util.Arrays;
import java.util.List;

public class Utilities {

    //any input over 30 characters will be cut off at 30 characters
    static String max30Chars(String string){
        return (string.length() <= 30) ? string : string.substring(0,30);
    }

    //any input that is negative will return zero
    static boolean nonNegativeNumber(int number){
        return (number >= 0);
    }

    //to be fixed
    //dob inputs must contain a "/"
    static boolean validDate(String date){
        return (date.contains("/"));
    }

    //must be a valid party from the list below, or candidate is considered independent
    static String validParty(String party){
        party = party.toLowerCase();
        List<String> parties = Arrays.asList("labour", "fina fail", "fina gael");
        return (parties.contains(party)) ? party : "independent";
    }
}
