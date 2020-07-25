package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {

    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    public Theater(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1 );

        for(char row ='A';row <= lastRow;row++){
            for (int setNum = 1; setNum <= seatsPerRow; setNum ++){
                Seat seat = new Seat(row + String.format("%02d",setNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return  seats.get(foundSeat).reserve();
        }
        else{
            System.out.println("There is no seat "+ seatNumber);
            return  false;
        }
    }

    // for testing
    public  void getSeats(){
        for (Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public  boolean reserve(){
            if (!this.reserved){
                this.reserved = true;
                System.out.println("Seat: "+seatNumber+" reserved");
                return  true;
            }
            else{
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved = false;
                System.out.println("reservation of seat: "+seatNumber+" canceled");
                return  true;
            }
            else{
                return  false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }


}
