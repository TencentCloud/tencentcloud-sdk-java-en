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

public class DescribeAutoScalingActivitiesResponse  extends AbstractModel{

    /**
    * Number of eligible scaling activities.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information set of eligible scaling activities.
    */
    @SerializedName("ActivitySet")
    @Expose
    private Activity [] ActivitySet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible scaling activities. 
     * @return TotalCount Number of eligible scaling activities.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible scaling activities.
     * @param TotalCount Number of eligible scaling activities.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information set of eligible scaling activities. 
     * @return ActivitySet Information set of eligible scaling activities.
     */
    public Activity [] getActivitySet() {
        return this.ActivitySet;
    }

    /**
     * Set Information set of eligible scaling activities.
     * @param ActivitySet Information set of eligible scaling activities.
     */
    public void setActivitySet(Activity [] ActivitySet) {
        this.ActivitySet = ActivitySet;
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
        this.setParamArrayObj(map, prefix + "ActivitySet.", this.ActivitySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

