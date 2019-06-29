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

public class DescribeInstancesStatusRequest  extends AbstractModel{

    /**
    * Query by one or more IDs of instances, suach as: `ins-11112222`. the format of the parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)）.the upper limit of instances of each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). 
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * Obtain query by one or more IDs of instances, suach as: `ins-11112222`. the format of the parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)）.the upper limit of instances of each request is 100.
     * @return InstanceIds Query by one or more IDs of instances, suach as: `ins-11112222`. the format of the parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)）.the upper limit of instances of each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set query by one or more IDs of instances, suach as: `ins-11112222`. the format of the parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)）.the upper limit of instances of each request is 100.
     * @param InstanceIds Query by one or more IDs of instances, suach as: `ins-11112222`. the format of the parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)）.the upper limit of instances of each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @return Offset Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @return Limit number of returned results. It defaults to 20, The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit` see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @param Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

