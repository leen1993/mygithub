package com.rekj.core.util;

import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.ConfigAttribute;

/**
 * 安全管理工具集
 * 
 * @author jack
 * @date 2017年5月11日 下午4:14:11
 */
public class SecurityUtil {
	protected static Logger logger = LoggerFactory.getLogger(SecurityUtil.class);

	public static class FunctionRights {
		private boolean hasFunction = false;

		private Collection<ConfigAttribute> roles = new ArrayList();

		public FunctionRights(boolean hasFunction, Collection<ConfigAttribute> roles) {
			this.hasFunction = hasFunction;
			this.roles = roles;
		}

		public boolean isHasFunction() {
			return this.hasFunction;
		}

		public void setHasFunction(boolean hasFunction) {
			this.hasFunction = hasFunction;
		}

		public Collection<ConfigAttribute> getRoles() {
			return this.roles;
		}

		public void setRoles(Collection<ConfigAttribute> roles) {
			this.roles = roles;
		}
	}
}

// public static boolean hasFuncPermission(String roleId, String function) {
// FunctionRights functionRights = getFuncRoleList(roleId, function);
// SysUser currentUser = ContextUtil.getCurrentUser();
// if (currentUser.getAuthorities().contains(SysRole.ROLE_GRANT_SUPER)) {
// return true;
// }
//
// if (!functionRights.isHasFunction()) {
// return true;
// }
//
// Collection functionRole = functionRights.getRoles();
// if (functionRole.size() == 0) {
// return false;
// }
//
// for (GrantedAuthority hadRole : currentUser.getAuthorities()) {
// if (functionRole.contains(new SecurityConfig(hadRole.getAuthority()))) {
// return true;
// }
// }
// return false;
// }

// private static FunctionRights getFuncRoleList(String sysAlias, String
// function) {
// SysRoleService sysRoleService = (SysRoleService)
// AppUtil.getBean(SysRoleService.class);
// List<SysResourceUrlExt> funcRoleList =
// sysRoleService.getFunctionRoleList(sysAlias, function);
// boolean hasFunction = false;
// if (funcRoleList.size() > 0) {
// hasFunction = true;
// }
//
// Collection<ConfigAttribute> collectoin = new HashSet();
// for (SysResourceUrlExt table : funcRoleList) {
// String role = table.getRole();
// if (!StringUtil.isEmpty(role))
// collectoin.add(new SecurityConfig(role));
// }
// return new FunctionRights(hasFunction, collectoin);
// }
