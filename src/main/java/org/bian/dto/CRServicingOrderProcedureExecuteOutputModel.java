package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureExecuteOutputModel
 */
public class CRServicingOrderProcedureExecuteOutputModel   {
  private String servicingOrderProcedureExecuteActionTaskReference = null;

  private Object servicingOrderProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Order Procedure instance execute service call 
   * @return servicingOrderProcedureExecuteActionTaskReference
  **/

  public String getServicingOrderProcedureExecuteActionTaskReference() {
    return servicingOrderProcedureExecuteActionTaskReference;
  }

  public void setServicingOrderProcedureExecuteActionTaskReference(String servicingOrderProcedureExecuteActionTaskReference) {
    this.servicingOrderProcedureExecuteActionTaskReference = servicingOrderProcedureExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

