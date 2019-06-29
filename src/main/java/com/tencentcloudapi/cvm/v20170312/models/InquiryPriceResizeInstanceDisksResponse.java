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

public class InquiryPriceResizeInstanceDisksResponse  extends AbstractModel{

    /**
    * The parameter indicates the price of expanding the capacity of the disk to a proper configuration.
    */
    @SerializedName("Price")
    @Expose
    private Price Price;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain the parameter indicates the price of expanding the capacity of the disk to a proper configuration.
     * @return Price The parameter indicates the price of expanding the capacity of the disk to a proper configuration.
     */
    public Price getPrice() {
        return this.Price;
    }

    /**
     * Set the parameter indicates the price of expanding the capacity of the disk to a proper configuration.
     * @param Price the parameter indicates the price of expanding the capacity of the disk to a proper configuration.
     */
    public void setPrice(Price Price) {
        this.Price = Price;
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
     * @param RequestId The unique ID of a request, which is required for each troubleshooting case.
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

