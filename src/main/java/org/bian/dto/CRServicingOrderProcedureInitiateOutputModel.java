package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureInitiateOutputModel
 */
public class CRServicingOrderProcedureInitiateOutputModel   {
  private String servicingOrderProcedureInstanceReference = null;

  private String servicingOrderProcedureInitiateActionReference = null;

  private Object servicingOrderProcedureInitiateActionRecord = null;

  private String servicingOrderProcedureInstanceStatus = null;

  private CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecord servicingOrderProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return servicingOrderProcedureInitiateActionReference
  **/

  public String getServicingOrderProcedureInitiateActionReference() {
    return servicingOrderProcedureInitiateActionReference;
  }

  public void setServicingOrderProcedureInitiateActionReference(String servicingOrderProcedureInitiateActionReference) {
    this.servicingOrderProcedureInitiateActionReference = servicingOrderProcedureInitiateActionReference;
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

  public CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecord getServicingOrderProcedureInstanceRecord() {
    return servicingOrderProcedureInstanceRecord;
  }

  public void setServicingOrderProcedureInstanceRecord(CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecord servicingOrderProcedureInstanceRecord) {
    this.servicingOrderProcedureInstanceRecord = servicingOrderProcedureInstanceRecord;
  }


}

