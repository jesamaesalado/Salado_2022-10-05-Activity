public class PerfumeException extends Exception{
    public PerfumeException(String message){
        super(message);
    }
    public String outofBound(){
        return "Not in the LOOP";
    }
    public String negativeIndex(){
        return "The Index is not Negative";
    }
}