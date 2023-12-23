package csci1110.Homework.Other;
import java.text.DecimalFormat;
public class Hotel {
    private String name;
    private int totalRooms;
    private int occupiedRooms;

    public Hotel(){
        occupiedRooms = 0;
    }

    public Hotel(String hotelName, int totalRooms){
        name = hotelName;
        this.totalRooms = totalRooms;
        occupiedRooms = 0;
    }

    public String getName(){return name;}
    public void setName(String nameHotel){ name = nameHotel;}
    public int getTotalRooms(){return totalRooms;}
    public void setTotalRooms(int roomTotal){totalRooms = roomTotal;}
    public int getOccupiedRooms(){return occupiedRooms;}
    public void setOccupiedRooms(int roomOccupied){occupiedRooms = roomOccupied;}

    public float occupancy(){
        return ((float) occupiedRooms/totalRooms *100);
    }

    public boolean sameNumRooms(Object other){
        if(!(other instanceof Hotel)){
            return false;
        }
        Hotel otherHotel = (Hotel) other;
        if(totalRooms == otherHotel.totalRooms){
            return true;
        }
        return false;
    }

    public boolean higherOccupancy(Object other){
        if (!(other instanceof Hotel)){
            return false;
        }

        Hotel otherHotel = (Hotel) other;
        float currentOccupancy = occupancy();

        if (currentOccupancy > otherHotel.occupancy()){
            return true;
        }
        return false;
    }


    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        return name +" has "+ totalRooms+" rooms "
                +"with an occupany rate of "+ df.format(occupancy())+"%";

    }
}
