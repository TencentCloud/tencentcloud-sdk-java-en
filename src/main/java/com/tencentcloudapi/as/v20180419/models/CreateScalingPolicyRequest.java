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

public class CreateScalingPolicyRequest extends AbstractModel{

    /**
    * Auto scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Alarm trigger policy name.
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * The method to adjust the desired number of instances after the alarm is triggered. Value range: <br><li>CHANGE_IN_CAPACITY: Increase or decrease the desired number of instances </li><li>EXACT_CAPACITY: Adjust to the specified desired number of instances </li> <li>PERCENT_CHANGE_IN_CAPACITY: Adjust the desired number of instances by percentage </li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * The adjusted value of desired number of instances after the alarm is triggered. Value range: <br><li>When AdjustmentType is CHANGE_IN_CAPACITY, if AdjustmentValue is a positive value, some new instances will be added after the alarm is triggered, and if it is a negative value, some existing instances will be removed after the alarm is triggered </li> <li> When AdjustmentType is EXACT_CAPACITY, the value of AdjustmentValue is the desired number of instances after the alarm is triggered, which should be equal to or greater than 0 </li> <li> When AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, if AdjusmentValue (in %) is a positive value, new instances will be added by percentage after the alarm is triggered; if it is a negative value, existing instances will be removed by percentage after the alarm is triggered.
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Long AdjustmentValue;

    /**
    * Alarm monitoring metric.
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * Cooldown period in seconds. Default value: 300 seconds.
    */
    @SerializedName("Cooldown")
    @Expose
    private Long Cooldown;

    /**
    * Array of String | Notification group ID, which is the set of user group IDs and can be queried through the [DescribeUserGroup API](https://cloud.tencent.com/document/api/378/4404).
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Get Auto scaling group ID. 
     * @return AutoScalingGroupId Auto scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Auto scaling group ID.
     * @param AutoScalingGroupId Auto scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Alarm trigger policy name. 
     * @return ScalingPolicyName Alarm trigger policy name.
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set Alarm trigger policy name.
     * @param ScalingPolicyName Alarm trigger policy name.
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * Get The method to adjust the desired number of instances after the alarm is triggered. Value range: <br><li>CHANGE_IN_CAPACITY: Increase or decrease the desired number of instances </li><li>EXACT_CAPACITY: Adjust to the specified desired number of instances </li> <li>PERCENT_CHANGE_IN_CAPACITY: Adjust the desired number of instances by percentage </li> 
     * @return AdjustmentType The method to adjust the desired number of instances after the alarm is triggered. Value range: <br><li>CHANGE_IN_CAPACITY: Increase or decrease the desired number of instances </li><li>EXACT_CAPACITY: Adjust to the specified desired number of instances </li> <li>PERCENT_CHANGE_IN_CAPACITY: Adjust the desired number of instances by percentage </li>
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * Set The method to adjust the desired number of instances after the alarm is triggered. Value range: <br><li>CHANGE_IN_CAPACITY: Increase or decrease the desired number of instances </li><li>EXACT_CAPACITY: Adjust to the specified desired number of instances </li> <li>PERCENT_CHANGE_IN_CAPACITY: Adjust the desired number of instances by percentage </li>
     * @param AdjustmentType The method to adjust the desired number of instances after the alarm is triggered. Value range: <br><li>CHANGE_IN_CAPACITY: Increase or decrease the desired number of instances </li><li>EXACT_CAPACITY: Adjust to the specified desired number of instances </li> <li>PERCENT_CHANGE_IN_CAPACITY: Adjust the desired number of instances by percentage </li>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Get The adjusted value of desired number of instances after the alarm is triggered. Value range: <br><li>When AdjustmentType is CHANGE_IN_CAPACITY, if AdjustmentValue is a positive value, some new instances will be added after the alarm is triggered, and if it is a negative value, some existing instances will be removed after the alarm is triggered </li> <li> When AdjustmentType is EXACT_CAPACITY, the value of AdjustmentValue is the desired number of instances after the alarm is triggered, which should be equal to or greater than 0 </li> <li> When AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, if AdjusmentValue (in %) is a positive value, new instances will be added by percentage after the alarm is triggered; if it is a negative value, existing instances will be removed by percentage after the alarm is triggered. 
     * @return AdjustmentValue The adjusted value of desired number of instances after the alarm is triggered. Value range: <br><li>When AdjustmentType is CHANGE_IN_CAPACITY, if AdjustmentValue is a positive value, some new instances will be added after the alarm is triggered, and if it is a negative value, some existing instances will be removed after the alarm is triggered </li> <li> When AdjustmentType is EXACT_CAPACITY, the value of AdjustmentValue is the desired number of instances after the alarm is triggered, which should be equal to or greater than 0 </li> <li> When AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, if AdjusmentValue (in %) is a positive value, new instances will be added by percentage after the alarm is triggered; if it is a negative value, existing instances will be removed by percentage after the alarm is triggered.
     */
    public Long getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set The adjusted value of desired number of instances after the alarm is triggered. Value range: <br><li>When AdjustmentType is CHANGE_IN_CAPACITY, if AdjustmentValue is a positive value, some new instances will be added after the alarm is triggered, and if it is a negative value, some existing instances will be removed after the alarm is triggered </li> <li> When AdjustmentType is EXACT_CAPACITY, the value of AdjustmentValue is the desired number of instances after the alarm is triggered, which should be equal to or greater than 0 </li> <li> When AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, if AdjusmentValue (in %) is a positive value, new instances will be added by percentage after the alarm is triggered; if it is a negative value, existing instances will be removed by percentage after the alarm is triggered.
     * @param AdjustmentValue The adjusted value of desired number of instances after the alarm is triggered. Value range: <br><li>When AdjustmentType is CHANGE_IN_CAPACITY, if AdjustmentValue is a positive value, some new instances will be added after the alarm is triggered, and if it is a negative value, some existing instances will be removed after the alarm is triggered </li> <li> When AdjustmentType is EXACT_CAPACITY, the value of AdjustmentValue is the desired number of instances after the alarm is triggered, which should be equal to or greater than 0 </li> <li> When AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, if AdjusmentValue (in %) is a positive value, new instances will be added by percentage after the alarm is triggered; if it is a negative value, existing instances will be removed by percentage after the alarm is triggered.
     */
    public void setAdjustmentValue(Long AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Get Alarm monitoring metric. 
     * @return MetricAlarm Alarm monitoring metric.
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set Alarm monitoring metric.
     * @param MetricAlarm Alarm monitoring metric.
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Get Cooldown period in seconds. Default value: 300 seconds. 
     * @return Cooldown Cooldown period in seconds. Default value: 300 seconds.
     */
    public Long getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set Cooldown period in seconds. Default value: 300 seconds.
     * @param Cooldown Cooldown period in seconds. Default value: 300 seconds.
     */
    public void setCooldown(Long Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Get Array of String | Notification group ID, which is the set of user group IDs and can be queried through the [DescribeUserGroup API](https://cloud.tencent.com/document/api/378/4404). 
     * @return NotificationUserGroupIds Array of String | Notification group ID, which is the set of user group IDs and can be queried through the [DescribeUserGroup API](https://cloud.tencent.com/document/api/378/4404).
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set Array of String | Notification group ID, which is the set of user group IDs and can be queried through the [DescribeUserGroup API](https://cloud.tencent.com/document/api/378/4404).
     * @param NotificationUserGroupIds Array of String | Notification group ID, which is the set of user group IDs and can be queried through the [DescribeUserGroup API](https://cloud.tencent.com/document/api/378/4404).
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
        this.setParamSimple(map, prefix + "AdjustmentType", this.AdjustmentType);
        this.setParamSimple(map, prefix + "AdjustmentValue", this.AdjustmentValue);
        this.setParamObj(map, prefix + "MetricAlarm.", this.MetricAlarm);
        this.setParamSimple(map, prefix + "Cooldown", this.Cooldown);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}

