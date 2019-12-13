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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProxyConfigurationRequest extends AbstractModel{

    /**
    * Connection instance ID; It’s an old parameter, please switch to ProxyId.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Target bandwidth. Unit: Mbps.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Target concurrence value. Unit: 10,000 connections.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Connection instance ID; It’s a new parameter.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get Connection instance ID; It’s an old parameter, please switch to ProxyId. 
     * @return InstanceId Connection instance ID; It’s an old parameter, please switch to ProxyId.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Connection instance ID; It’s an old parameter, please switch to ProxyId.
     * @param InstanceId Connection instance ID; It’s an old parameter, please switch to ProxyId.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Target bandwidth. Unit: Mbps.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range. 
     * @return Bandwidth Target bandwidth. Unit: Mbps.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Target bandwidth. Unit: Mbps.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
     * @param Bandwidth Target bandwidth. Unit: Mbps.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Target concurrence value. Unit: 10,000 connections.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range. 
     * @return Concurrent Target concurrence value. Unit: 10,000 connections.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set Target concurrence value. Unit: 10,000 connections.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
     * @param Concurrent Target concurrence value. Unit: 10,000 connections.
Bandwidth or Concurrent must be set. Use the DescribeAccessRegionsByDestRegion API to obtain the value range.
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence. 
     * @return ClientToken A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     * @param ClientToken A string used to ensure the idempotency of the request, which is generated by the user and must be unique to each request. The maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Connection instance ID; It’s a new parameter. 
     * @return ProxyId Connection instance ID; It’s a new parameter.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection instance ID; It’s a new parameter.
     * @param ProxyId Connection instance ID; It’s a new parameter.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

