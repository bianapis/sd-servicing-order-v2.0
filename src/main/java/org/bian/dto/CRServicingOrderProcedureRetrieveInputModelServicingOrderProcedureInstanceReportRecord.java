package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceReportRecord
 */
public class CRServicingOrderProcedureRetrieveInputModelServicingOrderProcedureInstanceReportRecord   {
  private String servicingOrderProcedureInstanceReportReference = null;

  private String servicingOrderProcedureInstanceReportType = null;

  private String servicingOrderProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return servicingOrderProcedureInstanceReportReference
  **/

  public String getServicingOrderProcedureInstanceReportReference() {
    return servicingOrderProcedureInstanceReportReference;
  }

  public void setServicingOrderProcedureInstanceReportReference(String servicingOrderProcedureInstanceReportReference) {
    this.servicingOrderProcedureInstanceReportReference = servicingOrderProcedureInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return servicingOrderProcedureInstanceReportParameters
  **/

  public String getServicingOrderProcedureInstanceReportParameters() {
    return servicingOrderProcedureInstanceReportParameters;
  }

  public void setServicingOrderProcedureInstanceReportParameters(String servicingOrderProcedureInstanceReportParameters) {
    this.servicingOrderProcedureInstanceReportParameters = servicingOrderProcedureInstanceReportParameters;
  }


}

