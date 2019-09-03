package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecord
 */
public class CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecord   {
  private String thirdPartyReference = null;

  private String thirdPartyServicingMandateReference = null;

  private String thirdPartyServicingMandate = null;

  private String customerReference = null;

  private String customerEligibilityAssessmentInstanceReference = null;

  private Object customerEligibilityAssessmentInstanceRecord = null;

  private String servicingOrderType = null;

  private CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord servicingOrderTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a third party service provider that handles some aspect of customer servicing access with the bank 
   * @return thirdPartyReference
  **/

  public String getThirdPartyReference() {
    return thirdPartyReference;
  }

  public void setThirdPartyReference(String thirdPartyReference) {
    this.thirdPartyReference = thirdPartyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a third party servicing mandate - used when a third party is requesting the service order 
   * @return thirdPartyServicingMandateReference
  **/

  public String getThirdPartyServicingMandateReference() {
    return thirdPartyServicingMandateReference;
  }

  public void setThirdPartyServicingMandateReference(String thirdPartyServicingMandateReference) {
    this.thirdPartyServicingMandateReference = thirdPartyServicingMandateReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The servicing mandate for a third party defines the customers and service access allowed 
   * @return thirdPartyServicingMandate
  **/

  public String getThirdPartyServicingMandate() {
    return thirdPartyServicingMandate;
  }

  public void setThirdPartyServicingMandate(String thirdPartyServicingMandate) {
    this.thirdPartyServicingMandate = thirdPartyServicingMandate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The customer requesting the servicing order directly or the customer that is being serviced indirectly by the third party 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer's active services and products record 
   * @return customerEligibilityAssessmentInstanceReference
  **/

  public String getCustomerEligibilityAssessmentInstanceReference() {
    return customerEligibilityAssessmentInstanceReference;
  }

  public void setCustomerEligibilityAssessmentInstanceReference(String customerEligibilityAssessmentInstanceReference) {
    this.customerEligibilityAssessmentInstanceReference = customerEligibilityAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The active products and services record includes an indication of the services that can be access via a third party servicing order with the appropriate mandate in place 
   * @return customerEligibilityAssessmentInstanceRecord
  **/

  public Object getCustomerEligibilityAssessmentInstanceRecord() {
    return customerEligibilityAssessmentInstanceRecord;
  }

  public void setCustomerEligibilityAssessmentInstanceRecord(Object customerEligibilityAssessmentInstanceRecord) {
    this.customerEligibilityAssessmentInstanceRecord = customerEligibilityAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of servicing order being processed (e.g. change of address, change of employment‚Ä¶) 
   * @return servicingOrderType
  **/

  public String getServicingOrderType() {
    return servicingOrderType;
  }

  public void setServicingOrderType(String servicingOrderType) {
    this.servicingOrderType = servicingOrderType;
  }


  /**
   * Get servicingOrderTaskRecord
   * @return servicingOrderTaskRecord
  **/

  public CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord getServicingOrderTaskRecord() {
    return servicingOrderTaskRecord;
  }

  public void setServicingOrderTaskRecord(CRServicingOrderProcedureInitiateInputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord servicingOrderTaskRecord) {
    this.servicingOrderTaskRecord = servicingOrderTaskRecord;
  }


}

