#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.system.manage;

import ${package}.system.entity.SysJobDo;
import com.easy.archetype.data.manage.IManage;

/**
 * <p>
 * 定时任务调度表 manage
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
public interface ISysJobManage extends IManage<SysJobDo> {

}
