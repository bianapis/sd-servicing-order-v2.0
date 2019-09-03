package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureRequestOutputModel
 */
public class CRServicingOrderProcedureRequestOutputModel   {
  private String servicingOrderProcedureRequestActionTaskReference = null;

  private Object servicingOrderProcedureRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Order Procedure instance request service call 
   * @return servicingOrderProcedureRequestActionTaskReference
  **/

  public String getServicingOrderProcedureRequestActionTaskReference() {
    return servicingOrderProcedureRequestActionTaskReference;
  }

  public void setServicingOrderProcedureRequestActionTaskReference(String servicingOrderProcedureRequestActionTaskReference) {
    this.servicingOrderProcedureRequestActionTaskReference = servicingOrderProcedureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return servicingOrderProcedureRequestActionTaskRecord
  **/

  public Object getServicingOrderProcedureRequestActionTaskRecord() {
    return servicingOrderProcedureRequestActionTaskRecord;
  }

  public void setServicingOrderProcedureRequestActionTaskRecord(Object servicingOrderProcedureRequestActionTaskRecord) {
    this.servicingOrderProcedureRequestActionTaskRecord = servicingOrderProcedureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

