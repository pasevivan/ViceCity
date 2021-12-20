package viceCity.models.guns;

public class Pistol extends BaseGun{

    public Pistol(String name) {
        super(name, 10, 100);

    }

    @Override
    public int fire() {


        if(getBulletsPerBarrel()==0 && getTotalBullets() > 0) {
            reload();
        }

        if(getBulletsPerBarrel() > 0) {
            setBulletsPerBarrel(getBulletsPerBarrel() - 1);
        }

        return 1;
    }

    private void reload() {
        setTotalBullets(getTotalBullets() - 10);
        setBulletsPerBarrel(10);
    }
}
