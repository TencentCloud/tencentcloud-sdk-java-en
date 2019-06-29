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

public class DescribeDisasterRecoverGroupsResponse  extends AbstractModel{

    /**
    * List of information on a spread placement group
    */
    @SerializedName("DisasterRecoverGroupSet")
    @Expose
    private DisasterRecoverGroup [] DisasterRecoverGroupSet;

    /**
    * Total number of user placement groups.
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of information on a spread placement group
     * @return DisasterRecoverGroupSet List of information on a spread placement group
     */
    public DisasterRecoverGroup [] getDisasterRecoverGroupSet() {
        return this.DisasterRecoverGroupSet;
    }

    /**
     * Set List of information on a spread placement group
     * @param DisasterRecoverGroupSet List of information on a spread placement group
     */
    public void setDisasterRecoverGroupSet(DisasterRecoverGroup [] DisasterRecoverGroupSet) {
        this.DisasterRecoverGroupSet = DisasterRecoverGroupSet;
    }

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
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DisasterRecoverGroupSet.", this.DisasterRecoverGroupSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

