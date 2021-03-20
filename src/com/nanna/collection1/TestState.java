package com.nanna.collection1;

public class TestState {

	
	State Odisha  = new State() {
		
		@Override
		public void population() {
			// TODO Auto-generated method stub
			System.out.println("5 Crore ");
			
		}
		
		@Override
		public void numberOfDistricts() {
			// TODO Auto-generated method stub
			System.out.println("28");
			
		}
	};	
		State delhi = new State() {
			
			@Override
			public void population() {
				System.out.println("10 crore");
			}
			
			@Override
			public void numberOfDistricts() {
				System.out.println("UT");
				
			}
		};
}
