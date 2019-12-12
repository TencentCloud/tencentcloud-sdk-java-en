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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvCreateInfosResponse  extends AbstractModel{

    /**
    * Number of compute environments
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of compute environment creation information
    */
    @SerializedName("ComputeEnvCreateInfoSet")
    @Expose
    private ComputeEnvCreateInfo [] ComputeEnvCreateInfoSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of compute environments 
     * @return TotalCount Number of compute environments
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of compute environments
     * @param TotalCount Number of compute environments
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of compute environment creation information 
     * @return ComputeEnvCreateInfoSet List of compute environment creation information
     */
    public ComputeEnvCreateInfo [] getComputeEnvCreateInfoSet() {
        return this.ComputeEnvCreateInfoSet;
    }

    /**
     * Set List of compute environment creation information
     * @param ComputeEnvCreateInfoSet List of compute environment creation information
     */
    public void setComputeEnvCreateInfoSet(ComputeEnvCreateInfo [] ComputeEnvCreateInfoSet) {
        this.ComputeEnvCreateInfoSet = ComputeEnvCreateInfoSet;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ComputeEnvCreateInfoSet.", this.ComputeEnvCreateInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
