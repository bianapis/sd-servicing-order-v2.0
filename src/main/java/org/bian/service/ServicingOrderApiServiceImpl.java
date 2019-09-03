/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ServicingOrderApiServiceImpl implements ServicingOrderApiService {

	public SDServicingOrderActivateOutputModel activate(SDServicingOrderActivateInputModel request){
		return JsonReader.read("activate-SDServicingOrderActivateOutputModel.json",new TypeReference<SDServicingOrderActivateOutputModel>(){});
	}
	
	public SDServicingOrderConfigureOutputModel configure(String sdReferenceId, SDServicingOrderConfigureInputModel request){
		return JsonReader.read("configure-SDServicingOrderConfigureOutputModel.json",new TypeReference<SDServicingOrderConfigureOutputModel>(){});
	}
	
	public CRServicingOrderProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureControlInputModel request){
		return JsonReader.read("control-CRServicingOrderProcedureControlOutputModel.json",new TypeReference<CRServicingOrderProcedureControlOutputModel>(){});
	}
	
	public CRServicingOrderProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRServicingOrderProcedureExchangeOutputModel.json",new TypeReference<CRServicingOrderProcedureExchangeOutputModel>(){});
	}
	
	public CRServicingOrderProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRServicingOrderProcedureExecuteOutputModel.json",new TypeReference<CRServicingOrderProcedureExecuteOutputModel>(){});
	}
	
	public SDServicingOrderFeedbackOutputModel feedback(String sdReferenceId, SDServicingOrderFeedbackInputModel request){
		return JsonReader.read("feedback-SDServicingOrderFeedbackOutputModel.json",new TypeReference<SDServicingOrderFeedbackOutputModel>(){});
	}
	
	public CRServicingOrderProcedureInitiateOutputModel initiate(String sdReferenceId, CRServicingOrderProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRServicingOrderProcedureInitiateOutputModel.json",new TypeReference<CRServicingOrderProcedureInitiateOutputModel>(){});
	}
	
	public CRServicingOrderProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureRequestInputModel request){
		return JsonReader.read("request-CRServicingOrderProcedureRequestOutputModel.json",new TypeReference<CRServicingOrderProcedureRequestOutputModel>(){});
	}
	
	public SDServicingOrderRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDServicingOrderRetrieveOutputModel.json",new TypeReference<SDServicingOrderRetrieveOutputModel>(){});
	}
	
	public CRServicingOrderProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRServicingOrderProcedureRetrieveOutputModel.json",new TypeReference<CRServicingOrderProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRServicingOrderProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureUpdateInputModel request){
		return JsonReader.read("update-CRServicingOrderProcedureUpdateOutputModel.json",new TypeReference<CRServicingOrderProcedureUpdateOutputModel>(){});
	}
	
}
