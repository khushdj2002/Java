package JavaCollectionFramework;

import java.util.Collection;
import java.util.List;

public class main_Room {
    public static void main(String[] args) {
        Room camebridge = new Room("Camebridge","Suite",5,250);
        Room oxford = new Room("oxford","deluxe",5,450);
        Room san = new Room("san","Suite",5,150);
        Room santa = new Room("santa","normal",3,150);

        Collection<Room> rooms = List.of(camebridge,oxford,san,santa);
        double total = getPotentialRevenue(rooms);
        System.out.println(total);
    }
    private static double getPotentialRevenue(Collection<Room> rooms){
        return rooms.stream()
                .mapToDouble(r -> r.getRate())
                .sum();
    }
}
