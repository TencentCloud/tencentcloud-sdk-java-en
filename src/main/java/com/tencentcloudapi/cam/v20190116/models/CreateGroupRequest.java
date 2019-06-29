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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupRequest  extends AbstractModel{

    /**
    * User Group Name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * User Group Description
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Getting User Group Name
     * @return GroupName Name of the user group
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Configuring User Group Name
     * @param GroupName Name of the user group
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Getting User Group Description
     * @return Remark User group description
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Configuring User Group Description
     * @param Remark User group description
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

