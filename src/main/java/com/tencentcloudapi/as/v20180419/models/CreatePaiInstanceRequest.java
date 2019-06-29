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

public class CreatePaiInstanceRequest  extends AbstractModel{

    /**
    * PAI instance domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Public network bandwidth configuration information
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Init script base64 encoded string
    */
    @SerializedName("InitScript")
    @Expose
    private String InitScript;

    /**
    * List of availability zones.
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * List of subnets
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Displayed name of an instance
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * List of instance models
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Instance Login settings
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Instance billing mode
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal settings. This parameter is mandatory for prepaid instances.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
     * Get PAI instance domain name
     * @return DomainName PAI instance domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Get PAI instance domain name
     * @param DomainName PAI instance domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Public network bandwidth configuration information
     * @return InternetAccessible Public network bandwidth configuration information
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Public network bandwidth configuration information
     * @param InternetAccessible Public network bandwidth configuration information
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Init script base64 encoded string
     * @return InitScript Init script base64 encoded string
     */
    public String getInitScript() {
        return this.InitScript;
    }

    /**
     * Set Init script base64 encoded string
     * @param InitScript Init script base64 encoded string
     */
    public void setInitScript(String InitScript) {
        this.InitScript = InitScript;
    }

    /**
     * Get list of availability zones.
     * @return Zones List of availability zones.
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set list of availability zones.
     * @param Zones list of availability zones
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get Vpcid
     * @return VpcId VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpcid
     * @param VpcId VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get List of subnets
     * @return SubnetIds List of subnets
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set List of subnets
     * @param SubnetIds List of subnets
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Displayed name of an instance.
     * @return InstanceName Displayed name of an instance.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Displayed name of an instance.
     * @param InstanceName The displayed name of the instance.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get list of instance models
     * @return InstanceTypes List of instance models
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set list of instance models
     * @param InstanceTypes List of instance models
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get instance login settings
     * @return LoginSettings instance login settings
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set instance login settings
     * @param LoginSettings instance login settings
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get instance billing mode
     * @return InstanceChargeType instance billing mode
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set instance billing mode
     * @param InstanceChargeType instance billing mode
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal settings. This parameter is mandatory for prepaid instances.
     * @return InstanceChargePrepaid Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal settings. This parameter is mandatory for prepaid instances.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal settings. This parameter is mandatory for prepaid instances.
     * @param InstanceChargePrepaid Parameter settings for prepaid billing mode, also known as monthly subscription. This parameter can specify the purchase period and other attributes such as auto-renewal settings. This parameter is mandatory for prepaid instances.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InitScript", this.InitScript);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);

    }
}

