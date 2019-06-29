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

public class ModifyImageAttributeRequest  extends AbstractModel{

    /**
    * Image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Set a new image name, which must meet the following requirements:<br> <li> It cannot exceed 64 characters.<br> <li> It must be unique.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Set a new image description, which must meet the following requirements:<br> <li> It cannot exceed 60 characters.
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
     * Obtain image ID list like `img-gvbnzy6f`. Image ID can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     * @return ImageIds Image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set up image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     * @param ImageIds Image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Set a new image name, which must meet the following requirements:<br> <li> It cannot exceed 20 characters.<br> <li> Image name cannot be the same as present image names.
     * @return ImageName Set a new image name, which must meet the following requirements:<br> <li> It cannot exceed 20 characters.<br> <li> Image name cannot be the same as present image names.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set a new image name, which must meet the following requirements:<br> <li> It cannot exceed 20 characters.<br> <li> Image name cannot be the same as present image names.
     * @param ImageName Set a new image name, which must meet the following requirements:<br> <li> It cannot exceed 20 characters.<br> <li> Image name cannot be the same as present image names.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Set a new image description, which must meet the following requirements:<br> <li> It cannot exceed 60 characters.
     * @return ImageDescription Set a new image description, which must meet the following requirements:<br> <li>  It cannot exceed 60 characters.
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set a new image description, which must meet the following requirements:<br> <li>  It cannot exceed 60 characters.
     * @param ImageDescription Set a new image name, which must meet the following requirements:<br> <li>  It cannot exceed 60 characters.
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);

    }
}

