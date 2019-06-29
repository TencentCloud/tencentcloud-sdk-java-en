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

public class ScheduledAction  extends AbstractModel{

    /**
    * Scheduled action ID
    */
    @SerializedName("ScheduledActionId")
    @Expose
    private String ScheduledActionId;

    /**
    * scheduled action name
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * ID of the scaling group that scheduled action belong to.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scheduled action start time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Repeat method of scheduled action
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
    * Scheduled action end time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Maximum number of instances set by scheduled action
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * Desired number of instances set by scheduled action
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * Minimum number of instances set by scheduled action
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * scheduled action creation time. Value: `UTC`Time in`ISO8601` standard，format：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get scheduled action ID
     * @return ScheduledActionId Scheduled action ID
     */
    public String getScheduledActionId() {
        return this.ScheduledActionId;
    }

    /**
     * Set scheduled action ID
     * @param ScheduledActionId Scheduled action ID
     */
    public void setScheduledActionId(String ScheduledActionId) {
        this.ScheduledActionId = ScheduledActionId;
    }

    /**
     * Get scheduled action name
     * @return ScheduledActionId Scheduled action name
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set scheduled action name
     * @param ScheduledActionId Scheduled action name
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Obtain ID of the scaling group that the scheduled action belong to.
     * @return AutoScalingGroupId ID of the scaling group that the scheduled action belong to.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set ID of the scaling group that the scheduled action belong to.
     * @param AutoScalingGroupId Scaling group ID that the scheduled action belong to.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Obtain scheduled action start time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     * @return StartTime Scheduled action start time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set the scheduled action start time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     * @param StartTime The scheduled action start time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Obtain the recurrence of scheduled action
     * @return Recurrence The recurrence of scheduled action
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set the recurrence of scheduled action
     * @param Recurrence The recurrence of scheduled action
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * Set the scheduled action end time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     * @return EndTime Scheduled action end time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set the scheduled action end time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     * @param EndTime Scheduled action end time. Value: `Beijing Time` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Obtain the maximum number of instances set by scheduled action
     * @return MaxSize The maximum number of instances set by scheduled action
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set the maximum number of instances set by scheduled action
     * @param MaxSize The maximum number of instances set by scheduled action
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Obtain the desired number of instances set by scheduled action
     * @return DesiredCapacity The desired number of instances set by scheduled action
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set the desired number of instances set by scheduled action
     * @param DesiredCapacity The desired number of instances set by scheduled action
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Obtain the minimum number of instances set by scheduled action
     * @return MinSize The minimum number of instances set by scheduled action
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Set the minimum number of instances set by scheduled action
     * @param MinSize The minimum number of instances set by scheduled action
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Obtain scheduled action creation time. Value: `UTC`Time in`ISO8601` standard，format：`YYYY-MM-DDThh:mm:ssZ`。
     * @return CreatedTime Scheduled action creation time. Value: `UTC`Time in`ISO8601` standard，format：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set the scheduled action creation time. Value: `UTC`Time in`ISO8601` standard，format：`YYYY-MM-DDThh:mm:ssZ`。
     * @param CreatedTime Scheduled action creation time. Value: `UTC`Time in`ISO8601` standard，format：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledActionId", this.ScheduledActionId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

