package com.jwt.hibernate.bean;

public class User {
	private String user_Id;
	private String Name;
	private String Password;
	private String Dob;
	private String Pob;
	private String gender;
	private String motherlang;
	private String caste;
	private String education;
	private String occupation;
	private String annualincome;
	private String state;
	private String phoneno;
	private String status;
	private String religion;
	private String country;
	private String residentstatus;
	private String citizenship;
	private String employement;
	private String emailid;
	private String city;

	public String getId() {
		return user_Id;
	}

	public void setId(String user_id) {
		this.user_Id = user_id;
	} 
	
	public String getUserName() {
		return Name;
	}

	public void setUserName(String userName) {
		this.Name = userName;
	}

	public String getUserPassword() {
		return Password;
	}

	public void setUserPassword(String userPassword) {
		this.Password = userPassword;
	}
	
	public String getGender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	public String getUserDob() {
		return Dob;
	}

	public void setUserDob(String userDob) {
		this.Dob = userDob;
	}

	public String getUserPob() {
		return Pob;
	}

	public void setUserPob(String userPob) {
		this.Pob = userPob;
	}

	public String getMotherlang() {
		return motherlang;
	}

	public void setMotherlang(String motherlang) {
		this.motherlang = motherlang;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getResidentstatus() {
		return residentstatus;
	}

	public void setResidentstatus(String residentstatus) {
		this.residentstatus = residentstatus;
	}

	public String getEmployement() {
		return employement;
	}

	public void setEmployement(String employement) {
		this.employement = employement;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
