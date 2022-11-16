package doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentBooking 
{
	ArrayList<String> doctorName=new ArrayList<String>();
	ArrayList<String> doctorQualification=new ArrayList<String>();
	ArrayList<String> doctorGender=new ArrayList<String>();
	ArrayList<String> doctorpassword=new ArrayList<String>();
	ArrayList<Integer> doctorAge=new ArrayList<Integer>();
	ArrayList<Long> doctorMobileNumber=new ArrayList<Long>();
	ArrayList<String> doctorCity=new ArrayList<String>();

	ArrayList<Integer> patientAge=new ArrayList<Integer>();
	ArrayList<String> patientName=new ArrayList<String>();
	ArrayList<String> patientGender=new ArrayList<String>();
	ArrayList<String> patientPassword=new ArrayList<String>();
	ArrayList<String> patientConfirmPassword=new ArrayList<String>();
	ArrayList<Long> patientMobileNumber=new ArrayList<Long>();

	ArrayList<Integer> patientAgeBooking=new ArrayList<Integer>();
	ArrayList<String> patientNameBooking=new ArrayList<String>();
	ArrayList<String> patientGenderBooking=new ArrayList<String>();
	ArrayList<Byte> doctorId=new ArrayList<Byte>();

	void dataAdd() 
	{
		doctorName.add("Laxman Patil");
		doctorName.add("Narendra patil");
		doctorName.add("Shubham Pardeshi");

		doctorQualification.add("MBBS");
		doctorQualification.add("MD");
		doctorQualification.add("BAMS");

		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("M");

		doctorpassword.add("Laxman123");
		doctorpassword.add("Narendra456");
		doctorpassword.add("Pardeshi321");

		doctorAge.add(26);
		doctorAge.add(27);
		doctorAge.add(25);

		doctorMobileNumber.add((long) 621);
		doctorMobileNumber.add((long) 253);
		doctorMobileNumber.add((long) 362);

		doctorCity.add("Surat");
		doctorCity.add("Dhule");
		doctorCity.add("Pune");
	}
	void admin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		byte choice;
		boolean flag=true;

		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |       Welcome Admin     |");
			System.out.println("\t\t |_________________________|");
			System.out.println("\n\n1. Doctor list \t2. Registered Patients \t3.Pateints with Appointment  \n\nEnter Your Choice.");
			choice=sc.nextByte();
			switch(choice)
			{
			case 1:
				for(int i=0;i<=doctorName.size()-1;i++)
				{
					System.out.println("Name: \t "+doctorName.get(i));
				}
				byte menuChoice;
				System.out.println("\n\n1. Main Menu\t 2.Previous menu");
				menuChoice=sc.nextByte();
				if(menuChoice==1)
				{
					flag=false;
				}
				else 
				{
					break;
				}
				break;
			case 2:
				if(patientName.isEmpty())
				{
					System.out.println("No Registered Patients yet.");
					Thread.sleep(3000);
					break;
				}
				else
				{
					for(int i=0;i<=patientName.size()-1;i++)
					{
						System.out.println(i+". "+patientName.get(i));
					}
					System.out.println("\n\n1. Main menu\t 2. Previous menu");
					menuChoice=sc.nextByte();
					if(menuChoice==1)
					{
						flag=false;
					}
					else
					{
						break;
					}
				}
				break;
			case 3:
				if(patientNameBooking.isEmpty())
				{
					System.out.println("\nNo Appointments yet.");
					Thread.sleep(3000);
					break;
				}
				else
				{
					for(int i=0;i<=patientNameBooking.size()-1;i++)
					{
						System.out.println(i+". "+patientNameBooking.get(i));
					}
					Thread.sleep(5000);
					flag=false;
				}
				break;
			default:
				System.out.println("Wrong Choice");
				Thread.sleep(1000);
				flag=true;
			}
		}
	}
	void patient() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Patient Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			System.out.println("1.Login \t 2. Registration\n");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(patientMobileNumber.isEmpty())
				{
					System.out.println("First Register your self then login..!");
					Thread.sleep(500);
					break;
				}
				else
				{
					patientLogin();
					flag=false;
				}
				break;
			case 2:
				patientRegistration();
				flag=false;
				break;

			default:
				System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
				flag=true;
				break;
			}
		}
	}
	void doctor() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;

		boolean flag=true;
		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Doctor Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			System.out.println("1.Login \t 2. Registration\n");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(doctorMobileNumber.isEmpty())
				{
					System.out.println("First Register then login..!");
					flag=false;
					Thread.sleep(500);
					break;
				}
				else
				{
					doctorLogin();
					flag=false;
				}
				break;
			case 2:
				doctorRegistration();
				flag=false;
				break;

			default:
				System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
				flag=true;
				break;
			}
		}
	}

	private void patientLogin() throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean flag = true;
		long mobilenumber;
		byte choice;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |         Login 		   |");
		System.out.println("\t\t |_________________________|");

		System.out.println("Enter your Username(mobilenumber)");
		mobilenumber=sc.nextLong();
		System.out.println("Enter your Password");
		String password=sc.next();

		boolean flag1=false;
		int j;
		for(j=0;j<=patientMobileNumber.size()-1;j++)
		{
			if((patientMobileNumber.get(j)).equals(mobilenumber)&&(patientPassword.get(j)).equals(password))
			{
				flag1=true;
				break;
			}
		}
		if(flag1==true)
		{
			Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |     Book Appointment    |");
			System.out.println("\t\t |_________________________|");
			System.out.println("\n Welcome "+patientName.get(j)+", to book appointment, choose your doctor..");

			for(int i=0;i<=doctorName.size()-1;i++)
			{
				System.out.println((i+1)+". "+doctorName.get(i));
			}
			choice=sc.nextByte();
			doctorId.add(choice);

			while(flag)
			{
				Thread.sleep(1000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Appointment    |");
				System.out.println("\t\t |_________________________|");

				if(choice<=doctorName.size() && choice>0)
				{
					System.out.println("\n\nName: \t "+doctorName.get(choice-1)+"\nAge: \t "+doctorAge.get(choice-1)+"\nMobile:  "+doctorMobileNumber.get(choice-1)+"\nCity: \t "+doctorCity.get(choice-1));
					System.out.println("\n Enter your name: \t");
					sc.nextLine();
					patientNameBooking.add(sc.nextLine());
					System.out.println("Enter Your Age: \t");
					patientAgeBooking.add(sc.nextInt());
					System.out.println("Enter Gender: \t");
					patientGenderBooking.add(sc.nextLine());

					System.out.println("Booking Is Successfull..");

					Thread.sleep(1000);
					flag=false;
					break;
				}
				else
				{
					System.out.println("\nEnter Correct Input");
					flag=true;
					Thread.sleep(1000);
				}
			}
		}
		else
		{
			System.out.println("Login Successfull..!");
			Thread.sleep(900);
			flag=false;
		}
	}
	private void patientRegistration() throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\n");
		System.out.println("\t\t | Welcome to Patient Registration Page!|");
		System.out.println("\n");
		System.out.println("Please Enter Your Name: \t");
		patientName.add(sc.nextLine());
		System.out.println("Enter your Age: \t");
		patientAge.add(sc.nextInt());
		System.out.println("Enter Your mobile number: \t");
		mobileNumber=sc.nextLong();
		long mno;

		boolean flag=true, flag1=true;

		if(patientMobileNumber.isEmpty())
		{
			patientMobileNumber.add((mobileNumber));
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration Is successfull..!");

			Thread.sleep(900);
			flag1=false;

		}
		else
		{
			for( i=0;i<=patientMobileNumber.size()-1;i++)
			{
				mno=patientMobileNumber.get(i);
				if(mno==mobileNumber)
				{
					flag1=false;
					break;
				}
			}
			if(flag1==true)
			{
				patientMobileNumber.add(mobileNumber);
				System.out.println("Enter Password");
				patientPassword.add(sc.nextLine());
				System.out.println("Registration is successfull..!");
				Thread.sleep(900);
			}
			else
			{
				System.out.println("same mobile number is not  allowed\n");
				Thread.sleep(900);
			}
		}
	}
	private void doctorLogin() throws Exception
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long mobilenumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		System.out.println("\t\t ----------------------------");
		System.out.println("\t\t| This is doctor login Page |");
		System.out.println("\t\t ----------------------------");
		System.out.println("\n");

		System.out.println("Enter your UserName(Mobile number)");
		mobilenumber=sc.nextLong();

		System.out.println("Enter your password ");
		String password=sc.next();

		int i=0;;
		byte choice;
		boolean flag=false;
		boolean flag1=true;
		for(i=0;i<=doctorMobileNumber.size()-1;i++)
		{
			if((doctorMobileNumber.get(i)).equals(mobilenumber)&&(doctorpassword.get(i)).equals(password));
			{
				flag=true;
				break;
			}
		}

		if(flag==true)
		{
			while(flag1)
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t----------------------------------------");
				System.out.println("\t\t| Welcome Doctor "+doctorName.get(i)+" |");
				System.out.println("\t\t----------------------------------------");
				System.out.println("\n\nPress 1 to see your Appointments. \n");
				choice=sc.nextByte();
				byte j=0;
				switch(choice)
				{
				case 1:
					if((doctorId.isEmpty()!=true))
					{
						while(j<=doctorId.size()-1)
						{
							if((i+1)==doctorId.get(j))
							{
								System.out.println("patient Name: "+patientNameBooking.get(j));
								j++;
							}
						}
						Thread.sleep(4000);
					}
					else
					{
						System.out.println("No Appointment..!");
						Thread.sleep(3000);
						flag1=true;
					}
					break;
				}
			}
			
		}
		else
		{
			System.out.println("Login Successfull..!");
			Thread.sleep(900);
		}
	}


			private void doctorRegistration() throws Exception
			{
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int i=0;
				long mobilenumber;
				boolean flag=true, flag1=true;

				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

				System.out.println("\t\t ----------------------------------");
				System.out.println("\t\t| This is doctor registration Page |");
				System.out.println("\t\t ----------------------------------");
				System.out.println("\n");

				System.out.println("Please Enter your Name");
				doctorName.add(sc.nextLine());

				System.out.println("Enter your mobile number");
				mobilenumber=sc.nextLong();

				long mno;

				if(doctorMobileNumber.isEmpty())
				{
					doctorMobileNumber.add((mobilenumber));
					System.out.println("Enter Password");
					doctorpassword.add(sc.next());
					System.out.println("Registration is successfull.");
					Thread.sleep(900);
					flag1=false;
				}
				else
				{
					for(i=0;i<=doctorMobileNumber.size()-1;i++)
					{
						mno=doctorMobileNumber.get(i);
						if(mno==mobilenumber)
						{
							flag1=false;
							break;
						}
					}
					if(flag1==true)
					{
						doctorMobileNumber.add(mobilenumber);
						System.out.println("Enter your Age: ");
						doctorAge.add(sc.nextInt());
						System.out.println("Enter City: ");
						doctorCity.add(sc.nextLine());
						System.out.println("Enter Password: ");
						doctorpassword.add(sc.nextLine());
						System.out.println("Registration is successfull");
						System.out.println("Deatils: Name: "+doctorName+" Number: "+doctorMobileNumber);
						Thread.sleep(900);
					}
					else
					{
						System.out.println("same mobile number is not allowed\n");
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(500);

					}
				}
			}
			public static void main(String[] args) throws Exception
			{
				AppointmentBooking ap=new AppointmentBooking();
				Scanner sc=new Scanner(System.in);
				ap.dataAdd();
				boolean flag= true;
				while(flag = true)
				{
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					
					System.out.println("---------------------------------------------------------------------");
					System.out.println("\t\t | Welcome to Doctor AppointmentBooking |");
					System.out.println("----------------------------------------------------------------------\n\n");
						System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						ap.doctor();
						flag=true;
						break;
					case 2:
						ap.patient();
						flag=true;
						break;
					case 3:
						ap.admin();
						flag=true;
						break;
						default:
							System.exit(0);
					}
				}
			}
		}
