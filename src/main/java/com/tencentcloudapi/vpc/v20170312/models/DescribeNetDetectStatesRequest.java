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

public class DescribeNetDetectStatesRequest extends AbstractModel{

    /**
    * The array of network detection instance `IDs`, such as [`netd-12345678`].
    */
    @SerializedName("NetDetectIds")
    @Expose
    private String [] NetDetectIds;

    /**
    * Filter conditions. `NetDetectIds` and `Filters` cannot be specified at the same time.
<li>net-detect-id - String - (Filter condition) The network detection instance ID, such as netd-12345678.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * The offset. Default: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The number of returned values. Default: 20. Maximum: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get The array of network detection instance `IDs`, such as [`netd-12345678`]. 
     * @return NetDetectIds The array of network detection instance `IDs`, such as [`netd-12345678`].
     */
    public String [] getNetDetectIds() {
        return this.NetDetectIds;
    }

    /**
     * Set The array of network detection instance `IDs`, such as [`netd-12345678`].
     * @param NetDetectIds The array of network detection instance `IDs`, such as [`netd-12345678`].
     */
    public void setNetDetectIds(String [] NetDetectIds) {
        this.NetDetectIds = NetDetectIds;
    }

    /**
     * Get Filter conditions. `NetDetectIds` and `Filters` cannot be specified at the same time.
<li>net-detect-id - String - (Filter condition) The network detection instance ID, such as netd-12345678.</li> 
     * @return Filters Filter conditions. `NetDetectIds` and `Filters` cannot be specified at the same time.
<li>net-detect-id - String - (Filter condition) The network detection instance ID, such as netd-12345678.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter conditions. `NetDetectIds` and `Filters` cannot be specified at the same time.
<li>net-detect-id - String - (Filter condition) The network detection instance ID, such as netd-12345678.</li>
     * @param Filters Filter conditions. `NetDetectIds` and `Filters` cannot be specified at the same time.
<li>net-detect-id - String - (Filter condition) The network detection instance ID, such as netd-12345678.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The offset. Default: 0. 
     * @return Offset The offset. Default: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset. Default: 0.
     * @param Offset The offset. Default: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The number of returned values. Default: 20. Maximum: 100. 
     * @return Limit The number of returned values. Default: 20. Maximum: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of returned values. Default: 20. Maximum: 100.
     * @param Limit The number of returned values. Default: 20. Maximum: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetDetectIds.", this.NetDetectIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

