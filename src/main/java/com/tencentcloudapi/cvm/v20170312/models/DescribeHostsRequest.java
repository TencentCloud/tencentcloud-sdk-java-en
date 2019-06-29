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

public class DescribeHostsRequest  extends AbstractModel{

    /**
    * Filter conditions
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - Required: No - (Filter condition) Filter by project ID. You can view the list of created projects by calling DescribeProject or by logging in to the console. You can also create a new project by calling AddProject.</li>
<li> host-id - String - Required: No - (Filter condition) Filter by CDH ID.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH instance name.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH status. （PENDING：Creating |LAUNCH_FAILURE：Failed|RUNNING：Running|EXPIRED：Expired）</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * <**ECI**>
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * Get filter condition.
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - Required: No - (Filter condition) Filter by project ID. You can view the list of created projects by calling DescribeProject or by logging in to the console. You can also create a new project by calling AddProject.</li>
<li> host-id - String - Required: No - (Filter condition) Filter by CDH ID.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH instance name.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH status. （PENDING：Creating |LAUNCH_FAILURE：Failed|RUNNING：Running|EXPIRED：Expired）</li>
     * @return Filters Filter condition.
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - Required: No - (Filter condition) Filter by project ID. You can view the list of created projects by calling DescribeProject or by logging in to the console. You can also create a new project by calling AddProject.</li>
<li> host-id - String - Required: No - (Filter condition) Filter by CDH ID.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH instance name.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH status. （PENDING：Creating |LAUNCH_FAILURE：Failed|RUNNING：Running|EXPIRED：Expired）</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter condition.
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - Required: No - (Filter condition) Filter by project ID. You can view the list of created projects by calling DescribeProject or by logging in to the console. You can also create a new project by calling AddProject.</li>
<li> host-id - String - Required: No - (Filter condition) Filter by CDH ID.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH instance name.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH status. （PENDING：Creating |LAUNCH_FAILURE：Failed|RUNNING：Running|EXPIRED：Expired）</li>
     * @param Filters Filter condition.
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - Required: No - (Filter condition) Filter by project ID. You can view the list of created projects by calling DescribeProject or by logging in to the console. You can also create a new project by calling AddProject.</li>
<li> host-id - String - Required: No - (Filter condition) Filter by CDH ID.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH instance name.</li>
<li> host-name - String - Required: No - (Filter condition) Filter by CDH status. （PENDING：Creating |LAUNCH_FAILURE：Failed|RUNNING：Running|EXPIRED：Expired）</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset. Default is 0.
     * @return Offset Offset. Default is 0.
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default is 0.
     * @param Offset Offset. Default is 0.
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of values to be returned. Default is 20. Maximum is 100
     * @return Limit Number of values to be returned. Default is 20. Maximum is 100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of values to be returned. Default is 20. Maximum is 100
     * @param Limit Number of values to be returned. Default is 20. Maximum is 100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

