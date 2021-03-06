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
/*
 * Declarations for global variables expected by JS
 *
 */
#ifndef __SJS_GLOBALS
#define __SJS_GLOBALS

#include<runtime.h>
#include<math.h>

// boxed
extern value_t* console;

extern value_t* Math;

extern value_t* Number;

extern value_t* Infinity;

extern value_t* __object_proto;

extern value_t* String;

#endif // __SJS_GLOBALS
