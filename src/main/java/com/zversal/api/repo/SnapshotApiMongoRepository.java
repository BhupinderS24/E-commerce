package com.zversal.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zversal.api.model.CompanyInfoModel;
import com.zversal.api.model.projection.SnapshotApi;
/**
 *This interface extends Mongo specific Repository interface,specifying the domain type as ComapnyInfoModel and the id type as String
 *annotation Repository Indicates that class is a "Repository", originally defined by Domain-Driven Design (Evans, 2003) as "a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects"
 * @author Bhupinder
 *
 */ 
@Repository
public interface SnapshotApiMongoRepository extends MongoRepository<CompanyInfoModel,String>{
	
	/**
	 *this method find the document which contains the ticker specified in parameter
	 * @param ticker of type String is excpected by this method
	 * @return the entity of type EarningApi
	 *  
	 */
SnapshotApi findByTicker(String ticker);	
}
