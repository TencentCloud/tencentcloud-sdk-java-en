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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoadBalancerAttributesRequest extends AbstractModel{

    /**
    * Unique CLB ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * CLB instance name
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Region information of the real server bound to a CLB.
    */
    @SerializedName("TargetRegionInfo")
    @Expose
    private TargetRegionInfo TargetRegionInfo;

    /**
    * Network billing parameter. Note: The maximum outbound bandwidth can be modified, but the network billing method cannot be modified.
    */
    @SerializedName("InternetChargeInfo")
    @Expose
    private InternetAccessible InternetChargeInfo;

    /**
     * Get Unique CLB ID 
     * @return LoadBalancerId Unique CLB ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Unique CLB ID
     * @param LoadBalancerId Unique CLB ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get CLB instance name 
     * @return LoadBalancerName CLB instance name
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set CLB instance name
     * @param LoadBalancerName CLB instance name
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Region information of the real server bound to a CLB. 
     * @return TargetRegionInfo Region information of the real server bound to a CLB.
     */
    public TargetRegionInfo getTargetRegionInfo() {
        return this.TargetRegionInfo;
    }

    /**
     * Set Region information of the real server bound to a CLB.
     * @param TargetRegionInfo Region information of the real server bound to a CLB.
     */
    public void setTargetRegionInfo(TargetRegionInfo TargetRegionInfo) {
        this.TargetRegionInfo = TargetRegionInfo;
    }

    /**
     * Get Network billing parameter. Note: The maximum outbound bandwidth can be modified, but the network billing method cannot be modified. 
     * @return InternetChargeInfo Network billing parameter. Note: The maximum outbound bandwidth can be modified, but the network billing method cannot be modified.
     */
    public InternetAccessible getInternetChargeInfo() {
        return this.InternetChargeInfo;
    }

    /**
     * Set Network billing parameter. Note: The maximum outbound bandwidth can be modified, but the network billing method cannot be modified.
     * @param InternetChargeInfo Network billing parameter. Note: The maximum outbound bandwidth can be modified, but the network billing method cannot be modified.
     */
    public void setInternetChargeInfo(InternetAccessible InternetChargeInfo) {
        this.InternetChargeInfo = InternetChargeInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamObj(map, prefix + "TargetRegionInfo.", this.TargetRegionInfo);
        this.setParamObj(map, prefix + "InternetChargeInfo.", this.InternetChargeInfo);

    }
}

