package com.nanna.collection.comparator;

public class State {

	
		private String district; 
		private String  language ; 
		private int population;
		public State(String district, String language, int population) {
			super();
			this.district = district;
			this.language = language;
			this.population = population;
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
		@Override
		public String toString() {
			return "State [district=" + district + ", language=" + language + ", population=" + population + "]";
		}
		
}
