/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisasterRecoverGroupResponse  extends AbstractModel{

    /**
    * List of spread placement group IDs.
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * Type of spread placement group, value:<br><li>Host: Physical machine<br><li>SW: Switch<br><li>Rack: Rack
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Name of a spread placement group with a length of 1-60 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Maximum number of CVMs in a placement group.
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Integer CvmQuotaTotal;

    /**
    * Number of CVMs in a placement group.
    */
    @SerializedName("CurrentNum")
    @Expose
    private Integer CurrentNum;

    /**
    * Creation time of a placement group.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of spread placement group IDs.
     * @return DisasterRecoverGroupId List of spread placement group IDs.
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set List of spread placement group IDs.
     * @param DisasterRecoverGroupId List of spread placement group IDs.
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get type of spread placement group, value:<br><li>Host: Physical machine<br><li>SW: Switch<br><li>Rack: Rack
     * @return Type Type of spread placement group, value:<br><li>Host: Physical machine<br><li>SW: Switch<br><li>Rack: Rack
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set type of spread placement group, value:<br><li>Host: Physical machine<br><li>SW: Switch<br><li>Rack: Rack
     * @param Type Type of spread placement group, value:<br><li>Host: Physical machine<br><li>SW: Switch<br><li>Rack: Rack
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get name of a spread placement group with a length of 1-60 characters.
     * @return Name Name of a spread placement group with a length of 1-60 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set name of a spread placement group with a length of 1-60 characters.
     * @param Name Name of a spread placement group with a length of 1-60 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get maximum number of CVMs in a placement group.
     * @return CvmQuotaTotal Maximum number of CVMs in a placement group.
     */
    public Integer getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set maximum number of CVMs in a placement group.
     * @param CvmQuotaTotal Maximum number of CVMs in a placement group.
     */
    public void setCvmQuotaTotal(Integer CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get number of CVMs in a placement group.
     * @return CurrentNum Number of CVMs in a placement group.
     */
    public Integer getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Number of CVMs in a placement group.
     * @param CurrentNum Number of CVMs in a placement group.
     */
    public void setCurrentNum(Integer CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get creation time of a placement group.
     * @return CreateTime Creation time of a placement group.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set creation time of a placement group.
     * @param CreateTime Creation time of a placement group.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @return RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @param RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

