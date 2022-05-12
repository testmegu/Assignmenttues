package com.cg.phonebook;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
	private List phoneBook = new ArrayList();

	public List getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List phoneBook) {
		this.phoneBook = phoneBook;
	}
	
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	char ch = 'y';

	public void menu() throws ParseException {

		while (ch == 'y') {

			
			System.out.println("1.Add Contact");
			System.out.println("2.Display all Contact");
			System.out.println("3.Search all Contact by phone");
			System.out.println("4.Remove Contact");
			System.out.println("5.Exit");
			System.out.println("Enter the choice .....");
		
			sc.nextLine();
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				addContact(null);
				break;
			case "2":
				viewAllContacts();
				break;
			case "3":
				viewContactGivenPhone();
				break;
			case "4":
				removeContact();
				break;
			case "5":
				System.out.println("Exited");
				break;
			default:
				System.out.println("Not a proper choice");
				break;
			}
						

			System.out.println("do you want to continue....");
			System.out.println("Enter 'y' to continue ......");
			ch = sc.next().charAt(0);

		} // while close
	}

		public void addContact(Contact contactObj) {
			System.out.print("Enter Contact First Name : ");
			String firstName = sc.nextLine();
			System.out.println("Enter Contact Last name : ");
			String lastName = sc.nextLine();
			System.out.println("Enter phoneNumber : ");
			long phoneNumber = sc1.nextLong();
			System.out.println("Enter emailID");
			String emailId = sc.nextLine();
			
			
			phoneBook.add(new Contact(firstName,lastName,phoneNumber,emailId));	
					
	}
		public List<Contact> viewAllContacts() {
			Iterator<Contact> it = phoneBook.iterator();
			while(it.hasNext()) {
				Contact phoneBook1 = it.next();
				System.out.println(phoneBook1);
			}
			return phoneBook;
			
		}
		
		public Contact viewContactGivenPhone() {
			
			boolean found = false;
			System.out.println("Enter phone number to search : ");
			Long phoneNumber = sc1.nextLong();
			System.out.println("---------------------------------------");
			Iterator<Contact> it = phoneBook.iterator();
			it = phoneBook.iterator();
			while(it.hasNext()) {
				Contact phoneBook1  = it.next();
				if(phoneBook1.getPhoneNumber() == phoneNumber) {
					System.out.println(phoneBook1);
					found=true;
				}
			}
					if(!found) {
						System.out.println("Phone Number not Found");
					}
					System.out.println("-----------------------------------");	
			return null;
			
		}
		
		public boolean removeContact() {
			boolean found = false;
			System.out.println("Enter phone number to remove : ");
			Long phoneNumber = sc1.nextLong();
			Iterator<Contact> it = phoneBook.iterator();
			it = phoneBook.iterator();
			while(it.hasNext()) {
				Contact phoneBook1  = it.next();
				if(phoneBook1.getPhoneNumber() == phoneNumber) {
					it.remove();
					found = true;
				}
			}
					if(!found) {
						System.out.println("Phone Number not Found");
						return false;
					}else {
						System.out.println("Phone Number removed");
						return true;
					}
		}	

}
