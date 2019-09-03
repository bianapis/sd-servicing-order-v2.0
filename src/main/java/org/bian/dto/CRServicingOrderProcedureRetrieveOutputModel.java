package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceAnalysis;
import org.bian.dto.CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceRecord;
import org.bian.dto.CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureRetrieveOutputModel
 */
public class CRServicingOrderProcedureRetrieveOutputModel   {
  private CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceRecord servicingOrderProcedureInstanceRecord = null;

  private String servicingOrderProcedureRetrieveActionTaskReference = null;

  private Object servicingOrderProcedureRetrieveActionTaskRecord = null;

  private String servicingOrderProcedureRetrieveActionResponse = null;

  private CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceReportRecord servicingOrderProcedureInstanceReportRecord = null;

  private CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceAnalysis servicingOrderProcedureInstanceAnalysis = null;


  /**
   * Get servicingOrderProcedureInstanceRecord
   * @return servicingOrderProcedureInstanceRecord
  **/

  public CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceRecord getServicingOrderProcedureInstanceRecord() {
    return servicingOrderProcedureInstanceRecord;
  }

  public void setServicingOrderProcedureInstanceRecord(CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceRecord servicingOrderProcedureInstanceRecord) {
    this.servicingOrderProcedureInstanceRecord = servicingOrderProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing Order Procedure instance retrieve service call 
   * @return servicingOrderProcedureRetrieveActionTaskReference
  **/

  public String getServicingOrderProcedureRetrieveActionTaskReference() {
    return servicingOrderProcedureRetrieveActionTaskReference;
  }

  public void setServicingOrderProcedureRetrieveActionTaskReference(String servicingOrderProcedureRetrieveActionTaskReference) {
    this.servicingOrderProcedureRetrieveActionTaskReference = servicingOrderProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return servicingOrderProcedureRetrieveActionTaskRecord
  **/

  public Object getServicingOrderProcedureRetrieveActionTaskRecord() {
    return servicingOrderProcedureRetrieveActionTaskRecord;
  }

  public void setServicingOrderProcedureRetrieveActionTaskRecord(Object servicingOrderProcedureRetrieveActionTaskRecord) {
    this.servicingOrderProcedureRetrieveActionTaskRecord = servicingOrderProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return servicingOrderProcedureRetrieveActionResponse
  **/

  public String getServicingOrderProcedureRetrieveActionResponse() {
    return servicingOrderProcedureRetrieveActionResponse;
  }

  public void setServicingOrderProcedureRetrieveActionResponse(String servicingOrderProcedureRetrieveActionResponse) {
    this.servicingOrderProcedureRetrieveActionResponse = servicingOrderProcedureRetrieveActionResponse;
  }


  /**
   * Get servicingOrderProcedureInstanceReportRecord
   * @return servicingOrderProcedureInstanceReportRecord
  **/

  public CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceReportRecord getServicingOrderProcedureInstanceReportRecord() {
    return servicingOrderProcedureInstanceReportRecord;
  }

  public void setServicingOrderProcedureInstanceReportRecord(CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceReportRecord servicingOrderProcedureInstanceReportRecord) {
    this.servicingOrderProcedureInstanceReportRecord = servicingOrderProcedureInstanceReportRecord;
  }


  /**
   * Get servicingOrderProcedureInstanceAnalysis
   * @return servicingOrderProcedureInstanceAnalysis
  **/

  public CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceAnalysis getServicingOrderProcedureInstanceAnalysis() {
    return servicingOrderProcedureInstanceAnalysis;
  }

  public void setServicingOrderProcedureInstanceAnalysis(CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceAnalysis servicingOrderProcedureInstanceAnalysis) {
    this.servicingOrderProcedureInstanceAnalysis = servicingOrderProcedureInstanceAnalysis;
  }


}

