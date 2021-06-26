


public class NumberUtilities {

    public static String getRange(int stop) {
        
        String s = "";
    
       for (int i=0; i < stop; i++){
            s = s + String.valueOf(i);
        }
        return s;
          }

    public static String getRange(int start, int stop) {
        String s= "";
    
       for (int i=start; i < stop; i++){
            s = s + String.valueOf(i);
        }
        return s;
    }


    public static String getRange(int start, int stop, int step) {
        String s= "";
    
       for (int i=start; i < stop; i= i+step){
            s = s + String.valueOf(i);
        }
        return s;
    }

    public static String getEvenNumbers(int start, int stop) {
        String s= "";
    
       for (int i=start; i < stop; i++){
           if ((i%2) == 0){
           s = s + String.valueOf(i);
        }  
       }
        return s;
    }


    public static String getOddNumbers(int start, int stop) {
        String s= "";
    
       for (int i=start; i < stop; i++){
           if ((i%2) != 0){
            s = s + String.valueOf(i);
        }
        }
        return s;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String s= "";
    
       for (int i=start; i <= stop; i++){
           int x = i;
           for(int j=2; j<=exponent; j++){
            
               x = x * i;
               }
           s = s + String.valueOf(x);

       }
        return s;
    }
}
