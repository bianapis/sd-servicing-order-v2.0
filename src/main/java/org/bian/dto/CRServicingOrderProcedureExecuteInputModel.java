package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureExecuteInputModel
 */
public class CRServicingOrderProcedureExecuteInputModel   {
  private String servicingOrderServicingSessionReference = null;

  private String servicingOrderProcedureInstanceReference = null;

  private Object servicingOrderProcedureExecuteActionTaskRecord = null;

  private CRServicingOrderProcedureExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return servicingOrderProcedureExecuteActionTaskRecord
  **/

  public Object getServicingOrderProcedureExecuteActionTaskRecord() {
    return servicingOrderProcedureExecuteActionTaskRecord;
  }

  public void setServicingOrderProcedureExecuteActionTaskRecord(Object servicingOrderProcedureExecuteActionTaskRecord) {
    this.servicingOrderProcedureExecuteActionTaskRecord = servicingOrderProcedureExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRServicingOrderProcedureExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRServicingOrderProcedureExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

