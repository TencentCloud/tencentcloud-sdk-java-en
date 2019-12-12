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

public class DestroyProxiesResponse  extends AbstractModel{

    /**
    * ID list of connection instances that cannot be terminated.
    */
    @SerializedName("InvalidStatusInstanceSet")
    @Expose
    private String [] InvalidStatusInstanceSet;

    /**
    * ID list of connection instances that failed to be terminated.
    */
    @SerializedName("OperationFailedInstanceSet")
    @Expose
    private String [] OperationFailedInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID list of connection instances that cannot be terminated. 
     * @return InvalidStatusInstanceSet ID list of connection instances that cannot be terminated.
     */
    public String [] getInvalidStatusInstanceSet() {
        return this.InvalidStatusInstanceSet;
    }

    /**
     * Set ID list of connection instances that cannot be terminated.
     * @param InvalidStatusInstanceSet ID list of connection instances that cannot be terminated.
     */
    public void setInvalidStatusInstanceSet(String [] InvalidStatusInstanceSet) {
        this.InvalidStatusInstanceSet = InvalidStatusInstanceSet;
    }

    /**
     * Get ID list of connection instances that failed to be terminated. 
     * @return OperationFailedInstanceSet ID list of connection instances that failed to be terminated.
     */
    public String [] getOperationFailedInstanceSet() {
        return this.OperationFailedInstanceSet;
    }

    /**
     * Set ID list of connection instances that failed to be terminated.
     * @param OperationFailedInstanceSet ID list of connection instances that failed to be terminated.
     */
    public void setOperationFailedInstanceSet(String [] OperationFailedInstanceSet) {
        this.OperationFailedInstanceSet = OperationFailedInstanceSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InvalidStatusInstanceSet.", this.InvalidStatusInstanceSet);
        this.setParamArraySimple(map, prefix + "OperationFailedInstanceSet.", this.OperationFailedInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

