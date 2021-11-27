package com.project.gridbackend.model;

import java.util.List;

public class ListResponse<T> {
	Integer page;
	Integer perPage;
	Integer totalItems;
	Integer totalPages;
	String by;
	boolean asc;
	List<T> payload;

	public ListResponse() {
	}

	public ListResponse(Integer page, Integer perPage, Integer totalItems, Integer totalPages, String by, boolean asc, List<T> payload) {
		this.page = page;
		this.perPage = perPage;
		this.totalItems = totalItems;
		this.totalPages = totalPages;
		this.by = by;
		this.asc = asc;
		this.payload = payload;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPerPage() {
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
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

	public List<T> getPayload() {
		return payload;
	}

	public void setPayload(List<T> payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "ListResponse{" +
				"page=" + page +
				", perPage=" + perPage +
				", totalItems=" + totalItems +
				", totalPages=" + totalPages +
				", by='" + by + '\'' +
				", asc=" + asc +
				", payload=" + payload +
				'}';
	}
}
