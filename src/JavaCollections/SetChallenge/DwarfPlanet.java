package JavaCollections.SetChallenge;

public class DwarfPlanet extends HavenlyBody {
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.DWARF_PLANET);
    }

//    @Override
//    public boolean addSatellite(HavenlyBody moon) {
//        if (moon.getBodyType() == BodyType.DWARF_PLANET){
//            super.addSatellite(moon);
//        }
//        else {
//            return false;
//        }
//    }
}
