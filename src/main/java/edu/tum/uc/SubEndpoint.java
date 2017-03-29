package edu.tum.uc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import edu.tum.cal.sub.SubNumbersRequest;
import edu.tum.cal.sub.SubNumbersResponse;

@Endpoint
public class SubEndpoint {
	private static final String NAMESPACE_URI = "http://sub.cal.tum.edu";
	
	private SubServiceImpl subService = null;
	
	@Autowired
	public SubEndpoint(SubServiceImpl subService){
		this.subService = subService;
	}
	
	@PayloadRoot(localPart = "SubNumbersRequest", namespace = NAMESPACE_URI)
	@ResponsePayload
	public SubNumbersResponse add(@RequestPayload SubNumbersRequest numbers){
		SubNumbersResponse _return = new SubNumbersResponse();
		double r = this.subService.sub(Double.parseDouble(numbers.getN1()), Double.parseDouble(numbers.getN2()));
		_return.setN1(String.valueOf(r));
		return _return;
	}
}
