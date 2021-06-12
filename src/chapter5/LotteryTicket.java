package chapter5;

import java.util.Arrays;
import java.util.Random;

/**
 * Generate lottery ticket numbers using binary /sequential search
 */
public class LotteryTicket {
    private static  final int LENGTH = 7;
    private  static  final  int MAX_TICKET_NUMBERS = 50;
    public static void main(String[] args) {

        LotteryTicket lotteryTicket = new LotteryTicket();
        int [] ticketNumbers = lotteryTicket.generateNumber(LENGTH);
        Arrays.sort(ticketNumbers);
        lotteryTicket.printTicket(ticketNumbers);

    }

    /**
     * Generates random unique numbers
     * @param length
     * @return
     */
    public int [] generateNumber(int length){
        int [] ticket = new int[length];

        Random random = new Random();
        int randomNumber;
        for (int num = 0; num < ticket.length; num++) {

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBERS) + 1;
            }while (sequentialSearchNumber(ticket,randomNumber));
            
            ticket[num] = randomNumber;

        }
        return  ticket;
    }


    /**
     * Does a sequential search on the array to find a valud
     * @param array Array to search through
     * @param randomNumber Value to search for
     * @return true if found / false is not found
     */
    private boolean sequentialSearchNumber(int[] array, int randomNumber) {
        for (int num: array) {
                if (num==randomNumber){
                    return true;
                }
        }
        return false;
    }

    /**
     * Performs a binary search
     * @param array
     * @param randomNumber
     * @return
     */
    private boolean binarySearchNumber(int [] array, int randomNumber){

        Arrays.sort(array);
        int result = Arrays.binarySearch(array,randomNumber);
        if (result>=0){

            return true;

        }else {
            return false;
        }
    }
    /**
     * Prints all the numbers of in an array in the same line e.g. 1|2|3|4|5|6|
     * @param ticket is the array of tickets to print
     */
    public void printTicket(int ticket []){
        for(int num: ticket
        ){
            System.out.print(num + "|");
        }
    }
}
