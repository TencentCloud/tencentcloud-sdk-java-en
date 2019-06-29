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

public class LoginSettings  extends AbstractModel{

    /**
    * Login password of the instance. The rule of password complexity varies with different operating systems:<br><li>Linux instance's password should be a combination of 8-16 characters comprised of at least two of the following types: letters [a-z, A-Z], numbers [0-9], and special symbols [( ) ` ~ ! @ # $ % ^ & * - + =  { } [ ] : ; ' , . ? / ].<br><li>The password for a Windows instance should be a combination of 12-16 characters comprised of at least three of the following types: [a-z], [A-Z], [0-9] and [( ) ` ~ ! @ # $ % ^ & * - + = { } [ ] : ; ' , . ? / ].<br><br>If this parameter is not specified, a password is randomly generated and sent to you via the internal message. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * List of key IDs. An instance associated with the key can be accessed using the corresponding private key. KeyId can be obtained via the API DescribeKeyPairs. A key and a password cannot be specified at the same time, and specifying the key is not supported in Windows. You can specify only one key when purchasing an instance.
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * Indicates whether to keep the original settings for an image. You cannot specify this parameter if Password or KeyIds.N is specified. You can specify this parameter to TRUE only when you create an instance using a custom image, shared image, or image imported from external resources. Value range:<br><li>TRUE: Keep the login settings for the image<br><li>FALSE: Do not keep the login settings for the image<br><br>Default: FALSE. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("KeepImageLogin")
    @Expose
    private Boolean KeepImageLogin;

    /**
     * Obtain a instance’s login password: password complexity requirement varies with different operating systems, as shown below:<br><li>Linux instance's password should be a combination of 8-16 characters comprised of at least two of the following types: letters [a-z, A-Z], numbers [0-9], and special symbols [( ) ` ~ ! @ # $ % ^ & * - + =  { } [ ] : ; ' , . ? / ].<br><li>The password for a Windows instance should be a combination of 12-16 characters comprised of at least three of the following types: [a-z], [A-Z], [0-9] and [( ) ` ~ ! @ # $ % ^ & * - + = { } [ ] : ; ' , . ? / ].<br><br>If this parameter is not specified, a password is randomly generated and sent to you via the internal message. Note: This field may return null, indicating that no valid value was found.
     * @return Password Login password of the instance. The rule of password complexity varies with different operating systems:<br><li>Linux instance's password should be a combination of 8-16 characters comprised of at least two of the following types: letters [a-z, A-Z], numbers [0-9], and special symbols [( ) ` ~ ! @ # $ % ^ & * - + =  { } [ ] : ; ' , . ? / ].<br><li>The password for a Windows instance should be a combination of 12-16 characters comprised of at least three of the following types: [a-z], [A-Z], [0-9] and [( ) ` ~ ! @ # $ % ^ & * - + = { } [ ] : ; ' , . ? / ].<br><br>If this parameter is not specified, a password is randomly generated and sent to you via the internal message. Note: This field may return null, indicating that no valid value was found.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Configure a instance’s login password: password complexity requirement varies with different operating systems, as shown below:<br><li>Linux instance's password should be a combination of 8-16 characters comprised of at least two of the following types: letters [a-z, A-Z], numbers [0-9], and special symbols [( ) ` ~ ! @ # $ % ^ & * - + =  { } [ ] : ; ' , . ? / ].<br><li>The password for a Windows instance should be a combination of 12-16 characters comprised of at least three of the following types: [a-z], [A-Z], [0-9] and [( ) ` ~ ! @ # $ % ^ & * - + = { } [ ] : ; ' , . ? / ].<br><br>If this parameter is not specified, a password is randomly generated and sent to you via the internal message. Note: This field may return null, indicating that no valid value was found.
     * @param Password Login password of the instance. The rule of password complexity varies with different operating systems:<br><li>Linux instance's password should be a combination of 8-16 characters comprised of at least two of the following types: letters [a-z, A-Z], numbers [0-9], and special symbols [( ) ` ~ ! @ # $ % ^ & * - + =  { } [ ] : ; ' , . ? / ].<br><li>The password for a Windows instance should be a combination of 12-16 characters comprised of at least three of the following types: [a-z], [A-Z], [0-9] and [( ) ` ~ ! @ # $ % ^ & * - + = { } [ ] : ; ' , . ? / ].<br><br>If this parameter is not specified, a password is randomly generated and sent to you via the internal message. Note: This field may return null, indicating that no valid value was found.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Obtain the list of key IDs. An instance associated with the key can be accessed using the corresponding private key. KeyId can be obtained via the API DescribeKeyPairs. A key and a password cannot be specified at the same time, and specifying the key is not supported in Windows. You can specify only one key when purchasing an instance.
     * @return KeyIds List of key IDs. An instance associated with the key can be accessed using the corresponding private key. KeyId can be obtained via the API DescribeKeyPairs. A key and a password cannot be specified at the same time, and specifying the key is not supported in Windows. You can specify only one key when purchasing an instance.
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Configure the list of key IDs. An instance associated with the key can be accessed using the corresponding private key. KeyId can be obtained via the API DescribeKeyPairs. A key and a password cannot be specified at the same time, and specifying the key is not supported in Windows. You can specify only one key when purchasing an instance.
     * @param KeyIds List of key IDs. An instance associated with the key can be accessed using the corresponding private key. KeyId can be obtained via the API DescribeKeyPairs. A key and a password cannot be specified at the same time, and specifying the key is not supported in Windows. You can specify only one key when purchasing an instance.
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Obtain whether to keep the original settings for an image. You cannot specify this parameter if Password or KeyIds.N is specified. You can specify this parameter to TRUE only when you create an instance using a custom image, shared image, or image imported from external resources. Value range:<br><li>TRUE: Keep the login settings for the image<br><li>FALSE: Do not keep the login settings for the image<br><br>Default: FALSE. Note: This field may return null, indicating that no valid value was found.
     * @return KeepImageLogin Indicates whether to keep the original settings for an image. You cannot specify this parameter if Password or KeyIds.N is specified. You can specify this parameter to TRUE only when you create an instance using a custom image, shared image, or image imported from external resources. Value range:<br><li>TRUE: Keep the login settings for the image<br><li>FALSE: Do not keep the login settings for the image<br><br>Default: FALSE. Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getKeepImageLogin() {
        return this.KeepImageLogin;
    }

    /**
     * Configure whether to keep the original settings for an image. You cannot specify this parameter if Password or KeyIds.N is specified. You can specify this parameter to TRUE only when you create an instance using a custom image, shared image, or image imported from external resources. Value range:<br><li>TRUE: Keep the login settings for the image<br><li>FALSE: Do not keep the login settings for the image<br><br>Default: FALSE. Note: This field may return null, indicating that no valid value was found.
     * @param KeepImageLogin Indicates whether to keep the original settings for an image. You cannot specify this parameter if Password or KeyIds.N is specified. You can specify this parameter to TRUE only when you create an instance using a custom image, shared image, or image imported from external resources. Value range:<br><li>TRUE: Keep the login settings for the image<br><li>FALSE: Do not keep the login settings for the image<br><br>Default: FALSE. Note: This field may return null, indicating that no valid value was found.
     */
    public void setKeepImageLogin(Boolean KeepImageLogin) {
        this.KeepImageLogin = KeepImageLogin;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "KeepImageLogin", this.KeepImageLogin);

    }
}

