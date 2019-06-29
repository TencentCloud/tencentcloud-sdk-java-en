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

public class DescribeImagesResponse  extends AbstractModel{

    /**
    * An array of detailed information of an image, including the main statuses and attributes of the image.
    */
    @SerializedName("ImageSet")
    @Expose
    private Image [] ImageSet;

    /**
    * Number of images satisfying the filter conditions.
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * obtain An array of detailed information of an image, including the main statuses and attributes of the image.
     * @return ImageSet An array of detailed information of an image, including the main statuses and attributes of the image.
     */
    public Image [] getImageSet() {
        return this.ImageSet;
    }

    /**
     * Set an array of detailed information of an image, including the main statuses and attributes of the image.
     * @param ImageSet An array of detailed information of an image, including the main statuses and attributes of the image.
     */
    public void setImageSet(Image [] ImageSet) {
        this.ImageSet = ImageSet;
    }

    /**
     * Obtain Number of images satisfying the filter conditions.
     * @return TotalCount Number of images satisfying the filter conditions.
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set number of images satisfying the filter conditions.
     * @param TotalCount Number of images satisfying the filter conditions.
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Obtain the unique ID of a request, which is required for each troubleshooting case.
     * @return RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique ID of a request, which is required for each troubleshooting case.
     * @return RequestId The unique ID of a request which is gotten from each request and it is required for each troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ImageSet.", this.ImageSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

