import java.util.ArrayList;

public class IcalExport {
	public static String timeZone = "America/New_York";
	
	public static String exportClasses(Schedule sched) {
		String tr = "BEGIN:VCALENDAR\n"
				+ "CALSCALE:GREGORIAN\n"
				+ "VERSION:2.0\n"
				+ "PRODID:-//SpireWithFewerTears//IcalExport Version 0.9.2//EN\n"
				+ "METHOD:PUBLISH\n";
		
		tr += getTimeZone() + "\n";
		
		ArrayList<Class> classes = sched.getClasses();
		
		for (Class c: classes) {
			tr += c.toIcalEvent() + "\n";
		}
		tr += "END:VCALENDAR";
		
		return tr;
	}
	
	private static String getTimeZone() {
		String tr = "BEGIN:VTIMEZONE\n"
				+ "TZID:America/New_York\n"
				+ "X-LIC-LOCATION:America/New_York\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:18831118T120358\n"
				+ "RDATE;VALUE=DATE-TIME:18831118T120358\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0456\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19180331T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19190330T070000Z;BYDAY=-1SU;BYMONTH=3\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:19181027T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19191026T060000Z;BYDAY=-1SU;BYMONTH=10\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:19200101T000000\n"
				+ "RDATE;VALUE=DATE-TIME:19200101T000000\n"
				+ "RDATE;VALUE=DATE-TIME:19420101T000000\n"
				+ "RDATE;VALUE=DATE-TIME:19460101T000000\n"
				+ "RDATE;VALUE=DATE-TIME:19670101T000000\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19200328T020000\n"
				+ "RDATE;VALUE=DATE-TIME:19200328T020000\n"
				+ "RDATE;VALUE=DATE-TIME:19740106T020000\n"
				+ "RDATE;VALUE=DATE-TIME:19750223T020000\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:19201031T020000\n"
				+ "RDATE;VALUE=DATE-TIME:19201031T020000\n"
				+ "RDATE;VALUE=DATE-TIME:19450930T020000\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19210424T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19410427T070000Z;BYDAY=-1SU;BYMONTH=4\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:19210925T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19410928T060000Z;BYDAY=-1SU;BYMONTH=9\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19420209T020000\n"
				+ "RDATE;VALUE=DATE-TIME:19420209T020000\n"
				+ "TZNAME:EWT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19450814T190000\n"
				+ "RDATE;VALUE=DATE-TIME:19450814T190000\n"
				+ "TZNAME:EPT\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19460428T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19660424T070000Z;BYDAY=-1SU;BYMONTH=4\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:19460929T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19540926T060000Z;BYDAY=-1SU;BYMONTH=9\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:19551030T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19661030T060000Z;BYDAY=-1SU;BYMONTH=10\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19670430T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19730429T070000Z;BYDAY=-1SU;BYMONTH=4\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:19671029T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=20061029T060000Z;BYDAY=-1SU;BYMONTH=10\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19760425T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=19860427T070000Z;BYDAY=-1SU;BYMONTH=4\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:19870405T020000\n"
				+ "RRULE:FREQ=YEARLY;UNTIL=20060402T070000Z;BYDAY=1SU;BYMONTH=4\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:DAYLIGHT\n"
				+ "DTSTART:20070311T020000\n"
				+ "RRULE:FREQ=YEARLY;BYDAY=2SU;BYMONTH=3\n"
				+ "TZNAME:EDT\n"
				+ "TZOFFSETFROM:-0500\n"
				+ "TZOFFSETTO:-0400\n"
				+ "END:DAYLIGHT\n"
				+ "BEGIN:STANDARD\n"
				+ "DTSTART:20071104T020000\n"
				+ "RRULE:FREQ=YEARLY;BYDAY=1SU;BYMONTH=11\n"
				+ "TZNAME:EST\n"
				+ "TZOFFSETFROM:-0400\n"
				+ "TZOFFSETTO:-0500\n"
				+ "END:STANDARD\n"
				+ "END:VTIMEZONE";
		return tr;
	}
}
