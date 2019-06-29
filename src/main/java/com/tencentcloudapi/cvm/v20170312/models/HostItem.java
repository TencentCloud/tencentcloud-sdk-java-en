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

public class HostItem  extends AbstractModel{

    /**
    * Location of the CDH instance. This parameter is used to specify the availability zone and project to which the instance belongs.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * CDH instance ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * CDH instance type
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * CDH instance name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Billing type of a CDH instance
    */
    @SerializedName("HostChargeType")
    @Expose
    private String HostChargeType;

    /**
    * Auto renewal flag of a CDH instance
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Creation time of a CDH instance
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Expiration time of a CDH instance
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * List of IDs of CVM instances created on CDH
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * CDH instance status
    */
    @SerializedName("HostState")
    @Expose
    private String HostState;

    /**
    * CDH instance IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * The resource information of a CDH instance
    */
    @SerializedName("HostResource")
    @Expose
    private HostResource HostResource;

    /**
    * Cage ID of the CDH instance. This parameter only applies to CDH in financial zone. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
     * Get location of the CDH instance. This parameter is used to specify the availability zone and project to which the instance belongs.
     * @return Placement Location of CDH instance. This parameter is used to specify the availability zone, project and other attributes of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set location of the CDH instance. This parameter is used to specify the availability zone and project to which the instance belongs.
     * @param Placement Location of CDH instance. This parameter is used to specify the availability zone, project and other attributes of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get CDH instance ID
     * @return HostId CDH instance ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set CDH instance ID
     * @param HostId CDH instance ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get CDH instance type
     * @return HostType CDH instance type
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set CDH instance type
     * @param HostType CDH instance type
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get CDH instance name
     * @return HostName CDH instance name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set CDH instance name
     * @param HostName CDH instance name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get billing type of a CDH instance
     * @return HostChargeType Billing type of a CDH instance
     */
    public String getHostChargeType() {
        return this.HostChargeType;
    }

    /**
     * Set billing type of a CDH instance
     * @param HostChargeType Billing type of a CDH instance
     */
    public void setHostChargeType(String HostChargeType) {
        this.HostChargeType = HostChargeType;
    }

    /**
     * Get auto renewal flag of a CDH instance
     * @return RenewFlag Auto renewal flag of a CDH instance
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set auto renewal flag of a CDH instance
     * @param RenewFlag Auto renewal flag of a CDH instance
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get creation time of a CDH instance
     * @return CreatedTime Creation time of a CDH instance
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set creation time of a CDH instance
     * @param CreatedTime Creation time of a CDH instance
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get expiration time of a CDH instance
     * @return ExpiredTime Expiration time of a CDH instance
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set expiration time of a CDH instance
     * @param ExpiredTime Expiration time of a CDH instance
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get list of IDs of CVM instances created on CDH
     * @return InstanceIds List of IDs of CVM instances created on CDH
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set list of IDs of CVM instances created on CDH
     * @param InstanceIds List of IDs of CVM instances created on CDH
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get CDH instance status
     * @return HostState CDH instance status
     */
    public String getHostState() {
        return this.HostState;
    }

    /**
     * Set CDH instance status
     * @param HostState CDH instance status
     */
    public void setHostState(String HostState) {
        this.HostState = HostState;
    }

    /**
     * Get CDH instance IP
     * @return HostIp CDH instance IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set CDH instance IP
     * @param HostIp CDH instance IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get the resource information of a CDH instance
     * @return HostResource The resource information of a CDH instance
     */
    public HostResource getHostResource() {
        return this.HostResource;
    }

    /**
     * Set the resource information of a CDH instance
     * @param HostResource The resource information of a CDH instance
     */
    public void setHostResource(HostResource HostResource) {
        this.HostResource = HostResource;
    }

    /**
     * Get Cage ID of the CDH instance. This parameter only applies to CDH in financial zone. Note: This field may return null, indicating that no valid value was found.
     * @return CageId Cage ID of the CDH instance. This parameter only applies to CDH in financial zone. Note: This field may return null, indicating that no valid value was found.
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set Cage ID of the CDH instance. This parameter only applies to CDH in financial zone. Note: This field may return null, indicating that no valid value was found.
     * @param CageId Cage ID of the CDH instance. This parameter only applies to CDH in financial zone. Note: This field may return null, indicating that no valid value was found.
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostChargeType", this.HostChargeType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "HostState", this.HostState);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamObj(map, prefix + "HostResource.", this.HostResource);
        this.setParamSimple(map, prefix + "CageId", this.CageId);

    }
}

