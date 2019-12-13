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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetworkInterfaceLimitResponse extends AbstractModel{

    /**
    * ENI quota
    */
    @SerializedName("EniQuantity")
    @Expose
    private Long EniQuantity;

    /**
    * The quota of IP addresses that can be allocated to each ENI.
    */
    @SerializedName("EniPrivateIpAddressQuantity")
    @Expose
    private Long EniPrivateIpAddressQuantity;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ENI quota 
     * @return EniQuantity ENI quota
     */
    public Long getEniQuantity() {
        return this.EniQuantity;
    }

    /**
     * Set ENI quota
     * @param EniQuantity ENI quota
     */
    public void setEniQuantity(Long EniQuantity) {
        this.EniQuantity = EniQuantity;
    }

    /**
     * Get The quota of IP addresses that can be allocated to each ENI. 
     * @return EniPrivateIpAddressQuantity The quota of IP addresses that can be allocated to each ENI.
     */
    public Long getEniPrivateIpAddressQuantity() {
        return this.EniPrivateIpAddressQuantity;
    }

    /**
     * Set The quota of IP addresses that can be allocated to each ENI.
     * @param EniPrivateIpAddressQuantity The quota of IP addresses that can be allocated to each ENI.
     */
    public void setEniPrivateIpAddressQuantity(Long EniPrivateIpAddressQuantity) {
        this.EniPrivateIpAddressQuantity = EniPrivateIpAddressQuantity;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EniQuantity", this.EniQuantity);
        this.setParamSimple(map, prefix + "EniPrivateIpAddressQuantity", this.EniPrivateIpAddressQuantity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

