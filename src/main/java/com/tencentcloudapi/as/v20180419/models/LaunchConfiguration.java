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

public class LaunchConfiguration  extends AbstractModel{

    /**
    * ID of the project to which the instance belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * Launch configuration ID.
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
    * Instance model.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Configuration information of the system disk in the instance.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Configuration information of the instance data disk.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Login settings of an instance.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LimitedLoginSettings LoginSettings;

    /**
    * Configuration information of public network bandwidth.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * The security group to which an instance belongs.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Scaling group to which the launch configuration is attached.
    */
    @SerializedName("AutoScalingGroupAbstractSet")
    @Expose
    private AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet;

    /**
    * Custom Data. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * Creation time of the launch configuration.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Indicates whether the enhanced service is enabled for the instance and the service settings.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Image ID.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Launch configuration status. Possible values:<br><li>NORMAL：Normal.<br><li>IMAGE_ABNORMAL：Image abnormal.<br><li>CBS_SNAP_ABNORMAL：Data disk snapshot abnormal.<br><li>SECURITY_GROUP_ABNORMAL：Security group abnormal.<br>
    */
    @SerializedName("LaunchConfigurationStatus")
    @Expose
    private String LaunchConfigurationStatus;

    /**
    * Instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>SPOTPAID: pay by bidding.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is prepaid. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * List of instance model.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * List of tag.
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * Version number.
    */
    @SerializedName("VersionNumber")
    @Expose
    private Integer VersionNumber;

    /**
    * Update Time.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Obtain the ID of the project to which the instance belongs.
     * @return ProjectId ID of the project to which the instance belongs.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Configure the ID of the project to which the instance belongs.
     * @param ProjectId ID of the project to which the instance belongs.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
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
     * Obtain the launch configuration name.
     * @return LaunchConfigurationName Launch configuration name.
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Configure the launch configuration name.
     * @param LaunchConfigurationName Launch configuration name.
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Obtain the instance model.
     * @return InstanceType Instance model.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Configure the instance model.
     * @param InstanceType Instance model.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Obtain the configuration information of the system disk in the instance.
     * @return SystemDisk Configuration information of the system disk in the instance.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set the configuration information of the system disk in the instance.
     * @param SystemDisk Configuration information of the system disk in the instance.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Obtain the configuration information of the instance data disk.
     * @return DataDisks Configuration information of the instance data disk.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set the configuration information of the instance data disk.
     * @param DataDisks Configuration information of the instance data disk.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Obtain the login settings of an instance.
     * @return LoginSettings Login settings of an instance.
     */
    public LimitedLoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set the login settings of an instance.
     * @param LoginSettings Login settings of an instance.
     */
    public void setLoginSettings(LimitedLoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Obtain the configuration information of public network bandwidth.
     * @return InternetAccessible Configuration information of public network bandwidth.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set the configuration information of public network bandwidth.
     * @param InternetAccessible Configuration information of public network bandwidth.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Obtain the security group to which an instance belongs.
     * @return SecurityGroupIds The security group to which an instance belongs.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Configure the security group to which an instance belongs.
     * @param SecurityGroupIds The security group to which an instance belongs.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Obtain the scaling group to which the launch configuration is attached.
     * Scaling group to which the launch configuration is attached.
     */
    public AutoScalingGroupAbstract [] getAutoScalingGroupAbstractSet() {
        return this.AutoScalingGroupAbstractSet;
    }

    /**
     * Configure the scaling group to which the launch configuration is attached.
     * Scaling group to which the launch configuration is attached.
     */
    public void setAutoScalingGroupAbstractSet(AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet) {
        this.AutoScalingGroupAbstractSet = AutoScalingGroupAbstractSet;
    }

    /**
     * Obtain the Custom Data. Note: This field may return null, indicating that no valid value was found.
     * @return UserData Custom Data. Note: This field may return null, indicating that no valid value was found.
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Configure the Custom Data. Note: This field may return null, indicating that no valid value was found.
     * @param UserData Custom Data. Note: This field may return null, indicating that no valid value was found.
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Obtain the creation time of the launch configuration.
     * @return CreatedTime Creation time of the launch configuration.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Configure the creation time of the launch configuration.
     * @param CreatedTime Creation time of the launch configuration.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Obtain whether the enhanced service is enabled for the instance and the service settings.
     * @return EnhancedService Indicates whether the enhanced service is enabled for the instance and the service settings.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Configure the whether the enhanced service is enabled for the instance and the service settings.
     * @param EnhancedService Indicates whether the enhanced service is enabled for the instance and the service settings.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Obtain the image ID.
     * @return ImageId Image ID.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Configure the image ID.
     * @param ImageId Image ID.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Obtain the status of launch configuration status. Possible values:<br><li>NORMAL：Normal.<br><li>IMAGE_ABNORMAL：Image abnormal.<br><li>CBS_SNAP_ABNORMAL：Data disk snapshot abnormal.<br><li>SECURITY_GROUP_ABNORMAL：Security group abnormal.<br>
     * @return LaunchConfigurationStatus The status of launch configuration status.<br><li>NORMAL：Normal.<br><li>IMAGE_ABNORMAL：Image abnormal.<br><li>CBS_SNAP_ABNORMAL：Data disk snapshot abnormal.<br><li>SECURITY_GROUP_ABNORMAL：Security group abnormal.<br>
     */
    public String getLaunchConfigurationStatus() {
        return this.LaunchConfigurationStatus;
    }

    /**
     * Configure the status of launch configuration status. Possible values:<br><li>NORMAL：Normal.<br><li>IMAGE_ABNORMAL：Image abnormal.<br><li>CBS_SNAP_ABNORMAL：Data disk snapshot abnormal.<br><li>SECURITY_GROUP_ABNORMAL：Security group abnormal.<br>
     * @param LaunchConfigurationStatus The status of launch configuration status.<br><li>NORMAL：Normal.<br><li>IMAGE_ABNORMAL：Image abnormal.<br><li>CBS_SNAP_ABNORMAL：Data disk snapshot abnormal.<br><li>SECURITY_GROUP_ABNORMAL：Security group abnormal.<br>
     */
    public void setLaunchConfigurationStatus(String LaunchConfigurationStatus) {
        this.LaunchConfigurationStatus = LaunchConfigurationStatus;
    }

    /**
     * Obtain the instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>SPOTPAID: pay by bidding.
     * @return InstanceChargeType The instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>SPOTPAID: pay by bidding.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Configure the instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>SPOTPAID: pay by bidding.
     * @param InstanceChargeType The instance charging mode,by default CVM service charges based on POSTPAID_BY_HOUR.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>SPOTPAID: pay by bidding.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Obtain the market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is prepaid. Note: This field may return null, indicating that no valid value was found.
     * @return InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is prepaid. Note: This field may return null, indicating that no valid value was found.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Configure the market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is prepaid. Note: This field may return null, indicating that no valid value was found.
     * @param InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is prepaid. Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Obtain the list of instance model.
     * @return InstanceTypes List of instance model.
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Configure the list of instance model.
     * @param InstanceTypes List of instance model.
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Obtain the list of tag.
     * @return InstanceTags List of tag.
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Configure the list of tag.
     * @param InstanceTags List of tag.
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Obtain the version number.
     * @return VersionNumber Version number.
     */
    public Integer getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Configure the version number.
     * @param VersionNumber Version number.
     */
    public void setVersionNumber(Integer VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Obtain the update Time.
     * @return UpdatedTime Update Time.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Configure the update Time.
     * @param UpdatedTime Update Time.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "AutoScalingGroupAbstractSet.", this.AutoScalingGroupAbstractSet);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LaunchConfigurationStatus", this.LaunchConfigurationStatus);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

