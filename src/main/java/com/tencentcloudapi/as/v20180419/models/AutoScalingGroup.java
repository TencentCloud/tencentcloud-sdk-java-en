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

public class AutoScalingGroup  extends AbstractModel{

    /**
    * Scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Scaling group name
    */
    @SerializedName("AutoScalingGroupName")
    @Expose
    private String AutoScalingGroupName;

    /**
    * Scaling group current status. Values include:<br><li>NORMAL: Normal.<br><li>CVM_ABNORMAL: Launch configuration abnormal<br><li>LB_ABNORMAL: CLB abnormal<br><li>VPC_ABNORMAL: VPC network abnormal<br><li>INSUFFICIENT_BALANCE: insufficient balance in your account<br>
    */
    @SerializedName("AutoScalingGroupStatus")
    @Expose
    private String AutoScalingGroupStatus;

    /**
    * Creation time, in UTC time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Default cooldown period, in seconds
    */
    @SerializedName("DefaultCooldown")
    @Expose
    private Integer DefaultCooldown;

    /**
    * Desired number of instances.
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Integer DesiredCapacity;

    /**
    * Enabled status, values include `ENABLED` and `DISABLED`
    */
    @SerializedName("EnabledStatus")
    @Expose
    private String EnabledStatus;

    /**
    * List of application load balancers
    */
    @SerializedName("ForwardLoadBalancerSet")
    @Expose
    private ForwardLoadBalancer [] ForwardLoadBalancerSet;

    /**
    * Number of Instances
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * Number of instances in `IN_SERVICE` status
    */
    @SerializedName("InServiceInstanceCount")
    @Expose
    private Integer InServiceInstanceCount;

    /**
    * Launch configuration ID
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Launch configuration name.
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * List of traditional load balancer IDs
    */
    @SerializedName("LoadBalancerIdSet")
    @Expose
    private String [] LoadBalancerIdSet;

    /**
    * Maximum number of instances
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
    * Minimum number of instances
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * List of subnet IDs
    */
    @SerializedName("SubnetIdSet")
    @Expose
    private String [] SubnetIdSet;

    /**
    * Termination policy
    */
    @SerializedName("TerminationPolicySet")
    @Expose
    private String [] TerminationPolicySet;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * List of availability zones
    */
    @SerializedName("ZoneSet")
    @Expose
    private String [] ZoneSet;

    /**
    * Retry policy
    */
    @SerializedName("RetryPolicy")
    @Expose
    private String RetryPolicy;

    /**
    * Whether the scaling group currently has ongoing scaling activity. `IN_ACTIVITY` indicates that there’s an ongoing scaling activity, `NOT_IN_ACTIVITY` indicates there’s no ongoing scaling activity. 
    */
    @SerializedName("InActivityStatus")
    @Expose
    private String InActivityStatus;

    /**
    * Scaling group tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Scaling group ID
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
     * Get scaling group name
     * @return AutoScalingGroupName Scaling group name
     */
    public String getAutoScalingGroupName() {
        return this.AutoScalingGroupName;
    }

    /**
     * Set scaling group name
     * @param AutoScalingGroupName Scaling group name
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
        this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * Get Scaling group current status. Values include:<br><li>NORMAL: Normal.<br><li>CVM_ABNORMAL: Launch configuration abnormal<br><li>LB_ABNORMAL: CLB abnormal<br><li>VPC_ABNORMAL: VPC network abnormal<br><li>INSUFFICIENT_BALANCE: insufficient balance in your account<br>
     * @return AutoScalingGroupStatus Scaling group current status. Values include:<br><li>NORMAL: Normal.<br><li>CVM_ABNORMAL: Launch configuration abnormal<br><li>LB_ABNORMAL: CLB abnormal<br><li>VPC_ABNORMAL: VPC network abnormal<br><li>INSUFFICIENT_BALANCE: insufficient balance in your account<br>
     */
    public String getAutoScalingGroupStatus() {
        return this.AutoScalingGroupStatus;
    }

    /**
     * Set Scaling group current status. Values include:<br><li>NORMAL: Normal.<br><li>CVM_ABNORMAL: Launch configuration abnormal<br><li>LB_ABNORMAL: CLB abnormal<br><li>VPC_ABNORMAL: VPC network abnormal<br><li>INSUFFICIENT_BALANCE: insufficient balance in your account<br>
     * @param AutoScalingGroupStatus Scaling group current status. Values include:<br><li>NORMAL: Normal.<br><li>CVM_ABNORMAL: Launch configuration abnormal<br><li>LB_ABNORMAL: CLB abnormal<br><li>VPC_ABNORMAL: VPC network abnormal<br><li>INSUFFICIENT_BALANCE: insufficient balance in your account<br>
     */
    public void setAutoScalingGroupStatus(String AutoScalingGroupStatus) {
        this.AutoScalingGroupStatus = AutoScalingGroupStatus;
    }

    /**
     * Get Creation time, in UTC time.
     * @return CreatedTime Creation time, in UTC time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time, in UTC time.
     * @param CreatedTime Creation time, in UTC time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Default cooldown period, in seconds
     * @return DefaultCooldown Default cooldown period, in seconds
     */
    public Integer getDefaultCooldown() {
        return this.DefaultCooldown;
    }

    /**
     * Set Default cooldown period, in seconds
     * @param DefaultCooldown Default cooldown period, in seconds
     */
    public void setDefaultCooldown(Integer DefaultCooldown) {
        this.DefaultCooldown = DefaultCooldown;
    }

    /**
     * Get Desired number of instances.
     * @return DesiredCapacity Desired number of instances.
     */
    public Integer getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set Desired number of instances.
     * @param DesiredCapacity Desired number of instances.
     */
    public void setDesiredCapacity(Integer DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get Enabled status, values include `ENABLED` and `DISABLED`
     * @return EnabledStatus Enabled status, values include `ENABLED` and `DISABLED`
     */
    public String getEnabledStatus() {
        return this.EnabledStatus;
    }

    /**
     * Set Enabled status, values include `ENABLED` and `DISABLED`
     * @param EnabledStatus Enabled status, values include `ENABLED` and `DISABLED`
     */
    public void setEnabledStatus(String EnabledStatus) {
        this.EnabledStatus = EnabledStatus;
    }

    /**
     * Get List of application load balancers
     * @return ForwardLoadBalancerSet List of application load balancers
     */
    public ForwardLoadBalancer [] getForwardLoadBalancerSet() {
        return this.ForwardLoadBalancerSet;
    }

    /**
     * Set List of application load balancers
     * @param ForwardLoadBalancerSet List of application load balancers
     */
    public void setForwardLoadBalancerSet(ForwardLoadBalancer [] ForwardLoadBalancerSet) {
        this.ForwardLoadBalancerSet = ForwardLoadBalancerSet;
    }

    /**
     * Get number of instances
     * @return InstanceCount number of instances
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set number of instances
     * @param InstanceCount number of instances 
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Number of instances in `IN_SERVICE` status
     * @return InServiceInstanceCount Number of instances in `IN_SERVICE` status
     */
    public Integer getInServiceInstanceCount() {
        return this.InServiceInstanceCount;
    }

    /**
     * Set Number of instances in `IN_SERVICE` status
     * @param InServiceInstanceCount Number of instances in `IN_SERVICE` status
     */
    public void setInServiceInstanceCount(Integer InServiceInstanceCount) {
        this.InServiceInstanceCount = InServiceInstanceCount;
    }

    /**
     * Get launch configuration ID
     * @return LaunchConfigurationId Launch configuration ID.
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set launch configuration ID
     * @param LaunchConfigurationId Launch configuration ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get launch configuration name
     * @return LaunchConfigurationName launch configuration name
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set launch configuration name
     * @param LaunchConfigurationName Launch configuration name
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get List of traditional load balancer IDs
     * @return LoadBalancerId List of traditional load balancer IDs
     */
    public String [] getLoadBalancerIdSet() {
        return this.LoadBalancerIdSet;
    }

    /**
     * Set List of traditional load balancer IDs
     * @param LoadBalancerIdSet List of traditional load balancer IDs
     */
    public void setLoadBalancerIdSet(String [] LoadBalancerIdSet) {
        this.LoadBalancerIdSet = LoadBalancerIdSet;
    }

    /**
     * Get Maximum number of instances
     * @return MaxSize Maximum number of instances
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum number of instances
     * @param MaxSize Maximum number of instances
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Minimum number of instances
     * @return MinSize Minimum number of instances
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Minimum number of instances
     * @param MinSize Minimum number of instances
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
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
     * Get List of subnet IDs
     * @return SubnetIds List of subnet IDs
     */
    public String [] getSubnetIdSet() {
        return this.SubnetIdSet;
    }

    /**
     * Set List of subnet IDs
     * @param SubnetIdSet List of subnet IDs
     */
    public void setSubnetIdSet(String [] SubnetIdSet) {
        this.SubnetIdSet = SubnetIdSet;
    }

    /**
     * Get Termination policy
     * @return TerminationPolicySet Termination policy
     */
    public String [] getTerminationPolicySet() {
        return this.TerminationPolicySet;
    }

    /**
     * Set Termination policy
     * @param TerminationPolicySet Termination policy
     */
    public void setTerminationPolicySet(String [] TerminationPolicySet) {
        this.TerminationPolicySet = TerminationPolicySet;
    }

    /**
     * Get VPC ID
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get list of availability zones
     * @return ZoneSet List of Availability Zones
     */
    public String [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set list of availability zones
     * @param ZoneSet List of Availability Zones
     */
    public void setZoneSet(String [] ZoneSet) {
        this.ZoneSet = ZoneSet;
    }

    /**
     * Get retry policy
     * @return RetryPolicy
     */
    public String getRetryPolicy() {
        return this.RetryPolicy;
    }

    /**
     * Set retry policy
     * @param RetryPolicy
     */
    public void setRetryPolicy(String RetryPolicy) {
        this.RetryPolicy = RetryPolicy;
    }

    /**
     * Get Whether the scaling group currently has ongoing scaling activity. `IN_ACTIVITY` indicates that there’s an ongoing scaling activity, `NOT_IN_ACTIVITY` indicates there’s no ongoing scaling activity. 
     * @return InActivityStatus Whether the scaling group currently has ongoing scaling activity. `IN_ACTIVITY` indicates that there’s an ongoing scaling activity, `NOT_IN_ACTIVITY` indicates there’s no ongoing scaling activity. 
     */
    public String getInActivityStatus() {
        return this.InActivityStatus;
    }

    /**
     * Set Whether the scaling group currently has ongoing scaling activity. `IN_ACTIVITY` indicates that there’s an ongoing scaling activity, `NOT_IN_ACTIVITY` indicates there’s no ongoing scaling activity. 
     * @param InActivityStatus Whether the scaling group currently has ongoing scaling activity. `IN_ACTIVITY` indicates that there’s an ongoing scaling activity, `NOT_IN_ACTIVITY` indicates there’s no ongoing scaling activity. 
     */
    public void setInActivityStatus(String InActivityStatus) {
        this.InActivityStatus = InActivityStatus;
    }

    /**
     * Get scaling group tag list
     * @return Tags scaling group tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set scaling group tag list
     * @param Tags scaling group tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupName", this.AutoScalingGroupName);
        this.setParamSimple(map, prefix + "AutoScalingGroupStatus", this.AutoScalingGroupStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DefaultCooldown", this.DefaultCooldown);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "EnabledStatus", this.EnabledStatus);
        this.setParamArrayObj(map, prefix + "ForwardLoadBalancerSet.", this.ForwardLoadBalancerSet);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InServiceInstanceCount", this.InServiceInstanceCount);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamArraySimple(map, prefix + "LoadBalancerIdSet.", this.LoadBalancerIdSet);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SubnetIdSet.", this.SubnetIdSet);
        this.setParamArraySimple(map, prefix + "TerminationPolicySet.", this.TerminationPolicySet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RetryPolicy", this.RetryPolicy);
        this.setParamSimple(map, prefix + "InActivityStatus", this.InActivityStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

