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

public class InquiryPriceResetInstanceRequest  extends AbstractModel{

    /**
    * Instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies a valid [image](https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images: <br/><li>Public image</li><li>Custom image</li><li>Shared Image</li><li>Marketplace image</li><br/>You can obtain the available image IDs by following methods:<br/><li>Query the Image ID of `PUBLIC_IMAGE`、`CUSTOM_IMAGE`、`SHARED_IMAGE` by logging in to [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); query image ID of a `MARKETPLACE_IMAGE` image via [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
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
    * Enables enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitor services. If this parameter is not specified, Cloud Monitor and Cloud Security services are enabled by default.
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
     * Get instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728).
     * @return InstanceId Instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728).
     * @param InstanceId Instance ID. You can obtain the parameter value from the `InstanceId` field in the returned result of API [DescribeInstances](https://intl.cloud.tencent.com/document/api/213/15728).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get specifies a valid [image](https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images: <br/><li>Public image</li><li>Custom image</li><li>Shared Image</li><li>Marketplace image</li><br/>You can obtain the available image IDs by following methods:<br/><li>Query the Image ID of `PUBLIC_IMAGE`、`CUSTOM_IMAGE`、`SHARED_IMAGE` by logging in to [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); query image ID of a `MARKETPLACE_IMAGE` image via [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     * @return ImageId Specifies a valid [image](https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images: <br/><li>Public image</li><li>Custom image</li><li>Shared Image</li><li>Marketplace image</li><br/>You can obtain the available image IDs by following methods:<br/><li>Query the Image ID of `PUBLIC_IMAGE`、`CUSTOM_IMAGE`、`SHARED_IMAGE` by logging in to [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); query image ID of a `MARKETPLACE_IMAGE` image via [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set specifies a valid [image](https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images: <br/><li>Public image</li><li>Custom image</li><li>Shared Image</li><li>Marketplace image</li><br/>You can obtain the available image IDs by following methods:<br/><li>Query the Image ID of `PUBLIC_IMAGE`、`CUSTOM_IMAGE`、`SHARED_IMAGE` by logging in to [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); query image ID of a `MARKETPLACE_IMAGE` image via [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
     * Set specifies a valid [image](https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-xxx`. There are four types of images: <br/><li>Public image</li><li>Custom image</li><li>Shared Image</li><li>Marketplace image</li><br/>You can obtain the available image IDs by following methods:<br/><li>Query the Image ID of `PUBLIC_IMAGE`、`CUSTOM_IMAGE`、`SHARED_IMAGE` by logging in to [console](https://console.cloud.tencent.com/cvm/image?rid=1&imageType=PUBLIC_IMAGE); query image ID of a `MARKETPLACE_IMAGE` image via [Cloud Marketplace](https://market.cloud.tencent.com/list).</li><li>Utilize API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715) obtain the `ImageId` field value in the returned result.</li>
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
     * @return LoginSettings Login settings of an instance. This parameter is used to set the instance login method, passwor, key, or to keep the original login settings of image. By default, a password is generated randomly and notified to the user via internal message.
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set login settings of an instance. This parameter is used to set the instance login method, passwor, key, or to keep the original login settings of image. By default, a password is generated randomly and notified to the user via internal message.
     * @param LoginSettings Login settings of an instance. This parameter is used to set the instance login method, passwor, key, or to keep the original login settings of image. By default, a password is generated randomly and notified to the user via internal message.
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get enables enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitor services. If this parameter is not specified, Cloud Monitor and Cloud Security services are enabled by default.
     * @return EnhancedService Enables enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitor services. If this parameter is not specified, Cloud Monitor and Cloud Security services are enabled by default.
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set enables enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitor services. If this parameter is not specified, Cloud Monitor and Cloud Security services are enabled by default.
     * @param EnhancedService Enables enhanced services. This parameter is used to specify whether to enable Cloud Security, Cloud Monitor services. If this parameter is not specified, Cloud Monitor and Cloud Security services are enabled by default.
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);

    }
}

