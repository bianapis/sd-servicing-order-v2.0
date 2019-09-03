/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ServicingOrderApiService {

	SDServicingOrderActivateOutputModel activate(SDServicingOrderActivateInputModel request);
	
	SDServicingOrderConfigureOutputModel configure(String sdReferenceId, SDServicingOrderConfigureInputModel request);
	
	CRServicingOrderProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureControlInputModel request);
	
	CRServicingOrderProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureExchangeInputModel request);
	
	CRServicingOrderProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureExecuteInputModel request);
	
	SDServicingOrderFeedbackOutputModel feedback(String sdReferenceId, SDServicingOrderFeedbackInputModel request);
	
	CRServicingOrderProcedureInitiateOutputModel initiate(String sdReferenceId, CRServicingOrderProcedureInitiateInputModel request);
	
	CRServicingOrderProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureRequestInputModel request);
	
	SDServicingOrderRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRServicingOrderProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRServicingOrderProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingOrderProcedureUpdateInputModel request);
	
}
