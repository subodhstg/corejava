package com.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "halldetails", catalog = "moviedb")
public class Halldetails implements java.io.Serializable {

	private String hallId;
	private String hallName;
	private String hallAddress;
	private String goldtype;
	private Integer goldnoofseats;
	private Integer goldprice;
	private String silvertype;
	private Integer silvernoofseats;
	private Integer silverprice;
	private String platinumtype;
	private Integer platinumnoofseats;
	private Integer platinumprice;
	private String showTime;
	private String createdBy;
	private String managedBy;
	private String editedBy;

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public String getManagedBy() {
		return managedBy;
	}

	public void setManagedBy(String managedBy) {
		this.managedBy = managedBy;
	}

	public Halldetails() {
	}

	public Halldetails(String hallId) {
		this.hallId = hallId;
	}

	public Halldetails(String hallId, String hallName, String hallAddress,
			String goldtype, Integer goldnoofseats, Integer goldprice,
			String silvertype, Integer silvernoofseats, Integer silverprice,
			String platinumtype, Integer platinumnoofseats,
			Integer platinumprice, String showTime, String createdBy) {
		this.hallId = hallId;
		this.hallName = hallName;
		this.hallAddress = hallAddress;
		this.goldtype = goldtype;
		this.goldnoofseats = goldnoofseats;
		this.goldprice = goldprice;
		this.silvertype = silvertype;
		this.silvernoofseats = silvernoofseats;
		this.silverprice = silverprice;
		this.platinumtype = platinumtype;
		this.platinumnoofseats = platinumnoofseats;
		this.platinumprice = platinumprice;
		this.showTime = showTime;
		this.createdBy = createdBy;
	}

	@Id
	@Column(name = "hallId", unique = true, nullable = false, length = 10)
	public String getHallId() {
		return this.hallId;
	}

	public void setHallId(String hallId) {
		this.hallId = hallId;
	}

	@Column(name = "hallName", length = 20)
	public String getHallName() {
		return this.hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	@Column(name = "hallAddress", length = 30)
	public String getHallAddress() {
		return this.hallAddress;
	}

	public void setHallAddress(String hallAddress) {
		this.hallAddress = hallAddress;
	}

	@Column(name = "goldtype", length = 30)
	public String getGoldtype() {
		return this.goldtype;
	}

	public void setGoldtype(String goldtype) {
		this.goldtype = goldtype;
	}

	@Column(name = "goldnoofseats")
	public Integer getGoldnoofseats() {
		return this.goldnoofseats;
	}

	public void setGoldnoofseats(Integer goldnoofseats) {
		this.goldnoofseats = goldnoofseats;
	}

	@Column(name = "goldprice")
	public Integer getGoldprice() {
		return this.goldprice;
	}

	public void setGoldprice(Integer goldprice) {
		this.goldprice = goldprice;
	}

	@Column(name = "silvertype", length = 30)
	public String getSilvertype() {
		return this.silvertype;
	}

	public void setSilvertype(String silvertype) {
		this.silvertype = silvertype;
	}

	@Column(name = "silvernoofseats")
	public Integer getSilvernoofseats() {
		return this.silvernoofseats;
	}

	public void setSilvernoofseats(Integer silvernoofseats) {
		this.silvernoofseats = silvernoofseats;
	}

	@Column(name = "silverprice")
	public Integer getSilverprice() {
		return this.silverprice;
	}

	public void setSilverprice(Integer silverprice) {
		this.silverprice = silverprice;
	}

	@Column(name = "platinumtype", length = 30)
	public String getPlatinumtype() {
		return this.platinumtype;
	}

	public void setPlatinumtype(String platinumtype) {
		this.platinumtype = platinumtype;
	}

	@Column(name = "platinumnoofseats")
	public Integer getPlatinumnoofseats() {
		return this.platinumnoofseats;
	}

	public void setPlatinumnoofseats(Integer platinumnoofseats) {
		this.platinumnoofseats = platinumnoofseats;
	}

	@Column(name = "platinumprice")
	public Integer getPlatinumprice() {
		return this.platinumprice;
	}

	public void setPlatinumprice(Integer platinumprice) {
		this.platinumprice = platinumprice;
	}

	@Column(name = "showTime", length = 20)
	public String getShowTime() {
		return this.showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	@Column(name = "createdBy", length = 20)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
