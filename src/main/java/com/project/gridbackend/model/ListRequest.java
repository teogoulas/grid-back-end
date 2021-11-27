package com.project.gridbackend.model;

public class ListRequest {
	Integer page;
	Integer rowsPerPage;
	String by;
	boolean asc;

	public ListRequest() {
		this.page = 1;
		this.rowsPerPage = 20;
		boolean asc = false;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRowsPerPage() {
		return rowsPerPage;
	}

	public void setRowsPerPage(Integer rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public boolean isAsc() {
		return asc;
	}

	public void setAsc(boolean asc) {
		this.asc = asc;
	}

	@Override
	public String toString() {
		return "ListRequest{" +
				"page=" + page +
				", rowsPerPage=" + rowsPerPage +
				", by='" + by + '\'' +
				", asc=" + asc +
				'}';
	}
}
