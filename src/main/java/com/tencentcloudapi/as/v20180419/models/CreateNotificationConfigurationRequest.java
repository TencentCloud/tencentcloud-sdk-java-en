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

public class CreateNotificationConfigurationRequest  extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Notification type. A collection of notification types to be subscribed to. Values as below:
<li>SCALE_OUT_SUCCESSFUL: Scaled up successfully</li>
<li>SCALE_OUT_FAILED: Unable to scale up</li>
<li>SCALE_IN_SUCCESSFUL: Scaled down successfully</li>
<li>SCALE_IN_FAILED: Unable to scale in</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: Unhealthy instance replaced successfully</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: Unable to replace unhealthy instance</li>
    */
    @SerializedName("NotificationTypes")
    @Expose
    private String [] NotificationTypes;

    /**
    * Notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Get Scaling Group ID
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set the scaling group ID
     * @param AutoScalingGroupId Scaling Group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get notification type. A collection of notification types to be subscribed to. Values as below:
<li>SCALE_OUT_SUCCESSFUL: Scaled up successfully</li>
<li>SCALE_OUT_FAILED: Unable to scale up</li>
<li>SCALE_IN_SUCCESSFUL: Scaled down successfully</li>
<li>SCALE_IN_FAILED: Unable to scale in</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: Unhealthy instance replaced successfully</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: Unable to replace unhealthy instance</li>
     * @return NotificationTypes notification type. A collection of notification types to be subscribed to. Values as below:
<li>SCALE_OUT_SUCCESSFUL: Scaled up successfully</li>
<li>SCALE_OUT_FAILED: Unable to scale up</li>
<li>SCALE_IN_SUCCESSFUL: Scaled down successfully</li>
<li>SCALE_IN_FAILED: Unable to scale in</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: Unhealthy instance replaced successfully</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: Unable to replace unhealthy instance</li>
     */
    public String [] getNotificationTypes() {
        return this.NotificationTypes;
    }

    /**
     * Set notification type. A collection of notification types to be subscribed to. Values as below:
<li>SCALE_OUT_SUCCESSFUL: Scaled up successfully</li>
<li>SCALE_OUT_FAILED: Unable to scale up</li>
<li>SCALE_IN_SUCCESSFUL: Scaled down successfully</li>
<li>SCALE_IN_FAILED: Unable to scale in</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: Unhealthy instance replaced successfully</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: Unable to replace unhealthy instance</li>
     * @param NotificationTypes Notification type. A collection of notification types to be subscribed to. Values as below:
<li>SCALE_OUT_SUCCESSFUL: Scaled up successfully</li>
<li>SCALE_OUT_FAILED: Unable to scale up</li>
<li>SCALE_IN_SUCCESSFUL: Scaled down successfully</li>
<li>SCALE_IN_FAILED: Unable to scale in</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL: Unhealthy instance replaced successfully</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED: Unable to replace unhealthy instance</li>
     */
    public void setNotificationTypes(String [] NotificationTypes) {
        this.NotificationTypes = NotificationTypes;
    }

    /**
     * Get notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     * @return NotificationUserGroupIds Notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     * @param NotificationUserGroupIds Notification group ID, a collection of user group IDs. User group IDs can be queried via the API DescribeUserGroup.
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}

