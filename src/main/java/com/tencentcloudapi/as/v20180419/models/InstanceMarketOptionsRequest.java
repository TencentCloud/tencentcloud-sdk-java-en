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

public class InstanceMarketOptionsRequest  extends AbstractModel{

    /**
    * Spot-related options.
    */
    @SerializedName("SpotOptions")
    @Expose
    private SpotMarketOptions SpotOptions;

    /**
    * Market type. Only "spot" is supported.Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MarketType")
    @Expose
    private String MarketType;

    /**
     * Obtain the spot-related options.
     * @return SpotOptions Spot-related options.
     */
    public SpotMarketOptions getSpotOptions() {
        return this.SpotOptions;
    }

    /**
     * Configure the spot-related options.
     * @param SpotOptions Spot-related options.
     */
    public void setSpotOptions(SpotMarketOptions SpotOptions) {
        this.SpotOptions = SpotOptions;
    }

    /**
     * Obtain the market type. Only "spot" is supported.Note: This field may return null, indicating that no valid value was found.
     * @return MarketType Market type. Only "spot" is supported.Note: This field may return null, indicating that no valid value was found.
     */
    public String getMarketType() {
        return this.MarketType;
    }

    /**
     * Configure the market type. Only "spot" is supported.Note: This field may return null, indicating that no valid value was found.
     * @param MarketType Market type. Only "spot" is supported.Note: This field may return null, indicating that no valid value was found.
     */
    public void setMarketType(String MarketType) {
        this.MarketType = MarketType;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SpotOptions.", this.SpotOptions);
        this.setParamSimple(map, prefix + "MarketType", this.MarketType);

    }
}

