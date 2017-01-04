/*
 * Copyright (C) 2016-Present Pivotal Software, Inc. All rights reserved.
 *
 * This program and the accompanying materials are made available under
 *
 * the terms of the under the Apache License, Version 2.0 (the "License”);
 *
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 *
 * limitations under the License.
 */

package io.pivotal.cloud.hive

import org.springframework.cloud.service.ServiceInfo
import org.springframework.cloud.service.common.RelationalServiceInfo

@ServiceInfo.ServiceLabel("hive")
open class HiveServiceInfo(id: String, url: String) : RelationalServiceInfo(id, url, null, HIVE_SCHEME) {

    companion object {
        val HIVE_SCHEME = "hive2"
    }
}
