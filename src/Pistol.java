public class Pistol {
    private int bullets;
    private  final  int maxBullets;

    public Pistol(int bullets, int maxBullets) {
        if (bullets < 0) {
            throw new IllegalArgumentException("Нельзя создать пистолет с отрицательным количеством заряженных " +
                    "патронов, в качестве аргумента было передано значение: " + bullets);
        }
        if (bullets > maxBullets) {
            throw new IllegalArgumentException("Нельзя создать пистолет с количеством заряженных " + bullets +
                    " патронов, при максимальной емкости пистолета  " + maxBullets + " патронов");
        }
        if (maxBullets < 1) {
            throw new IllegalArgumentException("Нельзя создать пистолет с емкостью менее одного патрона. " +
                    "В качестве аргумента было передано значение: " + maxBullets);
        }
        this.bullets = bullets;
        this.maxBullets = maxBullets;
    }

    public Pistol(int maxBullets) {
        this(5,maxBullets);
    }

    public int getBullets() {
        return bullets;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public void shoot (){
        if (bullets > 0) {
            bullets--;
            System.out.println("Бах");
        } else {
            System.out.println("Клац");
        }
    }

    public int reloadBullets (int addBullets) {
        if (addBullets < 0) {
            throw new IllegalArgumentException("Нельзя зарядить пистолет с отрицательным количеством дополнительных" +
                    " патронов, в качестве аргумента было передано значение: " + addBullets);
        }
        int returnedBullets = 0;
        if ((bullets + addBullets) > maxBullets) {
            returnedBullets = addBullets - (maxBullets - bullets);
            bullets = maxBullets;
        } else {
            bullets += addBullets;
        }
        return returnedBullets;
    }


    public int returnAllBullets () {
        int temp = bullets;
        bullets = 0;
        return temp;
    }

    public boolean isEmpty() {
        return bullets==0;
    }

    @Override
    public String toString() {
        return "Пистолет:  ёмкость - " + maxBullets + " патронов,  фактически заряжено - " + bullets + " патронов.";
    }
}
