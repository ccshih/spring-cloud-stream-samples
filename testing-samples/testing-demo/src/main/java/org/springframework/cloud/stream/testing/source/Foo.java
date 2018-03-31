package org.springframework.cloud.stream.testing.source;

public class Foo {
	private String x = "x";

	public String getX() {
		return x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
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
		Foo other = (Foo) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		return true;
	}

	public void setX(String x) {
		this.x = x;
	}

	public Foo(String x) {
		super();
		this.x = x;
	}
	
	
			
}
