package Es_03_Date;

import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Input Date & time: " + dateTimeString);

        System.out.println("Year: " + dateTimeString.getYear());
        System.out.println("Month: " + dateTimeString.getMonth());
        System.out.println("Day: " + dateTimeString.getDayOfMonth());
        System.out.println("Day of the week: " + dateTimeString.getDayOfWeek());

    }
}
