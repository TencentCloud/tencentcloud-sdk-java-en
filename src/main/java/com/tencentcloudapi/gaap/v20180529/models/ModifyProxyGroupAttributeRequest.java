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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProxyGroupAttributeRequest extends AbstractModel{

    /**
    * ID of the connection group to be modified.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * New connection group name. Up to 30 characters. The extra characters will be truncated.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get ID of the connection group to be modified. 
     * @return GroupId ID of the connection group to be modified.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set ID of the connection group to be modified.
     * @param GroupId ID of the connection group to be modified.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get New connection group name. Up to 30 characters. The extra characters will be truncated. 
     * @return GroupName New connection group name. Up to 30 characters. The extra characters will be truncated.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set New connection group name. Up to 30 characters. The extra characters will be truncated.
     * @param GroupName New connection group name. Up to 30 characters. The extra characters will be truncated.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

