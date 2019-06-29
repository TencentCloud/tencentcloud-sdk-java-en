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

public class ModifyNotificationConfigurationRequest  extends AbstractModel{

    /**
    * ID of notification to be modified. 
    */
    @SerializedName("AutoScalingNotificationId")
    @Expose
    private String AutoScalingNotificationId;

    /**
    * Type of notification: grouping of notification types that could be subscribed. Value range is as below:
<li>SCALE_OUT_SUCCESSFUL：Expansion completed successfully.</li>
<li>SCALE_OUT_SUCCESSFUL：Expansion failed.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking completed successfully.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking failed.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：Operation of replacing unhealthy instance completes successfully.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：Operation of replacing unhealthy instance failed.</li>
    */
    @SerializedName("NotificationTypes")
    @Expose
    private String [] NotificationTypes;

    /**
    * ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404).
    */
    @SerializedName("NotificationUserGroupIds")
    @Expose
    private String [] NotificationUserGroupIds;

    /**
     * Obtain the notification ID that is to be modified.
     * @return AutoScalingNotificationId Notification ID to be modified.
     */
    public String getAutoScalingNotificationId() {
        return this.AutoScalingNotificationId;
    }

    /**
     * Set notification ID that will be modified.
     * @param AutoScalingNotificationId Notification ID to be modified.
     */
    public void setAutoScalingNotificationId(String AutoScalingNotificationId) {
        this.AutoScalingNotificationId = AutoScalingNotificationId;
    }

    /**
     * Obtain the type of notification, which is grouping of notification types that could be subscribed. Value range is as below:
<li>SCALE_OUT_SUCCESSFUL：Expansion completed successfully.</li>
<li>SCALE_OUT_SUCCESSFUL：Expansion failed.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking completed successfully.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking failed.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：Operation of replacing unhealthy instance completes successfully.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：Operation of replacing unhealthy instance failed.</li>
     * @return NotificationTypes Type of notification: grouping of notification types that could be subscribed. Value range is as below:
<li>SCALE_OUT_SUCCESSFUL：Expansion completed successfully.</li>
<li>SCALE_OUT_SUCCESSFUL：Expansion failed.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking completed successfully.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking failed.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：Operation of replacing unhealthy instance completes successfully.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：Operation of replacing unhealthy instance failed.</li>
     */
    public String [] getNotificationTypes() {
        return this.NotificationTypes;
    }

    /**
     * Set type of notification: grouping of notification types that could be subscribed. Value range is as below:
<li>SCALE_OUT_SUCCESSFUL：Expansion completed successfully.</li>
<li>SCALE_OUT_SUCCESSFUL：Expansion failed.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking completed successfully.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking failed.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：Operation of replacing unhealthy instance completes successfully.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：Operation of replacing unhealthy instance failed.</li>
     * @param NotificationTypes Type of notification: grouping of notification types that could be subscribed. Value range is as below:
<li>SCALE_OUT_SUCCESSFUL：Expansion completed successfully.</li>
<li>SCALE_OUT_SUCCESSFUL：Expansion failed.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking completed successfully.</li>
<li>SCALE_IN_SUCCESSFUL：Shrinking failed.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_SUCCESSFUL：Operation of replacing unhealthy instance completes successfully.</li>
<li>REPLACE_UNHEALTHY_INSTANCE_FAILED：Operation of replacing unhealthy instance failed.</li>
     */
    public void setNotificationTypes(String [] NotificationTypes) {
        this.NotificationTypes = NotificationTypes;
    }

    /**
     * Obtain ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404).
     * @return NotificationUserGroupIds ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404).
     */
    public String [] getNotificationUserGroupIds() {
        return this.NotificationUserGroupIds;
    }

    /**
     * Set ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404).
     * @param NotificationUserGroupIds ID of notification group.It is the aggregation of user group IDs.User group IDs can be retrieved at [DescribeUserGroup](https://cloud.tencent.com/document/api/378/4404).
     */
    public void setNotificationUserGroupIds(String [] NotificationUserGroupIds) {
        this.NotificationUserGroupIds = NotificationUserGroupIds;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingNotificationId", this.AutoScalingNotificationId);
        this.setParamArraySimple(map, prefix + "NotificationTypes.", this.NotificationTypes);
        this.setParamArraySimple(map, prefix + "NotificationUserGroupIds.", this.NotificationUserGroupIds);

    }
}

