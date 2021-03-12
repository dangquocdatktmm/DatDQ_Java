package PRACTICAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Hotel> hotels = new ArrayList<Hotel>();

        hotels.add(new Hotel("Intercontinental", "Da Nang", "ownername1"));
        hotels.add(new Hotel("Metropole", "Ha Noi", "ownername2"));
        hotels.add(new Hotel("JW Marriott", "Ha Noi", "ownername3"));
        hotels.add(new Hotel("Four Seasons", "Quang Nam", "ownername4"));
        hotels.add(new Hotel("Rex Hotel", "Ho Chi Minh", "ownername5"));
        hotels.add(new Hotel("Laguna", "Hue", "ownername6"));
        hotels.add(new Hotel("Vinpearl Resort HaLong", "Quang Ninh", "ownername7"));
        hotels.add(new Hotel("Dalat Palace", "Lam Dong", "ownername8"));
        hotels.add(new Hotel("Intercontinental Nha Trang", "Khanh Hoa", "ownername9"));
        hotels.add(new Hotel("Grand Hotel Saigon", "Ho Chi Minh", "ownername10"));

        Scanner scanner = new Scanner(System.in);
        String ownerName;
        System.out.println("Input the Owner’s Name:");
        ownerName = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < hotels.size(); i++) {
            if (ownerName.equals(hotels.get(i).getOwnerName())) {
                System.out.println("Hotel name: " + hotels.get(i).getName() + ", Hotel location: "
                        + hotels.get(i).getLocation() + ", Hotel owner name: " + hotels.get(i).getOwnerName());
            }
        }
        System.out.println("Finish");
    }

}
