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

public class ModifyLaunchConfigurationAttributesRequest  extends AbstractModel{

    /**
    * Launch configuration ID.
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-8toqc6s3`. There are four types of images:<br/><li>Public image.</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images.</li><br/>You can obtain the available image ID by either of the following ways:<br/><li>Query the image ID of a `Public image`, `Custom image` or `Shared Image` by logging in to the [Console]; query the image ID of a `Service Marketplace Images` via [Cloud Marketplace].</li><li>Call the interface [DescribeImages] (https://cloud.tencent.com/document/api/213/15715), in the return string, retrieve filed [1].</li>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * List of instance machine types,each type defines different configurations about resources. It can have up to 5 instance machine types. Start the configuration, representing a single instance type via InstanceType and a multi-instance type via InstanceTypes. After the InstanceTypes is successfully started, the original InstanceType is automatically invalidated.
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * The validation policy works when actually modifying InstanceTypes. Valid value: ALL,ANY. Default value is ANY.<br><li> ALL, All instance types can be used, then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used, then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
    */
    @SerializedName("InstanceTypesCheckPolicy")
    @Expose
    private String InstanceTypesCheckPolicy;

    /**
    * Launch configuration display name.The name can only contain Chinese,English letters, numbers, underscore, hyphen”-”, English dot “.”. It cannot exceed 60 characters.
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * The customized data Base64 encoded. Not exceed 16KB in size. If you want to clear UserData, specify it as an empty string.
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

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
     * Obtain the specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-8toqc6s3`. There are four types of images:<br/><li>Public image.</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images.</li><br/>You can obtain the available image ID by either of the following ways:<br/><li>Query the image ID of a `Public image`, `Custom image` or `Shared Image` by logging in to the [Console]; query the image ID of a `Service Marketplace Images` via [Cloud Marketplace].</li><li>Call the interface [DescribeImages] (https://cloud.tencent.com/document/api/213/15715), in the return string, retrieve filed `ImageId`.</li>
     * @return ImageId Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-8toqc6s3`. There are four types of images:<br/><li>Public image.</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images.</li><br/>You can obtain the available image ID by either of the following ways:<br/><li>Query the image ID of a `Public image`, `Custom image` or `Shared Image` by logging in to the [Console]; query the image ID of a `Service Marketplace Images` via [Cloud Marketplace].</li><li>Call the interface [DescribeImages] (https://cloud.tencent.com/document/api/213/15715), in the return string,retrieve filed `ImageId`.</li>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Configure the specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-8toqc6s3`. There are four types of images:<br/><li>Public image.</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images.</li><br/>You can obtain the available image ID by either of the following ways:<br/><li>Query the image ID of a `Public image`, `Custom image` or `Shared Image` by logging in to the [Console]; query the image ID of a `Service Marketplace Images` via [Cloud Marketplace].</li><li>Call the interface [DescribeImages] (https://cloud.tencent.com/document/api/213/15715), in the return string,retrieve filed `ImageId`.</li>
     * @param ImageId Specifies a valid [image] (https://intl.cloud.tencent.com/document/product/213/4940) ID, such as `img-8toqc6s3`. There are four types of images:<br/><li>Public image.</li><li>Custom image</li><li>Shared Image.</li><li>Service Marketplace Images.</li><br/>You can obtain the available image ID by either of the following ways:<br/><li>Query the image ID of a `Public image`, `Custom image` or `Shared Image` by logging in to the [Console]; query the image ID of a `Service Marketplace Images` via [Cloud Marketplace].</li><li>Call the interface [DescribeImages] (https://cloud.tencent.com/document/api/213/15715), in the return string,retrieve filed `ImageId`.</li>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Obtain the list of instance machine types,each type defines different configurations about resources. It can have up to 5 instance machine types. Start the configuration, representing a single instance type via InstanceType and a multi-instance type via InstanceTypes. After the InstanceTypes is successfully started, the original InstanceType is automatically invalidated.
     * @return InstanceTypes List of instance machine types,each type defines different configurations about resources. It can have up to 5 instance machine types. Start the configuration, representing a single instance type via InstanceType and a multi-instance type via InstanceTypes. After the InstanceTypes is successfully started, the original InstanceType is automatically invalidated.
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Configure the list of instance machine types,each type defines different configurations about resources. It can have up to 5 instance machine types. Start the configuration, representing a single instance type via InstanceType and a multi-instance type via InstanceTypes. After the InstanceTypes is successfully started, the original InstanceType is automatically invalidated.
     * @param InstanceTypes List of instance machine types,each type defines different configurations about resources. It can have up to 5 instance machine types. Start the configuration, representing a single instance type via InstanceType and a multi-instance type via InstanceTypes. After the InstanceTypes is successfully started, the original InstanceType is automatically invalidated.
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Obtain the validation policy works when actually modifying InstanceTypes. Valid value: ALL,ANY. Default value is ANY.<br><li> ALL, All instance types can be used, then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used, then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     * @return InstanceTypesCheckPolicy The validation policy works when actually modifying InstanceTypes. Valid value: ALL,ANY. Default value is ANY.<br><li> ALL, All instance types can be used, then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used, then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     */
    public String getInstanceTypesCheckPolicy() {
        return this.InstanceTypesCheckPolicy;
    }

    /**
     * Configure the validation policy works when actually modifying InstanceTypes. Valid value: ALL,ANY. Default value is ANY.<br><li> ALL, All instance types can be used, then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used, then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     * @param InstanceTypesCheckPolicy The validation policy works when actually modifying InstanceTypes. Valid value: ALL,ANY. Default value is ANY.<br><li> ALL, All instance types can be used, then the validation is passed.Otherwise validation fail.<br><li> ANY, Any one of instance types can be used, then the validation is passed.Otherwise validation fail. The scenarios that instance types are not usable include: instance types are sold out,associated cloud disks are sold out. If an instance type does not exist or it is offiline, no matter what values InstanceTypesCheckPolicy has, validation always fail.
     */
    public void setInstanceTypesCheckPolicy(String InstanceTypesCheckPolicy) {
        this.InstanceTypesCheckPolicy = InstanceTypesCheckPolicy;
    }

    /**
     * Obtain the launch configuration display name.The name can only contain Chinese,English letters, numbers, underscore, hyphen”-”, English dot “.”. It cannot exceed 60 characters.
     * @return LaunchConfigurationName Launch configuration display name.The name can only contain Chinese,English letters, numbers, underscore, hyphen”-”, English dot “.”. It cannot exceed 60 characters.
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Configure the launch configuration display name.The name can only contain Chinese,English letters, numbers, underscore, hyphen”-”, English dot “.”. It cannot exceed 60 characters.
     * @param LaunchConfigurationName Launch configuration display name.The name can only contain Chinese,English letters, numbers, underscore, hyphen”-”, English dot “.”. It cannot exceed 60 characters.
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Obtain the customized data Base64 encoded. Not exceed 16KB in size. If you want to clear UserData, specify it as an empty string.
     * @return UserData The customized data Base64 encoded. Not exceed 16KB in size. If you want to clear UserData, specify it as an empty string.
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Configure the customized data Base64 encoded. Not exceed 16KB in size. If you want to clear UserData, specify it as an empty string.
     * @param UserData The customized data Base64 encoded. Not exceed 16KB in size. If you want to clear UserData, specify it as an empty string.
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "InstanceTypesCheckPolicy", this.InstanceTypesCheckPolicy);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "UserData", this.UserData);

    }
}

