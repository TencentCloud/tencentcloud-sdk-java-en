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

public class InstanceMarketOptionsRequest  extends AbstractModel{

    /**
    * Spot-related options
    */
    @SerializedName("SpotOptions")
    @Expose
    private SpotMarketOptions SpotOptions;

    /**
    * Market type. Only "spot" is supported.
    */
    @SerializedName("MarketType")
    @Expose
    private String MarketType;

    /**
     * Get options related to bidding
     * @return SpotOptions options related to bidding
     */
    public SpotMarketOptions getSpotOptions() {
        return this.SpotOptions;
    }

    /**
     * Set options related to spot requests
     * @param SpotOptions Options related to bidding
     */
    public void setSpotOptions(SpotMarketOptions SpotOptions) {
        this.SpotOptions = SpotOptions;
    }

    /**
     * Get market type. Only "spot" is supported.
     * @return MarketType market type. Only "spot" is supported.
     */
    public String getMarketType() {
        return this.MarketType;
    }

    /**
     * Set market type. Only "spot" is supported.
     * @param MarketType market type. Only "spot" is supported.
     */
    public void setMarketType(String MarketType) {
        this.MarketType = MarketType;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SpotOptions.", this.SpotOptions);
        this.setParamSimple(map, prefix + "MarketType", this.MarketType);

    }
}

