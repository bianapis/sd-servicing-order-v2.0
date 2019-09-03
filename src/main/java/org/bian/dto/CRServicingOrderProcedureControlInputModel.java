package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureControlInputModelServicingOrderProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureControlInputModel
 */
public class CRServicingOrderProcedureControlInputModel   {
  private String servicingOrderServicingSessionReference = null;

  private String servicingOrderProcedureInstanceReference = null;

  private Object servicingOrderProcedureControlActionTaskRecord = null;

  private CRServicingOrderProcedureControlInputModelServicingOrderProcedureControlActionRequest servicingOrderProcedureControlActionRequest = null;


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
   * Get servicingOrderProcedureControlActionRequest
   * @return servicingOrderProcedureControlActionRequest
  **/

  public CRServicingOrderProcedureControlInputModelServicingOrderProcedureControlActionRequest getServicingOrderProcedureControlActionRequest() {
    return servicingOrderProcedureControlActionRequest;
  }

  public void setServicingOrderProcedureControlActionRequest(CRServicingOrderProcedureControlInputModelServicingOrderProcedureControlActionRequest servicingOrderProcedureControlActionRequest) {
    this.servicingOrderProcedureControlActionRequest = servicingOrderProcedureControlActionRequest;
  }


}

