package Es_05_Date;

import javax.swing.text.StyledEditorKit;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
verificare che la prima data è precedente alla seconda
verificare che la seconda data è successiva alla prima
verificare che le due date sono uguali ad ora
Stampa il risultato*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTimeString = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formattedDateTime = dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));
        System.out.println("Input Date & time: " + formattedDateTime);

        OffsetDateTime dateTimeString2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        String formattedDateTime2 = dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));
        System.out.println("Input Date & time 2 : " + formattedDateTime2);

        Boolean checkDate1 = dateTimeString.isBefore(dateTimeString2);
        Boolean checkDate2 = dateTimeString2.isAfter(dateTimeString);

        System.out.println("Date 1 is before date 2: " + checkDate1);
        System.out.println("Date 2 is after date 1: " + checkDate2);

        String dateStringTime = dateTimeString.format(DateTimeFormatter.ofPattern("hh:mm:ss", Locale.ITALY));
        String dateStringTime2 = dateTimeString2.format(DateTimeFormatter.ofPattern("hh:mm:ss", Locale.ITALY));

        Boolean checkTime = dateStringTime.equals(dateStringTime2);
        System.out.println("Both dates have the same time: " + checkTime);
    }
}
