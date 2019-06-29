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

public class ListAttachedGroupPoliciesRequest  extends AbstractModel{

    /**
    * User group ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private Long TargetGroupId;

    /**
    * Page number. Default value is 1; starting from 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Per page size. Default value is 20
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
     * Obtain user group ID
     * @return TargetGroupId user group ID
     */
    public Long getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set user group ID
     * @param TargetGroupId user group ID
     */
    public void setTargetGroupId(Long TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Obtain page number. Default value is 1; starting from 1
     * @return Page page number. Default value is 1; starting from 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set page number. Default value is 1; starting from 1
     * @param Page page number. Default value is 1; starting from 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Obtain each page size. Default value is 20
     * @return Rp each page size. Default value is 20
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set each page size. Default value is 20
     * @param Rp each page size. Default value is 20
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);

    }
}

