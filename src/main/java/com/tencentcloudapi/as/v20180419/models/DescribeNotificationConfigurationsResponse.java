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

public class DescribeNotificationConfigurationsResponse  extends AbstractModel{

    /**
    * Number of eligible notifications.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of AS event notification details.
    */
    @SerializedName("AutoScalingNotificationSet")
    @Expose
    private AutoScalingNotification [] AutoScalingNotificationSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible notifications. 
     * @return TotalCount Number of eligible notifications.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible notifications.
     * @param TotalCount Number of eligible notifications.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of AS event notification details. 
     * @return AutoScalingNotificationSet List of AS event notification details.
     */
    public AutoScalingNotification [] getAutoScalingNotificationSet() {
        return this.AutoScalingNotificationSet;
    }

    /**
     * Set List of AS event notification details.
     * @param AutoScalingNotificationSet List of AS event notification details.
     */
    public void setAutoScalingNotificationSet(AutoScalingNotification [] AutoScalingNotificationSet) {
        this.AutoScalingNotificationSet = AutoScalingNotificationSet;
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
        this.setParamArrayObj(map, prefix + "AutoScalingNotificationSet.", this.AutoScalingNotificationSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

