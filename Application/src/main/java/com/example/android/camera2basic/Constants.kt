/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:JvmName("Constants")

package com.example.android.camera2basic

import java.text.DateFormat
import java.text.DateFormatSymbols
import java.util.*
import java.text.SimpleDateFormat






@JvmField val REQUEST_CAMERA_PERMISSION = 1

var df: DateFormat = SimpleDateFormat("MM/dd/yyyy HH:mm:ss")


// Get the date today using Calendar object.
var today = Calendar.getInstance().time
// this should be in another class
// https://stackoverflow.com/a/12995255/1435712
var reportDate = df.format(today)
@JvmField val timeStamp = DateFormat.getTimeInstance(DateFormat.LONG, Locale.US).format(Date())
@JvmField val PIC_FILE_NAME ="_" + timeStamp + "_.jpg"
