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

public class DescribeLifecycleHooksRequest  extends AbstractModel{

    /**
    * ID(s) of the Lifecycle hook to be queried, such as `ash-8azjzxcl`. A maximum of 100 instances are allowed for each request. You cannot specify both `LifecycleHookIds` and `Filters`.
    */
    @SerializedName("LifecycleHookIds")
    @Expose
    private String [] LifecycleHookIds;

    /**
    * Filter conditions
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
Filter conditions
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LifecycleHookIds ` and `Filters`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * Get queries according to one or more lifecycle hook ID(s), such as `ash-8azjzxcl`. A maximum of 100 lifecycle hook IDs are allowed for each request.You cannot specify both `LifecycleHookIds` and `Filters`.
     * @return LifecycleHookIds Queries according to one or more lifecycle hook ID(s), such as `ash-8azjzxcl`. A maximum of 100 lifecycle hook IDs are allowed for each request.You cannot specify both `LifecycleHookIds` and `Filters`.
     */
    public String [] getLifecycleHookIds() {
        return this.LifecycleHookIds;
    }

    /**
     * Set queries according to one or more lifecycle hook ID(s), such as `ash-8azjzxcl`. A maximum of 100 lifecycle hook IDs are allowed for each request.You cannot specify both `LifecycleHookIds` and `Filters`.
     * @param LifecycleHookIds Queries according to one or more lifecycle hook ID(s), such as `ash-8azjzxcl`. A maximum of 100 lifecycle hook IDs are allowed for each request.You cannot specify both `LifecycleHookIds` and `Filters`.
     */
    public void setLifecycleHookIds(String [] LifecycleHookIds) {
        this.LifecycleHookIds = LifecycleHookIds;
    }

    /**
     * Get filter conditions.
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
Filter conditions.
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LifecycleHookIds ` and `Filters`.
     * @return Filters Filter Conditions.
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
Filter conditions.
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LifecycleHookIds ` and `Filters`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions.
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
Filter conditions
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LifecycleHookIds ` and `Filters`.
     * @param Filters Filter conditions.
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
Filter conditions
<li> lifecycle-hook-id - String - Required: No - (Filter condition) Filter by lifecycle hook ID.</li>
<li> lifecycle-hook-name - String - Required: No - (Filter condition) Filter by lifecycle hook name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LifecycleHookIds ` and `Filters`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Get offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Offset Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LifecycleHookIds.", this.LifecycleHookIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

