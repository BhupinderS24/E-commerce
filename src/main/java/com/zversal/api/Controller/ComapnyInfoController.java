package com.zversal.api.Controller;


import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zversal.api.model.projection.EarningApi;
import com.zversal.api.model.projection.SnapshotApi;
import com.zversal.api.repo.EarningApiMongoRepository;
import com.zversal.api.repo.SnapshotApiMongoRepository;

/**
 * @author Bhupinder
 * @RestController takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON response.
 *
 */
@RestController
public class ComapnyInfoController {

	@Autowired
	private EarningApiMongoRepository earningRepository;
	@Autowired
    private SnapshotApiMongoRepository snapshotRepository;

	@RequestMapping(value = "/earning/{ticker}", method = RequestMethod.GET)
	public EarningApi getEarning(@PathVariable String ticker) {
		 return earningRepository.findByTicker(ticker);
		/*
		 * if (company != null) { return "No document" } else { return
		 * "User not found."; }
		 */
		
	}
	@RequestMapping(value="/snapshot/{ticker}",method=RequestMethod.GET)
	public SnapshotApi getSnapshot(@PathVariable String ticker) {
		return snapshotRepository.findByTicker(ticker);
		
	}
}
