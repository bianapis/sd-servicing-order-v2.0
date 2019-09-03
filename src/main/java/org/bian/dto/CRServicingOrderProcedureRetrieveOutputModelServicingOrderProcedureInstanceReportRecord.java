package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceReportRecord
 */
public class CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceReportRecord   {
  private String servicingOrderProcedureInstanceReportData = null;

  private String servicingOrderProcedureInstanceReportType = null;

  private Object servicingOrderProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return servicingOrderProcedureInstanceReportData
  **/

  public String getServicingOrderProcedureInstanceReportData() {
    return servicingOrderProcedureInstanceReportData;
  }

  public void setServicingOrderProcedureInstanceReportData(String servicingOrderProcedureInstanceReportData) {
    this.servicingOrderProcedureInstanceReportData = servicingOrderProcedureInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return servicingOrderProcedureInstanceReportType
  **/

  public String getServicingOrderProcedureInstanceReportType() {
    return servicingOrderProcedureInstanceReportType;
  }

  public void setServicingOrderProcedureInstanceReportType(String servicingOrderProcedureInstanceReportType) {
    this.servicingOrderProcedureInstanceReportType = servicingOrderProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return servicingOrderProcedureInstanceReport
  **/

  public Object getServicingOrderProcedureInstanceReport() {
    return servicingOrderProcedureInstanceReport;
  }

  public void setServicingOrderProcedureInstanceReport(Object servicingOrderProcedureInstanceReport) {
    this.servicingOrderProcedureInstanceReport = servicingOrderProcedureInstanceReport;
  }


}

