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

public class ListEntitiesForPolicyResponse  extends AbstractModel{

    /**
    * Number of entitiesNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * List of entitiesNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("List")
    @Expose
    private AttachEntityOfPolicy [] List;

    /**
    * The unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain number of entities.Note: This field may return null, indicating that no valid value was found.
     * @return TotalNum total number of entitiesNote: This field may return null, indicating that no valid value was found.
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set total number of entitiesNote: This field may return null, indicating that no valid value was found.
     * @param TotalNum total number of entitiesNote: This field may return null, indicating that no valid value was found.
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Obtain list of entitiesNote: This field may return null, indicating that no valid value was found.
     * @return List list of entitiesNote: This field may return null, indicating that no valid value was found.
     */
    public AttachEntityOfPolicy [] getList() {
        return this.List;
    }

    /**
     * Set list of entitiesNote: This field may return null, indicating that no valid value was found.
     * @param List list of entitiesNote: This field may return null, indicating that no valid value was found.
     */
    public void setList(AttachEntityOfPolicy [] List) {
        this.List = List;
    }

    /**
     * Obtain the unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId The unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set the unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId the unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

