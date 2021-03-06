/*
 * Copyright 2015-2019 The twitlatte authors
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

package com.github.moko256.twitlatte.viewmodel

import androidx.lifecycle.ViewModel
import com.github.moko256.twitlatte.model.base.ListModel
import com.github.moko256.twitlatte.model.base.StatusActionModel

/**
 * Created by moko256 on 2018/07/13.
 *
 * @author moko256
 */
class ListViewModel : ViewModel() {
    var initialized: Boolean = false

    lateinit var listModel: ListModel
    lateinit var statusActionModel: StatusActionModel

    fun start() {
        initialized = true
    }

    override fun onCleared() {
        listModel.close()
    }

}