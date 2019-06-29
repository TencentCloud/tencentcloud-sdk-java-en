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

public class LifecycleHook  extends AbstractModel{

    /**
    * Lifecycle hook ID.
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Lifecycle hook name.
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * Scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Lifecycle hook results by default.
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * Waiting timeout of lifecycle hook.
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Integer HeartbeatTimeout;

    /**
    * Scenario of lifecycle hook.
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Extra information of informing target.
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Inform target.
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
     * Obtain the lifecycle hook ID.
     * @return LifecycleHookId Lifecycle hook ID.
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Configure the lifecycle hook ID.
     * @param LifecycleHookId Lifecycle hook ID.
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Obtain the lifecycle hook name.
     * @return LifecycleHookName Lifecycle hook name.
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Configure the lifecycle hook name.
     * @param LifecycleHookName Lifecycle hook name.
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Obtain the scaling group ID.
     * @return AutoScalingGroupId Scaling group ID.
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Configure the scaling group ID.
     * @param AutoScalingGroupId Scaling group ID.
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Obtain the lifecycle hook results by default.
     * @return DefaultResult Lifecycle hook results by default.
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Configure the lifecycle hook results by default.
     * @param DefaultResult Lifecycle hook results by default.
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Obtain the waiting timeout of lifecycle hook.
     * @return HeartbeatTimeout Waiting timeout of lifecycle hook.
     */
    public Integer getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Configure the waiting timeout of lifecycle hook.
     * @param HeartbeatTimeout Waiting timeout of lifecycle hook.
     */
    public void setHeartbeatTimeout(Integer HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Obtain the scenario of lifecycle hook.
     * @return LifecycleTransition Scenario of lifecycle hook.
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Configure the scenario of lifecycle hook.
     * @param LifecycleTransition Scenario of lifecycle hook.
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Obtain the extra information of informing target.
     * @return NotificationMetadata Extra information of informing target.
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Configure the extra information of informing target.
     * @param NotificationMetadata Extra information of informing target.
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Obtain the creation time.
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Configure the creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Obtain the Informed target.
     * @return NotificationTarget Inform target.
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Configure the Informed target.
     * @param NotificationTarget Inform target.
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);

    }
}

