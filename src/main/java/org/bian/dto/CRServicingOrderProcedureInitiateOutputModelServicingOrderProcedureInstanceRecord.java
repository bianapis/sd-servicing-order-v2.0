package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord;

import javax.validation.Valid;
  
/**
 * CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecord
 */
public class CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecord   {
  private CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord servicingOrderTaskRecord = null;


  /**
   * Get servicingOrderTaskRecord
   * @return servicingOrderTaskRecord
  **/

  public CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord getServicingOrderTaskRecord() {
    return servicingOrderTaskRecord;
  }

  public void setServicingOrderTaskRecord(CRServicingOrderProcedureInitiateOutputModelServicingOrderProcedureInstanceRecordServicingOrderTaskRecord servicingOrderTaskRecord) {
    this.servicingOrderTaskRecord = servicingOrderTaskRecord;
  }


}

