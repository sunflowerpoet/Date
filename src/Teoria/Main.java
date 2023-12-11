package Teoria;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        OffsetDateTime adesso = OffsetDateTime.now();
//        System.out.println("adesso: " + adesso);

//        OffsetDateTime primoGennaio2023 = OffsetDateTime.of(2023,1,1,15,15,0,0, ZoneOffset.UTC);
//        System.out.println("primo gennaio:" + primoGennaio2023);

        OffsetDateTime ieri = OffsetDateTime.parse("2023-12-05T17:28:20+02:00");
        System.out.println("ieri: " + ieri);

        String dateStringFull = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT));
        String dateStringLong = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT));
        String dateStringMedium = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT));
        String dateStringShort = ieri.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT));

        System.out.println("Date String Full: " + dateStringFull);
        System.out.println("Date String Long: " + dateStringLong);
        System.out.println("Date String Medium: " + dateStringMedium);
        System.out.println("Date String Short: " + dateStringShort);

        String dateStringManuale = ieri.format(DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ITALY));
        System.out.println("Date String Manuale: " + dateStringManuale);

//        String dateStringIsoData = ieri.format(DateTimeFormatter.ISO_DATE);
//        String dateStringIsoOra = ieri.format(DateTimeFormatter.ISO_TIME);
//        String dateStringIsoDataOra = ieri.format(DateTimeFormatter.ISO_DATE_TIME);
//        String dateStringIso1 = ieri.format(DateTimeFormatter.ISO_ORDINAL_DATE);
//        String dateStringIsoLocale = ieri.format(DateTimeFormatter.ISO_LOCAL_DATE);

        ZonedDateTime yesterday = OffsetDateTime.parse("2023-10-03T11:12:04+02:00").toZonedDateTime();
        ZonedDateTime ieriZone = OffsetDateTime.parse("2023-10-03T11:12:04+02:00").atZoneSimilarLocal(ZoneId.of("Europe/Rome"));

        System.out.println("Zone date & time: " + yesterday);
        System.out.println("Zone similar local: " + ieriZone);

    }
}
