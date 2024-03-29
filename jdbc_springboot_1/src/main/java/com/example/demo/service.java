package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class service {
@Autowired
JdbcTemplate jt;

int insert(pojo o) {
	int id=o.getId();
	String name=o.getName();
	String branch=o.getBranch();
	String sql="insert into clginfo values(?,?,?)";
	return jt.update(sql,name,branch,id);
}

int delete(pojo o) {
	int id=o.getId();
	String name=o.getName();
	String branch=o.getBranch();
	String sql="delete from clginfo where branch=?";
	return jt.update(sql,branch);
}

}
