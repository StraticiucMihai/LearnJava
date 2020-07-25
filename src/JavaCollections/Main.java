package JavaCollections;

//import PreviousImplementation.List;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Theater theater = new Theater("My theatre", 8, 12);

        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(theater.seats );
        printList(seatCopy);
        Collections.shuffle(seatCopy);
        printList(seatCopy);
        Collections.reverse(seatCopy);
        printList(seatCopy);
        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Max value from seat: " + maxSeat.getSeatNumber());
        System.out.println("Min value from seat: " + minSeat.getSeatNumber());
        sort(seatCopy);
        System.out.println("Sorted:");
        printList(seatCopy);

//        //theatre.getSeats();
//        if (theater.reserveSeat("H11")){
//            System.out.println("Please pay");
//        }
//        else {
//            System.out.println("Seat is already taken");
//        }
        
    }

    public static void printList (List<Theater.Seat> list){

        for (Theater.Seat seat : list){
            System.out.print(" "+seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==========================================");
    }
    /**/
    public static void sort(List<? extends  Theater.Seat> list){

        for(int i =0 ; i< list.size()-1 ; i++){
            for (int j= i+1 ;j<list.size()-1; j++){
                if (list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list, i, j);
                }
            }

        }
    }
}
