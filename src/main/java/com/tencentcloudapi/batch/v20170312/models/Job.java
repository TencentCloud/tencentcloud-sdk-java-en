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

public class Job  extends AbstractModel{

    /**
    * Job information
    */
    @SerializedName("Tasks")
    @Expose
    private Task [] Tasks;

    /**
    * Instance name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Instance description
    */
    @SerializedName("JobDescription")
    @Expose
    private String JobDescription;

    /**
    * Instance priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the instance
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Dependency information
    */
    @SerializedName("Dependences")
    @Expose
    private Dependence [] Dependences;

    /**
    * Notification information
    */
    @SerializedName("Notifications")
    @Expose
    private Notification [] Notifications;

    /**
    * This is the dependency of the subsequent task on the previous task if there is a dependent relationship between them. Value range: PRE_TASK_SUCCEED, PRE_TASK_AT_LEAST_PARTLY_SUCCEED, PRE_TASK_FINISHED. Default value: PRE_TASK_SUCCEED.
    */
    @SerializedName("TaskExecutionDependOn")
    @Expose
    private String TaskExecutionDependOn;

    /**
    * Indicates which policy will be used in case that CVM instance creation fails. Value range: FAILED, RUNNABLE. FAILED indicates that the CVM instance creation failure will be processed as an execution failure, while RUNNABLE indicates that the failure will be processed as "keep waiting". Default value: FAILED. StateIfCreateCvmFailed is not valid for submitted jobs for which a compute environment is specified.
    */
    @SerializedName("StateIfCreateCvmFailed")
    @Expose
    private String StateIfCreateCvmFailed;

    /**
     * Get Job information 
     * @return Tasks Job information
     */
    public Task [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Job information
     * @param Tasks Job information
     */
    public void setTasks(Task [] Tasks) {
        this.Tasks = Tasks;
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
     * Get Instance description 
     * @return JobDescription Instance description
     */
    public String getJobDescription() {
        return this.JobDescription;
    }

    /**
     * Set Instance description
     * @param JobDescription Instance description
     */
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * Get Instance priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the instance 
     * @return Priority Instance priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the instance
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Instance priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the instance
     * @param Priority Instance priority. Tasks (Task) and task instances (TaskInstance) inherit the priority of the instance
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Dependency information 
     * @return Dependences Dependency information
     */
    public Dependence [] getDependences() {
        return this.Dependences;
    }

    /**
     * Set Dependency information
     * @param Dependences Dependency information
     */
    public void setDependences(Dependence [] Dependences) {
        this.Dependences = Dependences;
    }

    /**
     * Get Notification information 
     * @return Notifications Notification information
     */
    public Notification [] getNotifications() {
        return this.Notifications;
    }

    /**
     * Set Notification information
     * @param Notifications Notification information
     */
    public void setNotifications(Notification [] Notifications) {
        this.Notifications = Notifications;
    }

    /**
     * Get This is the dependency of the subsequent task on the previous task if there is a dependent relationship between them. Value range: PRE_TASK_SUCCEED, PRE_TASK_AT_LEAST_PARTLY_SUCCEED, PRE_TASK_FINISHED. Default value: PRE_TASK_SUCCEED. 
     * @return TaskExecutionDependOn This is the dependency of the subsequent task on the previous task if there is a dependent relationship between them. Value range: PRE_TASK_SUCCEED, PRE_TASK_AT_LEAST_PARTLY_SUCCEED, PRE_TASK_FINISHED. Default value: PRE_TASK_SUCCEED.
     */
    public String getTaskExecutionDependOn() {
        return this.TaskExecutionDependOn;
    }

    /**
     * Set This is the dependency of the subsequent task on the previous task if there is a dependent relationship between them. Value range: PRE_TASK_SUCCEED, PRE_TASK_AT_LEAST_PARTLY_SUCCEED, PRE_TASK_FINISHED. Default value: PRE_TASK_SUCCEED.
     * @param TaskExecutionDependOn This is the dependency of the subsequent task on the previous task if there is a dependent relationship between them. Value range: PRE_TASK_SUCCEED, PRE_TASK_AT_LEAST_PARTLY_SUCCEED, PRE_TASK_FINISHED. Default value: PRE_TASK_SUCCEED.
     */
    public void setTaskExecutionDependOn(String TaskExecutionDependOn) {
        this.TaskExecutionDependOn = TaskExecutionDependOn;
    }

    /**
     * Get Indicates which policy will be used in case that CVM instance creation fails. Value range: FAILED, RUNNABLE. FAILED indicates that the CVM instance creation failure will be processed as an execution failure, while RUNNABLE indicates that the failure will be processed as "keep waiting". Default value: FAILED. StateIfCreateCvmFailed is not valid for submitted jobs for which a compute environment is specified. 
     * @return StateIfCreateCvmFailed Indicates which policy will be used in case that CVM instance creation fails. Value range: FAILED, RUNNABLE. FAILED indicates that the CVM instance creation failure will be processed as an execution failure, while RUNNABLE indicates that the failure will be processed as "keep waiting". Default value: FAILED. StateIfCreateCvmFailed is not valid for submitted jobs for which a compute environment is specified.
     */
    public String getStateIfCreateCvmFailed() {
        return this.StateIfCreateCvmFailed;
    }

    /**
     * Set Indicates which policy will be used in case that CVM instance creation fails. Value range: FAILED, RUNNABLE. FAILED indicates that the CVM instance creation failure will be processed as an execution failure, while RUNNABLE indicates that the failure will be processed as "keep waiting". Default value: FAILED. StateIfCreateCvmFailed is not valid for submitted jobs for which a compute environment is specified.
     * @param StateIfCreateCvmFailed Indicates which policy will be used in case that CVM instance creation fails. Value range: FAILED, RUNNABLE. FAILED indicates that the CVM instance creation failure will be processed as an execution failure, while RUNNABLE indicates that the failure will be processed as "keep waiting". Default value: FAILED. StateIfCreateCvmFailed is not valid for submitted jobs for which a compute environment is specified.
     */
    public void setStateIfCreateCvmFailed(String StateIfCreateCvmFailed) {
        this.StateIfCreateCvmFailed = StateIfCreateCvmFailed;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobDescription", this.JobDescription);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamArrayObj(map, prefix + "Dependences.", this.Dependences);
        this.setParamArrayObj(map, prefix + "Notifications.", this.Notifications);
        this.setParamSimple(map, prefix + "TaskExecutionDependOn", this.TaskExecutionDependOn);
        this.setParamSimple(map, prefix + "StateIfCreateCvmFailed", this.StateIfCreateCvmFailed);

    }
}

