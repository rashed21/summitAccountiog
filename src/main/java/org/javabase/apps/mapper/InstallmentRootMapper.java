package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.InstallmentRoot;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface InstallmentRootMapper {
	
	void addInsRoot(InstallmentRoot installmentRoot);
	
	List<InstallmentRoot> getInstallmentRoots();

}
