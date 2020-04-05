package com.ExpleoGroup.Staff.Entities;

import java.util.UUID;


public class Company {
	
	// Properties every company must have....
	private UUID id;
	private String name;
	
	// Optional properties are built with the Builder Design Pattern...

	private String location;
	private int totalResourcesCount;
	private int registerNo;
	
	private Company(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.location = builder.location;
		this.totalResourcesCount = builder.totalResourcesCount;
		this.registerNo = builder.registerNo;
		
	}
	
	
	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}

	public int getTotalResourcesCount() {
		return totalResourcesCount;
	}

	public int getRegisterNo() {
		return registerNo;
	}



	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", location=" + location + ", totalResourcesCount="
				+ totalResourcesCount + ", registerNo=" + registerNo + "]";
	}



	// Builder class..
	public static class Builder{
		
		// Properties every company must have....
		private UUID id;
		private String name;
		
		// Optional properties are built with the Builder Design Pattern...

		private String location;
		private int totalResourcesCount;
		private int registerNo;
		
		//private Map<String, List<IEmployee>> resourcesDatabase;

		public Builder() {
			this.id = UUID.randomUUID();
			
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setLocation(String location) {
			this.location = location;
			return this;
		}
		
		public Builder setTotalResourcesCount(int totalResourcesCount) {
			this.totalResourcesCount = totalResourcesCount;
			return this;
		}
		
		public Builder setRegisterNo(int registerNo) {
			this.registerNo = registerNo;
			return this;
		}
		
		public Company build() {
			return new Company(this);
		}
		
		
		
	}

}
