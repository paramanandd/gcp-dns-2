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
import java.util.List;
// for new code 
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.dns.model.ResourceRecordSet;
import com.google.api.services.dns.model.ResourceRecordSetsListResponse;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

import com.google.cloud.dns.ChangeRequestInfo;
import com.google.cloud.dns.RecordSet;

import java.util.concurrent.TimeUnit;
public class App 
{
    public static void main( String[] args )
    {
	Dns dns = DnsOptions.getDefaultInstance().getService();	
	// Create a zone metadata object
	String zoneName = "jellyfish-zone"; // Change this zone name which is unique within your project
	String domainName = "domain.com."; // Change this to a domain which you own
	String description = "This is a google-cloud-dns sample zone.";
	ZoneInfo zoneInfo = ZoneInfo.of(zoneName, domainName, description);
//	List<Zone> zonelist;
	//create zone
/**	Zone zone1 = dns.create(zoneInfo);
	System.out.printf("Zone was created and assigned ID %s.%n", zone1.getGeneratedId());

	//list name servers
	List<String> nameServers = zone1.getNameServers();
	for (String nameServer : nameServers) {
	  System.out.println(nameServer);
	}
*/
	//list zones
	Iterator<Zone> zoneIterator = dns.listZones().iterateAll().iterator();
	int counter = 1;
	while (zoneIterator.hasNext()) {
	      	System.out.printf("#%d.: %s%n%n", counter, zoneIterator.next());
	  counter++;
	} 

	//list record sets
	Zone zone =dns.getZone(zoneName);
	
	System.out.printf("Record sets inside %s:", zone.getName());
	Iterator<RecordSet> recordSetIterator = zone.listRecordSets().iterateAll().iterator();
	System.out.println(String.format("Record sets inside %s:", zone.getName()));
	while (recordSetIterator.hasNext()) {
		System.out.println("inside");
	  System.out.println(recordSetIterator.next());
	}
	
	/**	String ip = "12.13.14.15";
RecordSet toCreate = RecordSet.newBuilder("www." + zone.getDnsName(), RecordSet.Type.A)
    .setTtl(24, TimeUnit.HOURS)
    .addRecord(ip)
    .build();

// Make a change
ChangeRequestInfo changeRequest = ChangeRequestInfo.newBuilder().add(toCreate).build();

// Build and apply the change request to our zone
changeRequest = zone.applyChangeRequest(changeRequest);
*/    }
}
