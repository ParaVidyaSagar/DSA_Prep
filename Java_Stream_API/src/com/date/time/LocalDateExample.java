package com.date.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateExample {
	
	public static void main(String[] args) {
		// Create a LocalDate representing 7th August 2023
		LocalDate date = LocalDate.of(2023, 8, 7);
	    System.out.println("Date: " + date);//Date: 2023-08-07
	
	    // Create a LocalTime representing 14:30:45
	    LocalTime time = LocalTime.of(14, 30, 45);
	    System.out.println("Time "+ time);//Time 14:30:45
	
	    // create a LocalDateTime representing 7th August 23023, 14:30:45
	    LocalDateTime dateTime = LocalDateTime.of(2023, 8,7,14,30,45);
	    System.out.println("Date and Time: "+ dateTime);//Date and Time: 2023-08-07T14:30:45
	    
	    
	    //Create a MonthDay for 7th August
	    MonthDay monthDay = MonthDay.of(8, 7);
	    System.out.println("Month and Day: "+ monthDay);//Month and Day: --08-07
	    
	    //Creates and offset time representing 14:30:45 with a +02:00 offset(2 hours ahead of UTC)
	    OffsetTime offsetTime = OffsetTime.of(14, 30, 45, 0, ZoneOffset.ofHours(2));
	    System.out.println(offsetTime); //14:30:45+02:00
	    
	    
	    //Create an offsetDateAndTime representing 7th August 2023, 14:30:45 with a +02:00 offset (2 hours ahead of UTC)
	    OffsetDateTime offsetDateTime = OffsetDateTime.of(2023, 8,7,14,30,45,0,ZoneOffset.ofHours(2));
	    System.out.println(offsetDateTime);//2023-08-07T14:30:45+02:00
	    
	    
	    /*
	     *Clock provides access to the current date and time in a specific time zone. It's useful
          for testing and situations where you need to work with a specific clock.
	     * 
	     */
	    //Get the current date and time using system default clock
	    Clock clock = Clock.systemDefaultZone();
	    Instant now = Instant.now(clock);
	    System.out.println("Current Date And Time: "+ now); //Current Date And Time: 2025-09-28T13:18:56.967482100Z
	   
	    /*
	     * ZoneDateTime represents a date and time with full timezone information.
	     */
	    //Create a LocalDateTime representing 7th August 2023, 14:30:45
	    LocalDateTime localDateTime = LocalDateTime.of(2023, 8,7,14,30,45);
	    // create a ZonedDateTime for the given LocalDateTime in the "American/Newyork_timezone
	    ZonedDateTime zoneDateTime = ZonedDateTime.of(localDateTime,ZoneId.of("America/New_York"));
	    System.out.println("Zoned Date and Time "+ zoneDateTime);//Zoned Date and Time 2023-08-07T14:30:45-04:00[America/New_York]
	    
	    /*
	     * ZoneId represents a time zone identifier, such as "America/New_York" or
           "Europe/London".
	     */
	    //Get the ZoneId for "America/New_York"
	    ZoneId zoneId = ZoneId.of("America/New_York");
	    System.out.println("ZoneId: "+zoneId); //America/New_York
	    
	    
	    
	}

}
