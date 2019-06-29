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

public class CreateScalingPolicyRequest  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Alarm trigger policy name
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * Method of changing desired number of instance after an alarm is triggered. Values include:<br><li>CHANGE_IN_CAPACITY：Increase or decrease desired number of instances</li><li>EXACT_CAPACITY：Adjust to specified desired number of instances</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust the desired number of instances according to a set percentage</li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * The adjustment value of the desired number of instances after an alarm is triggered. Values include:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue means that the number of instances will be increased when an alarm is triggered; a negative AdjustmentValue means that the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY, the AdjustmentValue will be the desired number of instances when an alarm is triggered. The value must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, a positive AdjustmentValue (in %) will be the percentage that the desired number of instances will increase by, a negative AdjustmentValue (in %) will be the percentage that the desired number of instances will decrease by.
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Integer AdjustmentValue;

    /**
    * Alarm monitoring metrics
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * Cooldown period (in seconds). Default is 300 seconds. 
    */
    @SerializedName("Cooldown")
    @Expose
    private Integer Cooldown;

    /**
    * Notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Get scaling group ID
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Alarm trigger policy name
     * @return ScalingPolicyName Alarm trigger policy name
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set Alarm trigger policy name
     * @param ScalingPolicyName Alarm trigger policy name
     */
    public void setScalingPolicyName(String ScalingPolicyName) {
        this.ScalingPolicyName = ScalingPolicyName;
    }

    /**
     * Get Method of changing desired number of instance after an alarm is triggered. Values include:<br><li>CHANGE_IN_CAPACITY：Increase or decrease desired number of instances</li><li>EXACT_CAPACITY：Adjust to specified desired number of instances</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust the desired number of instances according to a set percentage</li>
     * @return AdjustmentType Method of changing desired number of instance after an alarm is triggered. Values include:<br><li>CHANGE_IN_CAPACITY：Increase or decrease desired number of instances</li><li>EXACT_CAPACITY：Adjust to specified desired number of instances</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust the desired number of instances according to a set percentage</li>
     */
    public String getAdjustmentType() {
        return this.AdjustmentType;
    }

    /**
     * Set Method of changing desired number of instance after an alarm is triggered. Values include:<br><li>CHANGE_IN_CAPACITY：Increase or decrease desired number of instances</li><li>EXACT_CAPACITY：Adjust to specified desired number of instances</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust the desired number of instances according to a set percentage</li>
     * @param AdjustmentType Method of changing desired number of instance after an alarm is triggered. Values include:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust to specified desired number of instances</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Get the adjustment value of the desired number of instances after an alarm is triggered. Values include:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue means that the number of instances will be increased when an alarm is triggered; a negative AdjustmentValue means that the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY, the AdjustmentValue will be the desired number of instances when an alarm is triggered. The value must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, a positive AdjustmentValue (in %) will be the percentage that the desired number of instances will increase by, a negative AdjustmentValue (in %) will be the percentage that the desired number of instances will decrease by.
     * @return AdjustmentValue the adjustment value of the desired number of instances after an alarm is triggered. Values include:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue means that the number of instances will be increased when an alarm is triggered; a negative AdjustmentValue means that the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY, the AdjustmentValue will be the desired number of instances when an alarm is triggered. The value must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, a positive AdjustmentValue (in %) will be the percentage that the desired number of instances will increase by, a negative AdjustmentValue (in %) will be the percentage that the desired number of instances will decrease by.
     */
    public Integer getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * Set the adjustment value of the desired number of instances after an alarm is triggered. Values include:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue means that the number of instances will be increased when an alarm is triggered; a negative AdjustmentValue means that the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY, the AdjustmentValue will be the desired number of instances when an alarm is triggered. The value must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, a positive AdjustmentValue (in %) will be the percentage that the desired number of instances will increase by, a negative AdjustmentValue (in %) will be the percentage that the desired number of instances will decrease by.
     * @param AdjustmentValue the adjustment value of the desired number of instances after an alarm is triggered. Values include:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY, a positive AdjustmentValue means that the number of instances will be increased when an alarm is triggered; a negative AdjustmentValue means that the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY, the AdjustmentValue will be the desired number of instances when an alarm is triggered. The value must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY, a positive AdjustmentValue (in %) will be the percentage that the desired number of instances will increase by, a negative AdjustmentValue (in %) will be the percentage that the desired number of instances will decrease by.
     */
    public void setAdjustmentValue(Integer AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Get Alarm monitoring metrics
     * @return MetricAlarm Alarm monitoring metrics
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set Alarm monitoring metrics
     * @param MetricAlarm Alarm monitoring metrics
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * Get Cooldown period (in seconds). Default is 300 seconds. 
     * @return Cooldown Cooldown period (in seconds). Default is 300 seconds. 
     */
    public Integer getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set Cooldown period (in seconds). Default is 300 seconds. 
     * @param Cooldown period (in seconds). Default is 300 seconds. 
     */
    public void setCooldown(Integer Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Get Notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     * @return NotificationUserGroupIds Notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     * @param NotificationUserGroupIds Notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * For internal use only.
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

