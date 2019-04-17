package cn.hwd.es.bean;

import io.searchbox.annotations.JestId;

import java.util.Date;

public class User {

	@JestId
    private Integer id;
    private String name;
    private Date birth;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public User(Integer id, String name, Date birth) {
		this.id = id;
		this.name = name;
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birth=" + birth + "]";
	}
	
}
