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

public class DescribeLaunchConfigurationsRequest  extends AbstractModel{

    /**
    * ID(s) of the launch configuration(s) to be queried, such as `asc-ouy1ax38`. A maximum of 100 launch configurations can be queried at one time.You cannot specify both `LaunchConfigurationIds` and `Filters`.
    */
    @SerializedName("LaunchConfigurationIds")
    @Expose
    private String [] LaunchConfigurationIds;

    /**
    * Filter conditions.
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> launch-configuration-name - String - Required: No - (Filter condition) Filter by launch configuration name.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LaunchConfigurationIds` and `Filters`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688).
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * Obtain ID(s) of the launch configuration(s) to be queried, such as `asc-ouy1ax38`. A maximum of 100 launch configurations can be queried at one time.You cannot specify both `LaunchConfigurationIds` and `Filters`.
     * @return LaunchConfigurationIds ID(s) of the launch configuration(s) to be queried, such as `asc-ouy1ax38`. A maximum of 100 launch configurations can be queried at one time. You cannot specify both `LaunchConfigurationIds` and `Filters`.
     */
    public String [] getLaunchConfigurationIds() {
        return this.LaunchConfigurationIds;
    }

    /**
     * Set ID(s) of the launch configuration(s) to be queried, such as `asc-ouy1ax38`. A maximum of 100 launch configurations can be queried at one time. You cannot specify both `LaunchConfigurationIds` and `Filters`.
     * @param LaunchConfigurationIds ID(s) of the launch configuration(s) to be queried, such as `asc-ouy1ax38`. A maximum of 100 launch configurations can be queried at one time. You cannot specify both `LaunchConfigurationIds` and `Filters`.
     */
    public void setLaunchConfigurationIds(String [] LaunchConfigurationIds) {
        this.LaunchConfigurationIds = LaunchConfigurationIds;
    }

    /**
     * Obtain filter conditions.
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> launch-configuration-name - String - Required: No - (Filter condition) Filter by launch configuration name.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LaunchConfigurationIds` and `Filters`.
     * @return Filters Filter conditions.
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> launch-configuration-name - String - Required: No - (Filter condition) Filter by launch configuration name.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LaunchConfigurationIds` and `Filters`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions.
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> launch-configuration-name - String - Required: No - (Filter condition) Filter by launch configuration name.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LaunchConfigurationIds` and `Filters`.
     * @param Filters Filter conditions.
<li> launch-configuration-id - String - Required: No - (Filter condition) Filter by launch configuration ID.</li>
<li> launch-configuration-name - String - Required: No - (Filter condition) Filter by launch configuration name.</li>
You can specify 10 `Filters` and 5 `Filter.Values` in one request. You cannot specify both `LaunchConfigurationIds` and `Filters`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Obtain number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on `Limit`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Obtain offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @return Offset Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     * @param Offset Offset. Default is 0. For more information on `Offset`, see the relevant sections in API [Overview](https://intl.cloud.tencent.com/document/product/377).
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LaunchConfigurationIds.", this.LaunchConfigurationIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

