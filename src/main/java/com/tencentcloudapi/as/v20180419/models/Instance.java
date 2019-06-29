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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance  extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * ID of Launch configuration.
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Name of Launch configuration.
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * Lifecycle status. Possible values: IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB and DETACHING_LB.
    */
    @SerializedName("LifeCycleState")
    @Expose
    private String LifeCycleState;

    /**
    * Health status. Possible values: HEALTHY and UNHEALTHY.
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
    * Indicates whether to protect the instance from scaling down.
    */
    @SerializedName("ProtectedFromScaleIn")
    @Expose
    private Boolean ProtectedFromScaleIn;

    /**
    * Availability Zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Creation type. Possible values: AUTO_CREATION and MANUAL_ATTACHING.
    */
    @SerializedName("CreationType")
    @Expose
    private String CreationType;

    /**
    * The time when the instance is added.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Instance Type.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Version No.
    */
    @SerializedName("VersionNumber")
    @Expose
    private Integer VersionNumber;

    /**
     * Obtain an instance ID.
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Configure an instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Obtain a scaling group ID.
     * @return AutoScalingGroupId Scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Configure a scaling group ID.
     * @param AutoScalingGroupId Scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Obtain the ID of Launch configuration.
     * @return LaunchConfigurationId ID of Launch configuration.
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Configure the ID of Launch configuration.
     * @param LaunchConfigurationId ID of Launch configuration.
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Obtain the name of Launch configuration.
     * @return LaunchConfigurationName Name of Launch configuration.
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Configure the name of Launch configuration.
     * @param LaunchConfigurationName Name of Launch configuration.
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Obtain a lifecycle status. Possible values: IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB and DETACHING_LB.
     * @return LifeCycleState Lifecycle status. Possible values: IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB and DETACHING_LB.
     */
    public String getLifeCycleState() {
        return this.LifeCycleState;
    }

    /**
     * Configure a lifecycle status. Possible values: IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB and DETACHING_LB.
     * @param LifeCycleState Lifecycle status. Possible values: IN_SERVICE, CREATING, TERMINATING, ATTACHING, DETACHING, ATTACHING_LB and DETACHING_LB.
     */
    public void setLifeCycleState(String LifeCycleState) {
        this.LifeCycleState = LifeCycleState;
    }

    /**
     * Obtain a health status. Possible values: HEALTHY and UNHEALTHY.
     * @return HealthStatus Health status. Possible values: HEALTHY and UNHEALTHY.
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Configure a health status. Possible values: HEALTHY and UNHEALTHY.
     * @param HealthStatus Health status. Possible values: HEALTHY and UNHEALTHY.
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Obtain whether to protect the instance from scaling down is enable.
     * @return ProtectedFromScaleIn Indicates whether to protect the instance from scaling down.
     */
    public Boolean getProtectedFromScaleIn() {
        return this.ProtectedFromScaleIn;
    }

    /**
     * Configure whether to protect the instance from scaling down is enable.
     * @param ProtectedFromScaleIn Indicates whether to protect the instance from scaling down.
     */
    public void setProtectedFromScaleIn(Boolean ProtectedFromScaleIn) {
        this.ProtectedFromScaleIn = ProtectedFromScaleIn;
    }

    /**
     * Obtain the Availability Zone.
     * @return Zone Availability Zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Configure the Availability Zone.
     * @param Zone Availability Zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Obtain a creation type. Possible values: AUTO_CREATION and MANUAL_ATTACHING.
     * Creation type. Possible values: AUTO_CREATION and MANUAL_ATTACHING.
     */
    public String getCreationType() {
        return this.CreationType;
    }

    /**
     * Configure a creation type. Possible values: AUTO_CREATION and MANUAL_ATTACHING.
     * Creation type. Possible values: AUTO_CREATION and MANUAL_ATTACHING.
     */
    public void setCreationType(String CreationType) {
        this.CreationType = CreationType;
    }

    /**
     * Obtain the time when the instance is added.
     * @return AddTime The time when the instance is added.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Configure the time when the instance is added.
     * @param AddTime The time when the instance is added.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Obtain the Instance Type.
     * @return InstanceType Instance Type.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Configure the Instance Type.
     * @param InstanceType Type Instance Type.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Obtain the Version No.
     * @return VersionNumber Version No.
     */
    public Integer getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Configure the Version No.
     * @param VersionNumber Version No.
     */
    public void setVersionNumber(Integer VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "LifeCycleState", this.LifeCycleState);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "ProtectedFromScaleIn", this.ProtectedFromScaleIn);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreationType", this.CreationType);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);

    }
}

