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

public class UpgradeLaunchConfigurationRequest  extends AbstractModel{

    /**
    * Launch configuration ID.
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Define valid Image(https://cloud.tencent.com/document/product/213/4944)ID. Format is as [1]. There 4 image types:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>IDS of usable images can be retrieved in following ways:<br/><li>Inquiry on image IDs for [1],[2],[3] by logging in console(https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE);Inquiry on image IDs for [4] in Cloud Marketplace(https://market.cloud.tencent.com/list).</li><li>Call the interface[DescribeImages](https://cloud.tencent.com/document/api/213/15715),in the return string,retrieve filed [1].</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * List of instance machine types,each type defines different configurations about resources.It can have up to 5 instance machine types.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * Launch configuration display name.The name can only contain Chinese,English letters,numbers,underscore,hyphen”-”, English dot “.”.It cannot exceed 60 characters.
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * Configuration on data disks of instances.If it is not defined,no disks are purchased by default.Maximum 11 data disks are supported. 
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Enhanced service.This parameter is for turn on/off Cloud services like security and monitoring etc.If it is not defined,security service and monitoring service are turned on by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR：Charged based on hourly usage.Pay after use.<br><li>SPOTPAID：Price is determined by auction.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Market related options for instances, i.e. options for Spotpaid instances.If an instance is a Spotpaid instance,this option is required.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * Validation policy about instance type.Valid value:ALL,ANY. Default value is ANY. <br><li> ALL, All instance types can be used,then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used,then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * Settings on public network bandwidth related information.If it is not defined,bandwidth is 0Mbps by default.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Instance login setting.This parameter is for setting on instance login rule password,keys,or keep the original login setting in images.By default the password is generated randomly, and customers are notified through in-mail. 
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Instance project ID. This parameter can be retrieved from field 1 in return string of call [DescribeProject](https://cloud.tencent.com/document/api/378/4400).If it is not defined, default project is used.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * The security group to which the instance belongs. This parameter can be obtained by calling the field [1] in the returned value of [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the security group is not bound by default.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Instance system disk configuration of the launch configuration. If this parameter is not specified, it is assigned based on system default.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Customized data Base64 encoded.Not exceed 16KB in size. 
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Tag list.It is bound to expanded instances. Maximum 10 tags can be bound.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
     * Obtain Launch configuration ID.
     * @return LaunchConfigurationId Launch configuration ID
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set Launch configuration.
     * @param LaunchConfigurationId Launch configuration ID
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Obtain valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-8toqc6s3`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public images`, `customized images` or `shared images` by logging in to the [Console]; query the image ID of a `Service image marketplace` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     * @return ImageId Specify valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-8toqc6s3`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public images`, `customized images` or `shared images` by logging in to the [Console]; query the image ID of a `Service image marketplace` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, such as `img-8toqc6s3`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public images`, `customized images` or `shared images` by logging in to the [Console]; query the image ID of a `Service image marketplace` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     * @param ImageId specifies valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-8toqc6s3`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `Public images`, `customized images` or `shared images` by logging in to the [Console]; query the image ID of a `Service image marketplace` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Obtain the list of instance machine types,each type defines different configurations about resources.It can have up to 5 instance types.
     * @return InstanceTypes List of instance machine types,each type defines different configurations about resources.It can have up to 5 instance types.
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set the list of instance types,each type defines different configurations about resources.It can have up to 5 instance types.
     * @param InstanceTypes List of instance machine types,each type defines different configurations about resources.It can have up to 5 instance types.
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Obtain Launch configuration display name.The name can only contain Chinese,English letters,numbers,underscore,hyphen”-”, English dot “.”.It cannot exceed 60 characters.
     * | LaunchConfigurationName | Yes | String | The display name of the scaling group. It can only contain letters, numbers, underscores, hyphens ("-") and decimal points, with a length of not more than 60 characters. |
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set Launch configuration display name.The name can only contain Chinese,English letters,numbers,underscore,hyphen”-”, English dot “.”.It cannot exceed 60 characters.
     * | LaunchConfigurationName | Yes | String | The display name of the scaling group. It can only contain letters, numbers, underscores, hyphens ("-") and decimal points, with a length of not more than 60 characters. |
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Obtain the configuration information on data disks of instances.If it is not defined,no disks are purchased by default.Maximum 11 data disks are supported. 
     * @return DataDisks Configuration on data disks of instances.If it is not defined,no disks are purchased by default.Maximum 11 data disks are supported. 
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set the configuration on data disks of instances.If it is not defined,no disks are purchased by default.Maximum 11 data disks are supported. 
     * @param DataDisks Configuration on data disks of instances.If it is not defined,no disks are purchased by default.Maximum 11 data disks are supported. 
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Obtain the Instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR：Charged based on hourly usage.Pay after use.<br><li>SPOTPAID: pay by bidding
     * @return InstanceChargeType the Instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR：Charged based on hourly usage.Pay after use.<br><li>SPOTPAID: pay by bidding
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set the instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR：Charged based on hourly usage.Pay after use.<br><li>SPOTPAID: pay by bidding
     * @param InstanceChargeType the Instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR：Charged based on hourly usage.Pay after use.<br><li>SPOTPAID: pay by bidding
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Obtain the Market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is spot.
     * @return InstanceMarketOptions the Market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is spot.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set the market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is spot.
     * @param InstanceMarketOptions the market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is spot.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Obtain the validation policy about instance type.Valid value:ALL,ANY. Default value is ANY. <br><li> ALL, All instance types can be used,then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used,then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     * @return InstanceTypesCheckPolicy The validation policy about instance type.Valid value:ALL,ANY. Default value is ANY. <br><li> ALL, All instance types can be used,then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used,then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Set the validation policy about instance type.Valid value:ALL,ANY. Default value is ANY. <br><li> ALL, All instance types can be used,then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used,then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     * @param InstanceTypesCheckPolicy The validation policy about instance type.Valid value:ALL,ANY. Default value is ANY. <br><li> ALL, All instance types can be used,then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used,then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     * @return InternetAccessible Settings on public network bandwidth related information.If it is not defined,bandwidth is 0Mbps by default.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     * @param InternetAccessible Settings on public network bandwidth related information.If it is not defined,bandwidth is 0Mbps by default.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     * Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     * Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * | ProjectId | No | Integer | ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` field in the returned values of [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If this is left empty, default project is used. |
     * | ProjectId | No | Integer | ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` field in the returned values of [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If this is left empty, default project is used. |
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * | ProjectId | No | Integer | ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` field in the returned values of [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If this is left empty, default project is used. |
     * | ProjectId | No | Integer | ID of the project to which the instance belongs. This parameter can be obtained from the `projectId` field in the returned values of [DescribeProject](https://cloud.tencent.com/document/api/378/4400). If this is left empty, default project is used. |
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
     * | SecurityGroupIds.N | No | Array of String | The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the security group is not bound by default. |
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
     * | SecurityGroupIds.N | No | Array of String | The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the security group is not bound by default. |
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Obtain the instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     * @return SystemDisk The instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set the instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     * @param SystemDisk The instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Obtain the customized data Base64 encoded.Not exceed 16KB in size. 
     * @return UserData The customized data Base64 encoded.Not exceed 16KB in size. 
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set the customized data Base64 encoded.Not exceed 16KB in size. 
     * @param UserData The customized data Base64 encoded.Not exceed 16KB in size. 
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Obtain the tag list.It is bound to expanded instances. Maximum 10 tags can be bound.
     * @return InstanceTags The tag list.It is bound to expanded instances. Maximum 10 tags can be bound.
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set the tag list.It is bound to expanded instances. Maximum 10 tags can be bound.
     * @param InstanceTags The tag list.It is bound to expanded instances. Maximum 10 tags can be bound.
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamSimple(map, prefix + "InstanceTypesCheckPolicy", this.InstanceTypesCheckPolicy);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);

    }
}

