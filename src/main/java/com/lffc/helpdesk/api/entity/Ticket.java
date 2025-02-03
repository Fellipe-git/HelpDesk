package com.lffc.helpdesk.api.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.lffc.helpdesk.api.enums.PriorityEnum;
import com.lffc.helpdesk.api.enums.StatusEnum;

@Document
public class Ticket {

	@Id
	private String Id;
	
	@DBRef(lazy =true)
	private User user;
	
	private Date date;
	
	private String title;
	
	private Integer number;
	
	private StatusEnum status;
	
	private PriorityEnum priority;
	
	@DBRef(lazy =true)
	private User assignedUser;
	
	private String description;
	
	private String image; 
	
	//private List<...> changes;
	
	
	
	
	
	
	
}
