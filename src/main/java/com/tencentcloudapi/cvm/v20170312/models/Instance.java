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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance  extends AbstractModel{

    /**
    * Location of an instance.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Instances`ID`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    *  Instance model.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    *  Number of CPU cores in an instance (in core).
    */
    @SerializedName("CPU")
    @Expose
    private Integer CPU;

    /**
    * Volume of the instance memory, in `GB`.
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * Instance business status. range:<br><li>NORMAL: indicates the instance in the normal status<br><li>EXPIRED: indicates the expired instance <br><li>PROTECTIVELY_ISOLATED: indicates the instance that is safely isolated.
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * Instance Name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance billing mode. Range:<br><li>`PREPAID`： prepaid, that is annually/monthly subscription<br><li>`POSTPAID_BY_HOUR`： postpaid, that is billed by volume<br><li>`CDHPAID`：`CDH`paid, that is only paid for `CDH`, not for the instance on `CDH`.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    *  Information of the instance's system disk.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    *  Information of the instance's system disk. Only including the data disks purchased along with the instance. 
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Instance main network card’s intranet `IP` list.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private String [] PrivateIpAddresses;

    /**
    * Instance main network card’s extranet `IP` list. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    *  Instance bandwidth information.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    *  Information of the VPC to which the instance belongs.
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    *  of the image used by the production instance.
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Auto renewal flag. Supported values:<br><li>`NOTIFY_AND_MANUAL_RENEW`: Notify expiry but not renew automatically<br><li>`NOTIFY_AND_AUTO_RENEW`: Notify expiry and renew automatically<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: Neither notify expiry nor renew automatically
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Creation time. Displayed in a format that conforms to `ISO8601`, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Expire time. Displayed in a format that conforms to `ISO8601`, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Operating system name
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Login settings of the instance. Only the key associated with the instance is returned.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Instance status. Supported values: <br><li>PENDING: Creating<br></li><li>LAUNCH_FAILED: Creation failed<br></li><li>RUNNING: Running<br></li><li>STOPPED: Shut down<br></li><li>STARTING: Starting up<br></li><li>STOPPING: Shutting down<br></li><li>REBOOTING: Restarting<br></li><li>SHUTDOWN: To be terminated<br></li><li>TERMINATING: Terminating<br></li>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * Associated instances’ tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Instance shutdown billing mode Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<li>NOT_APPLICABLE：Instance is not shutdown or not suitable for stop billing after shut down<br>
    */
    @SerializedName("StopChargingMode")
    @Expose
    private String StopChargingMode;

    /**
     * Get the location of the instance.
     * @return Placement location of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set the location of the instance.
     * @param Placement location of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get instance`ID`
     * @return InstanceId Instance`ID`
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance`ID`.
     * @param InstanceId Instance `ID`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Obtain the instance model
     * @return InstanceType instance model.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set instance model.
     * @param InstanceType instance model.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get number of CPU cores in an instance (in core).
     * @return CPU Number of CPU cores in an instance (in core).
     */
    public Integer getCPU() {
        return this.CPU;
    }

    /**
     * Set number of CPU cores in an instance (in core).
     * @param CPU Number of CPU cores in the instance (in core).
     */
    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    /**
     * Obtain instance memory capacity.(in `GB`).
     * @return Memory Instance memory volume.(in `GB`).
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * Set instance memory volume.(in `GB`)
     * @param Memory Instance memory capacity (in `GB`).
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * Obtain instance business status: Value range:<br><li>NORMAL: Instance is normal<br><li>EXPIRED: Instance has expired<br><li>PROTECTIVELY_ISOLATED: Instance is isolated 
     * @return RestrictState Instance business status. Value range:<br><li>NORMAL: Instance is normal<br><li>EXPIRED: Instance has expired<br><li>PROTECTIVELY_ISOLATED: Instance is isolated 
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set instance business status. Value range:<br><li>NORMAL: Instance is normal<br><li>EXPIRED: Instance has expired<br><li>PROTECTIVELY_ISOLATED: Instance is isolated 
     * @param RestrictState Instance busniess mode. Range:<br><li>NORMAL: Instance is normal<br><li>EXPIRED: Instance has expired<br><li>PROTECTIVELY_ISOLATED: Instance is isolated 
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Obtain the name of the instance.
     * @return InstanceName Name of an instance.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set the name of an instance.
     * @param InstanceName Name of the instance.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Obtain instance billing method. Value range: <br><li>`PREPAID`: Prepaid. Monthly subscription.<br><li>`POSTPAID_BY_HOUR`:Postpaid. Bilied by volume.<br><li>`CDHPAID`: `CDH` Paid, that is only paid for `CDH`, not for instance on `CDH`.
     * @return InstanceChargeType Billing mode of instance.Value range:<br><li>`PREPAID`: Prepaid. Monthly subscription.<br><li>`POSTPAID_BY_HOUR`: Postpaid, billing by volume.<br><li>`CDHPAID`: `CDH`Paid, that is only paid for `CDH`, not for instance on `CDH`.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set instance billing method. Value range: <br><li>`PREPAID`: Prepaid. Monthly subscription.<br><li>`POSTPAID_BY_HOUR`: Postpaid, billing by volume.<br><li>`CDHPAID`: `CDH`Paid, that is only paid for `CDH`, not for instance on `CDH`.
     * @param InstanceChargeType Instance billing method. Value range: <br><li>`PREPAID`: Prepaid. Monthly subscription.<br><li>`POSTPAID_BY_HOUR`: Postpaid, billing by volume.<br><li>`CDHPAID`: `CDH`Paid, that is only paid for `CDH`, not for instance on `CDH`.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Obtain information of the instance's system disk.
     * @return SystemDisk Information of the instance's system disk.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set information of the instance's system disk.
     * @param SystemDisk Information of the instance's system disk.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Obtain information of the instance's system disk. Only include data disk brought with the instance.
     * @return DataDisks Information of the instance's system disk. Only include data disk brought with the instance.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set information of the instance's system disk. Only include data disk brought with the instance.
     * @param DataDisks information of the instance's system disk. Only include data disk brought with the instance.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Obtain the list of private `IPs``IP` of the instance's primary ENI.
     * @return PrivateIpAddresses the list of private `IPs``IP` of the instance's primary ENI.
     */
    public String [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set the list of private `IPs``IP` of the instance's primary ENI.
     * @param PrivateIpAddresses the list of private `IPs``IP` of the instance's primary ENI.
     */
    public void setPrivateIpAddresses(String [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Obtain the list of private `IPs``IP` of the instance's primary ENI. Note: This field may return null, indicating that no valid value was found.
     * @return PublicIpAddresses The list of public `IPs``IP` of the instance's primary ENI. Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set the list of public `IPs``IP` of the instance's primary ENI. Note: This field may return null, indicating that no valid value was found.
     * @param PublicIpAddresses The list of public `IPs``IP` of the instance's primary ENI. Note: This field may return null, indicating that no valid value was found.
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Obtain the bandwidth information of instance.
     * @return InternetAccessible The bandwidth information of instance.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set the bandwidth information of instance.
     * @param InternetAccessible the bandwidth information of instance.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     *  Obtain the information of the VPC to which the instance belongs.
     * @return VirtualPrivateCloud the information of the VPC to which the instance belongs.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set information of the VPC to which the instance belongs.
     * @param VirtualPrivateCloud information of the VPC to which the instance belongs.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Obtain the image`ID` used by the production instance.
     * @return ImageId the image`ID` used by the production instance.
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set the image`ID` used by the production instance.
     * @param ImageId the image`ID` used by the production instance.
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Obtain subscription sign. Value range:<br><li>`NOTIFY_AND_MANUAL_RENEW`: Notify expiry but not renew automatically<br><li>`NOTIFY_AND_AUTO_RENEW`: Notify expiry and renew automatically<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not notify expiry and do not renew automatically
     * @return RenewFlag Sign of Auto-renewal. Value of range:<br><li>`NOTIFY_AND_MANUAL_RENEW`: Notify expiry but not renew automatically<br><li>`NOTIFY_AND_AUTO_RENEW`: Notify expiry and renew automatically<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not notify expiry and do not renew automatically
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set the sign of Auto-renewal. Value of range:<br><li>`NOTIFY_AND_MANUAL_RENEW`: Notify expiry but not renew automatically<br><li>`NOTIFY_AND_AUTO_RENEW`: Notify expiry and renew automatically<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not notify expiry and do not renew automatically
     * @param RenewFlag The sign of Auto-renewal. Value of range:<br><li>`NOTIFY_AND_MANUAL_RENEW`: Notify expiry but not renew automatically<br><li>`NOTIFY_AND_AUTO_RENEW`: Notify expiry and renew automatically<br><li>`DISABLE_NOTIFY_AND_MANUAL_RENEW`: Do not notify expiry and do not renew automatically
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Obtain the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     * @return CreatedTime the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     * @param CreatedTime the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Obtain the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     * @return ExpiredTime the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     * @param ExpiredTime the creation time. Display as the `ISO8601` standard, and use `UTC` time, as the format as: `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Obtain Operating system name
     * @return OsName Operating system name
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set operating system name
     * @param OsName Operating system name
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Obtain the security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808).
     * @return SecurityGroupIds The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). 
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set up the security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808).
     * @param SecurityGroupIds the security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). 
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Obtain login settings of the instance. Only the key associated with the instance is returned.
     * @return LoginSettings login settings of the instance. Only the key associated with the instance is returned.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set login settings of the instance. Only the key associated with the instance is returned.
     * @param LoginSettings login settings of the instance. Only the key associated with the instance is returned.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Obtain instance status<br><li>PENDING: Creating<br></li><li>LAUNCH_FAILED: Creation failed<br></li><li>RUNNING: Running<br></li><li>STOPPED: Shut down<br></li><li>STARTING: Starting up<br></li><li>STOPPING: Shutting down<br></li><li>REBOOTING: Restarting<br></li><li>SHUTDOWN: To be terminated<br></li><li>TERMINATING: Terminating<br></li>
     * @return InstanceState InstanceState. Value range:<br><li>PENDING: Creating<br></li><li>LAUNCH_FAILED: Creation failed<br></li><li>RUNNING: Running<br></li><li>STOPPED: Shut down<br></li><li>STARTING: Starting up<br></li><li>STOPPING: Shutting down<br></li><li>REBOOTING: Restarting<br></li><li>SHUTDOWN: To be terminated<br></li><li>TERMINATING: Terminating<br></li>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set instanceState InstanceState. Value range:<br><li>PENDING: Creating<br></li><li>LAUNCH_FAILED: Creation failed<br></li><li>RUNNING: Running<br></li><li>STOPPED: Shut down<br></li><li>STARTING: Starting up<br></li><li>STOPPING: Shutting down<br></li><li>REBOOTING: Restarting<br></li><li>SHUTDOWN: To be terminated<br></li><li>TERMINATING: Terminating<br></li>
     * @param InstanceState InstanceState. Value range:<br><li>PENDING: Creating<br></li><li>LAUNCH_FAILED: Creation failed<br></li><li>RUNNING: Running<br></li><li>STOPPED: Shut down<br></li><li>STARTING: Starting up<br></li><li>STOPPING: Shutting down<br></li><li>REBOOTING: Restarting<br></li><li>SHUTDOWN: To be terminated<br></li><li>TERMINATING: Terminating<br></li>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Obtain associated tag list of the instance.
     * @return Tags associated tag list of the instance.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set associated tag list of the instance.
     * @param Tags associated tag list of the instance.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Obtain the shutdown billing method of an instance. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<li>NOT_APPLICABLE：Instance is not shut down or not applicable of the shutdown billing mode.<br>
     * @return StopChargingMode  the shutdown billing mode of the instance. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<li>NOT_APPLICABLE：Instance is not shut down or not applicable of the shutdown billing mode.<br>
     */
    public String getStopChargingMode() {
        return this.StopChargingMode;
    }

    /**
     * Set the shutdown billing mode of the instance. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<li>NOT_APPLICABLE：Instance is not shut down or not applicable of the shutdown billing mode.<br>
     * @param StopChargingMode shutdown billing mode of the instance. Value range:<br><li>KEEP_CHARGING: Keep charging after shutdown.<br><li>STOP_CHARGING: Stop charging after shutdown.<li>NOT_APPLICABLE：Instance is not shut down or not applicable of the shutdown billing mode.<br>
     */
    public void setStopChargingMode(String StopChargingMode) {
        this.StopChargingMode = StopChargingMode;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamArraySimple(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "StopChargingMode", this.StopChargingMode);

    }
}

