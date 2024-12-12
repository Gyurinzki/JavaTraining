package meetingrooms;

import java.util.Scanner;

public class MeetingRoomcontroller {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja hány tárgyalót fog hozzáadni");
        int darab = scanner.nextInt();

        for (int i = 0; i < darab; i++) {
            System.out.println("Adja meg a tárgyaló nevét");
            String Nev = scanner.nextLine();
        }

        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján\n" +
                "8. Kilépés");
        int opcio = scanner.nextInt();
    }


}
