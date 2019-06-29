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

public class InquiryPriceRenewInstancesResponse  extends AbstractModel{

    /**
    * Indicates the price of the instance with specified configuration.
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get indicates the price of the instance with specified configuration.
     * @return Price Indicates the price of the instance with specified configuration.
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set indicates the price of the instance with specified configuration.
     * @param Price Indicates the price of the instance with specified configuration.
     */
    public void setPrice(Price Price) {
        this.Price = Price;
    }

    /**
     * Get unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Price.", this.Price);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

