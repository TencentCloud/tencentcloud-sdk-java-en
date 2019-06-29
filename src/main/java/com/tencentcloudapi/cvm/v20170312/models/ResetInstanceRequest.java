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

public class ResetInstanceRequest  extends AbstractModel{

    /**
    * Instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images:<br/><li>Public Image</li><li>Custom Image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/9418) obtain the `ImageId` field value in the returned result.</li>
<br>Defalt value:Using current image
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Configuration information of the system disk in the instance. For the instances with a cloud disk as the system disk, you can allowed to perform capacity expansion of the system disk after re-installation by using this parameter to specify the capacity. If the parameter is not specified, the system disk capacity remains unchanged by default. You can only expand the system disk capacity (capacity reduction is not supported for a system disk). Re-installing the system can only modify the system disk capacity, and cannot modify the system disk type.
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * Login settings of an instance. This parameter is used to set the instance login method, passwor, key, or to keep the original login settings of image. By default, a password is generated randomly and notified to the user via internal message.
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * Enhanced service.This parameter is for turn on/off Cloud services like security and monitoring etc.If it is not defined,security service and monitoring service are turned on by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * Modify the instance’s HostName is supported when rereinstall system
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
     * Get instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388).
     * @return InstanceId Instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388).
     * @param InstanceId Instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/9388).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Obtain the specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images:<br/><li>Public Image</li><li>Custom Image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/9418) obtain the `ImageId` field value in the returned result.</li>
<br>Defalut value：Using the current Image
     * @return ImageId Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images:<br/><li>Public image</li><li>Custom Image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/9418) obtain the `ImageId` field value in the returned result.</li>
<br>Defalut value：Using the current Image
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Configure the specifies a valid [Image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of Images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/9418) obtain the `ImageId` field value in the returned result.</li>
<br>Defalut value：Using the current Image
     * @param ImageId Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images:<br/><li>Public Images</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images</li><br/>You can obtain the available image ID by either of the following ways: <br/><li>Query the image ID of a `公共镜像`, `自定义镜像` or `共享镜像` by logging in to the [Console]; query the image ID of a `服务镜像市场` via [Cloud Marketplace] (https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/9418) obtain the `ImageId` field value in the returned result.</li>
<br>Defalut value：Using the current Image
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get configuration information of the system disk in the instance. For the instances with a cloud disk as the system disk, you can allowed to perform capacity expansion of the system disk after re-installation by using this parameter to specify the capacity. If the parameter is not specified, the system disk capacity remains unchanged by default. You can only expand the system disk capacity (capacity reduction is not supported for a system disk). Re-installing the system can only modify the system disk capacity, and cannot modify the system disk type.
     * @return SystemDisk  Configuration information of the system disk in the instance. For the instances with a cloud disk as the system disk, you can allowed to perform capacity expansion of the system disk after re-installation by using this parameter to specify the capacity. If the parameter is not specified, the system disk capacity remains unchanged by default. You can only expand the system disk capacity (capacity reduction is not supported for a system disk). Re-installing the system can only modify the system disk capacity, and cannot modify the system disk type.
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set configuration information of the system disk in the instance. For the instances with a cloud disk as the system disk, you can allowed to perform capacity expansion of the system disk after re-installation by using this parameter to specify the capacity. If the parameter is not specified, the system disk capacity remains unchanged by default. You can only expand the system disk capacity (capacity reduction is not supported for a system disk). Re-installing the system can only modify the system disk capacity, and cannot modify the system disk type.
     * @param SystemDisk Configuration information of the system disk in the instance. For the instances with a cloud disk as the system disk, you can allowed to perform capacity expansion of the system disk after re-installation by using this parameter to specify the capacity. If the parameter is not specified, the system disk capacity remains unchanged by default. You can only expand the system disk capacity (capacity reduction is not supported for a system disk). Re-installing the system can only modify the system disk capacity, and cannot modify the system disk type.
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get login settings of an instance. This parameter is used to set the instance login method, passwor, key, or to keep the original login settings of image. By default, a password is generated randomly and notified to the user via internal message.
     * @return LoginSettings Login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message. 
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set up login settings of the instance. This parameter is used to set the login password and key for the instance, or to keep the original login settings for the image. By default, a random password is generated and sent to the user via the internal message.
     * @param LoginSettings Login settings of an instance. This parameter is used to set the instance login method, passwor, key, or to keep the original login settings of image. By default, a password is generated randomly and notified to the user via internal message.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get enables enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitor services. If this parameter is not specified, Cloud Monitor and Cloud Security services are enabled by default.
     * @return EnhancedService Enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set up enhanced service. This parameter is used to specify whether to enable Cloud Security, Cloud Monitoring and other services. If this parameter is not specified, the Cloud Monitoring and Cloud Security are enabled by default.
     * @param EnhancedService Enables enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitor services. If this parameter is not specified, Cloud Monitor and Cloud Security services are enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Modify instance’s HostName is supported when reinstall the system.
     * @return HostName Modify instance’s HostName is supported when reinstall the system.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Modify instance’s HostName is supported when reinstall the system
     * @param HostName Modify instance’s HostName is supported when reinstall the system.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "HostName", this.HostName);

    }
}

