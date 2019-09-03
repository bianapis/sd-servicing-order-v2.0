package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureExchangeOutputModel
 */
public class CRServicingOrderProcedureExchangeOutputModel   {
  private String servicingOrderProcedureExchangeActionTaskReference = null;

  private Object servicingOrderProcedureExchangeActionTaskRecord = null;

  private String servicingOrderProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Order Procedure instance exchange service call 
   * @return servicingOrderProcedureExchangeActionTaskReference
  **/

  public String getServicingOrderProcedureExchangeActionTaskReference() {
    return servicingOrderProcedureExchangeActionTaskReference;
  }

  public void setServicingOrderProcedureExchangeActionTaskReference(String servicingOrderProcedureExchangeActionTaskReference) {
    this.servicingOrderProcedureExchangeActionTaskReference = servicingOrderProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return servicingOrderProcedureExchangeActionTaskRecord
  **/

  public Object getServicingOrderProcedureExchangeActionTaskRecord() {
    return servicingOrderProcedureExchangeActionTaskRecord;
  }

  public void setServicingOrderProcedureExchangeActionTaskRecord(Object servicingOrderProcedureExchangeActionTaskRecord) {
    this.servicingOrderProcedureExchangeActionTaskRecord = servicingOrderProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return servicingOrderProcedureExchangeActionResponse
  **/

  public String getServicingOrderProcedureExchangeActionResponse() {
    return servicingOrderProcedureExchangeActionResponse;
  }

  public void setServicingOrderProcedureExchangeActionResponse(String servicingOrderProcedureExchangeActionResponse) {
    this.servicingOrderProcedureExchangeActionResponse = servicingOrderProcedureExchangeActionResponse;
  }


}

