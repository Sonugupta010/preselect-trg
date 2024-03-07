/*  Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String) */


import java.util.Scanner;
public class SortedFriendsName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = new String[10];

        System.out.println("Enter the names of 10 friends:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of friend #" + (i + 1) + ": ");
            friends[i] = sc.nextLine();
        }

        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (friends[i].compareTo(friends[j]) > 0) {
                    String temp = friends[i];
                    friends[i] = friends[j];
                    friends[j] = temp;
                }
            }
        }
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}


