#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage;

import com.easy.archetype.data.manage.IManage;
import ${package}.system.entity.SysRoleMenuDo;

import java.util.List;

/**
 * <p>
 * 角色和菜单关联表 manage
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
public interface ISysRoleMenuManage extends IManage<SysRoleMenuDo> {

	/**
	 * 根据角色id集合查询
	 * @param roleIds 角色id集合
	 * @return java.util.List<${package}.system.entity.SysRoleMenuDo>
	 * @since 2021/2/4
	 */
	List<SysRoleMenuDo> findRoleIds(List<Long> roleIds);

}
