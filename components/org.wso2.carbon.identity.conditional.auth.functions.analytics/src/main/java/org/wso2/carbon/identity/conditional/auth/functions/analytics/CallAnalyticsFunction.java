/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.identity.conditional.auth.functions.analytics;

import java.util.Map;
import java.util.function.Consumer;

/**
 * Function to publish events to analytics engine and get the output event synchronously.
 */
@FunctionalInterface
public interface CallAnalyticsFunction {

    /**
     *  Publish data to analytics engine and get the decision.
     *
     * @param metadata Metadata to call the endpoint.
     * @param payloadData payload data.
     * @param eventHandlers event handlers.
     */
    void callAnalytics(Map<String, String> metadata, Map<String, Object> payloadData,
                       Map<String, Object> eventHandlers);
}
