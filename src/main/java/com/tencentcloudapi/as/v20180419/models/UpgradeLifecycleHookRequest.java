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

public class UpgradeLifecycleHookRequest  extends AbstractModel{

    /**
    * Lifecycle hook ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Lifecycle hook name
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * Scenario of lifecycle hook. Value range includes: “INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Define the actions in case of lifecycle hook timeout. Value range: “CONTINUE”,“ABANDON”. Default value is “CONTINUE”.
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * Maximum time before Lifecycle timeout is reached (in seconds), range is from 30 to 3600 seconds. Default is 300 seconds.
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Integer HeartbeatTimeout;

    /**
    * Extra information that Auto Scaling sends to targets. Default value is
    */
    @SerializedName("NotificationMetadata")
    @Expose
    private String NotificationMetadata;

    /**
    * Notification target
    */
    @SerializedName("NotificationTarget")
    @Expose
    private NotificationTarget NotificationTarget;

    /**
     * Obtain Lifecycle hook ID
     * @return LifecycleHookId Lifecycle hook ID
     */
    public String getLifecycleHookId() {
        return this.LifecycleHookId;
    }

    /**
     * Set Lifecycle hook ID
     * @param LifecycleHookId Lifecycle hook ID
     */
    public void setLifecycleHookId(String LifecycleHookId) {
        this.LifecycleHookId = LifecycleHookId;
    }

    /**
     * Obtain Lifecycle hook ID
     * @return LifecycleHookId Lifecycle hook name
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set Lifecycle hook name
     * @param LifecycleHookName Lifecycle hook name
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Obtain the scenario of lifecycle hook. Value range includes: “INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     * @return LifecycleTransition The scenario of lifecycle hook. Value range includes: “INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set the scenario of lifecycle hook. Value range includes: “INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     * @param LifecycleTransition The scenario of lifecycle hook. Value range includes: “INSTANCE_LAUNCHING”和“INSTANCE_TERMINATING”
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Obtain define the actions in case of lifecycle hook timeout. Value range: “CONTINUE”,“ABANDON”. Default value is “CONTINUE”.
     * @return DefaultResult Define the actions in case of lifecycle hook timeout. Value range: “CONTINUE”,“ABANDON”. Default value is “CONTINUE”.
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set define the actions in case of lifecycle hook timeout. Value range: “CONTINUE”,“ABANDON”. Default value is “CONTINUE”.
     * @param DefaultResult Define the actions in case of lifecycle hook timeout. Value range: “CONTINUE”,“ABANDON”. Default value is “CONTINUE”.
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Obtain the maximum time before Lifecycle timeout is reached (in seconds), range is from 30 to 3600 seconds. Default is 300 seconds.
     * @return HeartbeatTimeout  The maximum time before Lifecycle timeout is reached (in seconds), range is from 30 to 3600 seconds. Default is 300 seconds.
     */
    public Integer getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set the maximum time before Lifecycle timeout is reached (in seconds), range is from 30 to 3600 seconds. Default is 300 seconds.
     * @param HeartbeatTimeout  The maximum time before Lifecycle timeout is reached (in seconds), range is from 30 to 3600 seconds. Default is 300 seconds.
     */
    public void setHeartbeatTimeout(Integer HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Obtain the extra information that Auto Scaling sends to targets. Default value is
     * @return NotificationMetadata The extra information that Auto Scaling sends to targets. Default value is
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set the extra information that Auto Scaling sends to targets. Default value is
     * @param NotificationMetadata The extra information that Auto Scaling sends to targets. Default value is
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Obtain Notification target
     * @return NotificationTarget Notification target
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set Notification target
     * @param NotificationTarget Notification target
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);

    }
}

