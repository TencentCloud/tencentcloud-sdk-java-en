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

public class CreateAutoScalingGroupRequest  extends AbstractModel{

    /**
    * Scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

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
    * VPC ID, enter an empty string for Basic Network
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Default cooldown period (in seconds), default value is 300. 
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
    * List of traditional load balancer IDs. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * List of application-based load balancers. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
    */
    @SerializedName("ForwardLoadBalancers")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancers;

    /**
    * List of subnet IDs. You must specify subnets when creating a scaling group under a VPC. 
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Termination policies. The number of policies is limited to 1. Values include OLDEST_INSTANCE and NEWEST_INSTANCE. Default value is OLDEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
    */
    @SerializedName("TerminationPolicies")
    @Expose
    private String [] TerminationPolicies;

    /**
    * List of availability zones. You must specify availability zones when creating a scaling group under a VPC.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * Retry policy, value includes IMMEDIATE_RETRY and INCREMENTAL_INTERVALS. Default value is   IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately. Retry again quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: Retry in incrementing intervals. As the number of consecutive failures increases, the intervals between each attempt increases gradually. Interval ranges from seconds to 1 day.
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * Availability zone validation policy. Values include ALL and ANY. Default value is ANY. <br><li> ALL: All availability zones(Zone) or subnets(SubnetId) can be used or validation fails<br><li> ANY: Any one of availability zones(Zone) or subnets(SubnetId) can be used or validation fails Common reasons why availability zones or subnet are unavailable: CVM instance type in the availability zone is sold out; CBS cloud disk in the availability zone is sold out; the availability zone has insufficient quota or the subnet IP is insufficient. If the availability zone or subnet in Zones/SubnetIds does not exist, the validation will fail regardless of the value of ZonesCheckPolicy.
    */
    @SerializedName("ZonesCheckPolicy")
    @Expose
    private String ZonesCheckPolicy;

    /**
    * Tag description list. This parameter is used to bind a tag to a scaling group, it also binds the tag to the associated instance.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     * @return AutoScalingGroupName Scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     * @param AutoScalingGroupName Scaling group name, must be unique in your account. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 55 characters.
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get launch configuration ID.
     * @return LaunchConfigurationId Launch configuration ID.
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set launch configuration ID.
     * @param LaunchConfigurationId Launch configuration ID.
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get max instance number, value range between 0-2000.
     * @return MaxSize Max instance number, value range between 0-2000.
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set max instance number, value range between 0-2000.
     * @param MaxSize Max instance number, value range between 0-2000.
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get min instance number, value range between 0-2000.
     * @return MinSize Min instance number, value range between 0-2000.
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Set min instance number, value range between 0-2000.
     * @param MinSize Min instance number, value range between 0-2000.
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get VPC ID, enter an empty string for Basic Network
     * @return VpcId VPC ID, enter an empty string for Basic Network
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, enter an empty string for Basic Network
     * @param VpcId VPC ID, enter an empty string for Basic Network
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get default cooldown period (in seconds), default value is 300. 
     * @return DefaultCooldown Default cooldown period (in seconds), default value is 300. 
     */
    public Integer getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set default cooldown period (in seconds), default value is 300. 
     * @param DefaultCooldown Default cooldown period (in seconds), default value is 300. 
     */
    public void setDefaultCooldown(Integer DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get desired instance number, value should be between the max and min number. 
     * @return DesiredCapacity Desired instance number, value should be between the max and min number. 
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set desired instance number, value should be between the max and min number. 
     * @param DesiredCapacity Desired instance number, value should be between the max and min number. 
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get list of traditional load balancer IDs. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     * @return LoadBalancerIds List of traditional load balancer IDs. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set list of traditional load balancer IDs. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     * @param LoadBalancerIds List of traditional load balancer IDs. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get project ID
     * @return ProjectId Project ID.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get list of application-based load balancers. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     * @return ForwardLoadBalancers ID List of application-based load balancers. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     */
    public ForwardLoadBalancer [] getForwardLoadBalancers() {
        return this.ForwardLoadBalancers;
    }

    /**
     * Set list of application-based load balancers. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     * @param ForwardLoadBalancers List of application-based load balancers. Currently limited to 1. You cannot specify both LoadBalancerIds and ForwardLoadBalancers.
     */
    public void setForwardLoadBalancers(ForwardLoadBalancer [] ForwardLoadBalancers) {
        this.ForwardLoadBalancers = ForwardLoadBalancers;
    }

    /**
     * Get list of subnet IDs. You must specify subnets when creating a scaling group under a VPC. 
     * @return SubnetIds List of subnet IDs. You must specify subnets when creating a scaling group under a VPC. 
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set list of subnet IDs. You must specify subnets when creating a scaling group under a VPC. 
     * @param SubnetIds List of subnet IDs. You must specify subnets when creating a scaling group under a VPC. 
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Termination policies. The number of policies is limited to 1. Values include OLDEST_INSTANCE and NEWEST_INSTANCE. Default value is OLDEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     * @return TerminationPolicies Termination policies. The number of policies is limited to 1. Values include OLDEST_INSTANCE and NEWEST_INSTANCE. Default value is OLDEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     */
    public String [] getTerminationPolicies() {
        return this.TerminationPolicies;
    }

    /**
     * Set Termination policies. The number of policies is limited to 1. Values include OLDEST_INSTANCE and NEWEST_INSTANCE. Default value is OLDEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     * @param TerminationPolicies Termination policies. The number of policies is limited to 1. Values include OLDEST_INSTANCE and NEWEST_INSTANCE. Default value is OLDEST_INSTANCE.<br><li> OLDEST_INSTANCE: Prioritize the oldest instance in the scaling group.<br><li> NEWEST_INSTANCE: Prioritize the latest instance in the scaling group.
     */
    public void setTerminationPolicies(String [] TerminationPolicies) {
        this.TerminationPolicies = TerminationPolicies;
    }

    /**
     * Get List of availability zones. You must specify availability zones when creating a scaling group under a VPC.
     * @return Zones List of availability zones. You must specify availability zones when creating a scaling group under a VPC.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set List of availability zones. You must specify availability zones when creating a scaling group under a VPC.
     * @param Zones List of availability zones. You must specify availability zones when creating a scaling group under a VPC.
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Retry policy, value includes IMMEDIATE_RETRY and INCREMENTAL_INTERVALS. Default value is   IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately. Retry again quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: Retry in incrementing intervals. As the number of consecutive failures increases, the intervals between each attempt increases gradually. Interval ranges from seconds to 1 day.
     * @return RetryPolicy Retry policy, value includes IMMEDIATE_RETRY and INCREMENTAL_INTERVALS. Default value is   IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately. Retry again quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: Retry in incrementing intervals. As the number of consecutive failures increases, the intervals between each attempt increases gradually. Interval ranges from seconds to 1 day.
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set Retry policy, value includes IMMEDIATE_RETRY and INCREMENTAL_INTERVALS. Default value is   IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately. Retry again quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: Retry in incrementing intervals. As the number of consecutive failures increases, the intervals between each attempt increases gradually. Interval ranges from seconds to 1 day.
     * @param RetryPolicy Retry policy, value includes IMMEDIATE_RETRY and INCREMENTAL_INTERVALS. Default value is   IMMEDIATE_RETRY.<br><li> IMMEDIATE_RETRY: Retry immediately. Retry again quickly in a short period of time. Continuous failures will not be retried after more than a certain number of times (5 times).<br><li> INCREMENTAL_INTERVALS: Retry in incrementing intervals. As the number of consecutive failures increases, the intervals between each attempt increases gradually. Interval ranges from seconds to 1 day.
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get Availability zone validation policy. Values include ALL and ANY. Default value is ANY. <br><li> ALL: All availability zones(Zone) or subnets(SubnetId) can be used or validation fails<br><li> ANY: Any one of availability zones(Zone) or subnets(SubnetId) can be used or validation fails Common reasons why availability zones or subnet are unavailable: CVM instance type in the availability zone is sold out; CBS cloud disk in the availability zone is sold out; the availability zone has insufficient quota or the subnet IP is insufficient. If the availability zone or subnet in Zones/SubnetIds does not exist, the validation will fail regardless of the value of ZonesCheckPolicy.
     * @return ZonesCheckPolicy Availability zone validation policy. Values include ALL and ANY. Default value is ANY. <br><li> ALL: All availability zones(Zone) or subnets(SubnetId) can be used or validation fails<br><li> ANY: Any one of availability zones(Zone) or subnets(SubnetId) can be used or validation fails Common reasons why availability zones or subnet are unavailable: CVM instance type in the availability zone is sold out; CBS cloud disk in the availability zone is sold out; the availability zone has insufficient quota or the subnet IP is insufficient. If the availability zone or subnet in Zones/SubnetIds does not exist, the validation will fail regardless of the value of ZonesCheckPolicy.
     */
    public String getZonesCheckPolicy() {
        return this.ZonesCheckPolicy;
    }

    /**
     * Set Availability zone validation policy. Values include ALL and ANY. Default value is ANY. <br><li> ALL: All availability zones(Zone) or subnets(SubnetId) can be used or validation fails<br><li> ANY: Any one of availability zones(Zone) or subnets(SubnetId) can be used or validation fails Common reasons why availability zones or subnet are unavailable: CVM instance type in the availability zone is sold out; CBS cloud disk in the availability zone is sold out; the availability zone has insufficient quota or the subnet IP is insufficient. If the availability zone or subnet in Zones/SubnetIds does not exist, the validation will fail regardless of the value of ZonesCheckPolicy.
     * @param ZonesCheckPolicy Availability zone validation policy. Values include ALL and ANY. Default value is ANY. <br><li> ALL: All availability zones(Zone) or subnets(SubnetId) can be used or validation fails<br><li> ANY: Any one of availability zones(Zone) or subnets(SubnetId) can be used or validation fails Common reasons why availability zones or subnet are unavailable: CVM instance type in the availability zone is sold out; CBS cloud disk in the availability zone is sold out; the availability zone has insufficient quota or the subnet IP is insufficient. If the availability zone or subnet in Zones/SubnetIds does not exist, the validation will fail regardless of the value of ZonesCheckPolicy.
     */
    public void setZonesCheckPolicy(String ZonesCheckPolicy) {
        this.ZonesCheckPolicy = ZonesCheckPolicy;
    }

    /**
     * Get Tag description list. This parameter is used to bind a tag to a scaling group, it also binds the tag to the associated instance.
     * @return Tags Tag description list. This parameter is used to bind a tag to a scaling group, it also binds the tag to the associated instance.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag description list. This parameter is used to bind a tag to a scaling group, it also binds the tag to the associated instance.
     * @param Tags Tag description list. This parameter is used to bind a tag to a scaling group, it also binds the tag to the associated instance.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancers.", this.ForwardLoadBalancers);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "TerminationPolicies.", this.TerminationPolicies);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "ZonesCheckPolicy", this.ZonesCheckPolicy);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

