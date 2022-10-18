import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String str = scan.nextLine();
        System.out.println("Your word is " + str.length() + " letters long");
        int length = str.length();
        if ((str.length() % 2) > 0) {
            System.out.println("The first half of your word is " + str.substring(0, length / 2));
            System.out.println("The second half of your word is " + str.substring(length / 2 + 1));
        } else {
            System.out.println("The first half of your word is " + str.substring(0, length / 2));
            System.out.println("The second half of your word is " + str.substring(length / 2));


        }
        System.out.println("Please enter a second word");
        String str2 = scan.nextLine();
        if (str.equals(str)) {
            System.out.println("The two words you entered are the same");


        }

        if (str.compareTo(str2) > 0) {
            System.out.println("The first word comes after  the second word");
        } else {
            System.out.println("The second word comes after the first word");
        }

        if (str.length() > str2.length()) {
            System.out.println("The first word is longer than the second word");
        } else {
            System.out.println("The second word is longer than the first word");
        }

        if ( str.indexOf(str2) > -1) {
            System.out.println("The first word can be found in the second word at index" + str.indexOf(str2));
        } else {
            System.out.println("not found");
        }


        if ( str2.indexOf(str) > -1) {
            System.out.println("The second word can be found in the first word at index" + str2.indexOf(str));
        } else {
            System.out.println("not found");
        }
    }
}