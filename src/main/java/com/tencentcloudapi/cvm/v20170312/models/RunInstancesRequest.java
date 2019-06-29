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

public class RunInstancesRequest  extends AbstractModel{

    /**
    * Location of an instance. This parameter is used to specify the availability zone, the project to which the instance belongs, and the CDH (specified when creating dedicated CVMs on a CDH), etc. 
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get field `ImageId` in the returned values by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Instance [billing type] (https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid. Monthly subscription.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>CDHPAID: exclusive child host billing (based on the creation of CDH, and CDH resources are free of charge)<br><li>SPOTPAID: pay by bidding<br>Default: POSTPAID_BY_HOUR.
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
    * Instance model. Different resource specifications are specified for different instance models.<br><li>For the creation of instance on the PREPAID or POSTPAID_BY_HOUR basis, specific values can be found in the latest specifications by calling the API [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749) or in [CVM Instance Configuration](https://intl.cloud.tencent.com/document/product/213/11518). If this parameter is not specified, the default model is S1.SMALL1. <br><li>For the creation of instance on the CDHPAID basis, the prefix of the parameter value is "CDH_". The parameter value is in the format of CDH_XCXG based on the CPU and memory configuration. For example, if a sub-machine of CDH is created with a single-core CPU and 1 GB memory, its value should be CDH_1C1G
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
    * Configuration information of VPC. This parameter is used to specify VPC ID and subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, it indicates the primary ENI IP of each instance and the value of parameter InstanceCount must be same as the number of VPC IPs.
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
    * The displayed name of the instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `[x, x+n-1]`, where `n` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
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
    * The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
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
    * Server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 60 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Timed tasks. This parameter is used to specify timed tasks for instances. Only timed termination is supported.
    */
    @SerializedName("ActionTimer")
    @Expose
    private ActionTimer ActionTimer;

    /**
    * Id of Placement Group: you can specify only one.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * Tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * Market-related options for instances, such as parameters related to spot instances.This parameter is required if the billing method for the specified instance is prepaid.
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * The user data provided to the instance, which is to be encoded in base64 mode, with the maximum size of 16KB. For more information on how to get this parameter, please see [Windows](https://intl.cloud.tencent.com/document/product/213/17526) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525) upon initial startup.
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
     * Obtain location of the instance. This parameter is used to specify the availability zone, the project to which the instance belongs, and the CDH (specified when creating CVMs), etc. 
     * @return Placement Location of the instance. This parameter is used to specify the availability zone, the project to which the instance belongs, and the CDH (specified when creating CVMs), etc. 
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Configure location of the instance. This parameter is used to specify the availability zone, the project to which the instance belongs, and the CDH (specified when creating CVMs), etc. 
     * @param Placement Location of the instance. This parameter is used to specify the availability zone, the project to which the instance belongs, and the CDH (specified when creating CVMs), etc. 
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Obtain valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Obtain the `ImageId` field value in the returned result by calling [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     * @return ImageId Specify valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get field `ImageId` in the returned values by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940)ID, such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get field `ImageId` in the returned values by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     * @param ImageId specifies valid [image] IDs (https://intl.cloud.tencent.com/document/product/213/4940), such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Get field `ImageId` in the returned values by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Obtain instance [billing type] (https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid. Monthly subscription.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>CDHPAID: exclusive child host billing (based on the creation of CDH, and CDH resources are free of charge)<br><li>SPOTPAID: pay by bidding<br>Default: POSTPAID_BY_HOUR.
     * @return InstanceChargeType Instance [billing type] (https://int.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid. Monthly subscription.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>CDHPAID: exclusive child host billing (based on the creation of CDH, and CDH resources are free of charge)<br><li>SPOTPAID: pay by bidding<br>Default: POSTPAID_BY_HOUR.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Configure instance [billing type] (https://cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid. Monthly subscription.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>CDHPAID: exclusive child host billing (based on the creation of CDH, and CDH resources are free of charge)<br><li>SPOTPAID: pay by bidding<br>Default: POSTPAID_BY_HOUR.
     * @param InstanceChargeType Instance [billing type] (https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid. Monthly subscription.<br><li>POSTPAID_BY_HOUR: postpaid by hour.<br><li>CDHPAID: exclusive child host billing (based on the creation of CDH, and CDH resources are free of charge)<br><li>SPOTPAID: pay by bidding<br>Default: POSTPAID_BY_HOUR.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Obtain relevant parameter settings for the prepaid mode: this parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @return InstanceChargePrepaid Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Configure relevant parameter settings for the prepaid mode: this parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @param InstanceChargePrepaid Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Obtain instance model. Different resource specifications are specified for different instance models.<br><li>For the creation of instance on the PREPAID or POSTPAID_BY_HOUR basis, specific values can be found in the latest specifications by calling the API [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749) or in [CVM Instance Configuration](https://intl.cloud.tencent.com/document/product/213/11518). If this parameter is not specified, the default model is S1.SMALL1. <br><li>For the creation of instance on the CDHPAID basis, the prefix of the parameter value is "CDH_". The parameter value is in the format of CDH_XCXG based on the CPU and memory configuration. For example, if a sub-machine of CDH is created with a single-core CPU and 1 GB memory, its value should be CDH_1C1G
     * @return InstanceType Instance model. Different instance models specify different resource specifications.<br><li>For the creation of instance on the PREPAID or POSTPAID_BY_HOUR basis, specific values can be found in the latest specifications by calling the API [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749) or in [CVM Instance Configuration](https://intl.cloud.tencent.com/document/product/213/11518). If this parameter is not specified, the default model is S1.SMALL1. <br><li>For the creation of instance on the CDHPAID basis, the prefix of the parameter value is "CDH_". The parameter value is in the format of CDH_XCXG based on the CPU and memory configuration. For example, if a sub-machine of CDH is created with a single-core CPU and 1 GB memory, its value should be CDH_1C1G
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Configure instance model. Different resource specifications are specified for different instance models.<br><li>For the creation of instance on the PREPAID or POSTPAID_BY_HOUR basis, specific values can be found in the latest specifications by calling the API [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749) or in [CVM Instance Configuration](https://intl.cloud.tencent.com/document/product/213/11518). If this parameter is not specified, the default model is S1.SMALL1. <br><li>For the creation of instance on the CDHPAID basis, the prefix of the parameter value is "CDH_". The parameter value is in the format of CDH_XCXG based on the CPU and memory configuration. For example, if a sub-machine of CDH is created with a single-core CPU and 1 GB memory, its value should be CDH_1C1G
     * @param InstanceType Instance model. Different instance models specify different resource specifications.<br><li>For the creation of instance on the PREPAID or POSTPAID_BY_HOUR basis, specific values can be found in the latest specifications by calling the API [DescribeInstanceTypeConfigs](https://intl.cloud.tencent.com/document/api/213/15749) or in [CVM Instance Configuration](https://intl.cloud.tencent.com/document/product/213/11518). If this parameter is not specified, the default model is S1.SMALL1. <br><li>For the creation of instance on the CDHPAID basis, the prefix of the parameter value is "CDH_". The parameter value is in the format of CDH_XCXG based on the CPU and memory configuration. For example, if a sub-machine of CDH is created with a single-core CPU and 1 GB memory, its value should be CDH_1C1G
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Obtain the instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     * @return SystemDisk Configuration information of instance’s system disk. If the parameter is not specified, the default value is assigned to it. |
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set up the instance’s system disk configuration of the launch configuration. If this parameter is not specified, the default value is assigned to it.
     * @param SystemDisk Configuration information of instance’s system disk. If the parameter is not specified, the default value is assigned to it. |
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Obtain configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     * @return DataDisks Configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Configure configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     * @param DataDisks Configuration information of the instance data disk. If the parameter is not specified, no data disk will be purchased by default. When purchasing, you can specify 11 data disks, which can contain at most 1 LOCAL_BASIC data disk or LOCAL_SSD data disk, at most 10 CLOUD_BASIC data disks, CLOUD_PREMIUM data disks, or CLOUD_SSD data disks.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Obtain configuration information of VPC. This parameter is used to specify VPC ID and subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, it indicates the primary ENI IP of each instance and the value of parameter InstanceCount must be same as the number of VPC IPs. |
     * @return VirtualPrivateCloud Configuration information of VPC. This parameter is used to specify VPC ID and subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, it indicates the primary ENI IP of each instance and the value of parameter InstanceCount must be same as the number of VPC IPs.
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Configure configuration information of VPC. This parameter is used to specify VPC ID and subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, it indicates the primary ENI IP of each instance and the value of parameter InstanceCount must be same as the number of VPC IPs. |
     * @param VirtualPrivateCloud Configuration information of VPC. This parameter is used to specify VPC ID and subnet ID, etc. If this parameter is not specified, the basic network is used by default. If a VPC IP is specified in this parameter, it indicates the primary ENI IP of each instance and the value of parameter InstanceCount must be same as the number of VPC IPs. |
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
     * Set up configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     * @param InternetAccessible Accessible Configuration information of public network bandwidth. If this parameter is not specified, the default public network bandwidth is 0 Mbps.
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Obtain number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664).
     * @return InstanceCount Number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664).
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664).
     * @param InstanceCount Number of instances to be purchased. Value range: [1, 100]. Default value: 1. The specified number of instances to be purchased cannot exceed the remaining quota allowed for the user, For more information about quota restrictions, please see [Restrictions on CVM Instance Purchase](https://intl.cloud.tencent.com/document/product/213/2664). |
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Obtain displayed name of an instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `[x, x+n-1]`, where `n` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     * @return InstanceName Displayed name of an instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `[x, x+n-1]`, where `n` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set the displayed name of the instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `[x, x+n-1]`, where `n` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     * @param InstanceName The displayed name of the instance.<br><li>If it is not specified, "Not named" is displayed by default.</li><li>If you purchase multiple instances and the pattern string `{R:x}` is specified, display names will be generated based on `[x, x+n-1]`, where `n` is the number of instances purchased. For example, when `server_{R:3}` is specified, the display name will be`server_3` if one instance is purchased, or `server_3` and `server_4` if two instances are purchased. You can specify multiple pattern strings `{R:x}`.</li><li>If you purchase multiple instances and the name pattern string is not specified, the suffix `1、2...n` is appended to the display names, where `n` is the number of instances purchased. For example, when `server_` is specified, the display name will be `server_1` and `server_2` if two instances are purchased.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Obtain login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     * @return LoginSettings Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set up login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message.
     * @param LoginSettings login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Obtain the security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
     * @return SecurityGroupIds The security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set up the security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
     * @param SecurityGroupIds the security group to which the instance belongs. This parameter can be obtained by calling the sgld field in the returned value of [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/api/215/15808). If this parameter is not specified, the defaul security group will be bounded.
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
     * Set up enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * @param EnhancedService Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Obtain a string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured.<br>For more information, please see How to Ensure Idempotency.
     * @return ClientToken A string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured. |<br>For more information, please see How to Ensure Idempotency.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set up a string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured.<br>For more information, please see How to Ensure Idempotency.
     * @param ClientToken A string to ensure the idempotency of the request, which is generated by the client. Each request shall have a unique string with a maximum of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be ensured. |<br>For more information, please see How to Ensure Idempotency.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Obtain server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 60 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     * @return HostName Server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 60 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set up server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 60 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     * @param HostName Server name of CVM.<br><li>Period (.) and hyphen (-) cannot be used as the first and the last character of HostName, and multiple consecutive hyphens (-) or periods (.) are not allowed.<br><li>Windows instance: The name should be a combination of 2 to 15 characters comprised of letters (case insensitive), numbers, and hyphens (-). Period (.) is not supported, and the name cannot be a string of pure numbers.<br><li>Other types (such as Linux) of instances: The name should be a combination of 2 to 60 characters, supporting multiple periods (.). The piece between two periods is composed of letters (case insensitive), numbers, and hyphens (-).
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Obtain timed tasks. This parameter is used to specify timed tasks for instances. Only timed termination is supported.
     * @return ActionTimer Timed task. This parameter is used to specify the timed task for instance. Currently, only the timed termination is supported.
     */
    public ActionTimer getActionTimer() {
        return this.ActionTimer;
    }

    /**
     * Set up timed tasks. This parameter is used to specify timed tasks for instances. Only timed termination is supported.
     * @param ActionTimer Timed task. This parameter is used to specify the timed task for instance. Currently, only the timed termination is supported.
     */
    public void setActionTimer(ActionTimer ActionTimer) {
        this.ActionTimer = ActionTimer;
    }

    /**
     * Obtain id of Placement Group: you can specify only one.
     * @return DisasterRecoverGroupIds Id of Placement Group: you can specify only one.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set up id of Placement Group: you can specify only one.
     * @param DisasterRecoverGroupIds Id of Placement Group: you can specify only one.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Obtain tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     * @return TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set up tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     * @param TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance. A tag can only be bound to CVM instances.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Obtain market-related options for instances, such as parameters related to spot instances. This parameter is required if the billing method for the specified instance is prepaid.
     * @return InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances. This parameter is required if the billing method for the specified instance is prepaid.
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set market-related options for instances, such as parameters related to spot instances. This parameter is required if the billing method for the specified instance is prepaid.
     * @param InstanceMarketOptions Market-related options for instances, such as parameters related to spot instances. This parameter is required if the billing method for the specified instance is prepaid.
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Obtain the user data provided to the instance, which is to be encoded in base64 mode, with the maximum size of 16KB. For more information on how to get this parameter, please see [Windows](https://intl.cloud.tencent.com/document/product/213/17526) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525) upon initial startup.
     * @return UserData the user data provided to the instance, which is to be encoded in base64 mode, with the maximum size of 16KB. For more information on how to get this parameter, please see [Windows](https://intl.cloud.tencent.com/document/product/213/17526) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525) upon initial startup.
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Configure the user data provided to the instance, which is to be encoded in base64 mode, with the maximum size of 16KB. For more information on how to get this parameter, please see [Windows](https://intl.cloud.tencent.com/document/product/213/17526) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525) upon initial startup.
     * @param UserData The user data provided to the instance, which is to be encoded in base64 mode, with the maximum size of 16KB. For more information on how to get this parameter, please see [Windows](https://intl.cloud.tencent.com/document/product/213/17526) and [Linux](https://intl.cloud.tencent.com/document/product/213/17525) upon initial startup.
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * For internal use only.
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
        this.setParamObj(map, prefix + "ActionTimer.", this.ActionTimer);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamSimple(map, prefix + "UserData", this.UserData);

    }
}

