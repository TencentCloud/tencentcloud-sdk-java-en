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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Activity  extends AbstractModel{

    /**
    * Activity ID
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * Compute node ID
    */
    @SerializedName("ComputeNodeId")
    @Expose
    private String ComputeNodeId;

    /**
    * Compute node activity type: creation or termination
    */
    @SerializedName("ComputeNodeActivityType")
    @Expose
    private String ComputeNodeActivityType;

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Cause
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * Active status
    */
    @SerializedName("ActivityState")
    @Expose
    private String ActivityState;

    /**
    * State reason
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

    /**
    * Activity start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Activity end time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * CVM instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Activity ID 
     * @return ActivityId Activity ID
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Activity ID
     * @param ActivityId Activity ID
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get Compute node ID 
     * @return ComputeNodeId Compute node ID
     */
    public String getComputeNodeId() {
        return this.ComputeNodeId;
    }

    /**
     * Set Compute node ID
     * @param ComputeNodeId Compute node ID
     */
    public void setComputeNodeId(String ComputeNodeId) {
        this.ComputeNodeId = ComputeNodeId;
    }

    /**
     * Get Compute node activity type: creation or termination 
     * @return ComputeNodeActivityType Compute node activity type: creation or termination
     */
    public String getComputeNodeActivityType() {
        return this.ComputeNodeActivityType;
    }

    /**
     * Set Compute node activity type: creation or termination
     * @param ComputeNodeActivityType Compute node activity type: creation or termination
     */
    public void setComputeNodeActivityType(String ComputeNodeActivityType) {
        this.ComputeNodeActivityType = ComputeNodeActivityType;
    }

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Cause 
     * @return Cause Cause
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set Cause
     * @param Cause Cause
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get Active status 
     * @return ActivityState Active status
     */
    public String getActivityState() {
        return this.ActivityState;
    }

    /**
     * Set Active status
     * @param ActivityState Active status
     */
    public void setActivityState(String ActivityState) {
        this.ActivityState = ActivityState;
    }

    /**
     * Get State reason 
     * @return StateReason State reason
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * Set State reason
     * @param StateReason State reason
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
    }

    /**
     * Get Activity start time 
     * @return StartTime Activity start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Activity start time
     * @param StartTime Activity start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Activity end time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Activity end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Activity end time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Activity end time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get CVM instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId CVM instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId CVM instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ComputeNodeId", this.ComputeNodeId);
        this.setParamSimple(map, prefix + "ComputeNodeActivityType", this.ComputeNodeActivityType);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "ActivityState", this.ActivityState);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

