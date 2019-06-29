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

public class DescribeDisasterRecoverGroupsRequest  extends AbstractModel{

    /**
    * ID of a spread placement group.
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * Spread placement group name. Fuzzy match is supported.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
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
     * Get ID of a spread placement group.
     * @return DisasterRecoverGroupIds Set ID of a spread placement group.
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set ID of a spread placement group.
     * @param DisasterRecoverGroupIds ID of a spread placement group.
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get Spread placement group name. Fuzzy match is supported.
     * @return Name Spread placement group name. Fuzzy match is supported.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Spread placement group name. Fuzzy match is supported.
     * @param Name Spread placement group name. Fuzzy match is supported.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     * @return Offset Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). 
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     * @param Offset Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). 
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     * @return Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     * @param Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

