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

public class DescribeHostsResponse  extends AbstractModel{

    /**
    * Total number of placement groups of an user
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * Details of a CDH instance
    */
    @SerializedName("HostSet")
    @Expose
    private HostItem [] HostSet;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of placement groups of an user
     * @return TotalCount Total number of placement groups of an user
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of placement groups of an user
     * @param TotalCount Total number of placement groups of an user
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Details of a CDH instance
     * @return HostSet Details of a CDH instance
     */
    public HostItem [] getHostSet() {
        return this.HostSet;
    }

    /**
     * Set Details of a CDH instance
     * @param HostSet Details of a CDH instance
     */
    public void setHostSet(HostItem [] HostSet) {
        this.HostSet = HostSet;
    }

    /**
     * Get Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @return RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @param RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "HostSet.", this.HostSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

