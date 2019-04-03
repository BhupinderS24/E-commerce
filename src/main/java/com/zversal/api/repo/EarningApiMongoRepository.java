package com.zversal.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.zversal.api.model.CompanyInfoModel;
import com.zversal.api.model.projection.EarningApi;


/**
 *This interface extends Mongo specific Repository interface,specifying the domain type as ComapnyInfoModel and the id type as String 
 * @author Bhupinder
 *
 *@Repository Indicates that class is a "Repository", originally defined by Domain-Driven Design (Evans, 2003) as "a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects"
 */ 
 

@Repository
public interface EarningApiMongoRepository extends MongoRepository<CompanyInfoModel, String> {
	/**
     * This method will retrieve the CompanyInfoModel details pertaining to
     * the ticker passed in.
     * 
     * @param ticker the unique id of the Document to search and retrieve.
     *            
     * @return an instance of {@link CompanyInfoModel} but only field with specified in {@link Earning Api} Interface .
     *       
     */
	EarningApi findByTicker(String ticker);
}
