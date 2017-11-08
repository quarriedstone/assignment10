public class Submarine implements isRocketWeapon, isFloating, isMilitaryEquipment {

    //Подводная лодка

    @Override
    public boolean isUnderwater() {
        return true;
    }

    @Override
    public boolean isAfloat() {
        return true;
    }

    @Override
    public void makeHarm() {

    }
}
