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

public class DescribeImagesRequest  extends AbstractModel{

    /**
    * Image ID list, such as: `img-gvbnzy6f`. the format of parameter of array type refer to [API introduction](https://cloud.tencent.com/document/api/213/15688). The IDs of images can be obtained in following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * Filter conditions, limit of each request of `Filters` is 0, while limit of each request of `Filters.Values`. `ImageIds` and `Filters` cannot be assigned in parameter at same time. the specific filter conditions are as below:
<li> image-id - String - Required:No - (Filter condition) Filter by image ID. </li>
<li> image-type - String - Required:No - (filter condition) Filter by the types of images. values of images：[image type](https://cloud.tencent.com/document/product/213/9452#image_type).</li>
<li> image-state - String - Required:No - (filter condition) Filter by the states of images. value of states: [image statas](https://cloud.tencent.com/document/product/213/9452#image_state).</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset, the default is 0. For more information, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * Limit, default is 20.For more information on Limit, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * Instance type, such as `S1.SMALL1`
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Image ID list, such as: `img-gvbnzy6f`. the format of parameter of array type refer to [API introduction](https://cloud.tencent.com/document/api/213/15688). The IDs of images can be obtained in following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     * @return ImageIds Image ID list, such as: `img-gvbnzy6f`. the format of parameter of array type refer to [API introduction](https://cloud.tencent.com/document/api/213/15688). The IDs of images can be obtained in following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set Image ID list, such as: `img-gvbnzy6f`. the format of parameter of array type refer to [API introduction](https://cloud.tencent.com/document/api/213/15688). The IDs of images can be obtained in following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     * @param ImageIds Image ID list, such as: `img-gvbnzy6f`. the format of parameter of array type refer to [API introduction](https://cloud.tencent.com/document/api/213/15688). The IDs of images can be obtained in following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image).
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Obtain Filter conditions, limit of each request of `Filters` is 0, while limit of each request of `Filters.Values`. `ImageIds` and `Filters` cannot be assigned in parameter at same time. the specific filter conditions are as below:
<li> image-type - String - Required:No - (Filter condition) Filter by image ID. </li>
<li> image-type - String - Required:No - (filter condition) Filter by the types of images. values of images：[image type](https://cloud.tencent.com/document/product/213/9452#image_type).</li>
<li> image-state - String - Required:No - (filter condition) Filter by the states of images. value of states: [image statas](https://cloud.tencent.com/document/product/213/9452#image_state).</li>
     * @return Filters Filter conditions, limit of each request of `Filters` is 0, while limit of each request of `Filters.Values`. `ImageIds` and `Filters` cannot be assigned in parameter at same time. the specific filter conditions are as below:
<li> image-type - String - Required:No - (Filter condition) Filter by image ID. </li>
<li> image-type - String - Required:No - (filter condition) Filter by the types of images. values of images：[image type](https://cloud.tencent.com/document/product/213/9452#image_type).</li>
<li> image-state - String - Required:No - (filter condition) Filter by the states of images. value of states: [image statas](https://cloud.tencent.com/document/product/213/9452#image_state).</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions, limit of each request of `Filters` is 0, while limit of each request of `Filters.Values`. `ImageIds` and `Filters` cannot be assigned in parameter at same time. the specific filter conditions are as below:
<li> image-type - String - Required:No - (Filter condition) Filter by image ID. </li>
<li> image-type - String - Required:No - (filter condition) Filter by the types of images. values of images：[image type](https://cloud.tencent.com/document/product/213/9452#image_type).</li>
<li> image-state - String - Required:No - (filter condition) Filter by the states of images. value of states: [image statas](https://cloud.tencent.com/document/product/213/9452#image_state).</li>
     * @param Filters Filter conditions, limit of each request of `Filters` is 0, while limit of each request of `Filters.Values`. `ImageIds` and `Filters` cannot be assigned in parameter at same time. the specific filter conditions are as below:
<li> image-type - String - Required:No - (Filter condition) Filter by image ID. </li>
<li> image-type - String - Required:No - (filter condition) Filter by the types of images. values of images：[image type](https://cloud.tencent.com/document/product/213/9452#image_type).</li>
<li> image-state - String - Required:No - (filter condition) Filter by the states of images. value of states: [image statas](https://cloud.tencent.com/document/product/213/9452#image_state).</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Offset, the default is 0. For more information, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     * @return Offset Offset, the default is 0. For more information, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, the default is 0. For more information, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     * @param Offset Offset, the default is 0. For more information, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Limit, default is 20.For more information on Limit, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     * @return Limit Limit, default is 20.For more information on Limit, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit, default is 20.For more information on Limit, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     * @param Limit Limit, default is 20.For more information on Limit, please see [API Introduction](/document/api/213/568#.E8.BE.93.E5.85.A5.E5.8F.82.E6.95.B0.E4.B8.8E.E8.BF.94.E5.9B.9E.E5.8F.82.E6.95.B0.E9.87.8A.E4.B9.89).
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Obtain instances types, such as `S1.SMALL1`
     * @return InstanceType instances types, such as `S1.SMALL1`
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set instances types, such as `S1.SMALL1`
     * @param InstanceType instances types, such as `S1.SMALL1`
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

