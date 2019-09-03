package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureUpdateOutputModel
 */
public class CRServicingOrderProcedureUpdateOutputModel   {
  private String servicingOrderProcedureUpdateActionTaskReference = null;

  private Object servicingOrderProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return servicingOrderProcedureUpdateActionTaskReference
  **/

  public String getServicingOrderProcedureUpdateActionTaskReference() {
    return servicingOrderProcedureUpdateActionTaskReference;
  }

  public void setServicingOrderProcedureUpdateActionTaskReference(String servicingOrderProcedureUpdateActionTaskReference) {
    this.servicingOrderProcedureUpdateActionTaskReference = servicingOrderProcedureUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

