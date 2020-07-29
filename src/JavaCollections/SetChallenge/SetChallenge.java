package JavaCollections.SetChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetChallenge {

    private static Map<HavenlyBody.Key, HavenlyBody> solarSystem = new HashMap<>();
    private static Set<HavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        System.out.println("Planets");
        for(HavenlyBody planet : planets) {
            System.out.println(planet); /*automatically call @Overwrite method toString from the class */
        }

//        HavenlyBody body = solarSystem.get("Jupiter");
//        System.out.println("Moons of " + body.getName());
//        for(HavenlyBody jupiterMoon: body.getSatellites()) {
//            System.out.println("\t" + jupiterMoon.getName());
//        }
//
//        Set<HavenlyBody> moons = new HashSet<>();
//        for(HavenlyBody planet : planets) {
//            moons.addAll(planet.getSatellites());
//        }
//
//        System.out.println("All Moons");
//        for(HavenlyBody moon : moons) {
//            System.out.println("\t" + moon.getName());
//        }
        HavenlyBody earth1 = new Planet("Earth" ,365);
        HavenlyBody earth2 =  new Planet("Earth",365);
        /*.equals is symmetrical */
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));

    }
}
