package csci1110.Homework.Other;
import csci1110.Homework.Other.Hotel;

import java.util.Scanner;

public class HotelDemo2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String nameOne = in.next();
        int totalRoomsOne = in.nextInt();
        Hotel hotelOne = new Hotel(nameOne,totalRoomsOne);
        String nameTwo = in.next();
        int totalRoomsTwo = in.nextInt();
        Hotel hotelTwo = new Hotel(nameTwo,totalRoomsTwo);

        int occRoomsOne = in.nextInt();
        int occRoomsTwo = in.nextInt();
        hotelOne.setOccupiedRooms(occRoomsOne);
        hotelTwo.setOccupiedRooms(occRoomsTwo);

        System.out.println(hotelOne);
        System.out.println(hotelTwo);

        boolean valueOne = hotelOne.sameNumRooms(hotelTwo);
        System.out.println("Both hotels have the same number of rooms is "+valueOne);

        boolean higher = hotelTwo.higherOccupancy(hotelOne);
        boolean higherTwo = hotelOne.higherOccupancy(hotelTwo);
        if (!higher && higherTwo){
            System.out.println(hotelOne.getName()+" has the highest occupancy rate.");
        }
        else if (higher && !higherTwo){
            System.out.println(hotelTwo.getName()+" has the highest occupancy rate.");
        }
        else{
            System.out.println(hotelOne.getName()+" and "+hotelTwo.getName()
                    +" have the same occupancy rate.");
        }

    }
}
