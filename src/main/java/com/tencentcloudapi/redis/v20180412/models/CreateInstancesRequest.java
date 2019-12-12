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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancesRequest  extends AbstractModel{

    /**
    * ID of the AZ where the instance resides
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Instance type. 2: Redis 2.8 master-slave edition; 3: Redis 3.2 master-slave edition (CKV master-slave edition); 4: Redis 3.2 cluster edition (CKV cluster edition); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Billing method. 0: pay as you go
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * Instance password. Rules: 1. It can contain 8-16 characters; 2. It must contain at least two of the following three types of characters: letters, digits, and special characters !@^*(). (When creating a password-free instance, you can leave this field along and it will be ignored.)
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Array of security group IDs
    */
    @SerializedName("SecurityGroupIdList")
    @Expose
    private String [] SecurityGroupIdList;

    /**
    * User-defined port. If this parameter is left blank, 6379 will be used by default
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Number of instance shards. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, Redis 2.8 standalone edition, and Redis 4.0 master-slave edition
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of instance replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Whether to support read-only replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition |
    */
    @SerializedName("ReplicasReadonly")
    @Expose
    private Boolean ReplicasReadonly;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Whether to support the password-free feature. Value range: true (password-free instance); false (password-enabled instance). Default value: false
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

    /**
     * Get ID of the AZ where the instance resides 
     * @return ZoneId ID of the AZ where the instance resides
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the AZ where the instance resides
     * @param ZoneId ID of the AZ where the instance resides
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Instance type. 2: Redis 2.8 master-slave edition; 3: Redis 3.2 master-slave edition (CKV master-slave edition); 4: Redis 3.2 cluster edition (CKV cluster edition); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition 
     * @return TypeId Instance type. 2: Redis 2.8 master-slave edition; 3: Redis 3.2 master-slave edition (CKV master-slave edition); 4: Redis 3.2 cluster edition (CKV cluster edition); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set Instance type. 2: Redis 2.8 master-slave edition; 3: Redis 3.2 master-slave edition (CKV master-slave edition); 4: Redis 3.2 cluster edition (CKV cluster edition); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
     * @param TypeId Instance type. 2: Redis 2.8 master-slave edition; 3: Redis 3.2 master-slave edition (CKV master-slave edition); 4: Redis 3.2 cluster edition (CKV cluster edition); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API | 
     * @return MemSize Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
     * @param MemSize Instance capacity in MB. The actual value is subject to the specifications returned by the purchasable specification querying API |
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API 
     * @return GoodsNum Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
     * @param GoodsNum Number of instances. The actual quantity purchasable at a time is subject to the specifications returned by the purchasable specification querying API
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1 
     * @return Period Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
     * @param Period Length of purchase in months, which is required when creating a monthly subscribed instances. Value range: [1,2,3,4,5,6,7,8,9,10,11,12,24,36]. For pay-as-you-go instances, enter 1
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Billing method. 0: pay as you go 
     * @return BillingMode Billing method. 0: pay as you go
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing method. 0: pay as you go
     * @param BillingMode Billing method. 0: pay as you go
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Instance password. Rules: 1. It can contain 8-16 characters; 2. It must contain at least two of the following three types of characters: letters, digits, and special characters !@^*(). (When creating a password-free instance, you can leave this field along and it will be ignored.) 
     * @return Password Instance password. Rules: 1. It can contain 8-16 characters; 2. It must contain at least two of the following three types of characters: letters, digits, and special characters !@^*(). (When creating a password-free instance, you can leave this field along and it will be ignored.)
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Instance password. Rules: 1. It can contain 8-16 characters; 2. It must contain at least two of the following three types of characters: letters, digits, and special characters !@^*(). (When creating a password-free instance, you can leave this field along and it will be ignored.)
     * @param Password Instance password. Rules: 1. It can contain 8-16 characters; 2. It must contain at least two of the following three types of characters: letters, digits, and special characters !@^*(). (When creating a password-free instance, you can leave this field along and it will be ignored.)
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query. 
     * @return VpcId VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
     * @param VpcId VPC ID such as vpc-sad23jfdfk. If this parameter is not passed in, the basic network will be selected by default. Please use the VPC list querying API to query.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2 
     * @return SubnetId In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
     * @param SubnetId In a basic network, subnetId is invalid. In a VPC subnet, the value is the subnet ID, such as subnet-fdj24n34j2
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list 
     * @return ProjectId Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
     * @param ProjectId Project ID. The value is subject to the projectId returned by user account > user account-related querying APIs > project list
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled 
     * @return AutoRenew Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     * @param AutoRenew Auto-renewal flag. 0: default status (manual renewal); 1: auto-renewal enabled; 2: auto-renewal disabled
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Array of security group IDs 
     * @return SecurityGroupIdList Array of security group IDs
     */
    public String [] getSecurityGroupIdList() {
        return this.SecurityGroupIdList;
    }

    /**
     * Set Array of security group IDs
     * @param SecurityGroupIdList Array of security group IDs
     */
    public void setSecurityGroupIdList(String [] SecurityGroupIdList) {
        this.SecurityGroupIdList = SecurityGroupIdList;
    }

    /**
     * Get User-defined port. If this parameter is left blank, 6379 will be used by default 
     * @return VPort User-defined port. If this parameter is left blank, 6379 will be used by default
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set User-defined port. If this parameter is left blank, 6379 will be used by default
     * @param VPort User-defined port. If this parameter is left blank, 6379 will be used by default
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Number of instance shards. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, Redis 2.8 standalone edition, and Redis 4.0 master-slave edition 
     * @return RedisShardNum Number of instance shards. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, Redis 2.8 standalone edition, and Redis 4.0 master-slave edition
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of instance shards. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, Redis 2.8 standalone edition, and Redis 4.0 master-slave edition
     * @param RedisShardNum Number of instance shards. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, Redis 2.8 standalone edition, and Redis 4.0 master-slave edition
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of instance replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition 
     * @return RedisReplicasNum Number of instance replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of instance replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition
     * @param RedisReplicasNum Number of instance replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Whether to support read-only replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition | 
     * @return ReplicasReadonly Whether to support read-only replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition |
     */
    public Boolean getReplicasReadonly() {
        return this.ReplicasReadonly;
    }

    /**
     * Set Whether to support read-only replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition |
     * @param ReplicasReadonly Whether to support read-only replicas. This parameter can be left blank for Redis 2.8 master-slave edition, CKV master-slave edition, and Redis 2.8 standalone edition |
     */
    public void setReplicasReadonly(Boolean ReplicasReadonly) {
        this.ReplicasReadonly = ReplicasReadonly;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Whether to support the password-free feature. Value range: true (password-free instance); false (password-enabled instance). Default value: false 
     * @return NoAuth Whether to support the password-free feature. Value range: true (password-free instance); false (password-enabled instance). Default value: false
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether to support the password-free feature. Value range: true (password-free instance); false (password-enabled instance). Default value: false
     * @param NoAuth Whether to support the password-free feature. Value range: true (password-free instance); false (password-enabled instance). Default value: false
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdList.", this.SecurityGroupIdList);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "ReplicasReadonly", this.ReplicasReadonly);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}

