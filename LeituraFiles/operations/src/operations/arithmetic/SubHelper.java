package operations.arithmetic;

public final class SubHelper implements Operacao {
    //Retorna a subtração de todos valores que forem passado.
    @Override
    public int calculate(final int... values) {
        int result = 0;
        try {
            for (int valor : values) {
                result -= valor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
