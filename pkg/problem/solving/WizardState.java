package com.pkg.problem.solving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class WizardState {
	int wizardNumber;
	int distance;
	List<Integer> list = new ArrayList<>();

	public WizardState(int wizardNumber, int distance, List<Integer> list) {
		this.wizardNumber = wizardNumber;
		this.distance = distance;
		this.list = list;
	}

	@Override
	public String toString() {
		return "{" + wizardNumber + ", " + distance + ", " + list + "}";
	}

	public List<Integer> getShortestPath(List<List<Integer>> wizards, int source, int target) {
		int minDistance = Integer.MAX_VALUE;
		List<Integer> minWizards = new ArrayList<>();
		Set<WizardState> visited = new HashSet<>();
		Queue<WizardState> queue = new LinkedList<>();
		List<Integer> t = new ArrayList<>();
		t.add(source);
		WizardState srcWizardState = new WizardState(source, 0, t);
		queue.offer(srcWizardState);
		visited.add(srcWizardState);
		while (!queue.isEmpty()) {
			WizardState wizardState = queue.poll();
			// System.out.println(wizardState);
			if (wizardState.wizardNumber == target) {
				// System.out.println("wizardState.distance:" + wizardState.distance);
				if (wizardState.distance < minDistance) {
					minDistance = wizardState.distance;
					minWizards = new ArrayList<>(wizardState.list);
				}
			}
			List<Integer> list = wizards.get(wizardState.wizardNumber);
			for (Integer wiz : list) {
				List<Integer> temp = new ArrayList<>(wizardState.list);
				temp.add(wiz);
				int distance = (int) Math.pow(Math.abs(wiz - wizardState.wizardNumber), 2);
				WizardState nextWizardState = new WizardState(wiz, wizardState.distance + distance, temp);
				if (!visited.contains(nextWizardState)) {
					visited.add(nextWizardState);
					queue.offer(nextWizardState);
				}
			}
		}
		System.out.println("minWizards:" + minWizards);
		System.out.println("minDistance:" + minDistance);
		return minWizards;
	}
}