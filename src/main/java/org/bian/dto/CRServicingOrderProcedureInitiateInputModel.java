package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureInitiateInputModel
 */
public class CRServicingOrderProcedureInitiateInputModel   {
  private String servicingOrderServicingSessionReference = null;

  private Object servicingOrderProcedureInitiateActionRecord = null;

  private String servicingOrderProcedureInstanceStatus = null;

  private CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecord servicingOrderProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return servicingOrderProcedureInitiateActionRecord
  **/

  public Object getServicingOrderProcedureInitiateActionRecord() {
    return servicingOrderProcedureInitiateActionRecord;
  }

  public void setServicingOrderProcedureInitiateActionRecord(Object servicingOrderProcedureInitiateActionRecord) {
    this.servicingOrderProcedureInitiateActionRecord = servicingOrderProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Servicing Order Procedure instance (e.g. initialised, pending, active) 
   * @return servicingOrderProcedureInstanceStatus
  **/

  public String getServicingOrderProcedureInstanceStatus() {
    return servicingOrderProcedureInstanceStatus;
  }

  public void setServicingOrderProcedureInstanceStatus(String servicingOrderProcedureInstanceStatus) {
    this.servicingOrderProcedureInstanceStatus = servicingOrderProcedureInstanceStatus;
  }


  /**
   * Get servicingOrderProcedureInstanceRecord
   * @return servicingOrderProcedureInstanceRecord
  **/

  public CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecord getServicingOrderProcedureInstanceRecord() {
    return servicingOrderProcedureInstanceRecord;
  }

  public void setServicingOrderProcedureInstanceRecord(CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecord servicingOrderProcedureInstanceRecord) {
    this.servicingOrderProcedureInstanceRecord = servicingOrderProcedureInstanceRecord;
  }


}

