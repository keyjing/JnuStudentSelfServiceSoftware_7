package com.jnu.model;

import java.io.Serializable;

public class NoticeContainer implements Serializable{
	private String _title;
	private String _date;
	private String _href;
	String publishingSource;
	
	
	public String getTitle() {
		return _title;
	}
	public void setTitle(String _title) {
		this._title = _title;
	}
	public String getDate() {
		return _date;
	}
	public void setDate(String _date) {
		this._date = _date;
	}
	public String getHref() {
		return _href;
	}
	public void setHref(String _href) {
		this._href = _href;
	}
	public String getPublishingSource() {
		return publishingSource;
	}
	public void setPublishingSource(String publishingSource) {
		this.publishingSource = publishingSource;
	}
	

	
}
