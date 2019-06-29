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

public class ModifyScalingPolicyRequest  extends AbstractModel{

    /**
    * Alert policy ID.
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * Alert policy name.
    */
    @SerializedName("ScalingPolicyName")
    @Expose
    private String ScalingPolicyName;

    /**
    * After an alert is triggered,the method to change expected instance number. Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust to desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
    */
    @SerializedName("AdjustmentType")
    @Expose
    private String AdjustmentType;

    /**
    * After an alert is triggered, the adjusted number of expected instances.Value:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY， a positive AdjustmentValue value means the number of instances will be increased after the alert is triggered; a negative AdjustmentValue value means the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY， an AdjustmentValue value is the number of expected instances after alert is triggered. It must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY， a positive AdjustmentValue value is the percentage that the number of expected instances will increase by,a negative value is that the number of expected instances will decrease by after alert is triggered. Its unit is %.
    */
    @SerializedName("AdjustmentValue")
    @Expose
    private Integer AdjustmentValue;

    /**
    * Cool down time. In seconds.
    */
    @SerializedName("Cooldown")
    @Expose
    private Integer Cooldown;

    /**
    * Metrics for alert monitoring.
    */
    @SerializedName("MetricAlarm")
    @Expose
    private MetricAlarm MetricAlarm;

    /**
    * ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404). When an alert user group needs to be cleared, a string “NULL” must be put into the list.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Obtain alert policy ID.
     * @return AutoScalingPolicyId Alert policy ID.
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set Alert policy ID.
     * @param AutoScalingPolicyId Alert policy ID.
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * Obtain alert policy name.
     * @return ScalingPolicyName alert policy name.
     */
    public String getScalingPolicyName() {
        return this.ScalingPolicyName;
    }

    /**
     * Set alert policy name.
     * | scalingPolicyName | Name of the user-defined alarm policy.
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
     * Set the method to modify expected instance number after an alert is triggered.Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
     * @param AdjustmentType After an alert is triggered, the method to modify expected instance number.Value:<br><li>CHANGE_IN_CAPACITY：Increase or decrease expected instance number.</li><li>EXACT_CAPACITY：Adjust desired expected instance number.</li> <li>PERCENT_CHANGE_IN_CAPACITY：Adjust to expected instance number as per percentage.</li>
     */
    public void setAdjustmentType(String AdjustmentType) {
        this.AdjustmentType = AdjustmentType;
    }

    /**
     * Obtain new value of expected instance number after an alert is triggered.Value:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY， a positive AdjustmentValue value means the number of instances will be increased after the alert is triggered; a negative AdjustmentValue value means the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY， an AdjustmentValue value is the number of expected instances after alert is triggered. It must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY， a positive AdjustmentValue value is the percentage that the number of expected instances will increase by,a negative value is that the number of expected instances will decrease by after alert is triggered. Its unit is %.
     * @return AdjustmentValue After an alert is triggered, the adjusted expected instance number. Value:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY， a positive AdjustmentValue value means the number of instances will be increased after the alert is triggered; a negative AdjustmentValue value means the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY， an AdjustmentValue value is the number of expected instances after alert is triggered. It must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY， a positive AdjustmentValue value is the percentage that the number of expected instances will increase by,a negative value is that the number of expected instances will decrease by after alert is triggered. Its unit is %.
     */
    public Integer getAdjustmentValue() {
        return this.AdjustmentValue;
    }

    /**
     * After an alert is triggered, the adjusted expected instance number. Value:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY， a positive AdjustmentValue value means the number of instances will be increased after the alert is triggered; a negative AdjustmentValue value means the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY， an AdjustmentValue value is the number of expected instances after alert is triggered. It must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY， a positive AdjustmentValue value is the percentage that the number of expected instances will increase by,a negative value is that the number of expected instances will decrease by after alert is triggered. Its unit is %.
     * @param AdjustmentValue After an alert is triggered, the adjusted expected instance number. Value:<br><li>If AdjustmentType is CHANGE_IN_CAPACITY， a positive AdjustmentValue value means the number of instances will be increased after the alert is triggered; a negative AdjustmentValue value means the number of instances will be decreased. </li> <li> If AdjustmentType is EXACT_CAPACITY， an AdjustmentValue value is the number of expected instances after alert is triggered. It must be greater or equal to zero. </li> <li> If AdjustmentType is PERCENT_CHANGE_IN_CAPACITY， a positive AdjustmentValue value is the percentage that the number of expected instances will increase by,a negative value is that the number of expected instances will decrease by after alert is triggered. Its unit is %.
     */
    public void setAdjustmentValue(Integer AdjustmentValue) {
        this.AdjustmentValue = AdjustmentValue;
    }

    /**
     * Obtain cool down time, in seconds.
     * @return Cooldown cool down time, in seconds.
     */
    public Integer getCooldown() {
        return this.Cooldown;
    }

    /**
     * Set cool down time, in seconds.
     * @param Cooldown cool down time, in seconds.
     */
    public void setCooldown(Integer Cooldown) {
        this.Cooldown = Cooldown;
    }

    /**
     * Obtain alert monitoring metrics.
     * @return MetricAlarm Alert monitoring metrics.
     */
    public MetricAlarm getMetricAlarm() {
        return this.MetricAlarm;
    }

    /**
     * Set alert monitoring metrics.
     * @param MetricAlarm Alert monitoring metrics.
     */
    public void setMetricAlarm(MetricAlarm MetricAlarm) {
        this.MetricAlarm = MetricAlarm;
    }

    /**
     * ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404). When an alert user group needs to be cleared, a string “NULL” must be put into the list.
     * ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404). When an alert user group needs to be cleared, a string “NULL” must be put into the list.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404). When an alert user group needs to be cleared, a string “NULL” must be put into the list.
     * ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404). When an alert user group needs to be cleared, a string “NULL” must be put into the list.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "ScalingPolicyName", this.ScalingPolicyName);
        this.setParamSimple(map, prefix + "AdjustmentType", this.AdjustmentType);
        this.setParamSimple(map, prefix + "AdjustmentValue", this.AdjustmentValue);
        this.setParamSimple(map, prefix + "Cooldown", this.Cooldown);
        this.setParamObj(map, prefix + "MetricAlarm.", this.MetricAlarm);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}

