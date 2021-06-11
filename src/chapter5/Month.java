package chapter5;

/**
 * Overloaded methods
 */
public class Month {
    public static void main(String[] args) {
        getMonth(1);
        getMonth("Jan");
    }


    public static  String getMonth(int month){
        return "";
    }
    public  static  int getMonth(String month){
        return 0;
    }
}
