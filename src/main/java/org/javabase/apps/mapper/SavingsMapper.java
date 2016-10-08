package org.javabase.apps.mapper;

import java.util.List;

import org.javabase.apps.entity.Savings;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface SavingsMapper {
	
	List<Savings> getAllSavingss();
	Savings getSavingsById(int SavingsId);
	Savings getSavingsBySavingsname(String Savingsname);
    void addSavings(Savings Savings);
    void updateSavings(Savings Savings);
    void deleteSavings(int SavingsId);

}
