package com.pkg.equal.hashcode;

public class Department {

	private String deptId;
	private String deptRegDate;

	public Department(String deptId, String deptRegDate) {
		this.deptId = deptId;
		this.deptRegDate = deptRegDate;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getdeptRegDate() {
		return deptRegDate;
	}

	public void setdeptRegDate(String deptRegDate) {
		this.deptRegDate = deptRegDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
		result = prime * result + ((deptRegDate == null) ? 0 : deptRegDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		if (deptRegDate == null) {
			if (other.deptRegDate != null)
				return false;
		} else if (!deptRegDate.equals(other.deptRegDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptRegDate=" + deptRegDate + "]";
	}

}
