package Es_01_Date;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni*/
public class Main {
    public static void main(String[] args) {

        OffsetDateTime dateTimeString = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("Input Date & time: " + dateTimeString);

        String dateStringFull = dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));
        System.out.println("Date & time FULL: " + dateStringFull);

        String dateStringMedium = dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT));
        System.out.println("Date & time MEDIUM: " + dateStringMedium);

        String dateStringShort = dateTimeString.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT));
        System.out.println("Date & time SHORT: " + dateStringShort);

    }
}
