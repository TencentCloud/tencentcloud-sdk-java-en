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

public class CreateScheduledActionRequest  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scheduled action name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters. It must be unique in the scaling group. 
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * The maximum number of instances when a scheduled action is triggered.
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * The minimum number of instances when a scheduled action is triggered.
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * The desired number of instances when a scheduled action is triggered.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * Scheduled action start time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Scheduled action end time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.<br><br>This parameter should be used with `Recurrence`. Scheduled action expires at end time. 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Repetition mode of the scheduled action, which is in the standard [Cron](https://zh.wikipedia.org/wiki/Cron) format.<br><br>This parameter should be used with `EndTime`. 
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

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
     * Get scheduled action name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters. It must be unique in the scaling group. 
     * @return ScheduledActionName Scheduled action name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters. It must be unique in the scaling group. 
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set scheduled action name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters. It must be unique in the scaling group. 
     * @param ScheduledActionName Scheduled action name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters. It must be unique in the scaling group. 
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Get the maximum number of instances when a scheduled action is triggered.
     * @return MaxSize The maximum number of instances when a scheduled action is triggered.
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set the maximum number of instances when a scheduled action is triggered.
     * @param MaxSize The maximum number of instances when a scheduled action is triggered.
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get the minimum number of instances when a scheduled action is triggered.
     * @return MinSize The minimum number of instances when a scheduled action is triggered.
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Set the minimum number of instances when a scheduled action is triggered.
     * @param MinSize The minimum number of instances when a scheduled action is triggered.
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get the desired number of instances when a scheduled action is triggered.
     * @return DesiredCapacity The desired number of instances when a scheduled action is triggered.
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set the desired number of instances when a scheduled action is triggered.
     * @param DesiredCapacity The desired number of instances when a scheduled action is triggered.
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get scheduled action start time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     * @return StartTime scheduled action start time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set scheduled action start time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     * @param StartTime scheduled action start time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get scheduled action end time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.<br><br>This parameter should be used with `Recurrence`. Scheduled action expires at end time. 
     * @return EndTime scheduled action end time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.<br><br>This parameter should be used with `Recurrence`. Scheduled action expires at end time. 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set scheduled action end time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.<br><br>This parameter should be used with `Recurrence`. Scheduled action expires at end time. 
     * @param EndTime scheduled action end time. Value: `北京时间` (UTC+8) in `ISO8601` standard and format `YYYY-MM-DDThh:mm:ss+08:00`.<br><br>This parameter should be used with `Recurrence`. Scheduled action expires at end time. 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get repetition mode of the scheduled action, which is in the standard [Cron](https://zh.wikipedia.org/wiki/Cron) format.<br><br>This parameter should be used with `EndTime`. 
     * @return Recurrence Repetition mode of the scheduled action, which is in the standard [Cron](https://zh.wikipedia.org/wiki/Cron) format.<br><br>This parameter should be used with `EndTime`. 
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set repetition mode of the scheduled action, which is in the standard [Cron](https://zh.wikipedia.org/wiki/Cron) format.<br><br>This parameter should be used with `EndTime`. 
     * @param Recurrence Repetition mode of the scheduled action, which is in the standard [Cron](https://zh.wikipedia.org/wiki/Cron) format.<br><br>This parameter should be used with `EndTime`. 
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);

    }
}

