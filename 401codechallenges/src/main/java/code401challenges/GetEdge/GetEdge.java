package code401challenges.GetEdge;

import code401challenges.graph.Graph;
import code401challenges.graph.GraphEdge;
import code401challenges.graph.GraphNode;

import java.util.List;
import java.util.Set;

public class GetEdge {

    public static int directFlight (Graph<String> mapOfCities, String[] itinerary) {

        if (itinerary.length < 2) {
            return -1;
        }

        int cityIndex = 0;
        int cost = 0;
        GraphNode<String> currentCity = null;
        Set<GraphNode<String>> listOfCities = mapOfCities.getNodes();

        // find the node that contains the first city in the itinerary to start
        for (GraphNode<String> city: listOfCities) {
            if (city.getValue().equals(itinerary[cityIndex])) {
                currentCity = city;
                break;
            }
        }
        cityIndex++;

        // While there are cities in the itinerary check the current city's neighbors for the next city
        // If it is, add the cost of the flight to the total and move to the next city
        // if not, return -1 right away
        while (cityIndex < itinerary.length) {
            List<GraphEdge<String>> neighbors = currentCity.getNeighbors();
            boolean arrivalCity = false;
            for(GraphEdge<String> neighbor : neighbors) {
                if (neighbor.getConnectedNode().getValue().equals(itinerary[cityIndex])) {
                    cost += neighbor.getWeight();
                    cityIndex++;
                    currentCity = neighbor.getConnectedNode();
                    arrivalCity = true;
                    break;
                }
            }

            if (!arrivalCity) {
                return -1;
            }
        }

        return cost;
    }
}
