#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.easy.archetype.framework.page.PageInfo;
import com.easy.archetype.framework.page.PageRequestParams;
import com.easy.archetype.data.manage.impl.ManageImpl;
import ${package}.system.entity.SysUserDo;
import ${package}.system.manage.ISysUserManage;
import ${package}.system.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 manageImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysUserManageImpl extends ManageImpl<SysUserMapper, SysUserDo> implements ISysUserManage {

	@Override
	public PageInfo<SysUserDo> listByPage(PageRequestParams<SysUserDo> pageRequestParams) {

		IPage<SysUserDo> page = new Page<>(pageRequestParams.getPageNum(), pageRequestParams.getPageSize());
		page = this.baseMapper.listByPage(page, pageRequestParams.getParams());

		PageInfo<SysUserDo> pageInfo = new PageInfo<SysUserDo>(page.getRecords(), page.getTotal(), pageRequestParams);
		return pageInfo;
	}
}
