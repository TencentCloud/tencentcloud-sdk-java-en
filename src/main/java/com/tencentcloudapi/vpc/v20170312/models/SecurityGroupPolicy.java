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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicy extends AbstractModel{

    /**
    * 安全组规则索引号。
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * 协议, 取值: TCP,UDP, ICMP。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口(all, 离散port,  range)。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
    */
    @SerializedName("ServiceTemplate")
    @Expose
    private ServiceTemplateSpecification ServiceTemplate;

    /**
    * 网段或IP(互斥)。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * The CIDR block or IPv6 (mutually exclusive).
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * 安全组实例ID，例如：sg-ohuuioma。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * IP地址ID或者ID地址组ID。
    */
    @SerializedName("AddressTemplate")
    @Expose
    private AddressTemplateSpecification AddressTemplate;

    /**
    * ACCEPT 或 DROP。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 安全组规则描述。
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * The last modification time of the security group.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 安全组规则索引号。 
     * @return PolicyIndex 安全组规则索引号。
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set 安全组规则索引号。
     * @param PolicyIndex 安全组规则索引号。
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get 协议, 取值: TCP,UDP, ICMP。 
     * @return Protocol 协议, 取值: TCP,UDP, ICMP。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议, 取值: TCP,UDP, ICMP。
     * @param Protocol 协议, 取值: TCP,UDP, ICMP。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口(all, 离散port,  range)。 
     * @return Port 端口(all, 离散port,  range)。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口(all, 离散port,  range)。
     * @param Port 端口(all, 离散port,  range)。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。 
     * @return ServiceTemplate 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     */
    public ServiceTemplateSpecification getServiceTemplate() {
        return this.ServiceTemplate;
    }

    /**
     * Set 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     * @param ServiceTemplate 协议端口ID或者协议端口组ID。ServiceTemplate和Protocol+Port互斥。
     */
    public void setServiceTemplate(ServiceTemplateSpecification ServiceTemplate) {
        this.ServiceTemplate = ServiceTemplate;
    }

    /**
     * Get 网段或IP(互斥)。 
     * @return CidrBlock 网段或IP(互斥)。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 网段或IP(互斥)。
     * @param CidrBlock 网段或IP(互斥)。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get The CIDR block or IPv6 (mutually exclusive). 
     * @return Ipv6CidrBlock The CIDR block or IPv6 (mutually exclusive).
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set The CIDR block or IPv6 (mutually exclusive).
     * @param Ipv6CidrBlock The CIDR block or IPv6 (mutually exclusive).
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get 安全组实例ID，例如：sg-ohuuioma。 
     * @return SecurityGroupId 安全组实例ID，例如：sg-ohuuioma。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组实例ID，例如：sg-ohuuioma。
     * @param SecurityGroupId 安全组实例ID，例如：sg-ohuuioma。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get IP地址ID或者ID地址组ID。 
     * @return AddressTemplate IP地址ID或者ID地址组ID。
     */
    public AddressTemplateSpecification getAddressTemplate() {
        return this.AddressTemplate;
    }

    /**
     * Set IP地址ID或者ID地址组ID。
     * @param AddressTemplate IP地址ID或者ID地址组ID。
     */
    public void setAddressTemplate(AddressTemplateSpecification AddressTemplate) {
        this.AddressTemplate = AddressTemplate;
    }

    /**
     * Get ACCEPT 或 DROP。 
     * @return Action ACCEPT 或 DROP。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set ACCEPT 或 DROP。
     * @param Action ACCEPT 或 DROP。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 安全组规则描述。 
     * @return PolicyDescription 安全组规则描述。
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set 安全组规则描述。
     * @param PolicyDescription 安全组规则描述。
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get The last modification time of the security group. 
     * @return ModifyTime The last modification time of the security group.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set The last modification time of the security group.
     * @param ModifyTime The last modification time of the security group.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "ServiceTemplate.", this.ServiceTemplate);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "AddressTemplate.", this.AddressTemplate);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

