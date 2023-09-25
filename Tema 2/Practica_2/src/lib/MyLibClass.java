package lib;

/**
 *
 * @author ONII404
 */
public class MyLibClass {
    
    public String validNum(int num){
        
        if(num > 0){
            return "Positivo";
        }else if(num < 0){
            return "Negatioe";
        }else{
            return "cero";
        }
    }
}
