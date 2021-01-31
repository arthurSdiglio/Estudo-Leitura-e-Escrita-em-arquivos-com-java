package operations.arithmetic;

public final class DivHelper implements Operacao {
    //Retorna a divisão dos valores passado. Espera-se que receba somente dois valores.

    @Override
    public int calculate(final int... values) {
        int result = 0;
        try {
            result = values[0];
            for (int i = 1; i < values.length; i++) {
                result /= values[i];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
