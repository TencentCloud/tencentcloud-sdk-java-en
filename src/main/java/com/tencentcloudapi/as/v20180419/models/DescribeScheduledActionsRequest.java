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

public class DescribeScheduledActionsRequest  extends AbstractModel{

    /**
    * ID(s) of the scheduled task(s) to be queried, such as `asst-am691zxo`. A maximum of 100 instances are allowed for each request. You cannot specify both ScheduledActionIds and Filters.
    */
    @SerializedName("ScheduledActionIds")
    @Expose
    private String [] ScheduledActionIds;

    /**
    * Filter conditions
<li> scheduled-action-id - String - Required: No - (Filter condition) Filter by scheduled task ID.</li>
<li> scheduled-action-name - String - Required: No - (Filter condition) Filter by scheduled task name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377). 
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * Obtain ID(s) of the scheduled task(s) to be queried, such as `asst-am691zxo`. A maximum of 100 instances are allowed for each request. You cannot specify both ScheduledActionIds and Filters.
     * @return ScheduledActionIds ID(s) of the scheduled task(s) to be queried, such as `asst-am691zxo`. A maximum of 100 instances are allowed for each request. You cannot specify both ScheduledActionIds and Filters.
     */
    public String [] getScheduledActionIds() {
        return this.ScheduledActionIds;
    }

    /**
     * Set ID(s) of the scheduled task(s) to be queried, such as `asst-am691zxo`. A maximum of 100 instances are allowed for each request. You cannot specify both ScheduledActionIds and Filters.
     * @param ScheduledActionIds ID(s) of the scheduled task(s) to be queried, such as `asst-am691zxo`. A maximum of 100 instances are allowed for each request. You cannot specify both ScheduledActionIds and Filters.
     */
    public void setScheduledActionIds(String [] ScheduledActionIds) {
        this.ScheduledActionIds = ScheduledActionIds;
    }

    /**
     * obtain filter conditions
<li> scheduled-action-id - String - Required: No - (Filter condition) Filter by scheduled task ID.</li>
<li> scheduled-action-name - String - Required: No - (Filter condition) Filter by scheduled task name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
     * @return Filters filter conditions.
<li> scheduled-action-id - String - Required: No - (Filter condition) Filter by scheduled task ID.</li>
<li> scheduled-action-name - String - Required: No - (Filter condition) Filter by scheduled task name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions.
<li> scheduled-action-id - String - Required: No - (Filter condition) Filter by scheduled task ID.</li>
<li> scheduled-action-name - String - Required: No - (Filter condition) Filter by scheduled task name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
     * @param Filters filter conditions
<li> scheduled-action-id - String - Required: No - (Filter condition) Filter by scheduled task ID.</li>
<li> scheduled-action-name - String - Required: No - (Filter condition) Filter by scheduled task name.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter condition) Filter by scaling group ID.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Obtain offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Offset Offest. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Offset Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Obtain number of returned results. It defaults to 20. The maximum is 100. For more information on , see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set number of returned results. It defaults to 20. The maximum is 100. For more information on , see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScheduledActionIds.", this.ScheduledActionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

