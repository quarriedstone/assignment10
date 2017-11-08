public class InfantryCombatVehicle implements isCombatGroundVehicle, isFloating {

    //БМП(Боевая машина пехоты)

    @Override
    public boolean hasWheels() {
        return false;
    }

    @Override
    public boolean hasTrackLayer() {
        return true;
    }

    @Override
    public boolean hasCombatGun() {
        return false;
    }

    @Override
    public void makeHarm() {

    }

    @Override
    public boolean isUnderwater() {
        return false;
    }

    @Override
    public boolean isAfloat() {
        return true;
    }
}
