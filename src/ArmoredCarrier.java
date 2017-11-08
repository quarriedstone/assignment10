public class ArmoredCarrier implements isCombatGroundVehicle {

    //Бронетранспортёр

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public boolean hasTrackLayer() {
        return false;
    }

    @Override
    public boolean hasCombatGun() {
        return false;
    }

    @Override
    public void makeHarm() {

    }
}
