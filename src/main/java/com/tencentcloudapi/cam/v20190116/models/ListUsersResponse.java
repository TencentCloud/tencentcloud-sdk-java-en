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

public class ListUsersResponse  extends AbstractModel{

    /**
    * Sub-user information
    */
    @SerializedName("Data")
    @Expose
    private SubAccountInfo [] Data;

    /**
    * The unique ID of request, which will be returned for each request and is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get sub-user information
     * @return Data sub-user information
     */
    public SubAccountInfo [] getData() {
        return this.Data;
    }

    /**
     * Configure sub-user information
     * @param Data sub-user information 
     */
    public void setData(SubAccountInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get the unique ID of request, which will be returned for each request, and is required for each troubleshooting case.
     * @return RequestId unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     * @param RequestId unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

