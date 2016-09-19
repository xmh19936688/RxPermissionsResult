/*
 * Copyright 2016 Copyright 2016 Víctor Albertos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.victoralbertos.common.internal;

public class Request {
  private final String[] permissions;
  private OnResult onResult;

  public Request(String... permissions) {
    this.permissions = permissions;
  }

  public void setOnResult(OnResult onResult) {
    this.onResult = onResult;
  }

  public OnResult onResult() {
    return onResult;
  }

  public String[] permissions() {
    return permissions;
  }
}
