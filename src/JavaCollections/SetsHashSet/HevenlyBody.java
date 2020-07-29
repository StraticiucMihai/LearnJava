package JavaCollections.SetsHashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        System.out.println("obj.getClass() is "+obj.getClass());
        System.out.println("this.getClass() is "+ this.getClass());

        if ((obj == null)||(obj.getClass() != this.getClass())){
            return false;
        }
        else{
            String objName = ((HeavenlyBody)obj).getName();
            return  this.name.equals(objName);
        }

    }
    @Override
    public int hashCode() {
        System.out.println("hashCode called ");
        return this.name.hashCode()+ 57/*ensure that a non zero number will be returned for anu hash code */ ;
    }
}