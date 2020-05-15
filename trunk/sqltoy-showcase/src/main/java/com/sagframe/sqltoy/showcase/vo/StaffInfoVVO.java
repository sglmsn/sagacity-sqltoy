/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sagframe.sqltoy.showcase.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import java.time.LocalDate;
import java.sql.Blob;
import java.time.LocalDateTime;
import com.sagframe.sqltoy.showcase.vo.base.AbstractStaffInfoVVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_staff_info_v,Remark:VIEW 	
 */
@SqlToyEntity
public class StaffInfoVVO extends AbstractStaffInfoVVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2494726278000435171L;
	
	/** default constructor */
	public StaffInfoVVO() {
		super();
	}
	/**
     *@todo vo columns to String
     */
    @Override
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public StaffInfoVVO clone() {
		try {
			return (StaffInfoVVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}