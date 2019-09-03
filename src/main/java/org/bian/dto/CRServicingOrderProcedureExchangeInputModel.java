package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureExchangeInputModelServicingOrderProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureExchangeInputModel
 */
public class CRServicingOrderProcedureExchangeInputModel   {
  private String servicingOrderServicingSessionReference = null;

  private String servicingOrderProcedureInstanceReference = null;

  private Object servicingOrderProcedureExchangeActionTaskRecord = null;

  private CRServicingOrderProcedureExchangeInputModelServicingOrderProcedureExchangeActionRequest servicingOrderProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return servicingOrderServicingSessionReference
  **/

  public String getServicingOrderServicingSessionReference() {
    return servicingOrderServicingSessionReference;
  }

  public void setServicingOrderServicingSessionReference(String servicingOrderServicingSessionReference) {
    this.servicingOrderServicingSessionReference = servicingOrderServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing Order Procedure instance 
   * @return servicingOrderProcedureInstanceReference
  **/

  public String getServicingOrderProcedureInstanceReference() {
    return servicingOrderProcedureInstanceReference;
  }

  public void setServicingOrderProcedureInstanceReference(String servicingOrderProcedureInstanceReference) {
    this.servicingOrderProcedureInstanceReference = servicingOrderProcedureInstanceReference;
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
   * Get servicingOrderProcedureExchangeActionRequest
   * @return servicingOrderProcedureExchangeActionRequest
  **/

  public CRServicingOrderProcedureExchangeInputModelServicingOrderProcedureExchangeActionRequest getServicingOrderProcedureExchangeActionRequest() {
    return servicingOrderProcedureExchangeActionRequest;
  }

  public void setServicingOrderProcedureExchangeActionRequest(CRServicingOrderProcedureExchangeInputModelServicingOrderProcedureExchangeActionRequest servicingOrderProcedureExchangeActionRequest) {
    this.servicingOrderProcedureExchangeActionRequest = servicingOrderProcedureExchangeActionRequest;
  }


}

