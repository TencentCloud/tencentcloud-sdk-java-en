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

public class TerminateTaskInstanceRequest  extends AbstractModel{

    /**
    * Instance ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Task name
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task instance index
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Long TaskInstanceIndex;

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
     * Get Task name 
     * @return TaskName Task name
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name
     * @param TaskName Task name
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task instance index 
     * @return TaskInstanceIndex Task instance index
     */
    public Long getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * Set Task instance index
     * @param TaskInstanceIndex Task instance index
     */
    public void setTaskInstanceIndex(Long TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);

    }
}

