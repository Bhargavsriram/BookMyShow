package com;
import java.util.Arrays;
import java.util.Scanner;
public class ClassA {
	void m1() {
		System.out.println("--------Welcome to BookMyShow------------");
		System.out.println("-----------------------------------------");
		System.out.println("Movies for PONGAL");
		System.out.println();
		System.out.println("1)Waltair Veerayya");
		System.out.println("2)Veera Shima Reddy");
		System.out.println("3)Varisu");
		System.out.println("-----------------------------------------");
		System.out.println("Enter your choice :");
		Scanner sc=new Scanner(System.in);
		switch(sc.nextInt()) {
			case 1:
				System.out.println("Cost of each ticket: Rs.500/-");
				System.out.println();
				System.out.println("Show available at : ");
				System.out.println("1)10.30AM   2)2.30PM   3)6.15PM   4)9.45PM");
				System.out.println("Select show timings : ");
				int time=sc.nextInt();
				System.out.println("Enter no.of tickets you required :");
				int tickets=sc.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("Total tickets amount is : "+500*tickets);
				System.out.println("                    GST : "+((500*tickets)*10)/100);
				System.out.println("Total amount to be paid : "+((500*tickets)+((500*tickets)*10)/100));
				System.out.println("-----------------------------------------");
				System.out.println("Enter names of "+tickets+" for seat booking :");
				String names[]=new String[tickets];
				for(int i=0;i<=names.length-1;i++) {
					names[i]=sc.next();
				}
				System.out.println("Tickets booked successfully for Waltair Veerayya for : "+Arrays.toString(names));
				break;
			
			case 2:
				System.out.println("Cost of each ticket: Rs.200/-");
				System.out.println();
				System.out.println("Enter no.of tickets you required :");
				int stickets=sc.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("Total tickets amount is : "+200*stickets);
				System.out.println("                    GST : "+((200*stickets)*10)/100);
				System.out.println("Total amount to be paid : "+((200*stickets)+((200*stickets)*10)/100));
				System.out.println("-----------------------------------------");
				System.out.println("Enter names of "+stickets+" for seat booking");
				String snames[]=new String[stickets];
				for(int i=0;i<=snames.length-1;i++) {
					snames[i]=sc.next();
				}
				System.out.println("Tickets booked successfully for Veera Shima Reddy : "+Arrays.toString(snames));
				break;
			
			case 3:
				System.out.println("Cost of each ticket: Rs.180/-");
				System.out.println();
				System.out.println("Enter no.of tickets you required :");
				int vtickets=sc.nextInt();
				System.out.println("-----------------------------------------");
				System.out.println("Total tickets amount is : "+180*vtickets);
				System.out.println("                    GST : "+((180*vtickets)*10)/100);
				System.out.println("Total amount to be paid : "+((180*vtickets)+((180*vtickets)*10)/100));
				System.out.println("-----------------------------------------");
				System.out.println("Enter names of "+vtickets+" for seat booking");
				String vnames[]=new String[vtickets];
				for(int i=0;i<=vnames.length-1;i++) {
					vnames[i]=sc.next();
				}
				System.out.println("Tickets booked successfully for Varisu : "+Arrays.toString(vnames));
				break;
		}
		sc.close();
	}
	public static void main(String[] args) {
		ClassA c=new ClassA();
		c.m1();
	}
}
