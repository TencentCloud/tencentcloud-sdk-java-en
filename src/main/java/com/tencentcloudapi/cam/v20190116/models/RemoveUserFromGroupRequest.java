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

public class RemoveUserFromGroupRequest extends AbstractModel{

    /**
    * The UID of the user to be deleted and an array corresponding to the User Group IDs
    */
    @SerializedName("Info")
    @Expose
    private GroupIdOfUidInfo [] Info;

    /**
     * Get The UID of the user to be deleted and an array corresponding to the User Group IDs 
     * @return Info The UID of the user to be deleted and an array corresponding to the User Group IDs
     */
    public GroupIdOfUidInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set The UID of the user to be deleted and an array corresponding to the User Group IDs
     * @param Info The UID of the user to be deleted and an array corresponding to the User Group IDs
     */
    public void setInfo(GroupIdOfUidInfo [] Info) {
        this.Info = Info;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Info.", this.Info);

    }
}

