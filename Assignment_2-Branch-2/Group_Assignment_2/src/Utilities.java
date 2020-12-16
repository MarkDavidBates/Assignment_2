public class Utilities {
    static boolean nonNegativeNumber(int number){
        return (number >=0);
    }
    static String max30Chars(String string){
        return(string.length()<=30)? string:string.substring(0,30);
    }
    //static String validElectionTypes(String string){return("Presidential","European");}


}

