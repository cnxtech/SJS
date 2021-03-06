/* 
 * Copyright 2014-2016 Samsung Research America, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Name of intrinsic function
 *
 * @author colin.gordon
 */
package com.samsung.sjs.backend.asts.ir;

public class IntrinsicName extends Expression {
    String name;
    public IntrinsicName(String s) {
        super(Tag.IntrinsicName);
        name = s;
    }
    @Override public String toString() { return name; }
    public String getIdentifier() { return name; }
    @Override
    public String toSource(int x) { return name; }
    @Override
    public <R> R accept(IRVisitor<R> v) {
        return v.visitIntrinsicName(this);
    }
}
