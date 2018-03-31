package org.springframework.cloud.stream.testing.source;

public class Bar {
	private int i = 1;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
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
		Bar other = (Bar) obj;
		if (i != other.i)
			return false;
		return true;
	}

	public Bar(int i) {
		super();
		this.i = i;
	}
	
	
}
