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

public class DescribeZoneInstanceConfigInfosRequest  extends AbstractModel{

    /**
    * Filter conditions.

<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>

<li> instance-family - String - Required: No - (Filter condition) Filter by instance family, such as: S1, I1, M1, etc.</li>

<li> instance-type - String - Required: No - (Filter condition) Filter by instance type. Instance type comprise varying combinations of CPU, memory and networking capacity, you can use DescribeInstanceTypeConfigs to retrieve latest configurations or refer to description of instance type. If this parameter is not specified, instance type S1.SMALL1 will be used.</li>

<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charge type. (PREPAID: monthly subscription, | POSTPAID_BY_HOUR: pay as you go | CDHPAID: Pay for dedicated host where CVM instance deployed.)  </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get filter conditions.  

<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>

<li> instance-family - String - Required: No - (Filter condition) Filter by instance family, such as: S1, I1, M1, etc.</li>

<li> instance-type - String - Required: No - (Filter condition) Filter by instance type. Instance type comprise varying combinations of CPU, memory and networking capacity, you can use DescribeInstanceTypeConfigs to retrieve latest configurations or refer to description of instance type. If this parameter is not specified, instance type S1.SMALL1 will be used.</li>

<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charge type. (PREPAID: monthly subscription, | POSTPAID_BY_HOUR: pay as you go | CDHPAID: Pay for dedicated host where CVM instance deployed.)  </li>
     * @return Filters Filter Conditions

<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>

<li> instance-family - String - Required: No - (Filter condition) Filter by instance family, such as: S1, I1, M1, etc.</li>

<li> instance-type - String - Required: No - (Filter condition) Filter by instance type. Instance type comprise varying combinations of CPU, memory and networking capacity, you can use DescribeInstanceTypeConfigs to retrieve latest configurations or refer to description of instance type. If this parameter is not specified, instance type S1.SMALL1 will be used.</li>

<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charge type. (PREPAID: monthly subscription, | POSTPAID_BY_HOUR: pay as you go | CDHPAID: Pay for dedicated host where CVM instance deployed.)  </li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions

<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>

<li> instance-family - String - Required: No - (Filter condition) Filter by instance family, such as: S1, I1, M1, etc.</li>

<li> instance-type - String - Required: No - (Filter condition) Filter by instance type. Instance type comprise varying combinations of CPU, memory and networking capacity, you can use DescribeInstanceTypeConfigs to retrieve latest configurations or refer to description of instance type. If this parameter is not specified, instance type S1.SMALL1 will be used.</li>

<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charge type. (PREPAID: monthly subscription, | POSTPAID_BY_HOUR: pay as you go | CDHPAID: Pay for dedicated host where CVM instance deployed.)  </li>
     * @param Filters Filter conditions.

<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>

<li> instance-family - String - Required: No - (Filter condition) Filter by instance family, such as: S1, I1, M1, etc.</li>

<li> instance-type - String - Required: No - (Filter condition) Filter by instance type. Instance type comprise varying combinations of CPU, memory and networking capacity, you can use DescribeInstanceTypeConfigs to retrieve latest configurations or refer to description of instance type. If this parameter is not specified, instance type S1.SMALL1 will be used.</li>

<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charge type. (PREPAID: monthly subscription, | POSTPAID_BY_HOUR: pay as you go | CDHPAID: Pay for dedicated host where CVM instance deployed.)  </li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

