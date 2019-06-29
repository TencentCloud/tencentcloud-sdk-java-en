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

public class ModifyScheduledActionRequest  extends AbstractModel{

    /**
    * ID of scheduled action to be modified.
    */
    @SerializedName("ScheduledActionId")
    @Expose
    private String ScheduledActionId;

    /**
    * Scheduled action name, which is unique under one scaling group. It can only contain Chinese and English letters, numbers, underscores, hyphens ("-") and decimal points. Its length cannot exceed 60 characters. |
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * When a Scheduled Action is triggered, maximum number of instances for a Scaling Group.
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * When a Scheduled Action is triggered, minimum number of instances for a Scaling Group.
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * When a Scheduled Action is triggered, desired number of instances for a Scaling Group.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * Time that scheduled task is triggered for first time. Its value is [1] (UTC+8), in [2] standard,Format:[3]
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Time that scheduled task ends. Its value is [1] (UTC+8), in [2] standard,Format:[3]<br>This parameter should be set with [1]. At end time,scheduled action expires.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Repeat of scheduled action. In standard Cron format  [Cron](https://zh.wikipedia.org/wiki/Cron).<br>This parameter should be set with [1]. 
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
     * Obtain the ID of the scheduled action that is to be modified.
     * @return ScheduledActionId ID of the scheduled action to be modified 
     */
    public String getScheduledActionId() {
        return this.ScheduledActionId;
    }

    /**
     * Set the ID of the scheduled action that is to be modified.
     * @param ScheduledActionId ID of the scheduled action to be modified
     */
    public void setScheduledActionId(String ScheduledActionId) {
        this.ScheduledActionId = ScheduledActionId;
    }

    /**
     * Obtain the name of the scheduled action,which is unique under one scaling group. It can only contain Chinese and English letters, numbers, underscores, hyphens ("-") and decimal points. Its length cannot exceed 60 characters.Be unique within a Scaling Group.
     * @return ScheduledActionName The name of the scheduled action,which is unique under one scaling group. It can only contain Chinese and English letters, numbers, underscores, hyphens ("-") and decimal points. Its length cannot exceed 60 characters. Be unique within a Scaling Group.
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set the name of the scheduled action,which is unique under one scaling group. It can only contain Chinese and English letters, numbers, underscores, hyphens ("-") and decimal points. Its length cannot exceed 60 characters.Be unique within a Scaling Group.
     * @param ScheduledActionName Scheduled action name, which is unique under one scaling group. It can only contain Chinese and English letters, numbers, underscores, hyphens ("-") and decimal points. Its length cannot exceed 60 characters. |
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Obtain maximum number of instances for a Scaling Group,which is for the time when a Scheduled Action is triggered.
     * @return MaxSize When a Scheduled Action is triggered, the maximum number of instances for a Scaling Group.
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set the maximum number of instances for a Scaling Group when a Scheduled Action is triggered.
     * @param MaxSize When a Scheduled Action is triggered, the maximum number of instances for a Scaling Group.
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * When a Scheduled Action is triggered, obtain minimum number of instances for a Scaling Group.
     * @return MinSize When a Scheduled Action is triggered, the minimum number of instances for a Scaling Group.
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Set the minimum number of instances for a Scaling Group when a Scheduled Action is triggered,
     * @param MinSize The minimum number of instances for a Scaling Group when a Scheduled Action is triggered,
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Obtain the desired number of instances for a Scaling Group when a Scheduled Action is triggered,
     * @return DesiredCapacity The desired number of instances for a Scaling Group when a scheduled action is triggered
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * When a Scheduled Action is triggered, desired number of instances for a Scaling Group.
     * @param DesiredCapacity The desired number of instances for Scaling Group when a scheduled action is triggered
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Obtain the time that scheduled action is triggered for first time. Its value is `北京时间`（UTC+8），in`ISO8601`standard，format：`YYYY-MM-DDThh:mm:ss+08:00`.
     * @return StartTime the time that scheduled action is triggered for first time. Its value is [1] (UTC+8), in [2] standard,Format:[3]
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set the time that scheduled action is triggered for first time. Its value is `北京时间`（UTC+8），in`ISO8601`standard，format：`YYYY-MM-DDThh:mm:ss+08:00`.
     * @param StartTime Time that scheduled action is triggered for first time. Its value is [1] (UTC+8), in [2] standard,Format:[3]
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Obtain the time that scheduled action ends. Its value is `北京时间`（UTC+8），in`ISO8601`standard，format：`YYYY-MM-DDThh:mm:ss+08:00`.<br>This parameter should be set with `Recurrence`. At end time,scheduled action expires. 
     * @return EndTime The time that scheduled action ends. Its value is `北京时间`（UTC+8），in`ISO8601`standard，format：`YYYY-MM-DDThh:mm:ss+08:00`. <br>This parameter should be set with `Recurrence`. At end time,scheduled action expires. 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Time that scheduled action ends. Its value is `北京时间`（UTC+8），in`ISO8601`standard，format：`YYYY-MM-DDThh:mm:ss+08:00`. <br>This parameter should be set with.`Recurrence`. A end time,scheduled action expires.
     * @param EndTime Time that scheduled action ends. Its value is `北京时间`（UTC+8），in`ISO8601`standard，format：`YYYY-MM-DDThh:mm:ss+08:00`. <br>This parameter should be set with `Recurrence` . At end time,scheduled action expires.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Obtain the repeat pattern of scheduled action. In standard Cron format[Cron](https://zh.wikipedia.org/wiki/Cron).<br>This parameter should be set with `EndTime`.
     * @return Recurrence Repeat of scheduled action. In standard Cron format[Cron](https://zh.wikipedia.org/wiki/Cron).<br>This parameter should be set with `EndTime`.
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set the repeat pattern of scheduled action. In standard Cron format[Cron](https://zh.wikipedia.org/wiki/Cron).<br>This parameter should be set with `EndTime`.
     * @param Recurrence Repeat pattern of scheduled action. In standard Cron format[Cron](https://zh.wikipedia.org/wiki/Cron).<br>This parameter should be set with `EndTime`.
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledActionId", this.ScheduledActionId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);

    }
}

