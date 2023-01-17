package some;

interface Transformer<OUT, IN> {

    OUT transform(IN original);
}
