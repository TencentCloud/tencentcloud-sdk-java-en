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

public class DescribeNotificationConfigurationsRequest  extends AbstractModel{

    /**
    * Queries by one or more notification IDs in the format of asn-2sestqbr. The maximum number of instances per request is 100. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
    */
    @SerializedName("AutoScalingNotificationIds")
    @Expose
    private String [] AutoScalingNotificationIds;

    /**
    * Filter.
<li> auto-scaling-notification-id - String - Required: No - (Filter) Filter by notification ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter) Filter by auto scaling group ID.</li>
The maximum number of `Filters` per request is 10. The upper limit for `Filter.Values` is 5. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Queries by one or more notification IDs in the format of asn-2sestqbr. The maximum number of instances per request is 100. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time. 
     * @return AutoScalingNotificationIds Queries by one or more notification IDs in the format of asn-2sestqbr. The maximum number of instances per request is 100. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
     */
    public String [] getAutoScalingNotificationIds() {
        return this.AutoScalingNotificationIds;
    }

    /**
     * Set Queries by one or more notification IDs in the format of asn-2sestqbr. The maximum number of instances per request is 100. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
     * @param AutoScalingNotificationIds Queries by one or more notification IDs in the format of asn-2sestqbr. The maximum number of instances per request is 100. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
     */
    public void setAutoScalingNotificationIds(String [] AutoScalingNotificationIds) {
        this.AutoScalingNotificationIds = AutoScalingNotificationIds;
    }

    /**
     * Get Filter.
<li> auto-scaling-notification-id - String - Required: No - (Filter) Filter by notification ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter) Filter by auto scaling group ID.</li>
The maximum number of `Filters` per request is 10. The upper limit for `Filter.Values` is 5. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time. 
     * @return Filters Filter.
<li> auto-scaling-notification-id - String - Required: No - (Filter) Filter by notification ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter) Filter by auto scaling group ID.</li>
The maximum number of `Filters` per request is 10. The upper limit for `Filter.Values` is 5. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter.
<li> auto-scaling-notification-id - String - Required: No - (Filter) Filter by notification ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter) Filter by auto scaling group ID.</li>
The maximum number of `Filters` per request is 10. The upper limit for `Filter.Values` is 5. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
     * @param Filters Filter.
<li> auto-scaling-notification-id - String - Required: No - (Filter) Filter by notification ID.</li>
<li> auto-scaling-group-id - String - Required: No - (Filter) Filter by auto scaling group ID.</li>
The maximum number of `Filters` per request is 10. The upper limit for `Filter.Values` is 5. This parameter does not support specifying both `AutoScalingNotificationIds` and `Filters` at the same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688). 
     * @return Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
     * @param Limit Number of returned results. Default value: 20. Maximum value: 100. For more information on `Limit`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688). 
     * @return Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
     * @param Offset Offset. Default value: 0. For more information on `Offset`, see the relevant section in the API [overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoScalingNotificationIds.", this.AutoScalingNotificationIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

