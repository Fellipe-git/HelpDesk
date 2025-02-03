package com.lffc.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lffc.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	Iterable<ChangeStatus> findByTicketAndIdOrderByDateChangeStatusDesc(String ticketId );
}
