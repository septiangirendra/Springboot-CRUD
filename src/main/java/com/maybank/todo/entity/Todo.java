package com.maybank.todo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="todos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( nullable = false )
	private String user; 
	
	@Column( nullable = false )
	private String description; 
	
	@Column( nullable = false )
	private Date targetDate;
	
	@Column( nullable = false)
	private int starMeter; 
	
	public Todo(String user, String desc, Date targetDate, int starMeter) {
        super();
        this.user = user;
        this.description = desc;
        this.targetDate = targetDate;
        this.starMeter = starMeter; 
    }
	
}
