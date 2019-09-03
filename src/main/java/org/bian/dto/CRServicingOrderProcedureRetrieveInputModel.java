package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceAnalysis;
import org.bian.dto.CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureRetrieveInputModel
 */
public class CRServicingOrderProcedureRetrieveInputModel   {
  private Object servicingOrderProcedureRetrieveActionTaskRecord = null;

  private String servicingOrderProcedureRetrieveActionRequest = null;

  private CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceReportRecord servicingOrderProcedureInstanceReportRecord = null;

  private CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceAnalysis servicingOrderProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return servicingOrderProcedureRetrieveActionRequest
  **/

  public String getServicingOrderProcedureRetrieveActionRequest() {
    return servicingOrderProcedureRetrieveActionRequest;
  }

  public void setServicingOrderProcedureRetrieveActionRequest(String servicingOrderProcedureRetrieveActionRequest) {
    this.servicingOrderProcedureRetrieveActionRequest = servicingOrderProcedureRetrieveActionRequest;
  }


  /**
   * Get servicingOrderProcedureInstanceReportRecord
   * @return servicingOrderProcedureInstanceReportRecord
  **/

  public CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceReportRecord getServicingOrderProcedureInstanceReportRecord() {
    return servicingOrderProcedureInstanceReportRecord;
  }

  public void setServicingOrderProcedureInstanceReportRecord(CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceReportRecord servicingOrderProcedureInstanceReportRecord) {
    this.servicingOrderProcedureInstanceReportRecord = servicingOrderProcedureInstanceReportRecord;
  }


  /**
   * Get servicingOrderProcedureInstanceAnalysis
   * @return servicingOrderProcedureInstanceAnalysis
  **/

  public CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceAnalysis getServicingOrderProcedureInstanceAnalysis() {
    return servicingOrderProcedureInstanceAnalysis;
  }

  public void setServicingOrderProcedureInstanceAnalysis(CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceAnalysis servicingOrderProcedureInstanceAnalysis) {
    this.servicingOrderProcedureInstanceAnalysis = servicingOrderProcedureInstanceAnalysis;
  }


}

