package TheatreProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        Theater theater = new Theater("My theatre",8, 12);
        if (theater.reserveSeat("H11")){
            System.out.println("Please pay");
        }
        else {
            System.out.println("Seat is already taken");
        }
        System.out.println("");
        if (theater.reserveSeat("H11")){
            System.out.println("Please pay");
        }
        else {
            System.out.println("Seat is already taken");
        }
        System.out.println("");
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.getSeats());
        Collections.reverse(seatCopy);
        printList(seatCopy);
        Collections.shuffle(seatCopy);
        printList(seatCopy);
        List<Theater.Seat> priceSeat = new ArrayList<>(theater.getSeats());
        priceSeat.add(theater.new Seat("A01", 12.00));
        priceSeat.add(theater.new Seat("H12", 7.00));
        priceSeat.add(theater.new Seat("A07",11.22));
        Collections.sort(priceSeat,Theater.PRICE_ORDER);
        printList(priceSeat);
    }


    public static void printList(List<Theater.Seat> list){
        for (Theater.Seat seat :list){
            System.out.print(" "+ seat.getSeatNumber() + " Price " + seat.getPrice());
        }
        System.out.println(" ");
        System.out.println("=============================================");
    }
}
