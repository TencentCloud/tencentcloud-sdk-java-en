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

public class DescribeJobResponse  extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Instance name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Information of availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Instance state
    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

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
    * Task view information
    */
    @SerializedName("TaskSet")
    @Expose
    private TaskView [] TaskSet;

    /**
    * Information of the dependency among tasks
    */
    @SerializedName("DependenceSet")
    @Expose
    private Dependence [] DependenceSet;

    /**
    * Task statistical metrics
    */
    @SerializedName("TaskMetrics")
    @Expose
    private TaskMetrics TaskMetrics;

    /**
    * Task instance statistical metrics
    */
    @SerializedName("TaskInstanceMetrics")
    @Expose
    private TaskInstanceView TaskInstanceMetrics;

    /**
    * Instance failure reason
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

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
     * Get Instance name 
     * @return JobName Instance name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Instance name
     * @param JobName Instance name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Information of availability zone 
     * @return Zone Information of availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Information of availability zone
     * @param Zone Information of availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance priority 
     * @return Priority Instance priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Instance priority
     * @param Priority Instance priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Instance state 
     * @return JobState Instance state
     */
    public String getJobState() {
        return this.JobState;
    }

    /**
     * Set Instance state
     * @param JobState Instance state
     */
    public void setJobState(String JobState) {
        this.JobState = JobState;
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
     * Get Task view information 
     * @return TaskSet Task view information
     */
    public TaskView [] getTaskSet() {
        return this.TaskSet;
    }

    /**
     * Set Task view information
     * @param TaskSet Task view information
     */
    public void setTaskSet(TaskView [] TaskSet) {
        this.TaskSet = TaskSet;
    }

    /**
     * Get Information of the dependency among tasks 
     * @return DependenceSet Information of the dependency among tasks
     */
    public Dependence [] getDependenceSet() {
        return this.DependenceSet;
    }

    /**
     * Set Information of the dependency among tasks
     * @param DependenceSet Information of the dependency among tasks
     */
    public void setDependenceSet(Dependence [] DependenceSet) {
        this.DependenceSet = DependenceSet;
    }

    /**
     * Get Task statistical metrics 
     * @return TaskMetrics Task statistical metrics
     */
    public TaskMetrics getTaskMetrics() {
        return this.TaskMetrics;
    }

    /**
     * Set Task statistical metrics
     * @param TaskMetrics Task statistical metrics
     */
    public void setTaskMetrics(TaskMetrics TaskMetrics) {
        this.TaskMetrics = TaskMetrics;
    }

    /**
     * Get Task instance statistical metrics 
     * @return TaskInstanceMetrics Task instance statistical metrics
     */
    public TaskInstanceView getTaskInstanceMetrics() {
        return this.TaskInstanceMetrics;
    }

    /**
     * Set Task instance statistical metrics
     * @param TaskInstanceMetrics Task instance statistical metrics
     */
    public void setTaskInstanceMetrics(TaskInstanceView TaskInstanceMetrics) {
        this.TaskInstanceMetrics = TaskInstanceMetrics;
    }

    /**
     * Get Instance failure reason 
     * @return StateReason Instance failure reason
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * Set Instance failure reason
     * @param StateReason Instance failure reason
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
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
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "JobState", this.JobState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "TaskSet.", this.TaskSet);
        this.setParamArrayObj(map, prefix + "DependenceSet.", this.DependenceSet);
        this.setParamObj(map, prefix + "TaskMetrics.", this.TaskMetrics);
        this.setParamObj(map, prefix + "TaskInstanceMetrics.", this.TaskInstanceMetrics);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

