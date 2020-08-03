package com.dennislee.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="language")
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Size(min = 2, max = 20)
	private String name;
	
	@Column
	@Size(min = 2, max = 20)
	private String creator;
	
	@Column
	@NotNull
	private double currentVersion;
	
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
    
    // This will will auto populate the current date, for the object's created date field, prior to the object being created
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
 // This will will auto populate the current date, for the object's updated date field, prior to the object updated,
 // This will also updated the language currentVersion by 0.1 for every time it is updated
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	public Language() {
	}

	public Language(@Size(min = 2, max = 20) String name, @Size(min = 2, max = 20) String creator) {
		super();
		this.name = name;
		this.creator = creator;
	}

	public Language(@Size(min = 2, max = 20) String name, @Size(min = 2, max = 20) String creator,
			@NotNull double currentVersion) {
		super();
		this.name = name;
		this.creator = creator;
		this.currentVersion = currentVersion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public double getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(double currentVersion) {
		this.currentVersion = currentVersion;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
