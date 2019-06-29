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

public class DescribeScheduledActionsResponse  extends AbstractModel{

    /**
    * Number of scheduled tasks that meet the condition.
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * List of scheduled task details.
    */
    @SerializedName("ScheduledActionSet")
    @Expose
    private ScheduledAction [] ScheduledActionSet;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain the number of scheduled tasks that meet the condition.
     * @return TotalCount Number of scheduled tasks that meet the condition.
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Configure the number of scheduled tasks that meet the condition.
     * @param TotalCount Number of scheduled tasks that meet the condition.
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Obtain the list of scheduled task details.
     * @return ScheduledActionSet List of scheduled task details.
     */
    public ScheduledAction [] getScheduledActionSet() {
        return this.ScheduledActionSet;
    }

    /**
     * Configure the list of scheduled task details.
     * @param ScheduledActionSet List of scheduled task details.
     */
    public void setScheduledActionSet(ScheduledAction [] ScheduledActionSet) {
        this.ScheduledActionSet = ScheduledActionSet;
    }

    /**
     * Obtain the unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ScheduledActionSet.", this.ScheduledActionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

