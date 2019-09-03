package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceAnalysis
 */
public class CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceAnalysis   {
  private String servicingOrderProcedureInstanceAnalysisReference = null;

  private String servicingOrderProcedureInstanceAnalysisReportType = null;

  private String servicingOrderProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return servicingOrderProcedureInstanceAnalysisReference
  **/

  public String getServicingOrderProcedureInstanceAnalysisReference() {
    return servicingOrderProcedureInstanceAnalysisReference;
  }

  public void setServicingOrderProcedureInstanceAnalysisReference(String servicingOrderProcedureInstanceAnalysisReference) {
    this.servicingOrderProcedureInstanceAnalysisReference = servicingOrderProcedureInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return servicingOrderProcedureInstanceAnalysisParameters
  **/

  public String getServicingOrderProcedureInstanceAnalysisParameters() {
    return servicingOrderProcedureInstanceAnalysisParameters;
  }

  public void setServicingOrderProcedureInstanceAnalysisParameters(String servicingOrderProcedureInstanceAnalysisParameters) {
    this.servicingOrderProcedureInstanceAnalysisParameters = servicingOrderProcedureInstanceAnalysisParameters;
  }


}

