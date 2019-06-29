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

public class DescribeScalingPoliciesResponse  extends AbstractModel{

    /**
    * The list of auto scaling alarm trigger policies retails.
    */
    @SerializedName("ScalingPolicySet")
    @Expose
    private ScalingPolicy [] ScalingPolicySet;

    /**
    * Number of notification matching the filter condition.
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain the list of auto scaling alarm trigger policies retails.
     * @return ScalingPolicySet The list of auto scaling alarm trigger policies retails.
     */
    public ScalingPolicy [] getScalingPolicySet() {
        return this.ScalingPolicySet;
    }

    /**
     * Set the list of auto scaling alarm trigger policies retails.
     * @param ScalingPolicySet The list of auto scaling alarm trigger policies retails.
     */
    public void setScalingPolicySet(ScalingPolicy [] ScalingPolicySet) {
        this.ScalingPolicySet = ScalingPolicySet;
    }

    /**
     * Obtain number of notification matching the filter condition.
     * @return TotalCount Number of notification matching the filter condition.
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set number of notification matching the filter condition.
     * @param TotalCount Number of notification matching the filter condition.
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Obtain the unique ID of a request which will be gotten from each request and it is required for each troubleshooting case.
     * @return RequestId the unique ID of a request which will be gotten from each request and it is required for each troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique ID of a request, which is required for each troubleshooting case.
     * @param RequestId the unique ID of a request which will be gotten from each request, and it is required for each troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ScalingPolicySet.", this.ScalingPolicySet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

