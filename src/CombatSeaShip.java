public class CombatSeaShip implements isFloating, isRocketWeapon, isMilitaryEquipment {

    //Военный корабль

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
