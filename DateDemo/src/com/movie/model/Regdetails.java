package com.movie.model;
// Generated Mar 31, 2014 2:57:31 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Regdetails generated by hbm2java
 */
@Entity
@Table(name="regdetails"
    ,catalog="moviedb"
)
public class Regdetails  implements java.io.Serializable {


     private String uname;
     private String pwd;
     private String firstName;
     private String lastName;
     private String email;
     private String mobNo;
     private String userType;
     private Date regdate;

    public Regdetails() {
    }

	
    public Regdetails(String uname, String pwd, Date regdate) {
        this.uname = uname;
        this.pwd = pwd;
        this.regdate = regdate;
    }
    public Regdetails(String uname, String pwd, String firstName, String lastName, String email, String mobNo, String userType, Date regdate) {
       this.uname = uname;
       this.pwd = pwd;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.mobNo = mobNo;
       this.userType = userType;
       this.regdate = regdate;
    }
   
     @Id 

    
    @Column(name="uName", unique=true, nullable=false, length=15)
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }

    
    @Column(name="pwd", nullable=false, length=30)
    public String getPwd() {
        return this.pwd;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
    @Column(name="firstName", length=40)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="lastName", length=40)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="email", length=40)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="mobNo", length=15)
    public String getMobNo() {
        return this.mobNo;
    }
    
    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    
    @Column(name="userType", length=10)
    public String getUserType() {
        return this.userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="regdate", nullable=false, length=19)
    public Date getRegdate() {
        return this.regdate;
    }
    
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }


	@Override
	public String toString() {
		return "Regdetails [uname=" + uname + ", pwd=" + pwd + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobNo=" + mobNo + ", userType=" + userType + ", regdate="
				+ regdate + "]";
	}




}

