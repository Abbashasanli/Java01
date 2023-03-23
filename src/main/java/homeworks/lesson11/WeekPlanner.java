package homeworks.lesson11;


import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = " do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = " go to courses; watch a film";
        while (true) {

            System.out.print("Please, input the day of the week:");
            String day = scan.next();
            day = day.substring(0, 1).toUpperCase() + day.substring(1);
            if ("exit".equalsIgnoreCase(day)) break;

            switch (day) {

                case "Sunday":
                    System.out.println("Your task for " + day + schedule[1][1]);
                    continue;
                case "Monday":
                    System.out.println("Your task for " + day + schedule[0][1]);
                    continue;
            }
            System.out.println("Sorry, I don't understand you, please try again.");
        }
    }
}


