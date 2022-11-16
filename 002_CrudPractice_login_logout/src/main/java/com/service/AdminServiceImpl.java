package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.model.Admin;
import com.model.Student;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;
	

}
