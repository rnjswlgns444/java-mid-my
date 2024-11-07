package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZonedId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZonedId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);
        
    }


}
