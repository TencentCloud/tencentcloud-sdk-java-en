/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http: //www.apache.org/licenses/LICENSE-2.0
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

public class Activity  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scaling activity ID
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * Scaling activity type. Values as below: <br>
<li>SCALE_OUT: Scale out<li>SCALE_IN: Scale in<li>ATTACH_INSTANCES: Attach instances<li>REMOVE_INSTANCES: Remove instances<li>DETACH_INSTANCES: Detach instances<li>TERMINATE_INSTANCES_UNEXPECTEDLY: Terminate instances in CVM console<li>REPLACE_UNHEALTHY_INSTANCE: Replace unhealthy instance
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * Scaling activity status. Values as below: <br>
<li>INIT: Initializing
<li>RUNNING: Running
<li>SUCCESSFUL: Activity is successful
<li>PARTIALLY_SUCCESSFUL: Activity is partially successful
<li>FAILED: Activity failed
<li>CANCELLED: Activity is canceled
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * Scaling activity status description
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * Scaling activity cause
    */
    @SerializedName("Cause")
    @Expose
    private String Cause;

    /**
    * Scaling activity description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Scaling activity start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Scaling activity end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Scaling activity creation time
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Scaling activity related instance set
    */
    @SerializedName("ActivityRelatedInstanceSet")
    @Expose
    private ActivtyRelatedInstance [] ActivityRelatedInstanceSet;

    /**
    * Scaling activity status short description
    */
    @SerializedName("StatusMessageSimplified")
    @Expose
    private String StatusMessageSimplified;

    /**
     * Get scaling group ID
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get scaling activity ID
     * @return ActivityId Scaling activity ID
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set scaling activity ID
     * @param ActivityId Scaling activity ID
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get scaling activity type. Values as below: <br>
<li>SCALE_OUT: Scale out<li>SCALE_IN: Scale in<li>ATTACH_INSTANCES: Attach instances<li>REMOVE_INSTANCES: Remove instances<li>DETACH_INSTANCES: Detach instances<li>TERMINATE_INSTANCES_UNEXPECTEDLY: Terminate instances in CVM console<li>REPLACE_UNHEALTHY_INSTANCE: Replace unhealthy instance
     * @return ActivityType Scaling activity type. Values as below: <br>
<li>SCALE_OUT: Scale out<li>SCALE_IN: Scale in<li>ATTACH_INSTANCES: Attach instances<li>REMOVE_INSTANCES: Remove instances<li>DETACH_INSTANCES: Detach instances<li>TERMINATE_INSTANCES_UNEXPECTEDLY: Terminate instances in CVM console<li>REPLACE_UNHEALTHY_INSTANCE: Replace unhealthy instance
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set scaling activity type. Values as below: <br>
<li>SCALE_OUT: Scale out<li>SCALE_IN: Scale in<li>ATTACH_INSTANCES: Attach instances<li>REMOVE_INSTANCES: Remove instances<li>DETACH_INSTANCES: Detach instances<li>TERMINATE_INSTANCES_UNEXPECTEDLY: Terminate instances in CVM console<li>REPLACE_UNHEALTHY_INSTANCE: Replace unhealthy instance
     * @param ActivityType Scaling activity type. Values as below: <br>
<li>SCALE_OUT: Scale out<li>SCALE_IN: Scale in<li>ATTACH_INSTANCES: Attach instances<li>REMOVE_INSTANCES: Remove instances<li>DETACH_INSTANCES: Detach instances<li>TERMINATE_INSTANCES_UNEXPECTEDLY: Terminate instances in CVM console<li>REPLACE_UNHEALTHY_INSTANCE: Replace unhealthy instance
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get scaling activity status. Values as below: <br>
<li>INIT: Initializing
<li>RUNNING: Running
<li>SUCCESSFUL: Activity is successful
<li>PARTIALLY_SUCCESSFUL: Activity is partially successful
<li>FAILED: Activity failed
<li>CANCELLED: Activity is canceled
     * @return StatusCode Scaling activity status. Values as below: <br>
<li>INIT: Initializing
<li>RUNNING: Running
<li>SUCCESSFUL: Activity is successful
<li>PARTIALLY_SUCCESSFUL: Activity is partially successful
<li>FAILED: Activity failed
<li>CANCELLED: Activity is canceled
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set scaling activity status. Values as below: <br>
<li>INIT: Initializing
<li>RUNNING: Running
<li>SUCCESSFUL: Activity is successful
<li>PARTIALLY_SUCCESSFUL: Activity is partially successful
<li>FAILED: Activity failed
<li>CANCELLED: Activity is canceled
     * @param StatusCode Scaling activity status. Values as below: <br>
<li>INIT:  Initializing
<li>RUNNING: Running
<li>SUCCESSFUL: Activity is successful
<li>PARTIALLY_SUCCESSFUL: Activity is partially successful
<li>FAILED: Activity failed
<li>CANCELLED: Activity is canceled
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get scaling activity status description
     * @return StatusMessage Scaling activity status description
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set scaling activity status description 
     * @param StatusMessage Scaling activity status description
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get the cause of the scaling activity
     * @return Cause Scaling activity casue
     */
    public String getCause() {
        return this.Cause;
    }

    /**
     * Set the cause of the scaling activity
     * @param Cause Scaling activity cause
     */
    public void setCause(String Cause) {
        this.Cause = Cause;
    }

    /**
     * Get scaling activity description
     * @return Description Scaling activity description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set scaling activity description 
     * @param Description Scaling activity description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get the start time of the scaling activity
     * @return StartTime Scaling activity start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set the start time of the scaling activity
     * @param StartTime Scaling activity start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get the end time of the scaling activity
     * @return EndTime Scaling activity end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set the end time of the scaling activity
     * @param EndTime Scaling activity end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get the creation time of the scaling activity
     * @return CreatedTime Scaling activity creation time
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set the creation time of the scaling activity
     * @param CreatedTime Scaling activity creation time
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get the scaling activity related instance set
     * @return ActivityRelatedInstanceSet Scaling activity related instance set
     */
    public ActivtyRelatedInstance [] getActivityRelatedInstanceSet() {
        return this.ActivityRelatedInstanceSet;
    }

    /**
     * Set the scaling activity related instance set
     * @param ActivityRelatedInstanceSet Scaling activity related instance set
     */
    public void setActivityRelatedInstanceSet(ActivtyRelatedInstance [] ActivityRelatedInstanceSet) {
        this.ActivityRelatedInstanceSet = ActivityRelatedInstanceSet;
    }

    /**
     * Get the scaling activity status short description
     * @return StatusMessageSimplified Scaling activity status short description
     */
    public String getStatusMessageSimplified() {
        return this.StatusMessageSimplified;
    }

    /**
     * Set the scaling activity status short description
     * @param StatusMessageSimplified Scaling activity status short description
     */
    public void setStatusMessageSimplified(String StatusMessageSimplified) {
        this.StatusMessageSimplified = StatusMessageSimplified;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "Cause", this.Cause);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "ActivityRelatedInstanceSet.", this.ActivityRelatedInstanceSet);
        this.setParamSimple(map, prefix + "StatusMessageSimplified", this.StatusMessageSimplified);

    }
}

