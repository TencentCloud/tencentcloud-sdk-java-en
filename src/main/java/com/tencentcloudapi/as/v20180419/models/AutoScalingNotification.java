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

public class AutoScalingNotification  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * List of user group IDs
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
    * List of event notifications
    */
    @SerializedName("NotificationTypes")
    @Expose
    private String [] NotificationTypes;

    /**
    * Event notification ID
    */
    @SerializedName("AutoScalingNotificationId")
    @Expose
    private String AutoScalingNotificationId;

    /**
     * Get scaling group ID
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID
     * @param AutoScalingGroupId Scaling Group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get List of user group IDs
     * @return NotificationUserGroupIds List of user group IDs
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set List of user group IDs
     * @param NotificationUserGroupIds List of user group IDs
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * Get List of event notifications
     * @return NotificationTypes List of event notifications
     */
    public String [] getNotificationTypes() {
        return this.NotificationTypes;
    }

    /**
     * Set List of event notifications
     * @param NotificationTypes List of event notifications
     */
    public void setNotificationTypes(String [] NotificationTypes) {
        this.NotificationTypes = NotificationTypes;
    }

    /**
     * Get Event notification ID
     * @return AutoScalingNotificationId Event notification ID
     */
    public String getAutoScalingNotificationId() {
        return this.AutoScalingNotificationId;
    }

    /**
     * Set Event notification ID
     * @param AutoScalingNotificationId Event notification ID
     */
    public void setAutoScalingNotificationId(String AutoScalingNotificationId) {
        this.AutoScalingNotificationId = AutoScalingNotificationId;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);

    }
}

