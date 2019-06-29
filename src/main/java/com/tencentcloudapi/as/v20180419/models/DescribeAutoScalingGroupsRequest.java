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

public class DescribeAutoScalingGroupsRequest  extends AbstractModel{

    /**
    * ID(s) of the scaling group(s) to be queried, such as `asg-nkdwoui0`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both `AutoScalingGroupIds` and `Filters`. 
    */
    @SerializedName("AutoScalingGroupIds")
    @Expose
    private String [] AutoScalingGroupIds;

    /**
    * Filter conditions
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
<li> auto-scaling-group-name - String - Required: No - (Filter condition) Filter by scaling group name.</li>
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID. </li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair.The tag-key is replaced with the specific tag key.Use using case 2 as reference.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `AutoScalingGroupIds` and `Filters`.
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
     * Obtain ID(s) of the scaling group(s) to be queried, such as `asg-nkdwoui0`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both `AutoScalingGroupIds`and `Filters`.
     * @return AutoScalingGroupIds ID(s) of the scaling group(s) to be queried, such as `asg-nkdwoui0`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both `AutoScalingGroupIds` and `Filters`.
     */
    public String [] getAutoScalingGroupIds() {
        return this.AutoScalingGroupIds;
    }

    /**
     * Set ID(s) of the scaling group(s) to be queried, such as `asg-nkdwoui0`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both `AutoScalingGroupIds` and `Filters`.
     * @param AutoScalingGroupIds ID(s) of the scaling group(s) to be queried, such as `asg-nkdwoui0`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both `AutoScalingGroupIds` and `Filters`.
     */
    public void setAutoScalingGroupIds(String [] AutoScalingGroupIds) {
        this.AutoScalingGroupIds = AutoScalingGroupIds;
    }

    /**
     * Obtain filter conditions.
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
<li> auto-scaling-group-name - String - Required: No - (Filter condition) Filter by scaling group name.</li>
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair.The tag-key is replaced with the specific tag key.Use using case 2 as reference.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `AutoScalingGroupIds`and `Filters`.
     * @return Filters Filter conditions.
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
<li> auto-scaling-group-name - String - Required: No - (Filter condition) Filter by scaling group name.</li>
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair.The tag-key is replaced with the specific tag key.Use using case 2 as reference.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `AutoScalingGroupIds` and `Filters`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions.
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
<li> auto-scaling-group-name - String - Required: No - (Filter condition) Filter by scaling group name.</li>
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair.The tag-key is replaced with the specific tag key.Use using case 2 as reference.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `AutoScalingGroupIds` and `Filters`.
     * @param Filters Filter conditions.
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
<li> auto-scaling-group-name - String - Required: No - (Filter condition) Filter by scaling group name.</li>
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - Required: No - (Filter condition) Filter by tag key-value pair.The tag-key is replaced with the specific tag key.Use using case 2 as reference.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `AutoScalingGroupIds` and `Filters`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Obtain offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377). 
     * @return Offset Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377). 
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
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoScalingGroupIds.", this.AutoScalingGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

