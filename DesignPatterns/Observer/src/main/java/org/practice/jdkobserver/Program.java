package org.practice.jdkobserver;


import org.practice.jdkobserver.products.NewsAgency;
import org.practice.jdkobserver.services.EmailService;
import org.practice.jdkobserver.services.SMSService;

public class Program {

	public static void main(String[] args) {
		System.out.println("Current News is : Bla Bla bla");
		NewsAgency myAgency = new NewsAgency();
		SMSService sms = new SMSService();
		EmailService email = new EmailService();
		myAgency.addObserver(sms);
		myAgency.addObserver(email);
		myAgency.addNews("shantonu is coading");
		myAgency.notifyObservers();
		
	}

}