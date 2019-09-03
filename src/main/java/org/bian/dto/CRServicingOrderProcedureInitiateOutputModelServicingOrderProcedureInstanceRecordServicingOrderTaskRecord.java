package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord
 */
public class CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord   {
  private String servicingOrderDescription = null;

  private String date = null;

  private String servicingOrderWorkProduct = null;

  private String servicingOrderWorkTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the processing tasks and their sequencing followed by the servicing order 
   * @return servicingOrderDescription
  **/

  public String getServicingOrderDescription() {
    return servicingOrderDescription;
  }

  public void setServicingOrderDescription(String servicingOrderDescription) {
    this.servicingOrderDescription = servicingOrderDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time that the servicing order is processed 
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the analysis 
   * @return servicingOrderWorkProduct
  **/

  public String getServicingOrderWorkProduct() {
    return servicingOrderWorkProduct;
  }

  public void setServicingOrderWorkProduct(String servicingOrderWorkProduct) {
    this.servicingOrderWorkProduct = servicingOrderWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the servicing order 
   * @return servicingOrderWorkTaskResult
  **/

  public String getServicingOrderWorkTaskResult() {
    return servicingOrderWorkTaskResult;
  }

  public void setServicingOrderWorkTaskResult(String servicingOrderWorkTaskResult) {
    this.servicingOrderWorkTaskResult = servicingOrderWorkTaskResult;
  }


}

