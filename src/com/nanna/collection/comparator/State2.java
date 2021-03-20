package com.nanna.collection.comparator;

import java.util.Comparator;

public class State2 {

	
		private String district;
		private String language; 
		private int population;
		public State2(String district, String language, int population) {
			super();
			this.district = district;
			this.language = language;
			this.population = population;
		}
		public State2() {
			// TODO Auto-generated constructor stub
		}
		
		public String getDistrict() {
			return district;
		}
		public String getLanguage() {
			return language;
		}
		public int getPopulation() {
			return population;
		}
		
		Comparator<State2> populationSort = new Comparator<State2>() {
			
			@Override
			public int compare(State2 o1, State2 o2) {
				if (o1.getPopulation()==o2.getPopulation()) {
					return 0;
				}
				else if (o1.getPopulation()>o2.getPopulation()) {
					return 1;
				}
				else
				return -1;
			}
		};
		
		@Override
		public String toString() {
			return "State2 [district=" + district + ", language=" + language + ", population=" + population + "]";
		}
		
		
		


}
