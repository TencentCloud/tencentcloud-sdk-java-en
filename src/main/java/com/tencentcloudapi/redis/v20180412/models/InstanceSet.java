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

public class InstanceSet  extends AbstractModel{

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * User's Appid
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong, China; 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Region ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * VPC ID, such as 75101
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * VPC subnet ID, such as 46315
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Instance VIP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Port number of an instance
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance creation time
    */
    @SerializedName("Createtime")
    @Expose
    private String Createtime;

    /**
    * Instance capacity in MB
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * This field has been disused
    */
    @SerializedName("SizeUsed")
    @Expose
    private Float SizeUsed;

    /**
    * Instance type. 1: Redis 2.8 cluster edition; 2: Redis 2.8 master-slave edition; 3: CKV master-slave edition (Redis 3.2); 4: CKV cluster edition (Redis 3.2); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Whether to set the auto-renewal flag for an instance. 1: auto-renewal set; 0: auto-renewal not set
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Instance expiration time
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * Engine: Redis community edition, Tencent Cloud CKV
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * Product type: Redis 2.8 cluster edition, Redis 2.8 master-slave edition, Redis 3.2 master-slave edition (CKV master-slave edition), Redis 3.2 cluster edition (CKV cluster edition), Redis 2.8 standalone edition, Redis 4.0 cluster edition
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * VPC ID, such as vpc-fk33jsf43kgv
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC subnet ID, such as subnet-fd3j6l35mm0
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Billing method. 0: pay-as-you-go; 1: monthly subscription
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * Description of an instance status, such as "instance running"
    */
    @SerializedName("InstanceTitle")
    @Expose
    private String InstanceTitle;

    /**
    * Scheduled deactivation time
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
    * Sub-status returned for an instance in process
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * Anti-affinity tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Instance node information
    */
    @SerializedName("InstanceNode")
    @Expose
    private InstanceNode [] InstanceNode;

    /**
    * Shard size
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * Number of shards
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Number of replicas
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Billing ID
    */
    @SerializedName("PriceId")
    @Expose
    private Long PriceId;

    /**
    * Isolation time
    */
    @SerializedName("CloseTime")
    @Expose
    private String CloseTime;

    /**
    * Read weight of a slave node
    */
    @SerializedName("SlaveReadWeight")
    @Expose
    private Long SlaveReadWeight;

    /**
    * Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * Project name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Whether an instance is password-free. true: yes; false: no
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoAuth")
    @Expose
    private Boolean NoAuth;

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
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get User's Appid 
     * @return Appid User's Appid
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set User's Appid
     * @param Appid User's Appid
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong, China; 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan 
     * @return RegionId Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong, China; 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong, China; 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
     * @param RegionId Region ID. 1: Guangzhou; 4: Shanghai; 5: Hong Kong, China; 6: Toronto; 7: Shanghai Finance; 8: Beijing; 9: Singapore; 11: Shenzhen Finance; 15: West US (Silicon Valley); 16: Chengdu; 17: Germany; 18: South Korea; 19: Chongqing; 21: India; 22: East US (Virginia); 23: Thailand; 24: Russia; 25: Japan
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region ID 
     * @return ZoneId Region ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Region ID
     * @param ZoneId Region ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get VPC ID, such as 75101 
     * @return VpcId VPC ID, such as 75101
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID, such as 75101
     * @param VpcId VPC ID, such as 75101
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID, such as 46315 
     * @return SubnetId VPC subnet ID, such as 46315
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID, such as 46315
     * @param SubnetId VPC subnet ID, such as 46315
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted 
     * @return Status Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
     * @param Status Current instance status. 0: to be initialized; 1: instance in process; 2: instance running; -2: instance isolated; -3: instance to be deleted
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Instance VIP 
     * @return WanIp Instance VIP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Instance VIP
     * @param WanIp Instance VIP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Port number of an instance 
     * @return Port Port number of an instance
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number of an instance
     * @param Port Port number of an instance
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance creation time 
     * @return Createtime Instance creation time
     */
    public String getCreatetime() {
        return this.Createtime;
    }

    /**
     * Set Instance creation time
     * @param Createtime Instance creation time
     */
    public void setCreatetime(String Createtime) {
        this.Createtime = Createtime;
    }

    /**
     * Get Instance capacity in MB 
     * @return Size Instance capacity in MB
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set Instance capacity in MB
     * @param Size Instance capacity in MB
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get This field has been disused 
     * @return SizeUsed This field has been disused
     */
    public Float getSizeUsed() {
        return this.SizeUsed;
    }

    /**
     * Set This field has been disused
     * @param SizeUsed This field has been disused
     */
    public void setSizeUsed(Float SizeUsed) {
        this.SizeUsed = SizeUsed;
    }

    /**
     * Get Instance type. 1: Redis 2.8 cluster edition; 2: Redis 2.8 master-slave edition; 3: CKV master-slave edition (Redis 3.2); 4: CKV cluster edition (Redis 3.2); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition 
     * @return Type Instance type. 1: Redis 2.8 cluster edition; 2: Redis 2.8 master-slave edition; 3: CKV master-slave edition (Redis 3.2); 4: CKV cluster edition (Redis 3.2); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Instance type. 1: Redis 2.8 cluster edition; 2: Redis 2.8 master-slave edition; 3: CKV master-slave edition (Redis 3.2); 4: CKV cluster edition (Redis 3.2); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
     * @param Type Instance type. 1: Redis 2.8 cluster edition; 2: Redis 2.8 master-slave edition; 3: CKV master-slave edition (Redis 3.2); 4: CKV cluster edition (Redis 3.2); 5: Redis 2.8 standalone edition; 6: Redis 4.0 master-slave edition; 7: Redis 4.0 cluster edition
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to set the auto-renewal flag for an instance. 1: auto-renewal set; 0: auto-renewal not set 
     * @return AutoRenewFlag Whether to set the auto-renewal flag for an instance. 1: auto-renewal set; 0: auto-renewal not set
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to set the auto-renewal flag for an instance. 1: auto-renewal set; 0: auto-renewal not set
     * @param AutoRenewFlag Whether to set the auto-renewal flag for an instance. 1: auto-renewal set; 0: auto-renewal not set
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Instance expiration time 
     * @return DeadlineTime Instance expiration time
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set Instance expiration time
     * @param DeadlineTime Instance expiration time
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get Engine: Redis community edition, Tencent Cloud CKV 
     * @return Engine Engine: Redis community edition, Tencent Cloud CKV
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set Engine: Redis community edition, Tencent Cloud CKV
     * @param Engine Engine: Redis community edition, Tencent Cloud CKV
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get Product type: Redis 2.8 cluster edition, Redis 2.8 master-slave edition, Redis 3.2 master-slave edition (CKV master-slave edition), Redis 3.2 cluster edition (CKV cluster edition), Redis 2.8 standalone edition, Redis 4.0 cluster edition 
     * @return ProductType Product type: Redis 2.8 cluster edition, Redis 2.8 master-slave edition, Redis 3.2 master-slave edition (CKV master-slave edition), Redis 3.2 cluster edition (CKV cluster edition), Redis 2.8 standalone edition, Redis 4.0 cluster edition
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set Product type: Redis 2.8 cluster edition, Redis 2.8 master-slave edition, Redis 3.2 master-slave edition (CKV master-slave edition), Redis 3.2 cluster edition (CKV cluster edition), Redis 2.8 standalone edition, Redis 4.0 cluster edition
     * @param ProductType Product type: Redis 2.8 cluster edition, Redis 2.8 master-slave edition, Redis 3.2 master-slave edition (CKV master-slave edition), Redis 3.2 cluster edition (CKV cluster edition), Redis 2.8 standalone edition, Redis 4.0 cluster edition
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get VPC ID, such as vpc-fk33jsf43kgv 
     * @return UniqVpcId VPC ID, such as vpc-fk33jsf43kgv
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID, such as vpc-fk33jsf43kgv
     * @param UniqVpcId VPC ID, such as vpc-fk33jsf43kgv
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC subnet ID, such as subnet-fd3j6l35mm0 
     * @return UniqSubnetId VPC subnet ID, such as subnet-fd3j6l35mm0
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set VPC subnet ID, such as subnet-fd3j6l35mm0
     * @param UniqSubnetId VPC subnet ID, such as subnet-fd3j6l35mm0
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Billing method. 0: pay-as-you-go; 1: monthly subscription 
     * @return BillingMode Billing method. 0: pay-as-you-go; 1: monthly subscription
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set Billing method. 0: pay-as-you-go; 1: monthly subscription
     * @param BillingMode Billing method. 0: pay-as-you-go; 1: monthly subscription
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get Description of an instance status, such as "instance running" 
     * @return InstanceTitle Description of an instance status, such as "instance running"
     */
    public String getInstanceTitle() {
        return this.InstanceTitle;
    }

    /**
     * Set Description of an instance status, such as "instance running"
     * @param InstanceTitle Description of an instance status, such as "instance running"
     */
    public void setInstanceTitle(String InstanceTitle) {
        this.InstanceTitle = InstanceTitle;
    }

    /**
     * Get Scheduled deactivation time 
     * @return OfflineTime Scheduled deactivation time
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Scheduled deactivation time
     * @param OfflineTime Scheduled deactivation time
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    /**
     * Get Sub-status returned for an instance in process 
     * @return SubStatus Sub-status returned for an instance in process
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set Sub-status returned for an instance in process
     * @param SubStatus Sub-status returned for an instance in process
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get Anti-affinity tag 
     * @return Tags Anti-affinity tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Anti-affinity tag
     * @param Tags Anti-affinity tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Instance node information 
     * @return InstanceNode Instance node information
     */
    public InstanceNode [] getInstanceNode() {
        return this.InstanceNode;
    }

    /**
     * Set Instance node information
     * @param InstanceNode Instance node information
     */
    public void setInstanceNode(InstanceNode [] InstanceNode) {
        this.InstanceNode = InstanceNode;
    }

    /**
     * Get Shard size 
     * @return RedisShardSize Shard size
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set Shard size
     * @param RedisShardSize Shard size
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get Number of shards 
     * @return RedisShardNum Number of shards
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Number of shards
     * @param RedisShardNum Number of shards
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Number of replicas 
     * @return RedisReplicasNum Number of replicas
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Number of replicas
     * @param RedisReplicasNum Number of replicas
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Billing ID 
     * @return PriceId Billing ID
     */
    public Long getPriceId() {
        return this.PriceId;
    }

    /**
     * Set Billing ID
     * @param PriceId Billing ID
     */
    public void setPriceId(Long PriceId) {
        this.PriceId = PriceId;
    }

    /**
     * Get Isolation time 
     * @return CloseTime Isolation time
     */
    public String getCloseTime() {
        return this.CloseTime;
    }

    /**
     * Set Isolation time
     * @param CloseTime Isolation time
     */
    public void setCloseTime(String CloseTime) {
        this.CloseTime = CloseTime;
    }

    /**
     * Get Read weight of a slave node 
     * @return SlaveReadWeight Read weight of a slave node
     */
    public Long getSlaveReadWeight() {
        return this.SlaveReadWeight;
    }

    /**
     * Set Read weight of a slave node
     * @param SlaveReadWeight Read weight of a slave node
     */
    public void setSlaveReadWeight(Long SlaveReadWeight) {
        this.SlaveReadWeight = SlaveReadWeight;
    }

    /**
     * Get Instance tag information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceTags Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceTags Instance tag information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get Project name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Whether an instance is password-free. true: yes; false: no
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NoAuth Whether an instance is password-free. true: yes; false: no
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getNoAuth() {
        return this.NoAuth;
    }

    /**
     * Set Whether an instance is password-free. true: yes; false: no
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NoAuth Whether an instance is password-free. true: yes; false: no
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoAuth(Boolean NoAuth) {
        this.NoAuth = NoAuth;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Createtime", this.Createtime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "SizeUsed", this.SizeUsed);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "InstanceTitle", this.InstanceTitle);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "InstanceNode.", this.InstanceNode);
        this.setParamSimple(map, prefix + "RedisShardSize", this.RedisShardSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "PriceId", this.PriceId);
        this.setParamSimple(map, prefix + "CloseTime", this.CloseTime);
        this.setParamSimple(map, prefix + "SlaveReadWeight", this.SlaveReadWeight);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "NoAuth", this.NoAuth);

    }
}

