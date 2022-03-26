package questions;

public class AnsweCell {
    public static void main(String[] args) {

            System.out.println(answerCell(true,true,false));
        }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if( ((isMorning == false)||(isMorning == true)) && ((isMom == false)||( isMom == true)) && isAsleep == true) {
            return false;

        }
        else if (isMorning == true && isMom == false && isAsleep == false){
            return false;
        }
        else if(isMorning == false && isMom == true && isAsleep == false){
            return true;

        }
        else if (isMorning == false && isMom == false && isAsleep == false){
            return true;
        }
        else {
            return true;
        }
    }


}
