package JavaCollections.SetChallenge;

public class Planet  extends HavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HavenlyBody moon) {
        if (moon.getKey().getBodyType() == BodyType.MOON){
            return  super.addSatellite(moon);
        }
        else {
            return false;
        }
    }

}
