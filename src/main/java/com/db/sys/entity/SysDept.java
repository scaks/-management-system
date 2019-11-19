package com.db.sys.entity;
import java.io.Serializable;
import java.util.Date;
public class SysDept implements Serializable{
	private static final long serialVersionUID = -5259265803332215029L;
    /**部门id*/
    private Integer id;
    /**部门名称*/
    private String name;
    /**排序(序号)*/
    private Integer sort;
    /**备注*/
    private String note;
    /**上级部门id*/
    private Integer parentId;
    /**创建用户*/
    private String createdUser;
    /**修改用户*/
    private String modifiedUser;
    /**创建时间*/
    private Date createdTime;
    /**修改时间*/
    private Date modifiedTime;

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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
}
