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

public class DescribeKeyPairsRequest  extends AbstractModel{

    /**
    * IDs of Key pairs, such as:`skey-11112222`（The API supports multiple ID as filter conditions. The format of parameter refers to API [introduction](Chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)).`KeyIds` and `Filters` cannot be assigned at same time. IDs of key pairs can be obtained via log in the console(https://console.cloud.tencent.com/cvm/index)
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Filter conditions
<li> project-id - Integer - Required :No | (Filter condition). Filter by project ID. You can obtain the project ID by either of the following ways: query the project ID via [Project List](https://console.cloud.tencent.com/project);obtain the project ID from the `projectId` field of the returned values of API [DescribeProject](/document/api/378/4400).|</li>
<li> key-name - String - Required: No - (Filter condition). Filter by key pair name.</li>`KeyIds` and `Filters` cannot be assigned at same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset, default is 0. please see API[introduction]  For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). Number of returned results, default is 20, and maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview (https://cloud.tencent.com/document/api/213/15688). 
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
     * IDs of Key pairs, such as:`skey-11112222`（The API supports multiple ID as filter conditions. The format of parameter refers to API [introduction](Chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)).`KeyIds` and `Filters` cannot be assigned at same time. IDs of key pairs can be obtained via log in the console(https://console.cloud.tencent.com/cvm/index)
     * @return KeyIds IDs of Key pairs, such as:`skey-11112222`（The API supports multiple ID as filter conditions. The format of parameter refers to API [introduction](Chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)).`KeyIds` and `Filters` cannot be assigned at same time. IDs of key pairs can be obtained via log in the console(https://console.cloud.tencent.com/cvm/index)
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set IDs of Key pairs, such as:`skey-11112222`（The API supports multiple ID as filter conditions. The format of parameter refers to API [introduction](Chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)).`KeyIds` and `Filters` cannot be assigned at same time. IDs of key pairs can be obtained via log in the console(https://console.cloud.tencent.com/cvm/index)
     * @param KeyIds IDs of Key pairs, such as:`skey-11112222`（The API supports multiple ID as filter conditions. The format of parameter refers to API [introduction](Chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)).`KeyIds` and `Filters` cannot be assigned at same time. IDs of key pairs can be obtained via log in the console(https://console.cloud.tencent.com/cvm/index)
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Obtain filter conditions
<li> project-id - Integer - required:  No | (Filter condition). Filter by project ID. You can obtain the project ID by querying the project ID via [Project List](https://console.cloud.tencent.com/project);or calling [DescribeProject](/document/api/378/4400) , and obtaining from the `projectId` field of the returned values of API.</li>
<li> key-name - String - Required: No - (Filter condition). Filter by key pair name.</li>`KeyIds` and `Filters` cannot be assigned at same time.
     * @return Filters filter conditions
<li> project-id - Integer - required:  No | (Filter condition). Filter by project ID. You can obtain the project ID by querying the project ID via [Project List](https://console.cloud.tencent.com/project);or calling [DescribeProject](/document/api/378/4400) , and obtaining from the `projectId` field of the returned values of API.</li>
<li> key-name - String - Required: No - (Filter condition). Filter by key pair name.</li>`KeyIds` and `Filters` cannot be assigned at same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions.
<li> project-id - Integer - required:  No | (Filter condition). Filter by project ID. You can obtain the project ID by querying the project ID via [Project List](https://console.cloud.tencent.com/project);or calling [DescribeProject](/document/api/378/4400) , and obtaining from the `projectId` field of the returned values of API.</li>
<li> key-name - String - Required: No - (Filter condition). Filter by key pair name.</li>`KeyIds` and `Filters` cannot be assigned at same time.
     * @param Filters filter condtions
<li> project-id - Integer - required:  No | (Filter condition). Filter by project ID. You can obtain the project ID by querying the project ID via [Project List](https://console.cloud.tencent.com/project);or calling [DescribeProject](/document/api/378/4400) , and obtaining from the `projectId` field of the returned values of API.</li>
<li> key-name - String - Required: No - (Filter condition). Filter by key pair name.</li>`KeyIds` and `Filters` cannot be assigned at same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Obtain Offset, default is 0. please see API[introduction]  For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). Number of returned results, default is 20, and maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview (https://cloud.tencent.com/document/api/213/15688). 
     * @return Offset Offset, default is 0. please see API[introduction]  For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). Number of returned results, default is 20, and maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview (https://cloud.tencent.com/document/api/213/15688). 
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, default is 0. please see API[introduction]  For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). Number of returned results, default is 20, and maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview (https://cloud.tencent.com/document/api/213/15688). 
     * @param Offset Offset, default is 0. please see API[introduction]  For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). Number of returned results, default is 20, and maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview (https://cloud.tencent.com/document/api/213/15688).
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * Obtain number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @return Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @param Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

