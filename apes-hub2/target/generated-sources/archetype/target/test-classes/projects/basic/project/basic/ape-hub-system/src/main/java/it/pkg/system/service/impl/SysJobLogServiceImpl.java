package it.pkg.system.service.impl;

import it.pkg.system.manage.ISysJobLogManage;
import it.pkg.system.service.ISysJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务调度日志表 serviceImpl
 * </p>
 *
 * @author luyanan
 * @since 2021-02-03
 */
@Service
public class SysJobLogServiceImpl implements ISysJobLogService {

	@Autowired
	private ISysJobLogManage iSysJobLogManage;

}
