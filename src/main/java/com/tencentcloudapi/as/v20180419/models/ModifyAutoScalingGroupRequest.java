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

public class ModifyAutoScalingGroupRequest  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * Default cooldown period (in sec), default value is 300.
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Integer DefaultCooldown;

    /**
    * Desired instance number, value should be between the max and min number.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * Launch configuration ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Max instance number, value range between 0-2000.
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * Min instance number, value range between 0-2000.
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * The list of subnet.
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Termination policies. The number of policies is limited to 1. Valid value: OLDEST_INSTANCE and NEWEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
    */
    @SerializedName("TerminationPolicies")
    @Expose
    private String [] TerminationPolicies;

    /**
    * VPC ID. This field is left empty for basic networks. You need to specify SubnetIds when modifying the network of the scaling group to a VPC with a specified VPC ID. Specify Zones when modifying the network to a basic network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * List of availability zones.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Retry policy, available value include: IMMEDIATE_RETRY and INCREMENTAL_INTERVALS，Default value:  IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately, retry quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: The interval is incremented and retry. As the number of consecutive failures increases, the retry interval increases gradually, and the retry interval ranges from seconds to 1 day.
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * Validation policy about availability zone. Valid value:ALL,ANY. Default value is ANY. It works when the scaling group changes the resource field (start configuration, available area, subnet).<br><li> ALL: All availability zones or SubnetId can be used, then the validation is passed. Otherwise validation fail.<br><li> ANY: Any one of availability zones or SubnetId can be used,then the validation is passed.Otherwise validation fail. Common reasons for the zones or subnet are unavailable includ: the available zones CVM instance type is sold out; the available zones CBS cloud disk sold out; the available zones quota is insufficient and the subnet IP is insufficient. If the available area or subnet in Zones/SubnetIds does not exist, the error will be verified regardless of the value of ZonesCheckPolicy.
    */
    @SerializedName("ZonesCheckPolicy")
    @Expose
    private String ZonesCheckPolicy;

    /**
     * Obtain the scaling group ID.
     * @return AutoScalingGroupId Scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Configure the scaling group ID.
     * @param AutoScalingGroupId Scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Obtain the scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     * @return AutoScalingGroupName Scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Configure the scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     * @param AutoScalingGroupName Scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Obtain the default cooldown period (in sec), default value is 300.
     * @return DefaultCooldown Default cooldown period (in sec), default value is 300.
     */
    public Integer getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Configure the default cooldown period (in sec), default value is 300.
     * @param DefaultCooldown Default cooldown period (in sec), default value is 300.
     */
    public void setDefaultCooldown(Integer DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Obtain the desired instance number, value should be between the max and min number.
     * @return DesiredCapacity Desired instance number, value should be between the max and min number.
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Configure the desired instance number, value should be between the max and min number.
     * @param DesiredCapacity Desired instance number, value should be between the max and min number.
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Obtain the launch configuration ID.
     * @return LaunchConfigurationId Launch configuration ID.
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Configure the launch configuration ID.
     * @param LaunchConfigurationId Launch configuration ID.
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Obtain the max instance number, value range between 0-2000.
     * @return MaxSize Max instance number, value range between 0-2000.
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Configure the max instance number, value range between 0-2000.
     * @param MaxSize Max instance number, value range between 0-2000.
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Obtain the min instance number, value range between 0-2000.
     * @return MinSize Min instance number, value range between 0-2000.
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Configure the min instance number, value range between 0-2000.
     * @param MinSize Min instance number, value range between 0-2000.
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Obtain the project ID.
     * @return ProjectId Project ID.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Configure the project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Obtain the list of subnet.
     * @return SubnetIds The list of subnet.
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Configure the list of subnet.
     * @param SubnetIds The list of subnet.
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Obtain the termination policies. The number of policies is limited to 1. Valid value: OLDEST_INSTANCE and NEWEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     * @return TerminationPolicies Termination policies. The number of policies is limited to 1. Valid value: OLDEST_INSTANCE and NEWEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     */
    public String [] getTerminationPolicies() {
        return this.TerminationPolicies;
    }

    /**
     * Configure the termination policies. The number of policies is limited to 1. Valid value: OLDEST_INSTANCE and NEWEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     * @param TerminationPolicies Termination policies. The number of policies is limited to 1. Valid value: OLDEST_INSTANCE and NEWEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     */
    public void setTerminationPolicies(String [] TerminationPolicies) {
        this.TerminationPolicies = TerminationPolicies;
    }

    /**
     * Obtain the VPC ID. This field is left empty for basic networks. You need to specify SubnetIds when modifying the network of the scaling group to a VPC with a specified VPC ID. Specify Zones when modifying the network to a basic network.
     * @return VpcId VPC ID, VPC ID. This field is left empty for basic networks. You need to specify SubnetIds when modifying the network of the scaling group to a VPC with a specified VPC ID. Specify Zones when modifying the network to a basic network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Configure the VPC ID. This field is left empty for basic networks. You need to specify SubnetIds when modifying the network of the scaling group to a VPC with a specified VPC ID. Specify Zones when modifying the network to a basic network.
     * @param VpcId VPC ID, VPC ID. This field is left empty for basic networks. You need to specify SubnetIds when modifying the network of the scaling group to a VPC with a specified VPC ID. Specify Zones when modifying the network to a basic network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Obtain the list of availability zones.
     * @return Zones List of availability zones.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Configure the list of availability zones.
     * @param Zones List of availability zones.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Obtain the retry policy, available value include: IMMEDIATE_RETRY and INCREMENTAL_INTERVALS，Default value:  IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately, retry quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: The interval is incremented and retry. As the number of consecutive failures increases, the retry interval increases gradually, and the retry interval ranges from seconds to 1 day.
     * @return RetryPolicy Retry policy, available value include: IMMEDIATE_RETRY and INCREMENTAL_INTERVALS，Default value:  IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately, retry quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: The interval is incremented and retry. As the number of consecutive failures increases, the retry interval increases gradually, and the retry interval ranges from seconds to 1 day.
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Configure the retry policy, available value include: IMMEDIATE_RETRY and INCREMENTAL_INTERVALS，Default value:  IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately, retry quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: The interval is incremented and retry. As the number of consecutive failures increases, the retry interval increases gradually, and the retry interval ranges from seconds to 1 day.
     * @param RetryPolicy Retry policy, available value include: IMMEDIATE_RETRY and INCREMENTAL_INTERVALS，Default value:  IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately, retry quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: The interval is incremented and retry. As the number of consecutive failures increases, the retry interval increases gradually, and the retry interval ranges from seconds to 1 day.
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Obtain the validation policy about availability zone. Valid value:ALL,ANY. Default value is ANY. It works when the scaling group changes the resource field (start configuration, available area, subnet).<br><li> ALL: All availability zones or SubnetId can be used, then the validation is passed. Otherwise validation fail.<br><li> ANY: Any one of availability zones or SubnetId can be used,then the validation is passed.Otherwise validation fail. Common reasons for the zones or subnet are unavailable includ: the available zones CVM instance type is sold out; the available zones CBS cloud disk sold out; the available zones quota is insufficient and the subnet IP is insufficient. If the available area or subnet in Zones/SubnetIds does not exist, the error will be verified regardless of the value of ZonesCheckPolicy.
     * @return ZonesCheckPolicy Validation policy about availability zone. Valid value:ALL,ANY. Default value is ANY. It works when the scaling group changes the resource field (start configuration, available area, subnet).<br><li> ALL: All availability zones or SubnetId can be used, then the validation is passed. Otherwise validation fail.<br><li> ANY: Any one of availability zones or SubnetId can be used,then the validation is passed.Otherwise validation fail. Common reasons for the zones or subnet are unavailable includ: the available zones CVM instance type is sold out; the available zones CBS cloud disk sold out; the available zones quota is insufficient and the subnet IP is insufficient. If the available area or subnet in Zones/SubnetIds does not exist, the error will be verified regardless of the value of ZonesCheckPolicy.
     */
    public String getZonesCheckPolicy() {
        return this.ZonesCheckPolicy;
    }

    /**
     * Configure the validation policy about availability zone. Valid value:ALL,ANY. Default value is ANY. It works when the scaling group changes the resource field (start configuration, available area, subnet).<br><li> ALL: All availability zones or SubnetId can be used, then the validation is passed. Otherwise validation fail.<br><li> ANY: Any one of availability zones or SubnetId can be used,then the validation is passed.Otherwise validation fail. Common reasons for the zones or subnet are unavailable includ: the available zones CVM instance type is sold out; the available zones CBS cloud disk sold out; the available zones quota is insufficient and the subnet IP is insufficient. If the available area or subnet in Zones/SubnetIds does not exist, the error will be verified regardless of the value of ZonesCheckPolicy.
     * @param ZonesCheckPolicy Validation policy about availability zone. Valid value:ALL,ANY. Default value is ANY. It works when the scaling group changes the resource field (start configuration, available area, subnet).<br><li> ALL: All availability zones or SubnetId can be used, then the validation is passed. Otherwise validation fail.<br><li> ANY: Any one of availability zones or SubnetId can be used,then the validation is passed.Otherwise validation fail. Common reasons for the zones or subnet are unavailable includ: the available zones CVM instance type is sold out; the available zones CBS cloud disk sold out; the available zones quota is insufficient and the subnet IP is insufficient. If the available area or subnet in Zones/SubnetIds does not exist, the error will be verified regardless of the value of ZonesCheckPolicy.
     */
    public void setZonesCheckPolicy(String ZonesCheckPolicy) {
        this.ZonesCheckPolicy = ZonesCheckPolicy;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "TerminationPolicies.", this.TerminationPolicies);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ZonesCheckPolicy", this.ZonesCheckPolicy);

    }
}

