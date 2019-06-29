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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SharePermission  extends AbstractModel{

    /**
    * The time when the image is shared
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * ID of the account to which the image is shared
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * Obtain the time when the image is shared
     * @return CreatedTime The time when the image is shared
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Configure the time when the image is shared
     * @param CreatedTime The time when the image is shared
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Obtain ID of the account to which the image is shared
     * @return AccountId ID of the account to which the image is shared
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Configure ID of the account to which the image is shared
     * @param AccountId ID of the account to which the image is shared
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);

    }
}

