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

public class InquiryPriceRunInstancesRequest  extends AbstractModel{

    /**
    * Instance position. This parameter is used to specify the availability zone and project to which the instance belongs.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Instance [billing type] (https://cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br>Default: POSTPAID_BY_HOUR.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API  [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/api/213/15749) or in the [instance configuration] (https://cloud.tencent.com/document/product/213/2177) description. If the parameter is not designated, we model is defaulted as S1.SMALL1.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * The instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, the parameter InstanceCount can only be 1. 
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * Configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * Number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664). |
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * The displayed name of the instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `n`, where `[x, x+n-1]` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group is not bounded.
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
    * A string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured.<br>For more information, please see How to Ensure Idempotency.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 30 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * Market-related options for instances, such as parameters related to spot instances |
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
     * Obtain the position of the instance. This parameter is used to specify the availability zone and project to which the instance belongs.
     * @return Placement Location of instance. This parameter is used to specify the availability zone, project and other attributes of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set the location of the instance. This parameter is used to specify the availability zone and project to which the instance belongs.
     * @param Placement Location of instance. This parameter is used to specify the availability zone, project and other attributes of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Obtain valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     * @return ImageId Specify valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     * @param ImageId specifies valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Obtain instance [billing type] (https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br>Default: POSTPAID_BY_HOUR.
     * @return InstanceChargeType Instance [billing type] (https://int.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br>Default: POSTPAID_BY_HOUR.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Configure instance [billing type] (https://cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br>Default: POSTPAID_BY_HOUR.
     * @param InstanceChargeType Instance [billing type] (https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br>Default: POSTPAID_BY_HOUR.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Obtain relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Relevant parameter settings for the prepaid mode, as parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @param InstanceChargePrepaidRelevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Obtain Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API  [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/api/213/15749) or in the [CVM instance type] (https://cloud.tencent.com/document/product/213/11518) description. If the parameter is not specified, the model is defaulted as S1.SMALL.
     * @return InstanceType Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API  [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/api/213/15749) or in the [CVM instance type] (https://cloud.tencent.com/document/product/213/2177) description. If the parameter is not specified, the model is defaulted as S1.SMALL.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API  [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/api/213/15749) or in the [CVM instance type] (https://cloud.tencent.com/document/product/213/2177) description. If the parameter is not specified, the model is defaulted as S1.SMALL.
     * @param InstanceType Instance model. Different instance models specify different resource specifications. Specific values can be found in the latest Specifications by calling the API  [DescribeInstanceTypeConfigs] (https://cloud.tencent.com/document/api/213/15749) or in the [instance type] (https://cloud.tencent.com/document/product/213/2177) description. If the parameter is not specified, the model is defaulted as S1.SMALL.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get the instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     * @return SystemDisk The instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set the instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     * @param SystemDisk Configuration information of instance’s system disk. If the parameter is not specified, the default value is assigned to it. |
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get Configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     * @return DataDisks Configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     * @param DataDisks Configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Obtain configuration information of VPC. This parameter is used to specify VPC ID and subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, it indicates the primary ENI IP of each instance and the value of parameter InstanceCount must be same as the number of VPC IPs. |
     * @return VirtualPrivateCloud Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, the parameter InstanceCount can only be 1. 
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set configuration information of VPC. This parameter is used to specify VPC ID and subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, it indicates the value of parameter InstanceCount must be same as the number of VPC IPs. |
     * @param VirtualPrivateCloud Configuration information of VPC. This parameter is used to specify the VPC ID, subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, the parameter InstanceCount can only be 1.
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Obtain configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     * @return Internet Accessible Configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     * @param InternetAccessible Accessible Configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664). |
     * @return InstanceCount Number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664). |
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664). |
     * @param InstanceCount Number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664). |
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Obtain displayed name of an instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `n`, where `[x, x+n-1]` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     * @return InstanceName Displayed name of an instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `n`, where `[x, x+n-1]` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set the displayed name of the instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `n`, where `[x, x+n-1]` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     * @param InstanceName The displayed name of the instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `n`, where `[x, x+n-1]` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     * @return LoginSettings Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     * @param LoginSettings Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Obtain the security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will not be bounded.
     * @return SecurityGroupIds The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will not be bounded.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
     * @param SecurityGroupIds The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Obtain enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * @return EnhancedService Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * @param EnhancedService Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * A string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured.<br>For more information, please see How to Ensure Idempotency.
     * A string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured.<br>For more information, please see How to Ensure Idempotency.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * A string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured.<br>For more information, please see How to Ensure Idempotency.
     * @param ClientToken A string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured.<br>For more information, please see How to Ensure Idempotency.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Obtain the server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 30 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     * @return HostName Server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 30 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set the Server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 30 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     * @param HostName Server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 30 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Obtain tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     * @return TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     * @param TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Obtain market-related options for instances, such as parameters related to spot instances |
     * @return InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set market-related options for instances, such as parameters related to spot instances |
     * @param InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);

    }
}

