package Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class Main
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		System.out.println("");
		System.out.println("  |******************************************************* WELCOME TO ODA-APP (ONLINE DOCTOR APPOINTMENT APP)  *************************************************************|");
		System.out.println("  						-------------------------------------------------------------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("");
			System.out.println("");
			System.out.println("	|--> MAIN MENU <--|	");
			System.out.println("");
			System.out.println(" PRESS 1 TO BOOK APPOINTMENT WITH DOCTOR");
			System.out.println(" PRESS 2 TO CANCELLED APPOINTMENT WHICH IS SCHEDULED WITH DOCTOR");
			System.out.println(" PRESS 3 TO GET DETAILS ABOUT ALL EXPERTS DOCTOR");
			System.out.println(" PRESS 4 TO GET YOUR APPOINTMENT DETAILS");
			System.out.println(" PRESS 5 TO EXIT APP ");

			System.out.println("");
			System.out.print(" Press a key to perform a particular task : ");
			int c = Integer.parseInt(br.readLine());
			System.out.println("");
			
			if(c==1)
			{
				// Add Students ...
				System.out.println("");
				System.out.println("<--------------- Add YOUR Details --------------->");
				System.out.println("");
				System.out.print(" Enter User First Name : ");
				String fname = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Last Name : ");
				String lname = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Age : ");
				int age = Integer.parseInt(br.readLine());
				System.out.println("");
				
				if(0>age || age>120)
				{
					System.out.println("");
					System.out.println(" Sorry You Entered Invalid Age !!! ");
					System.out.println(" Please Try Again ...");
					continue ;
				}
				System.out.println("");
				System.out.println(" Gender Options --> Male/Female/Other :");
				System.out.println("");
				System.out.print(" Enter User Gender : ");
				String gender = br.readLine();
				System.out.println("");
				
				if(gender.equals("Male") || gender.equals("male") || gender.equals("Female") || gender.equals("female") || gender.equals("Other") || gender.equals("other"))
				{
					
				}
				else
				{
					System.out.println("");
					System.out.println(" Sorry You Entered Invalid Gender !!! ");
					System.out.println(" Please Try Again ...");
					continue ;
				}
				
				System.out.print(" Enter User Phone Number : +91-");
				String phone = br.readLine();
				System.out.println("");
				if(phone.length()==10)
				{
					
				}
				else
				{
					System.out.println("");
					System.out.println(" Sorry You Entered Invalid Phone Number !!! ");
					System.out.println(" Please Try Again ...");
					continue ;
				}
				System.out.print(" Enter User Address : ");
				String address = br.readLine();
				System.out.println("");
				System.out.print(" Enter User Date Of Birth In This Format - (dd-mm-yyyy) : ");
				String dob = br.readLine();
				System.out.println("");
				if(dob.length()==10)
				{
					
				}
				else
				{
					System.out.println("");
					System.out.println(" Sorry You Entered Invalid Date OF Birth !!! ");
					System.out.println(" Please Try Again ...");
					continue ;
				}
				System.out.print(" Are You Privious Taken Any Appointment (Yes/No) : ");
				String prev_attend = br.readLine();
				System.out.println("");
				if(prev_attend.equals("Yes")||prev_attend.equals("yes")||prev_attend.equals("No")||prev_attend.equals("no"))
				{
					
				}
				else
				{
					System.out.println("");
					System.out.println(" Sorry You Entered Invalid Option !!! ");
					System.out.println(" Please Try Again ...");
					continue ;
				}
				System.out.print(" Enter User Email : ");
				String email = br.readLine();
				System.out.println("");
				System.out.println("");
				System.out.println("   --> LIST OF SPECIALIST DOCTOR : ");
				System.out.println("");
				System.out.println("     1-  Dr. Amit Vatkar- DNB");
				System.out.println("");
				System.out.println("     2-  Dr. Rahul Gupta- DM");
				System.out.println("");
				System.out.println("     3-  Dr. Chandrashekhar Kulkarni- M.Ch");
				System.out.println("");
				System.out.println("     4-  Dr. Gaurav Gupta- M.Ch");
				System.out.println("");
				System.out.println("     5-  Dr. Prajct Sao- MD");
				System.out.println("");
				System.out.println("     6-  Dr. Abhishek Arun Jaiswal- MD Med.");
				System.out.println("");
				System.out.println("     7-  Dr. Paras Agarwal- MD");
				System.out.println("");
				System.out.println("     8-  Dr. Sandeep Cheruku- DNB");
				System.out.println("");
				System.out.println("     9-  Dr. Manish Gupta- DM");
				System.out.println("");
				System.out.println("     10- Dr. Saleem Naik- DNB");
				System.out.println("");
				System.out.print(" Enter Any One Doctor Name From Above List Whose Appointment You Want : ");
				String doctor_name = br.readLine();
				System.out.println("");
				System.out.print(" Enter Date When You Want To Schedule Appointment With Doctor In This Format - (dd/mm/yyyy) : ");
				String sc_date = br.readLine();
				if(sc_date.length()==10)
				{
					
				}
				else
				{
					System.out.println("");
					System.out.println(" Sorry You Entered Invalid Date !!! ");
					System.out.println(" Please Try Again ...");
					continue ;
				}
				System.out.println("");
				System.out.println("          --> Payment-Options : Phonepe/G-pay/Paytm/Amazon-pay/Cash-on-treatment ");
				System.out.println("");
				System.out.print(" Enter Payment Option From Above List : ");
				String pay_opt = br.readLine();
				System.out.println("");
				System.out.print(" Enter Transaction-ID : ");
				String trans_id = br.readLine();
				System.out.println("");
				
				
				Users_Details st = new Users_Details(fname , lname , age , gender , phone , address , dob , prev_attend , email , doctor_name , sc_date , pay_opt , trans_id);
				boolean answer = User_Dao.insertUserToDB(st);
				
				if(answer)
				{
					System.out.println("");
					System.out.println("***********************************************************************************************************************************************************************");
					System.out.println("");
					System.out.println(" Congratulation !!! Details will submitted successfully ...");
					System.out.println("");
					System.out.println("***********************************************************************************************************************************************************************");
					System.out.println("");
				}
				
				else
				{
					System.out.println("");
					System.out.println(" Something went wrong ... ");
					System.out.println("");
				}
				System.out.println(st);
				System.out.println("");
				System.out.print(" Press Any Number From 0-9 For Main Menu : ");
				int d = Integer.parseInt(br.readLine());
				System.out.println("");
				System.out.println("***********************************************************************************************************************************************************************");
				System.out.println("");
				if(d==9)
				{
				
					continue ;
				}
				else
				{
					
				}
				
				
			}
			else if(c==2)
			{
				
				System.out.println("");
				System.out.println("***********************************************************************************************************************************************************************");
				System.out.println("");
				System.out.print(" Enter Phone_Number To Cancelled Appointment Which is Scheduled With Doctor : +91-");
				String phone_No= br.readLine();
				
				boolean f = User_Dao.removeAppointment(phone_No);
				if(f)
				{
					System.out.println("");
					System.out.println(" Congratulations !!! Your Appointment Will Be Cancelled Successfully ...");
					System.out.println("");
					System.out.println("***********************************************************************************************************************************************************************");
					System.out.println("");
					
				}
				else
				{
					System.out.println("");
				}
				
				System.out.print(" Press Any Number From 0-9 For Main Menu : ");
				int d = Integer.parseInt(br.readLine());
				System.out.println("");
				System.out.println("***********************************************************************************************************************************************************************");
				System.out.println("");
				if(d==9)
				{
				
					continue ;
				}
				else
				{
					
				}
			}
			else if(c==3)
			{
				
				User_Dao.showDoctorList();
				System.out.println("");
				System.out.print(" Press Any Number From 0-9 For Main Menu : ");
				int d = Integer.parseInt(br.readLine());
				System.out.println("");
				System.out.println("***********************************************************************************************************************************************************************");
				System.out.println("");
				if(d==9)
				{
				
					continue ;
				}
				else
				{
					
				}
			}
			else if(c==4)
			{	
				System.out.print(" Enter Phone_Number To Show Your Appointment Details : +91-");
				String phone_No= br.readLine();
				boolean f = User_Dao.showYourAppointmentDetails(phone_No);
				if(f)
				{
					System.out.println("");
					System.out.print(" Press Any Number From 0-9 For Main Menu : ");
					int d = Integer.parseInt(br.readLine());
					System.out.println("");
					System.out.println("***********************************************************************************************************************************************************************");
					System.out.println("");
					if(d==9)
					{
					
						continue ;
					}
					else
					{
						
					}
				}
				else
				{
					System.out.println("");
				}
			}
			else if(c==5)
			{
				// Exit ...
				break;
			}
			else
			{
				System.out.println("");
				System.out.println(" |--> Invalid Key ... Please Try Again !!!");
				System.out.println("");
				System.out.println("***********************************************************************************************************************************************************************");
			}
		}
		System.out.println("");
		System.out.println("***********************************************************************************************************************************************************************");
		System.out.println("");
		System.out.println(" 					||-->  ❤❤❤ THANKYOU FOR USING OUR APPLICATION ❤❤❤  <--||");
		System.out.println(" 								! SEE YOU SOON !");
		System.out.println("");
		System.out.println("***********************************************************************************************************************************************************************");
		System.out.println("");

	}

}
