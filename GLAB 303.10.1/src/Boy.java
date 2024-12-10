public class Boy extends Person {
    static double ageFactor = 1.1;
    public String talk(){
        return(super.talk() + " ... but I love java class.");
    }
    public String walk(){
        return("I am now walking");
    }
}
