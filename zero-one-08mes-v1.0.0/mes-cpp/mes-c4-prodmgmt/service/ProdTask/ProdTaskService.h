#pragma once
/*
 Copyright Zero One Star. All rights reserved.

 @Author: awei
 @Date: 2022/10/25 11:08:56

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

	  https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
#ifndef _ProdTask_SERVICE_
#define _ProdTask_SERVICE_
#include <list>
#include "domain/vo/ProdTask/ProdTaskVO.h"
#include "domain/dto/ProdTask/ProdTaskDTO.h"

/**
 * 示例服务实现，演示基础的示例服务实现
 */
class ProdTaskService
{
public:
	// 修改数据
	bool updateData(const ProdTaskModifyDTO::Wrapper& dto);
	// 通过ID删除数据
	bool removeData(uint64_t id);
};

#endif // !_ProdTask_SERVICE_

