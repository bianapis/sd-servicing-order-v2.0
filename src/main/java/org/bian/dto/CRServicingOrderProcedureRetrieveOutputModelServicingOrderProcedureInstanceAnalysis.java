package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceAnalysis
 */
public class CRServicingOrderProcedureRetrieveOutputModelServicingOrderProcedureInstanceAnalysis   {
  private String servicingOrderProcedureInstanceAnalysisData = null;

  private String servicingOrderProcedureInstanceAnalysisReportType = null;

  private Object servicingOrderProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return servicingOrderProcedureInstanceAnalysisData
  **/

  public String getServicingOrderProcedureInstanceAnalysisData() {
    return servicingOrderProcedureInstanceAnalysisData;
  }

  public void setServicingOrderProcedureInstanceAnalysisData(String servicingOrderProcedureInstanceAnalysisData) {
    this.servicingOrderProcedureInstanceAnalysisData = servicingOrderProcedureInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return servicingOrderProcedureInstanceAnalysisReportType
  **/

  public String getServicingOrderProcedureInstanceAnalysisReportType() {
    return servicingOrderProcedureInstanceAnalysisReportType;
  }

  public void setServicingOrderProcedureInstanceAnalysisReportType(String servicingOrderProcedureInstanceAnalysisReportType) {
    this.servicingOrderProcedureInstanceAnalysisReportType = servicingOrderProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return servicingOrderProcedureInstanceAnalysisReport
  **/

  public Object getServicingOrderProcedureInstanceAnalysisReport() {
    return servicingOrderProcedureInstanceAnalysisReport;
  }

  public void setServicingOrderProcedureInstanceAnalysisReport(Object servicingOrderProcedureInstanceAnalysisReport) {
    this.servicingOrderProcedureInstanceAnalysisReport = servicingOrderProcedureInstanceAnalysisReport;
  }


}

