package enamel;

import java.io.IOException;

public class ToyAuthoring {

    public static void main(String[] args) throws IOException {
    	ScenarioParser s = new ScenarioParser();
		s.setScenarioFile("/home/pi/TreasureBoxBrailleApps/FactoryScenarios/Scenario_" + 1 + ".txt");
    }
}