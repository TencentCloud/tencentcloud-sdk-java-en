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

public class CreateLifecycleHookRequest  extends AbstractModel{

    /**
    * Scaling group ID.
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Lifecycle hook name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 128 characters.
    */
    @SerializedName("LifecycleHookName")
    @Expose
    private String LifecycleHookName;

    /**
    * Lifecycle hook event. Values includes: “INSTANCE_LAUNCHING” and “INSTANCE_TERMINATING”
    */
    @SerializedName("LifecycleTransition")
    @Expose
    private String LifecycleTransition;

    /**
    * Defined actions when lifecycle hook times out. Values include “CONTINUE” or “ABANDON”. Default value is “CONTINUE”.
    */
    @SerializedName("DefaultResult")
    @Expose
    private String DefaultResult;

    /**
    * Maximum time before lifecycle hook times out (in seconds). Range is from 30 to 3600 seconds. Default is 300 seconds.
    */
    @SerializedName("HeartbeatTimeout")
    @Expose
    private Integer HeartbeatTimeout;

    /**
    * Additional notes sent to the notification target. Default value is “”. Maximum length is 1024 characters. 
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
     * Get Scaling group ID
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Lifecycle hook name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 128 characters.
     * @return LifecycleHookName Lifecycle hook name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 128 characters.
     */
    public String getLifecycleHookName() {
        return this.LifecycleHookName;
    }

    /**
     * Set Lifecycle hook name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 128 characters.
     * @param LifecycleHookName Lifecycle hook name. The name can only contain Chinese characters, English letters, numbers, underscore, hyphen “-” and periods. It cannot exceed 128 characters.
     */
    public void setLifecycleHookName(String LifecycleHookName) {
        this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * Get Lifecycle hook event. Values includes: “INSTANCE_LAUNCHING” and “INSTANCE_TERMINATING”
     * @return LifecycleTransition Lifecycle hook event. Values includes: “INSTANCE_LAUNCHING” and “INSTANCE_TERMINATING”
     */
    public String getLifecycleTransition() {
        return this.LifecycleTransition;
    }

    /**
     * Set Lifecycle hook event. Values includes: “INSTANCE_LAUNCHING” and “INSTANCE_TERMINATING”
     * @param LifecycleTransition Lifecycle hook event. Values includes: “INSTANCE_LAUNCHING” and “INSTANCE_TERMINATING”
     */
    public void setLifecycleTransition(String LifecycleTransition) {
        this.LifecycleTransition = LifecycleTransition;
    }

    /**
     * Get Defined actions when lifecycle hook times out. Values include “CONTINUE” or “ABANDON”. Default value is “CONTINUE”.
     * @return DefaultResult Defined actions when lifecycle hook times out. Values include “CONTINUE” or “ABANDON”. Default value is “CONTINUE”.
     */
    public String getDefaultResult() {
        return this.DefaultResult;
    }

    /**
     * Set Defined actions when lifecycle hook times out. Values include “CONTINUE” or “ABANDON”. Default value is “CONTINUE”.
     * @param DefaultResult Defined actions when lifecycle hook times out. Values include “CONTINUE” or “ABANDON”. Default value is “CONTINUE”.
     */
    public void setDefaultResult(String DefaultResult) {
        this.DefaultResult = DefaultResult;
    }

    /**
     * Get Maximum time before lifecycle hook times out (in seconds). Range is from 30 to 3600 seconds. Default is 300 seconds.
     * @return HeartbeatTimeout Maximum time before lifecycle hook times out (in seconds). Range is from 30 to 3600 seconds. Default is 300 seconds.
     */
    public Integer getHeartbeatTimeout() {
        return this.HeartbeatTimeout;
    }

    /**
     * Set Maximum time before lifecycle hook times out (in seconds). Range is from 30 to 3600 seconds. Default is 300 seconds.
     * @param HeartbeatTimeout Maximum time before lifecycle hook times out (in seconds). Range is from 30 to 3600 seconds. Default is 300 seconds.
     */
    public void setHeartbeatTimeout(Integer HeartbeatTimeout) {
        this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * Get Additional notes sent to the notification target. Default value is “”. Maximum length is 1024 characters. 
     * @return NotificationMetadata Additional notes sent to the notification target. Default value is “”. Maximum length is 1024 characters. 
     */
    public String getNotificationMetadata() {
        return this.NotificationMetadata;
    }

    /**
     * Set Additional notes sent to the notification target. Default value is “”. Maximum length is 1024 characters. 
     * @param NotificationMetadata Additional notes sent to the notification target. Default value is “”. Maximum length is 1024 characters. 
     */
    public void setNotificationMetadata(String NotificationMetadata) {
        this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * Get notification target
     * @return NotificationTarget Notification target
     */
    public NotificationTarget getNotificationTarget() {
        return this.NotificationTarget;
    }

    /**
     * Set notification target
     * @param NotificationTarget Notification target
     */
    public void setNotificationTarget(NotificationTarget NotificationTarget) {
        this.NotificationTarget = NotificationTarget;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "LifecycleHookName", this.LifecycleHookName);
        this.setParamSimple(map, prefix + "LifecycleTransition", this.LifecycleTransition);
        this.setParamSimple(map, prefix + "DefaultResult", this.DefaultResult);
        this.setParamSimple(map, prefix + "HeartbeatTimeout", this.HeartbeatTimeout);
        this.setParamSimple(map, prefix + "NotificationMetadata", this.NotificationMetadata);
        this.setParamObj(map, prefix + "NotificationTarget.", this.NotificationTarget);

    }
}

