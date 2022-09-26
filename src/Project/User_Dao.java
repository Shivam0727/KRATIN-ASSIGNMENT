package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class User_Dao 
{

	public static boolean insertUserToDB(Users_Details st) 
	{
		boolean f = false;
		try
		{
			Connection con = Connection_generator.createC();
			
			String c = " create table if not exists Appointment_Details(ID int not null auto_increment primary key , FIRST_NAME varchar(30) , LAST_NAME varchar(30) , AGE int(3) , GENDER varchar(10) , PHONE_NUMBER Varchar(15) ,   ADDRESS varchar(50) , DATE_OF_BIRTH varchar(20) , PREVIOUS_ATTENDED varchar(10) , EMAIL varchar(50) , DOCTOR_NAME varchar (50) , APPOITMENT_DATE varchar(30)  , FEES_TYPE varchar(30) , TRANSACTION_ID varchar(50) ) ";
			Statement stmt = con.createStatement();
			stmt.execute(c);			
			String q = "insert into Appointment_Details(FIRST_NAME , LAST_NAME , AGE , GENDER , PHONE_NUMBER ,  ADDRESS , DATE_OF_BIRTH , PREVIOUS_ATTENDED , EMAIL , DOCTOR_NAME , APPOITMENT_DATE , FEES_TYPE , TRANSACTION_ID) values(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getFname());
			pstmt.setString(2, st.getLname());
			pstmt.setInt(3, st.getAge());
			pstmt.setString(4, st.getGender());
			pstmt.setString(5, st.getPhone_no());
			pstmt.setString(6, st.getAddress());
			pstmt.setString(7, st.getDob());
			pstmt.setString(8, st.getPrev_attend());
			pstmt.setString(9, st.getEmail());
			pstmt.setString(10, st.getDoctor_name());
			pstmt.setString(11, st.getAppointment_date());
			pstmt.setString(12, st.getFees());
			pstmt.setString(13, st.getTrans_id());
			pstmt.executeUpdate();
			f=true;
		} 
		catch (Exception e)
		{
			System.out.println("Something Wents To Wrong ... Please Try Again !!!");
		}
		return f;
	}
	
	public static boolean removeAppointment(String phone_No) 
	{
		boolean f = false;
		try
		{
			Connection con = Connection_generator.createC();

			String q = "delete from Appointment_Details where PHONE_NUMBER = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, phone_No);
			int result = pstmt.executeUpdate();
			if(result==0)
			{
				System.out.println("");
				System.out.println(" 		|--> Sorry ... Your Record is Not Found !!!  <--|");
			}
			else
			{
				f=true;
			}
		}
		catch (Exception e)
		{
			System.out.println(" Something Went To Wrong ...");
		}
		return f;
	}

	public static void showDoctorList() 
	{
		System.out.println("");
		System.out.println("***********************************************************************************************************************************************************************");
		System.out.println("");
		System.out.println("  					 --> LIST OF SPECIALIST DOCTOR : ");
		System.out.println("");
		System.out.println("***********************************************************************************************************************************************************************");
		System.out.println("");
		System.out.println("\n -> Doctor-1 :\n\n"+
				 " Dr. Amit Vatkar- DNB\r\n"
				+ " PEDIATRIC NEUROLOGY , NAVI MUMBAI\r\n"
				+ " English, Hindi, Marathi\r\n"
				+ " Experience 9 Yrs\r\n"
				+ " You Pay : 1500 Rs\r\n"
				+" For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 750 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-2 :\n\n"
				+ " Dr. Rahul Gupta- DM\r\n"
				+ " CARDIOLOGY , NAVI MUMBAI\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 19 Yrs\r\n"
				+ " You Pay : 2000 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 1000 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-3 :\n\n"
				+ " Dr. Chandrashekhar Kulkarni- M.Ch\r\n"
				+ " CARDIO VASCULAR THORACIC SURGEON , MUMBAI\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 19 Yrs\r\n"
				+ " You Pay : 1800 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 900 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-4 :\n\n"
				+ " Dr. Gaurav Gupta- M.Ch\r\n"
				+ " CARDIO VASCULAR THORACIC SURGEON , DELHI\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 15 Yrs\r\n"
				+ " You Pay : 1000 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 500 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-5 :\n\n"
				+ " Dr. Prajct Sao- MD\r\n"
				+ " DERMATOLOGY , MUMBAI\r\n"
				+ " English, Hindi, Marathi\r\n"
				+ " Experience 16 Yrs\r\n"
				+ " You Pay : 1000 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 500 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-6\n\n :"
				+ " Dr. Abhishek Arun Jaiswal- MD Med.\r\n"
				+ " DIABETOLOGY , LUCKNOW 1\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 10 Yrs\r\n"
				+ " You Pay : 400 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 200 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-7 :\n\n"
				+ " Dr. Paras Agarwal- MD\r\n"
				+ " DIABETOLOGY , DELHI\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 13 Yrs\r\n"
				+ " You Pay : 1000 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 500 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-8 :\n\n"
				+ " Dr. Sandeep Cheruku- DNB\r\n"
				+ " DIABETOLOGY , HYDERABAD\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 10 Yrs\r\n"
				+ " You Pay : 400 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 200 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-9 :\n\n"
				+ " Dr. Manish Gupta- DM\r\n"
				+ " MEDICAL GASTRO , DELHI\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 12 Yrs\r\n"
				+ " You Pay : 800 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 400 Rs");
		System.out.println("");
		System.out.println("\n -> Doctor-10 :\n\n"
				+ " Dr. Saleem Naik- DNB\r\n"
				+ " SURGICAL GASTRO , DELHI\r\n"
				+ " English, Hindi\r\n"
				+ " Experience 18 Yrs\r\n"
				+ " You Pay : 1500 Rs\r\n"
				+ " For Old Age Group Above 55 yr First Check-up is Free and From Second Check-up Discounted Price : 750 Rs");
		System.out.println("");
		System.out.println("***********************************************************************************************************************************************************************");
		System.out.println("");
	}

	public static boolean showYourAppointmentDetails(String phone_No) 
	{
		boolean f = false;
		try
		{

			Connection con = Connection_generator.createC();
			String q =  "Select FIRST_NAME , LAST_NAME , AGE , GENDER , PHONE_NUMBER , DOCTOR_NAME , APPOITMENT_DATE   from Appointment_Details where PHONE_NUMBER ="+phone_No;			
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			
			
			while(set.next())
			{
				System.out.println("");
				System.out.println("*****************************************************************************");
				System.out.println("");
				System.out.println("	|-->  YOUR APPOINTMENT DETAILS : ");
				System.out.println("");
				System.out.println("*****************************************************************************");
				System.out.println("");
				
				String fname = set.getString(1);
				String lname = set.getString(2);
				String age = set.getString(3);
				String gender = set.getString(4);
				String phoneno = set.getString(5);
				String doctor_name = set.getString(6);
				String appoitment_date = set.getString(7);
				
				
				System.out.println("       First Name : "+fname);
				System.out.println("       Last Name : "+lname);
				System.out.println("       Age : "+age);
				System.out.println("       Gender : "+gender);
				System.out.println("       Phone Number : "+phoneno);
				System.out.println("       Doctor Name : "+doctor_name);
				System.out.println("       Appointment Date : "+appoitment_date);
				System.out.println("");
				System.out.println("*****************************************************************************");
			}
			
		
				f= true ;
		}
		catch (Exception e)
		{
			System.out.println(" Something Wents To Wrong ... Please Try Again !!!");
		}
		return f ;
	}
}


