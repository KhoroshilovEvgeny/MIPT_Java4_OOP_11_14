public class Fraction {
    final private int numerator;
    final private int denominator;


    public Fraction(int numerator, int denominator) {
        if (denominator > 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else if (denominator < 0) {
            this.numerator = numerator * (-1);
            this.denominator = denominator * (-1);
        }
        else {
            throw new IllegalArgumentException("знаменатель не может равен нулю");
        }
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // метод упрощения дробей
    public Fraction simplify(Fraction fr) {
        int nod = Utils.gcd(fr.getNumerator(), fr.getDenominator());
        return new Fraction(fr.getNumerator() / nod, fr.getDenominator() / nod);
    }


    // метод для суммирования двух дробей
    public Fraction sum(Fraction fr) {
        Fraction tempFr = new Fraction(this.getNumerator() * fr.getDenominator() + fr.getNumerator() * this.getDenominator(),
                this.getDenominator() * fr.getDenominator());
        return simplify(tempFr);
    }

    // метод для суммирования дроби с целым числом
    public Fraction sum(int numerator) {
        Fraction tempFr = this.sum(new Fraction(numerator, 1));
        return simplify(tempFr);
    }


    // метод для вычисления разницы двух дробей
    public Fraction minus(Fraction fr) {
        Fraction tempFr = new Fraction(this.getNumerator() * fr.getDenominator() - fr.getNumerator() * this.getDenominator(),
                this.getDenominator() * fr.getDenominator());
        return simplify(tempFr);
    }

    // метод для вычисления разницы дроби с целым числом
    public Fraction minus(int numerator) {
        Fraction tempFr = this.minus(new Fraction(numerator, 1));
        return simplify(tempFr);
    }

    // метод для умножения с дробью
    public Fraction multiplication(Fraction fr){
        Fraction tempFr = new Fraction(this.getNumerator() * fr.getNumerator(),
                this.getDenominator() * fr.getDenominator());
        return simplify(tempFr);
    }

    // метод для умножения с целым числом
    public Fraction multiplication(int numerator) {
        Fraction tempFr = this.multiplication(new Fraction(numerator, 1));
        return simplify(tempFr);
    }

    // метод для деления на дробь
    public Fraction div(Fraction fr){
        Fraction tempFr = new Fraction(this.getNumerator() * fr.getDenominator(),
                this.getDenominator() * fr.getNumerator());
        return simplify(tempFr);
    }

    // метод для деления на целое число
    public Fraction div(int numerator) {
        Fraction tempFr = this.div(new Fraction(numerator, 1));
        return simplify(tempFr);
    }

}
