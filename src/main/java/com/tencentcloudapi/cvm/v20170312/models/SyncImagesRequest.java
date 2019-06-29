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

public class SyncImagesRequest  extends AbstractModel{

    /**
    * Image ID can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).<br>Image ID must meet the following requirements:<br><li>It must identify an image with a status of `NORMAL`.<br><li>It must identify an image smaller than 50 GB.<br>For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * List of destination regions for synchronization. Destination region must meet the following requirements:<br><li>It cannot be the source region.<br><li>It must be valid.<br><li>Synchronization is not supported for some regions.<br>For more information about region parameter, see [Regions](https://intl.cloud.tencent.com/document/product/213/6091).
    */
    @SerializedName("DestinationRegions")
    @Expose
    private String [] DestinationRegions;

    /**
     * Obtain image ID list. Image ID can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).<br>Image ID must meet the following requirements:<br><li>It must identify an image with a status of `NORMAL`.<br><li>It must identify an image smaller than 50 GB.<br>For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     * @return ImageIds Image ID can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).<br>Image ID must meet the following requirements:<br><li>It must identify an image with a status of `NORMAL`.<br><li>It must identify an image smaller than 50 GB.<br>For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set up image ID can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).<br>Image ID must meet the following requirements:<br><li>It must identify an image with a status of `NORMAL`.<br><li>It must identify an image smaller than 50 GB.<br>For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     * @param ImageIds Image ID can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).<br>Image ID must meet the following requirements:<br><li>It must identify an image with a status of `NORMAL`.<br><li>It must identify an image smaller than 50 GB.<br>For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * List of destination regions for synchronization. Destination region must meet the following requirements:<br><li>It cannot be the source region.<br><li>It must be valid.<br><li>Synchronization is not supported for some regions.<br>For more information about region parameter, see [Regions](https://intl.cloud.tencent.com/document/product/213/6091).
     * @return DestinationRegions List of destination regions for synchronization. Destination region must meet the following requirements:<br><li>It cannot be the source region.<br><li>It must be valid.<br><li>Synchronization is not supported for some regions.<br>For more information about region parameter, see [Regions](https://intl.cloud.tencent.com/document/product/213/6091).
     */
    public String [] getDestinationRegions() {
        return this.DestinationRegions;
    }

    /**
     * Set up the list of destination regions for synchronization. Destination region must meet the following requirements:<br><li>It cannot be the source region.<br><li>It must be valid.<br><li>Synchronization is not supported for some regions.<br>For more information about region parameter, see [Regions](https://intl.cloud.tencent.com/document/product/213/6091).
     * @param DestinationRegions The list of destination regions for synchronization. Destination region must meet the following requirements:<br><li>It cannot be the source region.<br><li>It must be valid.<br><li>Synchronization is not supported for some regions.<br>For more information about region parameter, see [Regions](https://intl.cloud.tencent.com/document/product/213/6091).
     */
    public void setDestinationRegions(String [] DestinationRegions) {
        this.DestinationRegions = DestinationRegions;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArraySimple(map, prefix + "DestinationRegions.", this.DestinationRegions);

    }
}

