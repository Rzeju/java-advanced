package pl.codecool.collections.list.zad7;

public class Main {

    public static void main(String[] args) {

        GunMagazine gunMagazine = new GunMagazine(5);

        gunMagazine.loadBullet("Bullet-1");
        gunMagazine.loadBullet("Bullet-2");
        gunMagazine.loadBullet("Bullet-3");
        gunMagazine.loadBullet("Bullet-4");
        gunMagazine.loadBullet("Bullet-5");
        gunMagazine.loadBullet("Bullet-6");
        gunMagazine.loadBullet("Bullet-7");

        gunMagazine.shot();
        gunMagazine.loadBullet("Bullet-6");
        gunMagazine.shot();

        System.out.println(gunMagazine.isLoaded());
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        System.out.println(gunMagazine.isLoaded());
    }
}
