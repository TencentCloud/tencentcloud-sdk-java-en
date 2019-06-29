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

public class AttachEntityOfPolicy  extends AbstractModel{

    /**
    * Entity ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Entity NameNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Entity UINNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Type of entity association. 1 Associate by Users ； 2 Associate by User Groups
    */
    @SerializedName("RelatedType")
    @Expose
    private Long RelatedType;

    /**
     * Getting Entity ID
     * @return Id Entity ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Configuring Entity ID
     * @param Id Entity ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Getting Entity NameNote: This field may return null, indicating that no valid value was found.
     * @return Name: Entity NameNote: This field may return null, indicating that no valid value was found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Configuring Entity Name Note: This field may return null, indicating that no valid value was found.
     * @param Name Entity NameNote: This field may return null, indicating that no valid value was found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Getting Entity UINNote: This field may return null, indicating that no valid value was found.
     * @return Uin Entity UINNote: This field may return null, indicating that no valid value was found.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Configuring Entity UINNote: This field may return null, indicating that no valid value was found.
     * @param Uin Entity UINNote: This field may return null, indicating that no valid value was found.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Getting Type of Entity Association
     * @return RelatedType Type of entity association. 1 Associate by Users; 2 Associate by User Groups
     */
    public Long getRelatedType() {
        return this.RelatedType;
    }

    /**
     * Configuring type of entity association. 1 Associate by Users; 2 Associate by User Groups
     * @param RelatedType Type of entity association. 1 Associate by Users; 2 Associate by User Groups
     */
    public void setRelatedType(Long RelatedType) {
        this.RelatedType = RelatedType;
    }

    /**
     * For internal use only. 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RelatedType", this.RelatedType);

    }
}

