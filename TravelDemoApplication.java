
package com.aits.Traveldemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class TraveldemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TraveldemoApplication.class, args);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TraveldemoApplication.class);
		
		TicketReservation tk=context.getBean(TicketReservation.class);
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sevice:");
		
		String serviceType=sc.next();
		
		tk.bookTicket(serviceType,"Hyderabad","Tirupathi");
	*/
		tk.printObj();
		
		
	}

}
