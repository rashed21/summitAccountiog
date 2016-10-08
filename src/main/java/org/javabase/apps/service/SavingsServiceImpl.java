package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.Savings;
import org.javabase.apps.mapper.SavingsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SavingsServiceImpl implements SavingsService {

	@Autowired
	SavingsMapper savingsMapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<Savings> getAllSavingss() {
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public Savings getSavingsById(int SavingsId) {
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public Savings getSavingsBySavingsname(String Savingsname) {
		return null;
	}

	@Override
	@Transactional
	public void addSavings(Savings Savings) {
		savingsMapper.addSavings(Savings);
	}

	@Override
	@Transactional
	public void updateSavings(Savings Savings) {

	}

	@Override
	@Transactional
	public void deleteSavings(int SavingsId) {

	}

}
