package chapter5;

import java.util.Random;

public class LotteryTicket {
    private static  final int LENGTH = 6;
    private  static  final  int MAX_TICKET_NUMBERS = 50;
    public static void main(String[] args) {

        LotteryTicket lotteryTicket = new LotteryTicket();
       lotteryTicket.printTicket(lotteryTicket.generateNumber(LENGTH));

    }

    public int [] generateNumber(int length){
        int [] ticket = new int[length];

        Random random = new Random();
        for (int num = 0; num < ticket.length; num++) {
            ticket[num] = random.nextInt(MAX_TICKET_NUMBERS) + 1;

        }
        return  ticket;
    }

    public void printTicket(int ticket []){
        for(int num: ticket
        ){
            System.out.print(num + "|");

        }
    }
}
