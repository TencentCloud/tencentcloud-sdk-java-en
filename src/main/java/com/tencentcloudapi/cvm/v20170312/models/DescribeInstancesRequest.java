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

public class DescribeInstancesRequest  extends AbstractModel{

    /**
    * query by one or more Instance IDs, such as：`ins-xxxxxxxx`。（the format of parameter refer to API[introduction](https://cloud.tencent.com/document/api/213/15688)）。the upper limit of instances IDs of each query is 100, `InstanceIds` and `Filters` cannot be assigned at same time
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter conditions
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - required：No -(Filter condition) Filter by Project ID.By calling [DescribeProject](https://cloud.tencent.com/document/api/378/4400) to enquire the created projects list or log in the console to get it (https://console.cloud.tencent.com/cvm/index)；creating new projects by calling [AddProject](https://cloud.tencent.com/document/api/378/4398)</li>
<li> host-id - String - required：No - (Filter condition) Filter by [CDH] ID(https://cloud.tencent.com/document/product/416) .[CDH](https://cloud.tencent.com/document/product/416) sample of ID：host-xxxxxxxx.</li>
<li> vpc-id - String - required：No - (Filter condition) Filter by ID of VPC, sample ofVPC ID：vpc-xxxxxxxx.</li>
<li> subnet-id - String - required：No - (Filter condition) Filter by ID of subnet, sample of Subnet ID：subnet-xxxxxxxx.</li>
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID, sample of instance ID: ins-xxxxxxxx.</li>
<li> security-group-id - String - Required: No - (Filter condition) Filter by Security Group ID，sample of security group ID : sg-8jlk3f3r.</li>
<li> instance-name - String - Required: No - (Filter condition) Filter by instance name.</li>
<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charging type (PREPAID：monthly or yearly payment in advance | POSTPAID_BY_HOUR：hourly payment | CDHPAID：[CDH] payment (https://cloud.tencent.com/document/product/416)，only charge the fee of [CDH](https://cloud.tencent.com/document/product/416)，no charge for CVMs running on [CDH](https://cloud.tencent.com/document/product/416) )  </li>
<li> private-ip-address - String - Required: No - (Filter condition) Filter by the private IP of the instance primary ENI.</li>
<li> public-ip-address - String - Required: No - (Filter condition) Filter by the public IP of the instance primary ENI, including the IP automatically assigned when an instance is being created and the EIP manually bound after the instance has been created.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - required：No - (Filter condition) Filter by tag-key. tag-key use specific tag-key as replacement, please refer to sample 2.</li>
The upper limit of each request of `Filters` is10，while `Filter.Values` is 5. `InstanceIds` and `Filters` cannot be assigned at same time.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset. Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * query by one or more Instance IDs, such as：`ins-xxxxxxxx`。（the format of parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)). the upper limit of instances IDs of each query is 100, `InstanceIds` and `Filters` cannot be assigned at same time
     * @return InstanceIds query by one or more Instance IDs, such as：`ins-xxxxxxxx`。（the format of parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)). the upper limit of instances IDs of each query is 100, `InstanceIds` and `Filters` cannot be assigned at same time
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set query by one or more Instance IDs, such as：`ins-xxxxxxxx`。（the format of parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)). the upper limit of instances IDs of each query is 100, `InstanceIds` and `Filters` cannot be assigned at same time
     * @param InstanceIds query by one or more Instance IDs, such as：`ins-xxxxxxxx`。（the format of parameter refer to API[introduction](chapter `id.N` in https://cloud.tencent.com/document/api/213/15688)). the upper limit of instances IDs of each query is 100, `InstanceIds` and `Filters` cannot be assigned at same time
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * obtain filter conditions
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - required：No -(Filter condition) Filter by Project ID.By calling [DescribeProject](https://cloud.tencent.com/document/api/378/4400) to enquire the created projects list or log in the console to get it (https://console.cloud.tencent.com/cvm/index)；creating new projects by calling [AddProject](https://cloud.tencent.com/document/api/378/4398)</li>
<li> host-id - String - required：No - (Filter condition) Filter by [CDH] ID(https://cloud.tencent.com/document/product/416) .[CDH](https://cloud.tencent.com/document/product/416) sample of ID：host-xxxxxxxx.</li>
<li> vpc-id - String - required：No - (Filter condition) Filter by ID of VPC, sample ofVPC ID：vpc-xxxxxxxx.</li>
<li> subnet-id - String - required：No - (Filter condition) Filter by ID of subnet, sample of Subnet ID：subnet-xxxxxxxx.</li>
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID, sample of instance ID: ins-xxxxxxxx.</li>
<li> security-group-id - String - Required: No - (Filter condition) Filter by Security Group ID，sample of security group ID : sg-8jlk3f3r.</li>
<li> instance-name - String - Required: No - (Filter condition) Filter by instance name.</li>
<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charging type (PREPAID：monthly or yearly payment in advance | POSTPAID_BY_HOUR：hourly payment | CDHPAID：[CDH] payment (https://cloud.tencent.com/document/product/416)，only charge the fee of [CDH](https://cloud.tencent.com/document/product/416)，no charge for CVMs running on [CDH](https://cloud.tencent.com/document/product/416) )  </li>
<li> private-ip-address - String - Required: No - (Filter condition) Filter by the private IP of the instance primary ENI.</li>
<li> public-ip-address - String - Required: No - (Filter condition) Filter by the public IP of the instance primary ENI, including the IP automatically assigned when an instance is being created and the EIP manually bound after the instance has been created.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - required：No - (Filter condition) Filter by tag-key. tag-key use specific tag-key as replacement, please refer to sample 2.</li>
The upper limit of each request of `Filters` is10，while `Filter.Values` is 5. `InstanceIds` and `Filters` cannot be assigned at same time.
     * @return Filters filter conditions.
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - required：No -(Filter condition) Filter by Project ID.By calling [DescribeProject](https://cloud.tencent.com/document/api/378/4400) to enquire the created projects list or log in the console to get it (https://console.cloud.tencent.com/cvm/index)；creating new projects by calling [AddProject](https://cloud.tencent.com/document/api/378/4398)</li>
<li> host-id - String - required：No - (Filter condition) Filter by [CDH] ID(https://cloud.tencent.com/document/product/416) .[CDH](https://cloud.tencent.com/document/product/416) sample of ID：host-xxxxxxxx.</li>
<li> vpc-id - String - required：No - (Filter condition) Filter by ID of VPC, sample ofVPC ID：vpc-xxxxxxxx.</li>
<li> subnet-id - String - required：No - (Filter condition) Filter by ID of subnet, sample of Subnet ID：subnet-xxxxxxxx.</li>
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID, sample of instance ID: ins-xxxxxxxx.</li>
<li> security-group-id - String - Required: No - (Filter condition) Filter by Security Group ID，sample of security group ID : sg-8jlk3f3r.</li>
<li> instance-name - String - Required: No - (Filter condition) Filter by instance name.</li>
<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charging type (PREPAID：monthly or yearly payment in advance | POSTPAID_BY_HOUR：hourly payment | CDHPAID：[CDH] payment (https://cloud.tencent.com/document/product/416)，only charge the fee of [CDH](https://cloud.tencent.com/document/product/416)，no charge for CVMs running on [CDH](https://cloud.tencent.com/document/product/416) )  </li>
<li> private-ip-address - String - Required: No - (Filter condition) Filter by the private IP of the instance primary ENI.</li>
<li> public-ip-address - String - Required: No - (Filter condition) Filter by the public IP of the instance primary ENI, including the IP automatically assigned when an instance is being created and the EIP manually bound after the instance has been created.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - required：No - (Filter condition) Filter by tag-key. tag-key use specific tag-key as replacement, please refer to sample 2.</li>
The upper limit of each request of `Filters` is10，while `Filter.Values` is 5. `InstanceIds` and `Filters` cannot be assigned at same time.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - required：No -(Filter condition) Filter by Project ID.By calling [DescribeProject](https://cloud.tencent.com/document/api/378/4400) to enquire the created projects list or log in the console to get it (https://console.cloud.tencent.com/cvm/index)；creating new projects by calling [AddProject](https://cloud.tencent.com/document/api/378/4398)</li>
<li> host-id - String - required：No - (Filter condition) Filter by [CDH] ID(https://cloud.tencent.com/document/product/416) .[CDH](https://cloud.tencent.com/document/product/416) sample of ID：host-xxxxxxxx.</li>
<li> vpc-id - String - required：No - (Filter condition) Filter by ID of VPC, sample ofVPC ID：vpc-xxxxxxxx.</li>
<li> subnet-id - String - required：No - (Filter condition) Filter by ID of subnet, sample of Subnet ID：subnet-xxxxxxxx.</li>
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID, sample of instance ID: ins-xxxxxxxx.</li>
<li> security-group-id - String - Required: No - (Filter condition) Filter by Security Group ID，sample of security group ID : sg-8jlk3f3r.</li>
<li> instance-name - String - Required: No - (Filter condition) Filter by instance name.</li>
<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charging type (PREPAID：monthly or yearly payment in advance | POSTPAID_BY_HOUR：hourly payment | CDHPAID：[CDH] payment (https://cloud.tencent.com/document/product/416)，only charge the fee of [CDH](https://cloud.tencent.com/document/product/416)，no charge for CVMs running on [CDH](https://cloud.tencent.com/document/product/416) )  </li>
<li> private-ip-address - String - Required: No - (Filter condition) Filter by the private IP of the instance primary ENI.</li>
<li> public-ip-address - String - Required: No - (Filter condition) Filter by the public IP of the instance primary ENI, including the IP automatically assigned when an instance is being created and the EIP manually bound after the instance has been created.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - required：No - (Filter condition) Filter by tag-key. tag-key use specific tag-key as replacement, please refer to sample 2.</li>
The upper limit of each request of `Filters` is10，while `Filter.Values` is 5. `InstanceIds` and `Filters` cannot be assigned at same time.
     * @param Filters filter conditions
<li> zone - String - Required: No - (Filter condition) Filter by availability zone.</li>
<li> project-id - Integer - required：No -(Filter condition) Filter by Project ID.By calling [DescribeProject](https://cloud.tencent.com/document/api/378/4400) to enquire the created projects list or log in the console to get it (https://console.cloud.tencent.com/cvm/index)；creating new projects by calling [AddProject](https://cloud.tencent.com/document/api/378/4398)</li>
<li> host-id - String - required：No - (Filter condition) Filter by [CDH] ID(https://cloud.tencent.com/document/product/416) .[CDH](https://cloud.tencent.com/document/product/416) sample of ID：host-xxxxxxxx.</li>
<li> vpc-id - String - required：No - (Filter condition) Filter by ID of VPC, sample ofVPC ID：vpc-xxxxxxxx.</li>
<li> subnet-id - String - required：No - (Filter condition) Filter by ID of subnet, sample of Subnet ID：subnet-xxxxxxxx.</li>
<li> instance-id - String - Required: No - (Filter condition) Filter by instance ID, sample of instance ID: ins-xxxxxxxx.</li>
<li> security-group-id - String - Required: No - (Filter condition) Filter by Security Group ID，sample of security group ID : sg-8jlk3f3r.</li>
<li> instance-name - String - Required: No - (Filter condition) Filter by instance name.</li>
<li> instance-charge-type - String - Required: No - (Filter condition) Filter by instance charging type (PREPAID：monthly or yearly payment in advance | POSTPAID_BY_HOUR：hourly payment | CDHPAID：[CDH] payment (https://cloud.tencent.com/document/product/416)，only charge the fee of [CDH](https://cloud.tencent.com/document/product/416)，no charge for CVMs running on [CDH](https://cloud.tencent.com/document/product/416) )  </li>
<li> private-ip-address - String - Required: No - (Filter condition) Filter by the private IP of the instance primary ENI.</li>
<li> public-ip-address - String - Required: No - (Filter condition) Filter by the public IP of the instance primary ENI, including the IP automatically assigned when an instance is being created and the EIP manually bound after the instance has been created.</li>
<li> tag-key - String - Required: No - (Filter condition) Filter by tag key.</li>
<li> tag-value - String - Required: No - (Filter condition) Filter by tag value.</li>
<li> tag:tag-key - String - required：No - (Filter condition) Filter by tag-key. tag-key use specific tag-key as replacement, please refer to sample 2.</li>
The upper limit of each request of `Filters` is10，while `Filter.Values` is 5. `InstanceIds` and `Filters` cannot be assigned at same time.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @return Offset Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @param Offset Default is 0. For more information on Offset, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     * @return Limit Number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set number of returned results. It defaults to 20. The maximum is 100. For more information on Limit, see the relevant sections in API [Overview](https://cloud.tencent.com/document/api/213/15688). |
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

