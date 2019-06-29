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

public class DescribeAutoScalingActivitiesRequest  extends AbstractModel{

    /**
    * ID(s) of the scaling Activity to be queried, such as `asa-5l2ejpfo`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both`ActivityIds` and `Filters`.
    */
    @SerializedName("ActivityIds")
    @Expose
    private String [] ActivityIds;

    /**
    * Filter conditions
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by the scaling group ID</li>
<li> activity-status-code - String - Required: No - (Filter condition) Filter by the scaling activity status. (INIT:Initializing|RUNNING:Running|SUCCESSFUL:activity successful|PARTIALLY_SUCCESSFUL:activity partially successful|FAILED:activity failed|CANCELLED:activity cancelled</li>
<li> activity-type - String - Required: No - (Filter condition) Filter by the scaling activity type. （SCALE_OUT：capacity expansion acactivity|SCALE_IN:Reduce capacity acactivity|ATTACH_INSTANCES:attach instances|REMOVE_INSTANCES:remove instances|DETACH_INSTANCES:detach instances|TERMINATE_INSTANCES_UNEXPECTEDLY:terminate instances on CVM Console|REPLACE_UNHEALTHY_INSTANCE:replace unhealthy instance|UPDATE_LOAD_BALANCERS:update load balancers）</li>
<li> activity-id - String - Required: No - (Filter condition) Filter by the scaling activity ID</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `ActivityIds`and `Filters`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. It defaults to 20. The maximum is 100. For more information on`Limit` , see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
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
    * Earliest start time,if specify ActivityIds, this parameter will be ignored. Which is based on time`UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Latest end time,if specify ActivityIds, this parameter will be ignored. Which is based on time`UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Obtain ID(s) of the scaling Activity to be queried, such as `asa-5l2ejpfo`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both`ActivityIds` and `Filters`.
     * @return ActivityIds ID(s) of the scaling Activity to be queried, such as `asa-5l2ejpfo`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both`ActivityIds` and `Filters`.
     */
    public String [] getActivityIds() {
        return this.ActivityIds;
    }

    /**
     * Set ID(s) of the scaling Activity to be queried, such as `asa-5l2ejpfo`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both`ActivityIds` and `Filters`.
     * @param ActivityIds ID(s) of the scaling Activity to be queried, such as `asa-5l2ejpfo`. A maximum of 100 scaling groups can be queried at one time. You cannot specify both`ActivityIds` and `Filters`.
     */
    public void setActivityIds(String [] ActivityIds) {
        this.ActivityIds = ActivityIds;
    }

    /**
     * Obtain filter conditions
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by the scaling group ID</li>
<li> activity-status-code - String - Required: No - (Filter condition) Filter by the scaling activity status. (INIT:Initializing|RUNNING:Running|SUCCESSFUL:activity successful|PARTIALLY_SUCCESSFUL:activity partially successful|FAILED:activity failed|CANCELLED:activity cancelled</li>
<li> activity-type - String - Required: No - (Filter condition) Filter by the scaling activity type. （SCALE_OUT：capacity expansion acactivity|SCALE_IN:Reduce capacity acactivity|ATTACH_INSTANCES:attach instances|REMOVE_INSTANCES:remove instances|DETACH_INSTANCES:detach instances|TERMINATE_INSTANCES_UNEXPECTEDLY:terminate instances on CVM Console|REPLACE_UNHEALTHY_INSTANCE:replace unhealthy instance|UPDATE_LOAD_BALANCERS:update load balancers）</li>
<li> activity-id - String - Required: No - (Filter condition) Filter by the scaling activity ID</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `ActivityIds`and `Filters`.
     * @return Filters Filter conditions
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by the scaling group ID</li>
<li> activity-status-code - String - Required: No - (Filter condition) Filter by the scaling activity status. (INIT:Initializing|RUNNING:Running|SUCCESSFUL:activity successful|PARTIALLY_SUCCESSFUL:activity partially successful|FAILED:activity failed|CANCELLED:activity cancelled</li>
<li> activity-type - String - Required: No - (Filter condition) Filter by the scaling activity type. （SCALE_OUT：capacity expansion acactivity|SCALE_IN:Reduce capacity acactivity|ATTACH_INSTANCES:attach instances|REMOVE_INSTANCES:remove instances|DETACH_INSTANCES:detach instances|TERMINATE_INSTANCES_UNEXPECTEDLY:terminate instances on CVM Console|REPLACE_UNHEALTHY_INSTANCE:replace unhealthy instance|UPDATE_LOAD_BALANCERS:update load balancers）</li>
<li> activity-id - String - Required: No - (Filter condition) Filter by the scaling activity ID</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `ActivityIds`and `Filters`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by the scaling group ID.</li>
<li> activity-status-code - String - Required: No - (Filter condition) Filter by the scaling activity status. (INIT:Initializing|RUNNING:Running|SUCCESSFUL:activity successful|PARTIALLY_SUCCESSFUL:activity partially successful|FAILED:activity failed|CANCELLED:activity cancelled</li>
<li> activity-type - String - Required: No - (Filter condition) Filter by the scaling activity type. （SCALE_OUT：capacity expansion acactivity|SCALE_IN:Reduce capacity acactivity|ATTACH_INSTANCES:attach instances|REMOVE_INSTANCES:remove instances|DETACH_INSTANCES:detach instances|TERMINATE_INSTANCES_UNEXPECTEDLY:terminate instances on CVM Console|REPLACE_UNHEALTHY_INSTANCE:replace unhealthy instance|UPDATE_LOAD_BALANCERS:update load balancers）</li>
<li> activity-id - String - Required: No - (Filter condition) Filter by the scaling activity ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `ActivityIds`and `Filters`.
     * @param Filters Filter conditions.
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by the scaling group ID.</li>
<li> activity-status-code - String - Required: No - (Filter condition) Filter by the scaling activity status. (INIT:Initializing|RUNNING:Running|SUCCESSFUL:activity successful|PARTIALLY_SUCCESSFUL:activity partially successful|FAILED:activity failed|CANCELLED:activity cancelled</li>
<li> activity-type - String - Required: No - (Filter condition) Filter by the scaling activity type. （SCALE_OUT：capacity expansion acactivity|SCALE_IN:Reduce capacity acactivity|ATTACH_INSTANCES:attach instances|REMOVE_INSTANCES:remove instances|DETACH_INSTANCES:detach instances|TERMINATE_INSTANCES_UNEXPECTEDLY:terminate instances on CVM Console|REPLACE_UNHEALTHY_INSTANCE:replace unhealthy instance|UPDATE_LOAD_BALANCERS:update load balancers）</li>
<li> activity-id - String - Required: No - (Filter condition) Filter by the scaling activity ID.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `ActivityIds`and `Filters`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Obtain number of returned results. It defaults to 20. The maximum is 100. For more information on`Limit` , see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Obtain Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default is 0. For more information on `Offset` , see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Offset. Default is 0. For more information on`Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Obtain earliest start time,if specify ActivityIds, this parameter will be ignored. Which is based on time `UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     * @return StartTime Earliest start time,if specify ActivityIds, this parameter will be ignored. Which is based on time `UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set earliest start time,if specify ActivityIds, this parameter will be ignored. Which is based on time `UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     * @param StartTime Earliest start time,if specify ActivityIds, this parameter will be ignored. Which is based on time `UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Obtain latest end time,if specify ActivityIds, this parameter will be ignored. Which is based on time`UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     * @return EndTime latest end time,if specify ActivityIds, this parameter will be ignored. Which is based on time`UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set latest end time,if specify ActivityIds, this parameter will be ignored. Which is based on time`UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     * @param EndTime latest end time,if specify ActivityIds, this parameter will be ignored. Which is based on time`UTC`,and in the format of `ISO8601` according to the `YYYY-MM-DDThh:mm:ssZ` standard.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ActivityIds.", this.ActivityIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

