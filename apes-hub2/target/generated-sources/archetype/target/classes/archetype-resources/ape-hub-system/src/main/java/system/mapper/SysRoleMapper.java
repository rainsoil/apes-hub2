#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.mapper;

import com.easy.archetype.data.mybatisplus.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;
import ${package}.system.entity.SysRoleDo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色信息表 mapper
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Mapper
public interface SysRoleMapper extends BaseMapperPlus<SysRoleDo> {

	/**
	 * 根据用户id查询角色
	 * @param userId 用户id
	 * @return java.util.List<${package}.system.entity.SysRoleDo>
	 * @since 2021/2/4
	 */
	List<SysRoleDo> selectRolePermissionByUserId(@Param("userId") Long userId);

}
