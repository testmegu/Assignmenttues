package com.cg.memberapplication;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Library {
	List<Member> memberList = new ArrayList<>();	
	Iterator<Member> it = memberList.iterator();
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	char ch = 'y';

	public void menu() throws ParseException {

		while (ch == 'y') {

			
			System.out.println("1.Add Member");
			System.out.println("2.View All Members");
			System.out.println("3.Search Member By Address");
			System.out.println("4.Exit");
			System.out.println("Enter the choice .....");
		
			sc.nextLine();
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				addMember();
				break;
			case "2":
				viewAllMembers();
				break;
			case "3":
				viewMembersByAddress();
				break;
			case "4":
				System.out.println("Exited...");
				break;
			default:
				System.out.println("Not a proper choice");
				break;
			}
						

			System.out.println("do you want to continue....");
			System.out.println("Enter 'y' to continue ......");
			ch = sc.next().charAt(0);

		} 

	}
	
	public void addMember() {
		System.out.print("Enter member id : ");
		int memberId = sc.nextInt();
		System.out.println("Enter member name : ");
		String memberName = sc1.nextLine();
		System.out.println("Enter member address : ");
		String address = sc1.nextLine();
		
		
		memberList.add(new Member(memberId,memberName,address));
		
		
	}
	
	public  List<Member> viewAllMembers(){
		Iterator<Member> it = memberList.iterator();
		while(it.hasNext()) {
			Member memberList1 = it.next();
			System.out.println(memberList1);
		}
		return memberList;
		
	}
	
	public List<Member> viewMembersByAddress(){
		boolean found = false;
		System.out.println("Enter member address to search : ");
		String address = sc1.nextLine();
		System.out.println("--");
		it = memberList.iterator();
		while(it.hasNext()) {
			Member memberList1  = it.next();
			if(memberList1.getAddress().equals(address)) {
				System.out.println(memberList1);
				found=true;
			}
		}
				if(!found) {
					System.out.println("Address not Found");
				}
				System.out.println("--");
		
		return memberList;
		
		
		
	}

}
