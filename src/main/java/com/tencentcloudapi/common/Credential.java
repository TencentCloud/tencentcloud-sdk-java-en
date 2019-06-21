/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common;

public class Credential {
	
	/**
	 * You can create or retrieve it from Tencent Cloud Management Console, Access Management product.
	 */
	private String secretId;
	
	/**
	 * You can create or retrieve it from Tencent Cloud Management Console, Access Management product.
	 */
	private String secretKey;
	
	/**
	 * Temporary token, should be used along with temporary secret id and secret key.
	 */
	private String token;
	
	public Credential(String secretId, String secretKey) {
		this(secretId, secretKey, "");
	}
	
	public Credential(String secretId, String secretKey, String token) {
		this.secretId = secretId;
		this.secretKey = secretKey;
		this.token = token;
	}
	
	public void setSecretId(String secretId) {
		this.secretId = secretId;
	}
	
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getSecretId() {
		return this.secretId;
	}
	
	public String getSecretKey() {
		return this.secretKey;
	}
	
	public String getToken() {
		return this.token;
	}
}
