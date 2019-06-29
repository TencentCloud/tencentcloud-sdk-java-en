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

public class DescribeInstanceTypeConfigsRequest  extends AbstractModel{

    /**
    * Filter conditions
<li> zone - String - Required: No - (Filter criteria) Filter by [availability zone](https://cloud.tencent.com/document/api/213/9452#zone).</li>
<li> instance-family - String - Required: No - (Filter criteria) Filter by instance model series, such as: `S1`, `I1`, `M1`, etc.</li>
the upper limit of `Filters` and `Filter.Values` of each request are 10 and 1 respectively
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Obtain filter conditions
<li> zone - String - Required: No - (Filter criteria) Filter by [availability zone](https://cloud.tencent.com/document/api/213/9452#zone).</li>
<li> instance-family - String - Required: No - (Filter criteria) Filter by instance model series, such as: `S1`, `I1`, `M1`, etc.</li>
the upper limit of `Filters` and `Filter.Values` of each request are 10 and 1 respectively
     * @return Filters filter conditions
<li> zone - String - Required: No - (Filter criteria) Filter by [availability zone](https://cloud.tencent.com/document/api/213/9452#zone).</li>
<li> instance-family - String - Required: No - (Filter criteria) Filter by instance model series, such as: `S1`, `I1`, `M1`, etc.</li>
the upper limit of `Filters` and `Filter.Values` of each request are 10 and 1 respectively
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions
<li> zone - String - Required: No - (Filter criteria) Filter by [availability zone](https://cloud.tencent.com/document/api/213/9452#zone).</li>
<li> instance-family - String - Required: No - (Filter criteria) Filter by instance model series, such as: `S1`, `I1`, `M1`, etc.</li>
the upper limit of `Filters` and `Filter.Values` of each request are 10 and 1 respectively
     * @param Filters filter conditions
<li> zone - String - Required: No - (Filter criteria) Filter by [availability zone](https://cloud.tencent.com/document/api/213/9452#zone).</li>
<li> instance-family - String - Required: No - (Filter criteria) Filter by instance model series, such as: `S1`, `I1`, `M1`, etc.</li>
the upper limit of `Filters` and `Filter.Values` of each request are 10 and 1 respectively
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

