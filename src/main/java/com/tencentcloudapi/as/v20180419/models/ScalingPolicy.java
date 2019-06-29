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

public class ScalingPolicy  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Alert trigger policy ID
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * Alert trigger policy name
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * After an alert is triggered,the method to change expected instance number. Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * After an alert is triggered,the adjusted value of desired number of instances.
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Integer AdjustmentValue;

    /**
    * Cooldown period
    */
    @SerializedName("Cooldown")
    @Expose
    private Integer Cooldown;

    /**
    * Alert monitor metrics.
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * ID of notification group, which is the collection of user group IDs.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Obtain the scaling group ID
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Configure the scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Obtain the alert trigger policy ID
     * @return AutoScalingPolicyId Alert trigger policy ID
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set alert trigger policy ID
     * @param AutoScalingPolicyId alert trigger policy ID
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * Obtain alert trigger policy ID
     * @return ScalingPolicyName alert trigger policy name
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set the alert trigger policy name
     * @param ScalingPolicyName alert trigger policy name
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * Obtain the method to modify expected instance number after an alert is triggered.Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
     * @return AdjustmentType After an alert is triggered, the method to modify expected instance number.Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * After an alert is triggered,the method to change expected instance number. Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
     * @param AdjustmentType After an alert is triggered, the method to modify expected instance number.Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Obtain the adjusted value of expected number of instances after alert is triggered.
     * @return AdjustmentValue After an alert is triggered, the adjusted expected instance number. Value:
     */
    public Integer getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set the adjusted value of expected number of instances after alert is triggered.
     * @param AdjustmentValue After an alert is triggered, the adjusted expected instance number. Value:
     */
    public void setAdjustmentValue(Integer AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Obtain the cooldown time
     * @return Cooldown cool down time, in seconds.
     */
    public Integer getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set the cooldown time
     * @param Cooldown cool down time, in seconds.
     */
    public void setCooldown(Integer Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Obtain alert/monitor metrics.
     * @return MetricAlarm alert/monitor metrics.
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set alert/monitor metrics.
     * @param MetricAlarm alert/monitor metrics.
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Obtain notification group ID,which is the collection of user groups.
     * @return NotificationUserGroupIds Notification group ID,which is the collection of user groups.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set notification group ID,which is the collection of user groups.
     * @param NotificationUserGroupIds Notification group ID,which is the collection of user groups.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
        this.setParamSimple(map, prefix + "AdjustmentType", this.AdjustmentType);
        this.setParamSimple(map, prefix + "AdjustmentValue", this.AdjustmentValue);
        this.setParamSimple(map, prefix + "Cooldown", this.Cooldown);
        this.setParamObj(map, prefix + "MetricAlarm.", this.MetricAlarm);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}

