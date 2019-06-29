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

public class DescribeAutoScalingInstancesRequest  extends AbstractModel{

    /**
    * IDs of CVM instances to be queried. You cannot specify both InstanceIds and Filters.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter conditions.
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `InstanceIds` and `Filters`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * Obtain IDs of CVM instances to be queried. You cannot specify both InstanceIds and Filters.
     * @return InstanceIds IDs of CVM instances to be queried. You cannot specify both InstanceIds and Filters.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set IDs of CVM instances to be queried. You cannot specify both InstanceIds and Filters.
     * @param InstanceIds IDs of CVM instances to be queried. You cannot specify both InstanceIds and Filters.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtain filter conditions.
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `InstanceIds` and `Filters`.
     * @return Filters Filter conditions.
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `InstanceIds` and `Filters`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions.
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `InstanceIds` and `Filters`.
     * @param Filters conditions.
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `InstanceIds` and `Filters`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Obtain offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Offset Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Obtain number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
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
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

