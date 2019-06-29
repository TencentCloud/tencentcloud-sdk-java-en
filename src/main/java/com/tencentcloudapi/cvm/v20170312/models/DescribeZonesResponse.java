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

public class DescribeZonesResponse  extends AbstractModel{

    /**
    * Number of Availability Zones
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * List of Availability zone
    */
    @SerializedName("ZoneSet")
    @Expose
    private ZoneInfo [] ZoneSet;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get number of Availability Zones.
     * @return TotalCount Number of Availability Zones.
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set number of Availability Zones.
     * @param TotalCount Number of Availability Zones.
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get list of Availability Zones.
     * @return ZoneSet List of Availability Zones.
     */
    public ZoneInfo [] getZoneSet() {
        return this.ZoneSet;
    }

    /**
     * Set list of Availability Zones.
     * @param ZoneSet List of Availability Zones.
     */
    public void setZoneSet(ZoneInfo [] ZoneSet) {
        this.ZoneSet = ZoneSet;
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
     * @param RequestId Get Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ZoneSet.", this.ZoneSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

