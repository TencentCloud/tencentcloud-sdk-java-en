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

public class CreateLifecycleHookResponse  extends AbstractModel{

    /**
    * Lifecycle hook ID
    */
    @SerializedName("LifecycleHookId")
    @Expose
    private String LifecycleHookId;

    /**
    * Unique ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Lifecycle hook ID
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
     * Get unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @return RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     * @param RequestId Unique request ID, which is returned in every request. The RequestId is required for troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleHookId", this.LifecycleHookId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

