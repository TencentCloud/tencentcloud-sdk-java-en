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

public class CreateLaunchConfigurationRequest  extends AbstractModel{

    /**
    * Launch configuration display name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters.
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * Specified valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, in the format `img-8toqc6s3`. There are four types of images:<br/><li>Public image</li><li>Custom image</li><li>Shared Image</li><li>Service Marketplace Image</li><br/>You can get the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public Image`, `Custom Image` or `Shared Image` by logging in to the Console; query the image ID of a `Service Marketplace Image` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get the `ImageId` field in the returned values of API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Instance project ID. Get this parameter in the `projectId` field in the returned values of API [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If it is not defined, default project is used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * Instance model. Different instance models specify different resource specifications. For specific values, call API [DescribeInstanceTypeConfigs] (https://intl.cloud.tencent.com/document/api/213/15749) for latest specifications, or refer to [instance type](https://intl.cloud.tencent.com/document/product/213/11518). `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance’s system disk configuration. If not specified, the default value will be assigned.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Instance’s system disk configuration. If not specified, no disks will be purchased by default. A maximum of 11 data disks can be assigned. 
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Public network bandwidth configuration. If not specified, the default public network bandwidth is 0 Mbps.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Instance login setting. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the console message center.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * The security group to which the instance belongs. Get this parameter in the `SecurityGroupId` field in the returned values of API [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If it is not defined, no security group will be bound by default.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Base64-encoded custom data of up to 16 KB.
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Instance billing mode. CVM instances are POSTPAID_BY_HOUR by default.<br><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly cycle<br><li>SPOTPAID: pay by bidding.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Market-related options for instances, such as parameters related to spot instances.This parameter is mandatory for spot instances.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * List of instance models. Different instance models specify different resource specifications. Up to 5 instance models can be supported. `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Instance type validation policy. Values include ALL and ANY. Default value is ANY. <br><li> ALL: All instance types (InstanceType) can be used or validation fails.<br><li> ANY: Any one of the instance types (InstanceType) can be used or validation fails. Common reasons why instance types are not available: instance types are sold out, associated cloud disks are sold out. If an instance type does not exist or if it is discontinued, the validation will fail regardless of the value of InstanceTypesCheckPolicy.
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * Tag list. Tag lists can be bound to instances. A maximum of 10 tags are supported.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
     * Get Launch configuration display name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters.
     * @return LaunchConfigurationName Launch configuration display name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters.
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set Launch configuration display name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters.
     * @param LaunchConfigurationName Launch configuration display name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 60 characters.
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get Specified valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, in the format `img-8toqc6s3`. There are four types of images:<br/><li>Public image</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Image</li><br/>You can get the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public Image`, `Custom Image` or `Shared Image` by logging in to the Console; query the image ID of a `Service Marketplace Image` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get the `ImageId` field in the returned values of API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     * @return ImageId Specified valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, in the format `img-8toqc6s3`. There are four types of images:<br/><li>Public image</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Image</li><br/>You can get the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public Image`, `Custom Image` or `Shared Image` by logging in to the Console; query the image ID of a `Service Marketplace Image` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get the `ImageId` field in the returned values of API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Specified valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, in the format `img-8toqc6s3`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Image</li><br/>You can get the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public Image`, `Custom Image` or `Shared Image` by logging in to the Console; query the image ID of a `Service Marketplace Image` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get the `ImageId` field in the returned values of API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     * @param ImageId Specified valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, in the format `img-8toqc6s3`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Image</li><br/>You can get the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public Image`, `Custom Image` or `Shared Image` by logging in to the Console; query the image ID of a `Service Marketplace Image` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get the `ImageId` field in the returned values of API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Instance project ID. Get this parameter in the `projectId` field in the returned values of API [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If it is not defined, default project is used.
     * @return ProjectId  Instance project ID. Get this parameter in the `projectId` field in the returned values of API [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If it is not defined, default project is used.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Instance project ID. Get this parameter in the `projectId` field in the returned values of API [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If it is not defined, default project is used.
     * @param ProjectId  Instance project ID. Get this parameter in the `projectId` field in the returned values of API [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If it is not defined, default project is used.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance model. Different instance models specify different resource specifications. For specific values, call API [DescribeInstanceTypeConfigs] (https://intl.cloud.tencent.com/document/api/213/15749) for latest specifications, or refer to [instance type](https://intl.cloud.tencent.com/document/product/213/11518). `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     * @return InstanceType Instance model. Different instance models specify different resource specifications. For specific values, call API [DescribeInstanceTypeConfigs] (https://intl.cloud.tencent.com/document/api/213/15749) for latest specifications, or refer to [instance type](https://intl.cloud.tencent.com/document/product/213/11518). `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model. Different instance models specify different resource specifications. For specific values, call API [DescribeInstanceTypeConfigs] (https://intl.cloud.tencent.com/document/api/213/15749) for latest specifications, or refer to [instance type](https://intl.cloud.tencent.com/document/product/213/11518). `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     * @param InstanceType Instance model. Different instance models specify different resource specifications. For specific values, call API [DescribeInstanceTypeConfigs] (https://intl.cloud.tencent.com/document/api/213/15749) for latest specifications, or refer to [instance type](https://intl.cloud.tencent.com/document/product/213/11518). `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance’s system disk configuration. If not specified, the default value will be assigned.
     * @return SystemDisk Instance’s system disk configuration. If not specified, the default value will be assigned.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set Instance’s system disk configuration. If not specified, the default value will be assigned.
     * @param SystemDisk Instance’s system disk configuration. If not specified, the default value will be assigned.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Instance’s system disk configuration. If not specified, no disks will be purchased by default. A maximum of 11 data disks can be assigned. 
     * @return DataDisks Instance’s system disk configuration. If not specified, no disks will be purchased by default. A maximum of 11 data disks can be assigned. 
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set Instance’s system disk configuration. If not specified, no disks will be purchased by default. A maximum of 11 data disks can be assigned. 
     * @param DataDisks Instance’s system disk configuration. If not specified, no disks will be purchased by default. A maximum of 11 data disks can be assigned. 
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get Public network bandwidth configuration. If not specified, the default public network bandwidth is 0 Mbps.
     * @return InternetAccessible Instance’s system disk configuration. If not specified, no disks will be purchased by default. A maximum of 11 data disks can be assigned. 
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set Public network bandwidth configuration. If not specified, the default public network bandwidth is 0 Mbps.
     * @param InternetAccessible Public network bandwidth configuration. If not specified, the default public network bandwidth is 0 Mbps.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get Instance login setting. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the console message center.
     * @return LoginSettings Instance login setting. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the console message center.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set Instance login setting. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the console message center.
     * @param LoginSettings Instance login setting. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the console message center.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get The security group to which the instance belongs. Get this parameter in the `SecurityGroupId` field in the returned values of API [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If it is not defined, no security group will be bound by default.
     * @return SecurityGroupIds The security group to which the instance belongs. The security group to which the instance belongs. Get this parameter in the `SecurityGroupId` field in the returned values of API [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If it is not defined, no security group will be bound by default.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set The security group to which the instance belongs. Get this parameter in the `SecurityGroupId` field in the returned values of API [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If it is not defined, no security group will be bound by default.
     * @param SecurityGroupIds The security group to which the instance belongs. Get this parameter in the `SecurityGroupId` field in the returned values of API [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If it is not defined, no security group will be bound by default.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * @return EnhancedService Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * @param EnhancedService Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get Base64-encoded custom data of up to 16 KB.
     * @return UserData Base64-encoded custom data of up to 16 KB.
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set Base64-encoded custom data of up to 16 KB.
     * @param UserData Base64-encoded custom data of up to 16 KB.
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get Instance billing mode. CVM instances are POSTPAID_BY_HOUR by default.<br><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly cycle<br><li>SPOTPAID: pay by bidding.
     * @return InstanceChargeType Instance billing mode. CVM instances are POSTPAID_BY_HOUR by default.<br><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly cycle<br><li>SPOTPAID: pay by bidding.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing mode. CVM instances are POSTPAID_BY_HOUR by default.<br><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly cycle<br><li>SPOTPAID: pay by bidding.
     * @param InstanceChargeType Instance billing mode. CVM instances are POSTPAID_BY_HOUR by default.<br><li>POSTPAID_BY_HOUR: pay-as-you-go on an hourly cycle<br><li>SPOTPAID: pay by bidding.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Market-related options for instances, such as parameters related to spot instances.This parameter is mandatory for spot instances.
     * @return InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.This parameter is mandatory for spot instances.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set Market-related options for instances, such as parameters related to spot instances.This parameter is mandatory for spot instances.
     * @param InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.This parameter is mandatory for spot instances.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get List of instance models. Different instance models specify different resource specifications. Up to 5 instance models can be supported. `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     * @return InstanceTypes List of instance models. Different instance models specify different resource specifications. Up to 5 instance models can be supported. `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set List of instance models. Different instance models specify different resource specifications. Up to 5 instance models can be supported. `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     * @param InstanceTypes List of instance models. Different instance models specify different resource specifications. Up to 5 instance models can be supported. `InstanceType` and `InstanceTypes` are mutually exclusive, and one and only one of them must be entered.
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get Instance type validation policy. Values include ALL and ANY. Default value is ANY. <br><li> ALL: All instance types (InstanceType) can be used or validation fails.<br><li> ANY: Any one of the instance types (InstanceType) can be used or validation fails. Common reasons why instance types are not available: instance types are sold out, associated cloud disks are sold out. If an instance type does not exist or if it is discontinued, the validation will fail regardless of the value of InstanceTypesCheckPolicy.
     * @return InstanceTypesCheckPolicy Instance type validation policy. Values include ALL and ANY. Default value is ANY.<br><li> ALL: All instance types (InstanceType) can be used or validation fails.<br><li> ANY: Any one of the instance types (InstanceType) can be used or validation fails. Common reasons why instance types are not available: instance types are sold out, associated cloud disks are sold out. If an instance type does not exist or if it is discontinued, the validation will fail regardless of the value of InstanceTypesCheckPolicy.
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Set Instance type validation policy. Values include ALL and ANY. Default value is ANY.<br><li> ALL: All instance types (InstanceType) can be used or validation fails.<br><li> ANY: Any one of the instance types (InstanceType) can be used or validation fails. Common reasons why instance types are not available: instance types are sold out, associated cloud disks are sold out. If an instance type does not exist or if it is discontinued, the validation will fail regardless of the value of InstanceTypesCheckPolicy.
     * @param InstanceTypesCheckPolicy Instance type validation policy. Values include ALL and ANY. Default value is ANY.<br><li> ALL: All instance types (InstanceType) can be used or validation fails.<br><li> ANY: Any one of the instance types (InstanceType) can be used or validation fails. Common reasons why instance types are not available: instance types are sold out, associated cloud disks are sold out. If an instance type does not exist or if it is discontinued, the validation will fail regardless of the value of InstanceTypesCheckPolicy.
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Get Tag list. Tag lists can be bound to instances. A maximum of 10 tags are supported.
     * @return InstanceTags Tag list. Tag lists can be bound to instances. A maximum of 10 tags are supported.
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set Tag list. Tag lists can be bound to instances. A maximum of 10 tags are supported.
     * @param InstanceTags Tag list. Tag lists can be bound to instances. A maximum of 10 tags are supported.
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "InstanceTypesCheckPolicy", this.InstanceTypesCheckPolicy);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);

    }
}

