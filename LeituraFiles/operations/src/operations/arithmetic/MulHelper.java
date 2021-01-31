package operations.arithmetic;

public final class MulHelper implements Operacao {
    //Retorna a multiplicação de todos elementos do array.
    @Override
    public int calculate(final int... values) {
        int result = 0;
        try {
            result = values[0];
            for (int i = 1; i < values.length; i++) {
                result *= values[i];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
