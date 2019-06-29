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

public class DisasterRecoverGroup  extends AbstractModel{

    /**
    * ID of a spread placement group.
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * Name of spread placement group, name between 1 and 60 characters long.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type of spread placement group, choose from:<br><li>HOST: Physical host<br><li>SW: Switch<br><li>RACK: Rack
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Maximum number of CVMs that can be hosted in a spread placement group.
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Integer CvmQuotaTotal;

    /**
    * Current number of CVMs hosted in a spread placement group.
    */
    @SerializedName("CurrentNum")
    @Expose
    private Integer CurrentNum;

    /**
    * List of instance IDs of CVM in a spread placement group. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Creation time of a spread placement group. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get ID of a spread placement group.
     * @return DisasterRecoverGroupId ID of a spread placement group.
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set ID of a spread placement group.
     * @param DisasterRecoverGroupId ID of a spread placement group.
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Name of a spread placement group with a length of 1-60 characters.
     * @return Name Name of spread placement group, group name between 1 and 60 characters long.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Name of a spread placement group with a length of 1-60 characters.
     * @param Name Name of spread placement group, group name between 1 and 60 characters long.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get type of spread placement group, choose from:<br><li>HOST: Physical host<br><li>SW: Switch<br><li>RACK: Rack
     * @return Type Type of spread placement group, choose from:<br><li>HOST: Physical host<br><li>SW: Switch<br><li>RACK: Rack
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set type of spread placement group, choose from:<br><li>HOST: Physical host<br><li>SW: Switch<br><li>RACK: Rack
     * @param Type Type of spread placement group, choose from:<br><li>HOST: Physical host<br><li>SW: Switch<br><li>RACK: Rack
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get maximum number of CVMs that can be hosted in a spread placement group.
     * @return CvmQuotaTotal Maximum number of CVMs that can be hosted in a spread placement group.
     */
    public Integer getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set maximum number of CVMs that can be hosted in a spread placement group.
     * @param CvmQuotaTotal Maximum number of CVMs that can be hosted in a spread placement group.
     */
    public void setCvmQuotaTotal(Integer CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get number of CVMs hosted in a spread placement group.
     * @return CurrentNum Current number of CVMs hosted in a spread placement group.
     */
    public Integer getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set number of CVMs hosted in a spread placement group.
     * @param CurrentNum Current number of CVMs hosted in a spread placement group.
     */
    public void setCurrentNum(Integer CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get list of IDs of CVMs in a spread placement group. Note: This field may return null, indicating that no valid value was found.
     * @return InstanceIds List of instance IDs of CVM in a spread placement group. Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set list of instance IDs of CVM in a spread placement group. Note: This field may return null, indicating that no valid value was found.
     * @param InstanceIds List of instance IDs of CVM in a spread placement group. Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get creation time of a spread placement group. Note: This field may return null, indicating that no valid value was found.
     * @return CreateTime List of instance IDs of CVM in a spread placement group. Note: This field may return null, indicating that no valid value was found.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set creation time of a spread placement group. Note: This field may return null, indicating that no valid value was found.
     * @param CreateTime List of instance IDs of CVM in a spread placement group. Note: This field may return null, indicating that no valid value was found.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

