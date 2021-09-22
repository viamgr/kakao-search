/*
 * Designed and developed by 2021 beomjo
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

package io.github.beomjo.search.usecase

import io.github.beomjo.search.entity.Empty
import io.github.beomjo.search.entity.History
import io.github.beomjo.search.repository.SearchRepository
import io.github.beomjo.search.usecase.base.FlowUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSearchHistoryList @Inject constructor(
    private val searchRepository: SearchRepository
) : FlowUseCase<Empty, List<History>>() {
    override fun execute(param: Empty): Flow<List<History>> {
        return searchRepository.getSearchHistoryList()
    }
}