public class Tank implements isCombatGroundVehicle {

    //Танк

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
        return true;
    }

    @Override
    public void makeHarm() {

    }
}
