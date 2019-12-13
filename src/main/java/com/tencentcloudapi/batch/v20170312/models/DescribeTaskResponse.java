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

public class DescribeTaskResponse extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Job name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Job state
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Total number of task instances
    */
    @SerializedName("TaskInstanceTotalCount")
    @Expose
    private Long TaskInstanceTotalCount;

    /**
    * Task instance information
    */
    @SerializedName("TaskInstanceSet")
    @Expose
    private TaskInstanceView [] TaskInstanceSet;

    /**
    * Task instance statistical metrics
    */
    @SerializedName("TaskInstanceMetrics")
    @Expose
    private TaskInstanceMetrics TaskInstanceMetrics;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID 
     * @return JobId Instance ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Instance ID
     * @param JobId Instance ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Job name 
     * @return TaskName Job name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Job name
     * @param TaskName Job name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Job state 
     * @return TaskState Job state
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * Set Job state
     * @param TaskState Job state
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Total number of task instances 
     * @return TaskInstanceTotalCount Total number of task instances
     */
    public Long getTaskInstanceTotalCount() {
        return this.TaskInstanceTotalCount;
    }

    /**
     * Set Total number of task instances
     * @param TaskInstanceTotalCount Total number of task instances
     */
    public void setTaskInstanceTotalCount(Long TaskInstanceTotalCount) {
        this.TaskInstanceTotalCount = TaskInstanceTotalCount;
    }

    /**
     * Get Task instance information 
     * @return TaskInstanceSet Task instance information
     */
    public TaskInstanceView [] getTaskInstanceSet() {
        return this.TaskInstanceSet;
    }

    /**
     * Set Task instance information
     * @param TaskInstanceSet Task instance information
     */
    public void setTaskInstanceSet(TaskInstanceView [] TaskInstanceSet) {
        this.TaskInstanceSet = TaskInstanceSet;
    }

    /**
     * Get Task instance statistical metrics 
     * @return TaskInstanceMetrics Task instance statistical metrics
     */
    public TaskInstanceMetrics getTaskInstanceMetrics() {
        return this.TaskInstanceMetrics;
    }

    /**
     * Set Task instance statistical metrics
     * @param TaskInstanceMetrics Task instance statistical metrics
     */
    public void setTaskInstanceMetrics(TaskInstanceMetrics TaskInstanceMetrics) {
        this.TaskInstanceMetrics = TaskInstanceMetrics;
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
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskInstanceTotalCount", this.TaskInstanceTotalCount);
        this.setParamArrayObj(map, prefix + "TaskInstanceSet.", this.TaskInstanceSet);
        this.setParamObj(map, prefix + "TaskInstanceMetrics.", this.TaskInstanceMetrics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

