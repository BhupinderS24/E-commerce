package com.zversal.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zversal.api.model.projection.EarningApi;
import com.zversal.api.model.projection.SnapshotApi;
import com.zversal.api.repo.EarningApiMongoRepository;
import com.zversal.api.repo.SnapshotApiMongoRepository;

/**
 * This class exposes the REST API for the system.
 * @author Bhupinder
 * @RestController takes care of mapping request data to the defined request
 *                 handler method. Once response body is generated from the
 *                 handler method, it converts it to JSON response.
 *
 */
@RestController
public class ComapnyInfoController {

	@Autowired
	private EarningApiMongoRepository earningRepository;
	@Autowired
	private SnapshotApiMongoRepository snapshotRepository;

	/**
	 * This method will be used to get earning
	 * @param ticker unique id
	 * @return an instance of EarningApi
	 */
	@RequestMapping(value = "/earning/{ticker}", method = RequestMethod.GET)
	public EarningApi getEarning(@PathVariable String ticker) { 
	    return earningRepository.findByTicker(ticker);
		
	}
	/**
	 * This method will be used to get snapshot
	 * @param ticker the unique id of the Document
	 * @return an instance of SnapshotApi
	 */
	@RequestMapping(value = "/snapshot/{ticker}", method = RequestMethod.GET)
	public SnapshotApi getSnapshot(@PathVariable String ticker) {
		return snapshotRepository.findByTicker(ticker);
	}
}
