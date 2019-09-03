package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureUpdateInputModel
 */
public class CRServicingOrderProcedureUpdateInputModel   {
  private String servicingOrderServicingSessionReference = null;

  private String servicingOrderProcedureInstanceReference = null;

  private Object servicingOrderProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return servicingOrderProcedureUpdateActionTaskRecord
  **/

  public Object getServicingOrderProcedureUpdateActionTaskRecord() {
    return servicingOrderProcedureUpdateActionTaskRecord;
  }

  public void setServicingOrderProcedureUpdateActionTaskRecord(Object servicingOrderProcedureUpdateActionTaskRecord) {
    this.servicingOrderProcedureUpdateActionTaskRecord = servicingOrderProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

