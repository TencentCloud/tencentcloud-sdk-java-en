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

public class DescribeInstanceInternetBandwidthConfigsResponse  extends AbstractModel{

    /**
    * List of bandwidth configurations.
    */
    @SerializedName("InternetBandwidthConfigSet")
    @Expose
    private InternetBandwidthConfig [] InternetBandwidthConfigSet;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain list of bandwidth configurations.
     * @return InternetBandwidthConfigSet List of bandwidth configurations.
     */
    public InternetBandwidthConfig [] getInternetBandwidthConfigSet() {
        return this.InternetBandwidthConfigSet;
    }

    /**
     * Set list of bandwidth configurations.
     * @param InternetBandwidthConfigSet List of bandwidth configurations.
     */
    public void setInternetBandwidthConfigSet(InternetBandwidthConfig [] InternetBandwidthConfigSet) {
        this.InternetBandwidthConfigSet = InternetBandwidthConfigSet;
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
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InternetBandwidthConfigSet.", this.InternetBandwidthConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

