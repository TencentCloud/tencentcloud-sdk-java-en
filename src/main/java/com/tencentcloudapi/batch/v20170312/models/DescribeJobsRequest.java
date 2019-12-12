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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobsRequest  extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("JobIds")
    @Expose
    private String [] JobIds;

    /**
    * Filter
<li> job-id - String - Required: No - (Filter) Filter by job ID.</li>
<li> job-name - String - Required: No - (Filter) Filter by job name.</li>
<li> job-state - String - Required: No - (Filter) Filter by job state.</li>
<li> zone - String - Required: No - (Filter) Filter by availability zone.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Instance ID 
     * @return JobIds Instance ID
     */
    public String [] getJobIds() {
        return this.JobIds;
    }

    /**
     * Set Instance ID
     * @param JobIds Instance ID
     */
    public void setJobIds(String [] JobIds) {
        this.JobIds = JobIds;
    }

    /**
     * Get Filter
<li> job-id - String - Required: No - (Filter) Filter by job ID.</li>
<li> job-name - String - Required: No - (Filter) Filter by job name.</li>
<li> job-state - String - Required: No - (Filter) Filter by job state.</li>
<li> zone - String - Required: No - (Filter) Filter by availability zone.</li> 
     * @return Filters Filter
<li> job-id - String - Required: No - (Filter) Filter by job ID.</li>
<li> job-name - String - Required: No - (Filter) Filter by job name.</li>
<li> job-state - String - Required: No - (Filter) Filter by job state.</li>
<li> zone - String - Required: No - (Filter) Filter by availability zone.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li> job-id - String - Required: No - (Filter) Filter by job ID.</li>
<li> job-name - String - Required: No - (Filter) Filter by job name.</li>
<li> job-state - String - Required: No - (Filter) Filter by job state.</li>
<li> zone - String - Required: No - (Filter) Filter by availability zone.</li>
     * @param Filters Filter
<li> job-id - String - Required: No - (Filter) Filter by job ID.</li>
<li> job-name - String - Required: No - (Filter) Filter by job name.</li>
<li> job-state - String - Required: No - (Filter) Filter by job state.</li>
<li> zone - String - Required: No - (Filter) Filter by availability zone.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results 
     * @return Limit Number of returned results
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results
     * @param Limit Number of returned results
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "JobIds.", this.JobIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

