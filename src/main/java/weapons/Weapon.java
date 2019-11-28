 package weapons;

    public enum Weapon {
        SWORD(5),
        AXE(6),
        CLUB(3),
        MACE(5),
        CROSSBOW(8);

        private int damage;

            Weapon(int damage){
                this.damage = damage;
    }
    public int getDamage(){
                return this.damage;
    }

}
