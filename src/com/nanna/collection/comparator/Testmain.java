package com.nanna.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testmain {

	public static void main(String[] args) {

		State2 sta = new State2();
		
		List<State2> nannaState = new ArrayList<State2>();
		nannaState.add(new State2("KalaHandi", "Kalahandia", 800000));
		nannaState.add(new State2("Sambalpur", "sambalpuri", 1800000));
		nannaState.add(new State2("KhordhA", "Kataki", 67999));
		for (State2 state : nannaState) {
			System.out.println(state);
		}
		

		System.out.println("=======================================================================================");
		Comparator<State2> pSorter = sta.populationSort;
			nannaState.sort(pSorter);
			for (State2 state2 : nannaState) {
				System.out.println(state2);
			}

	}

}
/* 
 * 
 * 		List<State> nannaState = new ArrayList<State>();
		nannaState.add(new State("KalaHandi", "Kalahandia", 800000));
		nannaState.add(new State("Sambalpur", "sambalpuri", 1800000));
		nannaState.add(new State("KhordhA", "Kataki", 67999));
		for (State state : nannaState) {
			System.out.println(state);
		}

		System.out.println("=======================================================================================");
		nannaState.sort(new PopulationSorter());
			System.out.println(nannaState);

 * 
 * 
 * */
 