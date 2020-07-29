package JavaCollections.SetChallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public abstract  class HavenlyBody {

    private final double orbitalPeriod;
    private final Set<HavenlyBody> satellites;
    private final Key key ;

    public  static final class Key {
        private String name;
        private BodyType bodyType;

        private Key(String name ,BodyType type){
            this.name = name;
            this.bodyType =type;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if (this.name.equals(key.getName())){
                return (this.bodyType == key.getBodyType());
            }
            else {
                return false ;
            }
        }

        @Override
        public String toString() {
            return this.name + " : " + this.bodyType;
        }
    }
    public Key getKey() {
        return key;
    }

    public enum BodyType{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }
    public HavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();

    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HavenlyBody moon) {

        return this.satellites.add(moon);
    }

    public Set<HavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    public static Key makeKey(String name , BodyType bodyType){
       return  new Key(name,bodyType);
    }
    @Override
    public final boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if ( obj instanceof HavenlyBody){
            HavenlyBody theobj = (HavenlyBody) obj;
            return  this.key.equals(theobj.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        System.out.println("hashCode called ");
        //       return this.name.hashCode()+ 57 + this.bodyType.hashCode() /*ensure that a non zero number will be returned for anu hash code */ ;
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }
}