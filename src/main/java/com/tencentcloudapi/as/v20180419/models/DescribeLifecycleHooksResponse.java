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

public class DescribeLifecycleHooksResponse extends AbstractModel{

    /**
    * Array of lifecycle hooks
    */
    @SerializedName("LifecycleHookSet")
    @Expose
    private LifecycleHook [] LifecycleHookSet;

    /**
    * Total quantity
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of lifecycle hooks 
     * @return LifecycleHookSet Array of lifecycle hooks
     */
    public LifecycleHook [] getLifecycleHookSet() {
        return this.LifecycleHookSet;
    }

    /**
     * Set Array of lifecycle hooks
     * @param LifecycleHookSet Array of lifecycle hooks
     */
    public void setLifecycleHookSet(LifecycleHook [] LifecycleHookSet) {
        this.LifecycleHookSet = LifecycleHookSet;
    }

    /**
     * Get Total quantity 
     * @return TotalCount Total quantity
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total quantity
     * @param TotalCount Total quantity
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "LifecycleHookSet.", this.LifecycleHookSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

