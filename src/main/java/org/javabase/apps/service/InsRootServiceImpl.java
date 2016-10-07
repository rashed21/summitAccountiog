/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.InstallmentRoot;
import org.javabase.apps.entity.Role;
import org.javabase.apps.mapper.InstallmentRootMapper;
import org.javabase.apps.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class InsRootServiceImpl implements InsRootService {

	@Autowired
	InstallmentRootMapper installmentRootMapper;

	@Override
	@Transactional
	public void addInsRoot(InstallmentRoot installmentRoot) {
		installmentRootMapper.addInsRoot(installmentRoot);
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<InstallmentRoot> getInstallmentRoots() {
		return installmentRootMapper.getInstallmentRoots();
	}
	
	
}
