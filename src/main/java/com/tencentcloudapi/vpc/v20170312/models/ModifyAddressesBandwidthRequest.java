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

public class ModifyAddressesBandwidthRequest extends AbstractModel{

    /**
    * The unique ID of the EIP, such as 'eip-xxxx'.
    */
    @SerializedName("AddressIds")
    @Expose
    private String [] AddressIds;

    /**
    * 调整带宽目标值
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 包月带宽起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 包月带宽结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get The unique ID of the EIP, such as 'eip-xxxx'. 
     * @return AddressIds The unique ID of the EIP, such as 'eip-xxxx'.
     */
    public String [] getAddressIds() {
        return this.AddressIds;
    }

    /**
     * Set The unique ID of the EIP, such as 'eip-xxxx'.
     * @param AddressIds The unique ID of the EIP, such as 'eip-xxxx'.
     */
    public void setAddressIds(String [] AddressIds) {
        this.AddressIds = AddressIds;
    }

    /**
     * Get 调整带宽目标值 
     * @return InternetMaxBandwidthOut 调整带宽目标值
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 调整带宽目标值
     * @param InternetMaxBandwidthOut 调整带宽目标值
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 包月带宽起始时间 
     * @return StartTime 包月带宽起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 包月带宽起始时间
     * @param StartTime 包月带宽起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 包月带宽结束时间 
     * @return EndTime 包月带宽结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 包月带宽结束时间
     * @param EndTime 包月带宽结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressIds.", this.AddressIds);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

