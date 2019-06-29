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

public class ListPoliciesRequest  extends AbstractModel{

    /**
    * Number of items on each page: must be greater than 0 and no greater than 200. The default is 20
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * Page number: start from 1 and less than 200. Default is 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Valid values: All, QCS, and Local. "All" means to all policies will be returned; "QCS" means only predefined policies will be returned; "Local" means only custom policies will be returned. "All" is the default value.
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * Filter by policy name.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Obtain the number of items on each page: must be greater than 0 and no greater than 200. The default is 20
     * @return Rp number of items on each page: must be greater than 0 and no greater than 200. The default is 20
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set the number of items on each page: must be greater than 0 and no greater than 200. The default is 20
     * @param Rp the number of items on each page: must be greater than 0 and no greater than 200. The default is 20
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Obtain page number, which starts from 1 and cannot be greater than 200. Default is 1
     * @return Page page number, which starts from 1 and cannot be greater than 200. Default is 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set page number, which starts from 1 and cannot be greater than 200. Default is 1
     * @param Page page number, which starts from 1 and cannot be greater than 200
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Obtain valid values: All, QCS, and Local. "All" means to all policies will be returned; "QCS" means only predefined policies will be returned; "Local" means only custom policies will be returned. "All" is the default value.
     * @return Scope valid values: All, QCS, and Local. "All" means to all policies will be returned; "QCS" means only predefined policies will be returned; "Local" means only custom policies will be returned. "All" is the default value.
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Configure valid values: All, QCS, and Local. "All" means to all policies will be returned; "QCS" means only predefined policies will be returned; "Local" means only custom policies will be returned. "All" is the default value.
     * @param Scope valid values: All, QCS, and Local. "All" means to all policies will be returned; "QCS" means only predefined policies will be returned; "Local" means only custom policies will be returned. "All" is the default value.
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Obtain filter by policy name
     * @return Keyword filter by policy name
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Configure filter by policy name
     * @param Keyword filter by policy name
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

