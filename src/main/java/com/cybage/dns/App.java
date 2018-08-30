package com.cybage.dns;
import com.google.cloud.dns.Zone;
import com.google.cloud.dns.Dns;
import com.google.cloud.dns.DnsOptions;
import com.google.cloud.dns.Zone;
import com.google.cloud.dns.ZoneInfo;
import java.util.Iterator;
import com.google.cloud.dns.RecordSet;
/**
 * Hello world!
 *
 */
import com.google.cloud.dns.ChangeRequest;
import com.google.cloud.dns.ChangeRequestInfo;
import com.google.cloud.dns.Dns;
import com.google.cloud.dns.DnsOptions;
import com.google.cloud.dns.ProjectInfo;
import com.google.cloud.dns.RecordSet;
import com.google.cloud.dns.Zone;
import com.google.cloud.dns.ZoneInfo;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public class App 
{
    public static void main( String[] args )
    {
/**Iterator<RecordSet> recordSetIterator = zone.listRecordSets().iterateAll();
    	    System.out.println( "Hello World!" );
	Dns dns = DnsOptions.getDefaultInstance().getService();
	// List all your zones
Iterator<Zone> zoneIterator = dns.listZones().iterateAll();
int counter = 1;
while (zoneIterator.hasNext()) {
  System.out.printf("#%d.: %s%n%n", counter, zoneIterator.next());
  counter++;
}

// List the record sets in a particular zone
recordSetIterator = zone.listRecordSets().iterateAll();
System.out.println(String.format("Record sets inside %s:", zone.getName()));
while (recordSetIterator.hasNext()) {
  System.out.println(recordSetIterator.next());
}*/
//    Dns dns;
  //  Zone zone=null;
    
    Dns  dns = DnsOptions.getDefaultInstance().getService();
    Iterator<Zone> zoneIterator = dns.listZones().iterateAll().iterator();
      if (zoneIterator.hasNext()) {
        System.out.println("The project contains the following zones:");
        while (zoneIterator.hasNext()) {
         // printZone(zoneIterator.next());
//	  System.out.printf("%nName: %s%n", zone.getName();
         System.out.printf("%nName: %s%n", zoneIterator.next().getName());
	//Iterator<RecordSet> recordSetIterator = zoneIterator.next().listRecordSets().iterateAll();
	//while (recordSetIterator.hasNext()) {
	 // System.out.println(recordSetIterator.next());
//	}
	}
      } else {
        System.out.println("Project contains no zones.");
      }
}
}
