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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInfoResponse  extends AbstractModel{

    /**
    * Task status. preparing: to be run; running: running; succeed: succeeded; failed: failed; error: running error.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task type
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Task message, which is displayed in case of an error. It will be blank if the status is running or succeeded
    */
    @SerializedName("TaskMessage")
    @Expose
    private String TaskMessage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task status. preparing: to be run; running: running; succeed: succeeded; failed: failed; error: running error. 
     * @return Status Task status. preparing: to be run; running: running; succeed: succeeded; failed: failed; error: running error.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. preparing: to be run; running: running; succeed: succeeded; failed: failed; error: running error.
     * @param Status Task status. preparing: to be run; running: running; succeed: succeeded; failed: failed; error: running error.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Task start time 
     * @return StartTime Task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
     * @param StartTime Task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task type 
     * @return TaskType Task type
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type
     * @param TaskType Task type
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Task message, which is displayed in case of an error. It will be blank if the status is running or succeeded 
     * @return TaskMessage Task message, which is displayed in case of an error. It will be blank if the status is running or succeeded
     */
    public String getTaskMessage() {
        return this.TaskMessage;
    }

    /**
     * Set Task message, which is displayed in case of an error. It will be blank if the status is running or succeeded
     * @param TaskMessage Task message, which is displayed in case of an error. It will be blank if the status is running or succeeded
     */
    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskMessage", this.TaskMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

