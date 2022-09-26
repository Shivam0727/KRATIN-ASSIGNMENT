package Project;

public class Users_Details 
{
	private int sr_no ;
	private String fname ;
	private String lname ;
	private int age ;
	private String gender ;
	private String phone_no ;
	private String address ;
	private String dob ;
	private String prev_attend ;
	private String email ;
	private String doctor_name ;
	private String appointment_date ;
	private String fees ;
	private String trans_id ;
	public Users_Details(String fname, String lname, int age, String gender, String phone_no, String address,
			String dob, String prev_attend, String email, String doctor_name, String appointment_date, String fees,
			String trans_id) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.phone_no = phone_no;
		this.address = address;
		this.dob = dob;
		this.prev_attend = prev_attend;
		this.email = email;
		this.doctor_name = doctor_name;
		this.appointment_date = appointment_date;
		this.fees = fees;
		this.trans_id = trans_id;
	}
	
	
	public Users_Details(int sr_no, String fname, String lname, int age, String gender, String phone_no, String address,
			String dob, String prev_attend, String email, String doctor_name, String appointment_date, String fees,
			String trans_id) {
		super();
		this.sr_no = sr_no;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.phone_no = phone_no;
		this.address = address;
		this.dob = dob;
		this.prev_attend = prev_attend;
		this.email = email;
		this.doctor_name = doctor_name;
		this.appointment_date = appointment_date;
		this.fees = fees;
		this.trans_id = trans_id;
	}


	protected String getTrans_id() {
		return trans_id;
	}
	protected void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	public int getSr_no() {
		return sr_no;
	}
	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPrev_attend() {
		return prev_attend;
	}
	public void setPrev_attend(String prev_attend) {
		this.prev_attend = prev_attend;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getAppointment_date() {
		return appointment_date;
	}
	public void setAppointment_date(String appointment_date) {
		this.appointment_date = appointment_date;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	
	
	
	public Users_Details() {
		super();
	}
	@Override
	public String toString() {
		return "Users_Details [  First Name = " + fname + " , Last Name = " + lname + " , Age = " + age + " , Gender = "
				+ gender + " , Phone Number = " + phone_no + " , Address = " + address + " , Date Of Birth = " + dob + " , Have You Attended Any Appointment Previously = "
				+ prev_attend + " , Email = " + email + " , Doctor Name = " + doctor_name + "  , Appointment Date = "
				+ appointment_date + " , Fees-Type = " + fees +" , Transaction-ID "+ trans_id + " ]";
	}


	public Users_Details(String phone_no) {
		super();
		this.phone_no = phone_no;
	}
	
	
}
