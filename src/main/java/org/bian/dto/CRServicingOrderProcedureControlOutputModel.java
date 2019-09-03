package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureControlOutputModel
 */
public class CRServicingOrderProcedureControlOutputModel   {
  private String servicingOrderProcedureControlActionTaskReference = null;

  private Object servicingOrderProcedureControlActionTaskRecord = null;

  private String servicingOrderProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Order Procedure instance control processing service call 
   * @return servicingOrderProcedureControlActionTaskReference
  **/

  public String getServicingOrderProcedureControlActionTaskReference() {
    return servicingOrderProcedureControlActionTaskReference;
  }

  public void setServicingOrderProcedureControlActionTaskReference(String servicingOrderProcedureControlActionTaskReference) {
    this.servicingOrderProcedureControlActionTaskReference = servicingOrderProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return servicingOrderProcedureControlActionTaskRecord
  **/

  public Object getServicingOrderProcedureControlActionTaskRecord() {
    return servicingOrderProcedureControlActionTaskRecord;
  }

  public void setServicingOrderProcedureControlActionTaskRecord(Object servicingOrderProcedureControlActionTaskRecord) {
    this.servicingOrderProcedureControlActionTaskRecord = servicingOrderProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return servicingOrderProcedureControlActionResponse
  **/

  public String getServicingOrderProcedureControlActionResponse() {
    return servicingOrderProcedureControlActionResponse;
  }

  public void setServicingOrderProcedureControlActionResponse(String servicingOrderProcedureControlActionResponse) {
    this.servicingOrderProcedureControlActionResponse = servicingOrderProcedureControlActionResponse;
  }


}

