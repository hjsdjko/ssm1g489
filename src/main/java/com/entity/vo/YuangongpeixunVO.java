package com.entity.vo;

import com.entity.YuangongpeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工培训
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 17:21:57
 */
public class YuangongpeixunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 周期
	 */
	
	private String zhouqi;
		
	/**
	 * 讲师
	 */
	
	private String jiangshi;
		
	/**
	 * 课程
	 */
	
	private String kecheng;
		
	/**
	 * 教学反馈
	 */
	
	private String jiaoxuefankui;
				
	
	/**
	 * 设置：周期
	 */
	 
	public void setZhouqi(String zhouqi) {
		this.zhouqi = zhouqi;
	}
	
	/**
	 * 获取：周期
	 */
	public String getZhouqi() {
		return zhouqi;
	}
				
	
	/**
	 * 设置：讲师
	 */
	 
	public void setJiangshi(String jiangshi) {
		this.jiangshi = jiangshi;
	}
	
	/**
	 * 获取：讲师
	 */
	public String getJiangshi() {
		return jiangshi;
	}
				
	
	/**
	 * 设置：课程
	 */
	 
	public void setKecheng(String kecheng) {
		this.kecheng = kecheng;
	}
	
	/**
	 * 获取：课程
	 */
	public String getKecheng() {
		return kecheng;
	}
				
	
	/**
	 * 设置：教学反馈
	 */
	 
	public void setJiaoxuefankui(String jiaoxuefankui) {
		this.jiaoxuefankui = jiaoxuefankui;
	}
	
	/**
	 * 获取：教学反馈
	 */
	public String getJiaoxuefankui() {
		return jiaoxuefankui;
	}
			
}
